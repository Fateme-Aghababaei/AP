package Main;

import Forms.StartForm;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                StartForm startForm = new StartForm();
                startForm.setVisible(true);
            }
        });
    }
}