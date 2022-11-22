package edu.zharif.pemograman.gui2;

import javax.swing.*;

public class RunFormPendaftaran {
    public static void main(String args[]){
        JFrame jFrame = new JFrame("Form Pendaftaran");
        jFrame.setContentPane(new FormPendaftaran().getRoodPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);
    }
}
