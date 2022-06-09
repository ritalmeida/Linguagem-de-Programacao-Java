package edu.ufp.inf.lp2._09_nio;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.ufp.inf.lp2._05_figgeo.Circle;
import edu.ufp.inf.lp2._05_figgeo.Point;
import edu.ufp.inf.lp2._05_figgeo.Rectangle;

public class FileObjectOutputStreamApp {

    public static void main(String[] args) {
        String filename = (args.length == 1 ? args[0] : "data/Date.bin");
        //ObjectOutputStream oos = null;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
            //oos = new ObjectOutputStream(new FileOutputStream(filename));
            // Create message and Date objects
            String msg = "Today's Date:";
            Date today = new Date(System.currentTimeMillis());
            // Write String object followed by Date object
            oos.writeObject(msg);
            oos.writeObject(today);
            Point p = new Point(1.0, 1.0);
            Rectangle r = new Rectangle(new Point(0.0, 1.0), new Point(1.0, 0.0), Color.BLUE);
            Circle c = new Circle(Color.BLUE, 1.0, new Point(0.0, 0.0));
            // Write serialized objects into file
            oos.writeObject(p);
            oos.writeObject(r);
            oos.writeObject(c);

        } catch (IOException e) {
            Logger.getLogger(FileObjOutputStreamApp.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
