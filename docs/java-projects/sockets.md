# Sockets

## Oque é um Socket

Socket é uma abstração de rede que permite a comunicação entre diferentes processos, geralmente em máquinas distintas através da rede. Normalmente, um servidor que está em execução em uma máquina possui um socket que fica ouvindo em uma porta específica, aguardando a conexão de um cliente.

> De acordo com a Oracle: *"Um Socket é um ponto de comunicação entre duas máquinas"*

---

## Estrutura de uma aplicação com Sockets

Uma aplicação que utiliza sockets normalmente é composta por um servidor e vários clientes. O servidor fica ouvindo uma porta específica, aguardando a conexão de um cliente. Quando o cliente se conecta e envia uma mensagem, o servidor processa essa mensagem e retorna a resposta ao cliente.

![socket](images/socket.svg)

| Definições | Descrições                                         |
| ---------- | -------------------------------------------------- |
| bind       | Associa o socket a um endereço IP e a uma porta.   |
| listen     | Começa a "escutar" por conexões.                   |
| accept     | Aguarda até que um cliente se conecte ao servidor. |

---

## Protocolo TCP e UDP

^^*TCP(Transmission Control Protocol)*^^ e ^^*UDP(User Datagram Protocol)*^^ são os dois principais protocolos usados na camada de transporte do modelo TCP/IP. Ambos são responsáveis por transferir dados entre dispositivos, mas fazem isso de formas diferentes.

### TCP

É um protocolo ==orientado a conexão==, significando que ele estabelece uma conexão confiavel antes da troca de dados entre os dois dispositivos.

Utilizado quando precisamos de uma troca confiável de informações. Para essa comunicação é necessário a confirmação de que os pacotes foram recebidos corretamente, caso o pacote tenha sido perdido, é solicitado para que seja enviado novamente.

### UDP

É um protocolo ==sem conexão==, significando que os dados são enviados sem garantir que o receptor os recebas.

Quando não precisamos de uma troca confiável de informações. Muito utilizado para transmissões de videos, voip, etc... Aplicações que não são necessários a confirmação de entrega dos pacotes,

### Comparação entre TCP e UDP

| **Característica** |            **TCP**            |            **UDP**            |
| :----------------: | :---------------------------: | :---------------------------: |
|     Orientação     |      Orientado a conexão      |          Sem conexão          |
|   Confiabilidade   |           Garantido           |         Não garantido         |
| Controle de Fluxo  |              Sim              |              Não              |
| Controle de Erros  |    Sim (com retransmissão)    |              Não              |
| Ordem dos Pacotes  |           Garantida           |         Não garantida         |
|     Velocidade     | Mais lento devido ao overhead |   Mais rápido, sem overhead   |
|      Overhead      |             Alto              |             Baixo             |
|     Uso Típico     |       Web, FTP, E-mails       | Streaming, VoIP, Jogos online |

---

## Fontes

- [Java Socket: Entendendo a classe Socket e a ServerSocket em detalhes](https://www.devmedia.com.br/java-socket-entendendo-a-classe-socket-e-a-serversocket-em-detalhes/31894)
- [Java Sockets: Criando comunicações em Java](https://www.devmedia.com.br/java-sockets-criando-comunicacoes-em-java/9465)
- [All About Sockets](https://docs.oracle.com/javase/tutorial/networking/sockets/index.html)
