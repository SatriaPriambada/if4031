/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SendFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingSocket;
import org.apache.thrift.transport.TNonblockingTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 *
 * @author Satria
 */
public class StreamFileClient {
    public static void main(String [] args) throws IOException {
        try {
            TFramedTransport transport;
            TTransport socket = new TSocket("localhost", 9090);
            transport = new TFramedTransport(socket);
            try {
              transport.open();
              // Set socket timeout to regular mode
            } catch (TTransportException e) {
              System.out.println("Failed to establish connection to host "+ e.toString());
              transport.close();
              throw new IOException("Failed to establish connection to host ", e);
            }
            TProtocol protocol = new TBinaryProtocol(transport);
            StreamFileService.Client client = new StreamFileService.Client(protocol);
            perform(client);
            transport.close();
        } catch (TException x) {
            x.printStackTrace();
        }
    }
    
    private static void perform(StreamFileService.Client client) throws TException
    {
    Scanner sc = new Scanner(System.in);
    while (true){
        String input = sc.nextLine();
        String listInput[] = input.split(" ");
            switch(listInput[0]){
                case "DIR":
                    if (listInput.length < 2){
                        System.out.println("Usage DIR [PATH]");
                    } else {
                        searchDir(client, listInput[1]);
                    }
                    break;
                case "CREATEDIR":
                    if (listInput.length < 3){
                        System.out.println("Usage CREATEDIR [PATH] [NAMADIR]");
                    } else {
                        createDir(client, listInput[1], listInput[2]);
                    }
                    break;
                case "GETFILE":
                    if (listInput.length < 4){
                        System.out.println("Usage GETFILE [PATH] [NAMADIR] [PATHLOKAL]");
                    } else {
                        getFile(client, listInput[1], listInput[2], listInput[3]);
                    }
                    break;
                case "PUTFILE":
                    if (listInput.length < 4){
                        System.out.println("Usage PUTFILE [PATH] [NAMADIR] [PATHLOKAL]");
                    } else {
                        putFile(client, listInput[1], listInput[2], listInput[3]);
                    }
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
    
    private static void searchDir(StreamFileService.Client client, String path) throws TException{
        System.out.println(path);
        List<String> response = null;
        response = client.lookDir(path);
        int i = -1;
        for (String s : response){
            ++i;
            if (i % 4 == 0)
                System.out.print("Filename:" +s);
            else if (i % 4 == 1)
                System.out.print("\tLast Mod:" + new Date(Long.parseLong(s)));
            else if (i % 4 == 2)
                System.out.print("\tSize:" + s + " bytes");
            else if (i % 4 == 3)
                System.out.println("\tCreated:" + s );
        }
    }
    
    private static void createDir(StreamFileService.Client client, String path, String newName) throws TException{
        System.out.println(path + "/" + newName);
        String response = client.createDir(path, newName);
        System.out.println(response);
    }
    
    private static void getFile(StreamFileService.Client client, String path, String newName, String localPath){
        System.out.println("Open from : " + path + "/" + newName);
    }
    
    private static void putFile(StreamFileService.Client client, String path, String newName, String localPath){
        System.out.println("Save to : " + path + "/" + newName);
    }
}
