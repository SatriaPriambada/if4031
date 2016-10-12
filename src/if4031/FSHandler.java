package if4031;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.apache.thrift.TException;


/**
 *
 * @author Satria
 */
public class FSHandler implements FSService.Iface {


    @Override
    public Tree Dir(String path) {
        Tree result=null;
        return result;
    }

    @Override
    public String CreateDir(String path, String namadir) throws TException {
        return "Success";
    }

    @Override
    public FileChunk GetFile(String fileName, long offset, int size) {
        FileChunk fresult = null;
        return fresult;
    }

    @Override
    public String PutFile(String path, FileChunk fileName, String pathToSave) {
        return "Success";
    }

    
}
