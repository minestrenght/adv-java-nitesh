
package pkg;

import java.io.File;
import javax.swing.JFileChooser;

public class Start {
    public static void main(String[] args) {
        System.out.println("Starting file chooser ...");
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);//prompt user for file
        File f = fc.getSelectedFile();
        if(null == f) {
            System.out.println("You have not selected any file.");
        } else {
            System.out.printf("You have selected file: %s\n", f.getName());
        }
    }
}
