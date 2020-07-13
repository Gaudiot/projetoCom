# Communication Infrastructure project
Project developed for the Communication Infrastructure discipline (IF678).

### Project objective
This project aims to build a P2P communication between 2 clients, besides the correct understanding and application of the RTP protocol while using UDP as protocol from the transport layer.

### How it works
* 3 (three) computers can be used on this project once the documents are downloaded.
* One of them will be the server while the other 2 will be the clients.
* To work properly, the server's IP address must be already known and be inserted on the campus "localhost" on file "cliente.java" line 24.
* After the server is running, the client shall connect. When executed, a new window will pop-up asking the desired username to be used. After both clients are connected they will be able to send messages to each other, besides being able to make a VoIP call.

#### Observations
* While client B is offline, the messages sent from client A will be stored in its own computer until client B comes back online, moment that stored messages will be sent to client B.
* It will only be possible make a VoIP call if both clients accept to talk.
* The only function of the server is to register the client and to inform them the status (online/offline) and information (IP address and port) from the other clients.
