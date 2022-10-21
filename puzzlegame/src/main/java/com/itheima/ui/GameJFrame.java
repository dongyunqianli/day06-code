package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    int[][] data = new int[4][4];

    int x,y;

    String path="puzzlegame\\image\\girl\\girl3\\";
    int[][] win={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    int step=0;


    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");


    public GameJFrame(){
        initJFrame();

        initJMenuBar();

        initData();
        
        initImage();

        this.setVisible(true);
    }

    private void initData() {
        int[] tempArr = new int[16];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i]=i;
        }
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index;
            do{
                index = r.nextInt(tempArr.length);
            }while(i==index);
            tempArr[i]^=tempArr[index];
            tempArr[index]^=tempArr[i];
            tempArr[i]^=tempArr[index];
        }

        for (int i = 0; i < tempArr.length; i++) {
            if(tempArr[i]==0){
                x=i/4;
                y=i%4;
            }
            data[i/4][i%4]=tempArr[i];
        }
    }

    private void initImage() {
        this.getContentPane().removeAll();

        if(victory()){
            //D:\wiLearn2\HMjavaBasic\code\day06-code\puzzlegame\image\win.png
            JLabel winJLabel = new JLabel(new ImageIcon("puzzlegame\\image\\win.png"));
            winJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJLabel);
        }



        JLabel setpCount = new JLabel("step: "+step);
        setpCount.setBounds(50,30,100,20);
        this.getContentPane().add(setpCount);



        for (int i=0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel jLabel = new JLabel(new ImageIcon(path+(data[i][j])+".jpg"));
                jLabel.setBounds(105*j+83,105*i+134,105,105);
                jLabel.setBorder(new BevelBorder(0));
                this.getContentPane().add(jLabel);
            }
        }

        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);

        this.getContentPane().repaint();




    }

    private void initJMenuBar() {
        /* 初始化菜单*/
        JMenuBar jMenuBar = new JMenuBar();
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");



        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);


        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603,680);

        setTitle("拼图单机版 v1.0");
        setAlwaysOnTop(true);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
//        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);


        this.setLayout(null);

        this.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==65){
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path+"all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);

            JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
            background.setBounds(40,40,508,560);
            this.getContentPane().add(background);

            this.getContentPane().repaint();

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(victory())return;
        switch (e.getKeyCode()){
            case 37 :
                System.out.println("<-");
                if(y<3) {
                    data[x][y] = data[x][y + 1];
                    data[x][y + 1] = 0;
                    y++;
                    step++;
                    initImage();
                }
                break;
            case 38 :
                System.out.println("上");
                if(x<3){
                    data[x][y]=data[x+1][y];
                    data[x+1][y]=0;
                    x++;
                    step++;
                    initImage();

                }
                break;
            case 39 :
                System.out.println("->");
                if(y>0){
                    data[x][y]=data[x][y-1];
                    data[x][y-1]=0;
                    y--;
                    step++;
                    initImage();

                }
                break;
            case 40 :
                System.out.println("下");
                if(x>0){
                    data[x][y]=data[x-1][y];
                    data[x-1][y]=0;
                    x--;
                    step++;
                    initImage();
                }
                break;
            case 65:
                initImage();
                break;
            case 87:
                for (int i = 0; i < 15; i++) {
                    data[i/4][i%4]=i+1;
//                    System.out.println("data["+i/4+"]["+i%4+"]=" + (i+1));
                }
                data[3][3]=0;
                initImage();
                break;
        }

    }


    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j]!=win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (replayItem.equals(e.getSource())) {
            System.out.println("restart game");

            step=0;
            initData();
            initImage();

        }

        if (reLoginItem.equals(e.getSource())) {
            System.out.println("login again");

            this.setVisible(false);
            new LoginJFrame();

        }

        if (closeItem.equals(e.getSource())) {
            System.out.println("close game");
            System.exit(0);
        }

        if (accountItem.equals(e.getSource())) {
            System.out.println("公众号");
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("puzzlegame\\image\\about.png"));
            jLabel.setBounds(0,0,258,258);
            jDialog.getContentPane().add(jLabel);

            jDialog.setSize(344,344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);

            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
    }
}
