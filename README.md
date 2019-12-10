# projetoCom
Projeto realizado para a disciplina Infraestrutura de Comunicação(IF678).

### Objetivo do projeto
Esse projeto teve como objetivo realizar uma comunicação P2P entre os clientes, além do correto entendimento e implementação do protocolo RTP ao implementar o protocolo UDP como protocolo
da camada de transporte.

### Funcionamento
* Ao baixar todos os documentos, 3(três) computadores poderão ser utilizados neste projeto. 
* Um deles servirá como servidor e os outros dois serão os clientes.
* Para o correto funcionamento, o endereço IP do servidor já deve ser conhecido e inserido no lugar do localhost na linha 24 do arquivo cliente.java.
* Após o servidor ser posto para rodar, os clientes já poderão se conectar. Ao serem executados uma janela abrirá perguntando o nome de usuário que deseja utilizar. Assim que os 2 clientes
se conectarem, será capaz que enviem mensagens de texto entre si, além de poderem realizar uma chamada VoIP.

#### Observações
* Caso o cliente B esteja offline, as mensagens enviada pelo cliente A serão armazenadas no próprio cliente até que o cliente B decida ficar online, momento o qual
as mensagens armazenadas serão enviadas.
* Só será possível haver comunicação por voz caso ambos os clientes aceitem a conversa.
* O Servidor é utilizado apenas para registrar os clientes e informá-los dos estados(online/offline) e informações(endereço IP e porta) dos outros clientes.
