package lab3_;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Double[] a = {1., 1.};

        HornersScheme frame = new HornersScheme(a);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


}
