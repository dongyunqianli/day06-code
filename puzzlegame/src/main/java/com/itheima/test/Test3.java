package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(603,680);
        jFrame.setTitle("事件演示");
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        JButton jtb = new JButton("click me");
        jtb.setBounds(0,0,100,50);


//        jtb.addActionListener(new MyActionListener());
/*        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("达咩~不要点我哦~");
            }
        });*/
        jtb.addActionListener(e -> System.out.println("达咩~不要点我哦~"));


        jFrame.getContentPane().add(jtb);
        jFrame.setVisible(true);
    }
}
