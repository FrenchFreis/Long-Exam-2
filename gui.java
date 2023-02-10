/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author alisrc
 */
public class gui {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Long Exam 2");

        JLabel name_label, gender_label, prog_label;

        JTextField name_text;

        JRadioButton rM, rF;

        //
        name_label = new JLabel("Name: ");
        name_label.setBounds(25, 50, 100, 30);

        name_text = new JTextField(15);
        name_text.setBounds(100, 50, 100, 30);

        //
        gender_label = new JLabel("Gender: ");
        gender_label.setBounds(25, 100, 100, 30);

        rM = new JRadioButton("Male");
        rM.setBounds(100, 100, 100, 30);

        rF = new JRadioButton("Female");
        rF.setBounds(100, 125, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rM);
        bg.add(rF);

        //
        prog_label = new JLabel("Prog. Lang.");
        prog_label.setBounds(25, 170, 100, 30);

        // 
        String languages[] = {"c++", "c#", "Java", "Python"};

        JComboBox cb = new JComboBox(languages);
        cb.setBounds(100, 170, 100, 30);

        //
        JButton submit_button = new JButton();
        submit_button.setText("Submit");
        submit_button.setBounds(100, 210, 100, 30);

        JMenuBar mb = new JMenuBar();

        JMenu File = new JMenu("File");
        JMenuItem Menu1, Menu2;

        Menu1 = new JMenuItem("Menu 1");
        Menu2 = new JMenuItem("Menu 2");

        File.add(Menu1);
        File.add(Menu2);

        JMenu Edit = new JMenu("Edit");
        JMenuItem Edit1;

        Edit1 = new JMenuItem("Edit 1");

        Edit.add(Edit1);

        JMenu Delete = new JMenu("Delete");

        frame.add(name_label);
        frame.add(gender_label);
        frame.add(name_text);
        frame.add(rM);
        frame.add(rF);
        frame.add(prog_label);
        frame.add(cb);
        frame.add(submit_button);

        mb.add(File);
        mb.add(Edit);
        mb.add(Delete);
        frame.setJMenuBar(mb);

        frame.setSize(300, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
