/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SendFile;

import org.apache.log4j.BasicConfigurator;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

/**
 *
 * @author Satria
 */
public class StreamFileServer {
    public static StreamFileHandler handler;
    public static StreamFileService.Processor processor;
    public static void main(String [] args) {
    BasicConfigurator.configure();
    try {
        handler = new StreamFileHandler();
        processor = new StreamFileService.Processor(handler);
        Runnable T1 = new Runnable() {
        public void run() {
            simple(processor);
            }
        };
//        
//        Runnable T2 = new Runnable() {
//        public void run() {
//            simple(processor);
//            }
//        };
//        new Thread(T2).start();
        new Thread(T1).start();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
    public static void simple(StreamFileService.Processor processor) {
        try {
            TNonblockingServerTransport  serverTransport;
            serverTransport = new TNonblockingServerSocket(9090);
            TServer server;
            server = new TNonblockingServer (new TNonblockingServer.Args(serverTransport).processor(processor));
            System.out.println("Starting the simple filesystem server...");
            server.serve();
            System.out.println("Test");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
