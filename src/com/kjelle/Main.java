package com.kjelle;

import com.kjelle.net.Server;

public class Main {

    public static void main(String[] args) {
        if(args.length >= 0 && args.length < 2) {
            String[] socket = args[2].split(":");
            String ip = socket[0];
            int port = Integer.parseInt(socket[1]);
            Server server1 = new Server(1337, port, ip);
            server1.setMessage(args[0]);
        } else {
            System.out.println("Wrong formatted arguments.\n" +
                    "Must be 'java -jar sendUDP msg IP:port.\n");
        }
    }
}
