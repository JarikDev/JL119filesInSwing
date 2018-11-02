package com;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

public class Main {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("Show File dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jFileChooser = new JFileChooser();
//                // jFileChooser.showSaveDialog(jPanel);
//                // jFileChooser.showOpenDialog(jPanel);
//                //   jFileChooser.setMultiSelectionEnabled(true);
//
//                jFileChooser.setCurrentDirectory(new File("D:\\"));
//                // jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//                jFileChooser.setFileFilter(new FileFilter() {
//                    @Override
//                    public boolean accept(File f) {
//                        if (f.getName().endsWith("jpg") || f.getName().endsWith("jpeg")) {
//                            return true;
//                        }
//                        return false;
//                    }
//
//                    @Override
//                    public String getDescription() {
//                        return "only jpg files";
//                    }
//                });
//                TextField textField = new TextField("text field", 50);
//                jFileChooser.add(textField, BorderLayout.WEST);
//                jFileChooser.addPropertyChangeListener(new PropertyChangeListener() {
//                    @Override
//                    public void propertyChange(PropertyChangeEvent evt) {
//                        textField.setText(evt.getNewValue().toString());
//                    }
//                });


                int i=jFileChooser.showDialog(jPanel, "save ass");
                System.out.println(i);
                File file=jFileChooser.getSelectedFile();
                System.out.println(file);
            }
        });

        jPanel.revalidate();

    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 500);
        return jFrame;

    }
}