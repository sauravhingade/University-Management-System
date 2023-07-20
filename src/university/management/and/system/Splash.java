
package university.management.and.system;


import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {    //implements thread class
    
    Thread t;
    Splash () {
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        t = new Thread(this);                          // making the instance of thread class
        
        t.start();                                           //internally call to the run method of thread class
        
        setVisible(true);
        
        int x = 1;
        for (int i = 2; i <= 600; i+=4, x+=1) {
            setLocation(600 - ((i + x)/2), 350 - (i/2));                // to move the frame dynamicaly
            setSize(i + 3*x, i + x/2);
            
            try {                                                          
                Thread.sleep(10);                                  // slowing the execution of code by few milisecond so that frame will opened slowly
            } catch (Exception e) {}
        }        
    }
    
    public void run() {                                            
        try {
            Thread.sleep(5000);                                      //it stop the execution for 7 sec and show frame for 7 sec
            setVisible(false);                                           // after 7 sec fram will get hide 
            
            // Next Frame
            new Login();
        } catch (Exception e) {
            
        }
    }
    
    public static void main(String[] args) {
        new Splash();
    }
}
