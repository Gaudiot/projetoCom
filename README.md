# Communication Infrastructure project
Project developed to the Communication Infrastructure discipline(IF678).

### Project objective
This project aims to build a P2P communication between 2 clients, besides the correct understanding and application of the RTP protocol while using UDP as protocol frm the transport layer.

### How it works
* After you downloaded all the documents, 3(three) computers can be used on this project.
* One of them will be the server while the other 2 will be the clients.
* To work properly, The server's IP adress must be already known and be inserted on the campus "localhost" on file "cliente.java" line 24.
* After the server is running, the client shall connect. When executed, a new window will pop-up asking the desired username to be used. After both clients are connected they will be able to send messages to each other, besides being able to make a VoIP call.

#### Observations
* While client B is offline, the messages sent from client A will be stored on its own computer until client B comes back online, moment on which the stored messages will be sent to client B.
* It will only be possible make a VoIP call if both clients accept to talk.
* The only function of the server is to register the client and to inform them the status(online/offline) and information(IP adress and port) from the other clients.
