package edu.zharif.pemograman.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPendaftaran {
    private JTextField textNama;
    private JTextField textNIM;
    private JButton buttonSave;
    private JPanel roodPanel;
    private JLabel labelhasil;

    public FormPendaftaran() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mengambil data dari textNama
                String nama = textNama.getText();
                //mengambil data dari textNIM
                String nim = textNIM.getText();
                //diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
                //tampilkan output ke form
                labelhasil.setText(mhs.toString());
            }
        });
    }

    public JPanel getRoodPanel() {
        return roodPanel;
    }
}
