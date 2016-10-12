package if4031;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

/**
 *
 * @author Satria
 */
public class FSServer {
    public static FSHandler handler;
    public static FSService.Processor processor;
    public static void main(String [] args) {
        try {
        handler = new FSHandler();
        processor = new FSService.Processor(handler);
        Runnable simple = new Runnable() {
            public void run() {
                simple(processor);
            }
        };
        new Thread(simple).start();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
    
    public static void simple(FSService.Processor processor) {
        try {
            TServerTransport serverTransport = new TServerSocket(9090);
            TServer server;
            server = new TThreadPoolServer(new
                    TThreadPoolServer.Args(serverTransport).processor(processor));
            System.out.println("Starting the simple server...");
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
