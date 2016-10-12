/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SendFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.thrift.TException;

/**
 *
 * @author Satria
 */
public class StreamFileHandler implements StreamFileService.Iface {
    static String root = "C:\\Users\\Satria\\Documents\\ThriftProject\\root";
    @Override
    public List<String> lookDir(String path) throws TException {
        List<String> response = null;
        try {
            //System.out.println("Here " +path );
            response = findFile(new File(root + path));
        } catch (IOException ex) {
            Logger.getLogger(StreamFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }

    @Override
    public String createDir(String path, String nama_dir) throws TException {
        Path pathFile = Paths.get(root + path);
        String response = "";
        if (!Files.exists(pathFile)) {
            response = "Direktori path belum ada";
        } else {
            Path newDirPath = Paths.get(root, path, nama_dir);
            try {
                Files.createDirectories(newDirPath);
            } catch (IOException e) {
                //fail to create directory
                e.printStackTrace();
            }
            response = "Direktori berhasil dibuat pada " + newDirPath.toString();
        }
        return response;
    }

    @Override
    public byte getBytes(String path, String nama_file, String localPath) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String saveFile(String path, String nama_file, String localPath) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<String> findFile(File file) throws IOException
    {
        List<String> listFile;
        listFile = new ArrayList<>();
        File[] list = file.listFiles();
        if(list!=null){
        for (File fil : list)
        {
            if (!fil.isDirectory())
            {
                System.out.println("File name:" + fil.toString());
                BasicFileAttributes attr;
                attr = Files.readAttributes(fil.toPath(), BasicFileAttributes.class);
                listFile.add(fil.toString());
                //add last modified
                listFile.add(String.valueOf(fil.lastModified()));
                //add size in bytes
                listFile.add(String.valueOf(fil.length()));
                //add created time
                listFile.add(attr.creationTime().toString());
            }
            else
            {
                System.out.println("Not a directory");
            }
        }
        
        }else{
            listFile.add("No file");
        }
        return listFile;
    }
    
}
