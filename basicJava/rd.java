// if a program require some user inoutr then such input can be 
//  provided in different ways

// 1.by using showInputDialog function - this function shows a small input window where we can enter our data
// Componentparent, string message 

// 2.By using command line arguments - whenever a program is run are executed from the command prompt
// we can pass some data in a string array

// 3. by using scanner class

import javax.swing.JOptionPane;

public class rd {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Enter a number: ");
        int N = Integer.parseInt(s);
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}


