//Making a GUI in Java

package com.company;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui implements ActionListener
{
    private int counts=0;
    private final JLabel label;

    public Gui()
    {
        JButton button = new JButton("Click Me!");
        button.addActionListener(this);
        label=new JLabel("Number of Clicks: "+counts);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(350,200);
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));

        frame.add(panel,BorderLayout.CENTER);
        panel.add(button);
        panel.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] arg)
    {
        new Gui();
    }

    public void actionPerformed(ActionEvent e)
    {
        counts++;
        label.setText("Number of Clicks: "+counts);
    }
}
