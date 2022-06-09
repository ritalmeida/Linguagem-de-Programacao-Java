package edu.ufp.inf.lp2._09_nio;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileBinInputStreamApp {

    public static void main(String[] args) {

        String filename = (args.length == 1 ? args[0] : "data/Test.bin");
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream(filename)));
            int size = dis.readInt();
            double[] data= new double[size];
            //byte dataBytes[] = new byte[64000];
            for (int i = 0; i < size; i++) {
                data[i] = dis.readDouble();
                //dataBytes[i] = dis.readByte();
                System.out.println("d = " + data[i]);
            }
        } catch (Exception e) {
            Logger.getLogger(FileBinInputStreamApp.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(FileBinInputStreamApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
