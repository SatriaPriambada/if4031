package if4031;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 *
 * @author Satria
 */
public class FSClient {
    public static void main(String [] args) {
    try {
        TTransport transport;
        transport = new TSocket("localhost", 9090);
        transport.open();
        TProtocol protocol = new TBinaryProtocol(transport);
        FSService.Client client = new FSService.Client(protocol);
        Scanner in = new Scanner(System.in);
        while (true){
            String input = in.nextLine();
            String arrInput[] = input.split(" ");
            switch (arrInput[0]){
                case "DIR":
                    lookDir(client, arrInput[1]);
                    break;
                case "CREATEDIR":
                    createDir(client, arrInput[1], arrInput[2]);
                    break;
                case "GETFILE":
                    getFile(client, arrInput[1], arrInput[2], arrInput[3]);
                    break;
                case "PUTFILE":
                    putFile(client, arrInput[1], arrInput[2], arrInput[3]);
                    break;
            }
        }

    } catch (TException x) {
        x.printStackTrace();
    }
    }
    
    private static void lookDir(FSService.Client client, String path)
    throws TException
    {
        Tree result = client;
        System.out.println(Tree.toString());
    }
    
    private static void createDir(FSService.Client client, String path, String newPath)
    throws TException
    {
        Tree result = client;
        System.out.println("Sending create dir");
    }
    
    private static void getFile(FSService.Client client, String path, String filename, String newPath)
    throws TException
    {
        Tree result = client;
        System.out.println("Get a file");
    }
    
    private static void putFile(FSService.Client client, String path, String filename,String newPath)
    throws TException
    {
        Tree result = client;
        System.out.println("Put a file");
    }
    
}
