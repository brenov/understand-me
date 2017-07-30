# Understand Me

## Description

**Understand Me** is a multi-user chat that performs simultaneous translation. The user must choose a language in which to converse and all the messages received will be translated, if necessary, into the language that this user chose. Each user must have a unique name, so that the chat server can identify their users and also identify the users in the conversation.

### How it works?

The translation is made from the Google Cloud Translation API. The user sends the message to the server that checks their language and applies the translation if necessary to send the message to each of the other users participating in the chat.

### Supported Languages

- Portuguese
- English
- Spanish
- German
- French
- Italian
- Dutch

### Dependencies

- Java 8.0 or greater

## Contribuiting

Click [here](CONTRIBUITING.md) to see how to contribute.

## How to compile

#### Server

Open the project folder:

```bash
cd ChatServer
```

To compile the chat server enter the following command:

```bash
javac -cp lib/*.jar src/br/com/brenov/chatserver/*.java
```

To generate the jar executable run the following command:

```bash
jar cfm ChatServer.jar manifest.mf src/br/com/brenov/chatserver/*.class
```

#### Client

Open the project folder:

```bash
cd ChatClient
```

To compile the chat client enter the following command:

```bash
javac src/br/com/brenov/chatclient/*.java
```

To generate the jar executable run the following command:

```bash
jar cfm ChatClient.jar manifest.mf src/br/com/brenov/chatclient/*.class
```

## How to run

To run the chat server enter the following command:

```bash
# You need an API key to be able to use the Google Cloud Translation API
java -jar ChatServer.jar $APIKEY
```

And to run the chat client:

```bash
java -jar ChatClient.jar
```

## How to use client

### Enter the chat

First you need to enter the IP address of the server, then you must choose the language in which you want to chat, and finally choose a name to identify yourself on the chat server. All set, you can now send and receive messages in the chat.

<p align="center"><img src ="img/entering-chat.gif" width="400px"></p>

## Sample

### Client side

<p align="center"><img src ="img/conversation.gif"/></p>

### Server side

<p align="center"><img src ="img/server.png" width="600px"/></p>

## Author

[<img src="https://avatars2.githubusercontent.com/u/17532418?v=3&s=400" width="100"/>](https://github.com/brenov) |
---|
[Breno Viana](https://github.com/brenov) |
