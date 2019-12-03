import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.SourceDataLine;

public class player extends Thread{

    DatagramSocket in;
    SourceDataLine audio_out;
    private cliente client;
    byte[] buffer = new byte[512];

    public player(SourceDataLine audio_out, cliente client) {
        this.audio_out = audio_out;
        this.client = client;
    }

    @Override
    public void run(){
        DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
        System.out.println("Thread player init.");
        while(this.client.calling){
            try {
                client.portThisAudio.receive(incoming);
                buffer = incoming.getData();
                audio_out.write(buffer, 0, buffer.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        audio_out.drain();
        audio_out.close();
        System.out.println("Thread player stop.");
    }
}
