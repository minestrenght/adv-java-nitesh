package pkg;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Start {

    public static void main(String[] args) {
        final Frame f = new Frame("Window Adapter");//make it final
        f.setSize(300, 250);//width, height
        f.setVisible(true);//show
        WindowAdapter wa = new WindowAdapter() {
            //x-close button was clicked
            @Override
            public void windowClosing(WindowEvent we) {
                System.out.println("Closing frame ...");
                f.dispose();
            }

            //frame instance/object being destroyed
            @Override
            public void windowClosed(WindowEvent we) {
                System.out.println("Frame closed ...");
            }
        };
        f.addWindowListener(wa);//attach handler
    }
}
