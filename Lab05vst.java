// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10,10,width,height);
        x1= 10;
        y1 = 640;
        x2 =990;
        y2 = 625;

        for ( int x=0; x < 51; x++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 19;
            y2 -= 12;

        }
        x1= 990;
        y1 = 640;
        x2 =10;
        y2 = 625;

        for ( int x=0; x < 51; x++) {
            g.drawLine(x1, y1, x2, y2);
            x1 -= 19;
            y2 -= 12;

        }
        x1 = 10;
        y1 = 10;
        x2 =990;
        y2 = 10;


        for ( int x=0; x < 51; x++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 20;
            y2 += 13;


        }
        x1 = 10;
        y1 = 10;
        x2 =990;
        y2 = 10;


        for ( int x=0; x < 51; x++) {
            g.drawLine(x1, y1, x2, y2);
            x2 -=20 ;
            y1 += 12;


        }
        }
    }



