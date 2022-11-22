package com.tictactoe;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe extends javax.swing.JFrame {
    
    private String startgame = "X";
    private int xcount = 0;
    private int ocount = 0;
    boolean checker;

    public TicTacToe() {
        initComponents();
    }

    private void choosePlayer() { // checking the player turn
        if (startgame.equalsIgnoreCase("X")) {
            startgame = "O";
        } else {
            startgame = "X";
        }
    }

    public void winGame() {
        String b1 = btntick1.getText();
        String b2 = btntick2.getText();
        String b3 = btntick3.getText();
        String b4 = btntick4.getText();
        String b5 = btntick5.getText();
        String b6 = btntick6.getText();
        String b7 = btntick7.getText();
        String b8 = btntick8.getText();
        String b9 = btntick9.getText();

           if (b1.equals("X") && b2.equals("X") && b3.equals("X")) {

            btntick1.setBackground(Color.orange);
            btntick2.setBackground(Color.orange);
            btntick3.setBackground(Color.orange);
            xcount++;
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            resetcolor();

        }

        if (b4.equals("X") && b5.equals("X") && b6.equals("X")) {

            btntick4.setBackground(Color.orange);
            btntick5.setBackground(Color.orange);
            btntick6.setBackground(Color.orange);
            xcount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetcolor();

        }
        if (b7.equals("X") && b8.equals("X") && b9.equals("X")) {

            btntick7.setBackground(Color.orange);
            btntick8.setBackground(Color.orange);
            btntick9.setBackground(Color.orange);
            xcount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetcolor();

        }

        if (b1.equals("X") && b4.equals("X") && b7.equals("X")) {

            btntick1.setBackground(Color.orange);
            btntick4.setBackground(Color.orange);
            btntick7.setBackground(Color.orange);
            xcount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetcolor();

        }

        if (b2.equals("X") && b5.equals("X") && b8.equals("X")) {

            btntick2.setBackground(Color.orange);
            btntick5.setBackground(Color.orange);
            btntick8.setBackground(Color.orange);
            xcount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetcolor();

        }

        if (b3.equals("X") && b6.equals("X") && b9.equals("X")) {

            btntick3.setBackground(Color.orange);
            btntick6.setBackground(Color.orange);
            btntick9.setBackground(Color.orange);
            xcount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetcolor();

        }
        if (b1.equals("X") && b5.equals("X") && b9.equals("X")) {

            btntick1.setBackground(Color.orange);
            btntick5.setBackground(Color.orange);
            btntick9.setBackground(Color.orange);
            xcount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetcolor();

        }
        if (b3.equals("X") && b5.equals("X") && b7.equals("X")) {

            btntick3.setBackground(Color.orange);
            btntick5.setBackground(Color.orange);
            btntick7.setBackground(Color.orange);
            xcount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetcolor();

        }

        if (b1.equals("O") && b2.equals("O") && b3.equals("O")) {

            btntick1.setBackground(Color.orange);
            btntick2.setBackground(Color.orange);
            btntick3.setBackground(Color.orange);
            ocount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetcolor();

        }

        if (b4.equals("O") && b5.equals("O") && b6.equals("O")) {
            btntick5.setBackground(Color.orange);
            btntick6.setBackground(Color.orange);
            ocount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetcolor();

        }
        if (b7.equals("O") && b8.equals("O") && b9.equals("O")) {

            btntick7.setBackground(Color.orange);
            btntick8.setBackground(Color.orange);
            btntick9.setBackground(Color.orange);
            ocount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetcolor();

        }

        if (b1.equals("O") && b4.equals("O") && b7.equals("O")) {

            btntick1.setBackground(Color.orange);
            btntick4.setBackground(Color.orange);
            btntick7.setBackground(Color.orange);
            ocount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetcolor();

        }

        if (b2.equals("O") && b5.equals("O") && b8.equals("O")) {

            btntick2.setBackground(Color.orange);
            btntick5.setBackground(Color.orange);
            btntick8.setBackground(Color.orange);
            ocount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetcolor();

        }

        if (b3.equals("O") && b6.equals("O") && b9.equals("O")) {

            btntick3.setBackground(Color.orange);
            btntick6.setBackground(Color.orange);
            btntick9.setBackground(Color.orange);
            ocount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetcolor();

        }
        if (b1.equals("O") && b5.equals("O") && b9.equals("O")) {

            btntick1.setBackground(Color.orange);
            btntick5.setBackground(Color.orange);
            btntick9.setBackground(Color.orange);
            ocount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetcolor();

        }
        if (b3.equals("O") && b5.equals("O") && b7.equals("O")) {

            btntick3.setBackground(Color.orange);
            btntick5.setBackground(Color.orange);
            btntick7.setBackground(Color.orange);
            ocount++;
            gameScore();

            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetcolor();

        }
    }

    public void gameScore() {
        jlblplayer0.setText("" + ocount);
        jlblplayerx.setText("" + xcount);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btntick2 = new javax.swing.JButton();
        btntick3 = new javax.swing.JButton();
        btntick4 = new javax.swing.JButton();
        btntick7 = new javax.swing.JButton();
        btntick5 = new javax.swing.JButton();
        btntick6 = new javax.swing.JButton();
        btntick8 = new javax.swing.JButton();
        btntick9 = new javax.swing.JButton();
        btntick1 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblplayer0 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlblplayerx = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 100));
        setMinimumSize(new java.awt.Dimension(700, 800));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(770, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setAutoscrolls(true);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btntick2.setBackground(new java.awt.Color(255, 255, 255));
        btntick2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btntick2.setToolTipText("");
        btntick2.setMaximumSize(new java.awt.Dimension(200, 158));
        btntick2.setMinimumSize(new java.awt.Dimension(200, 158));
        btntick2.setPreferredSize(new java.awt.Dimension(200, 158));
        btntick2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntick2ActionPerformed(evt);
            }
        });
        jPanel3.add(btntick2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 220, 130));

        btntick3.setBackground(new java.awt.Color(255, 255, 255));
        btntick3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btntick3.setToolTipText("");
        btntick3.setMaximumSize(new java.awt.Dimension(200, 158));
        btntick3.setMinimumSize(new java.awt.Dimension(200, 158));
        btntick3.setPreferredSize(new java.awt.Dimension(200, 158));
        btntick3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntick3ActionPerformed(evt);
            }
        });
        jPanel3.add(btntick3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 220, 130));

        btntick4.setBackground(new java.awt.Color(255, 255, 255));
        btntick4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btntick4.setToolTipText("");
        btntick4.setMaximumSize(new java.awt.Dimension(200, 158));
        btntick4.setMinimumSize(new java.awt.Dimension(200, 158));
        btntick4.setPreferredSize(new java.awt.Dimension(200, 158));
        btntick4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntick4ActionPerformed(evt);
            }
        });
        jPanel3.add(btntick4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 220, 130));

        btntick7.setBackground(new java.awt.Color(255, 255, 255));
        btntick7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btntick7.setToolTipText("");
        btntick7.setMaximumSize(new java.awt.Dimension(200, 158));
        btntick7.setMinimumSize(new java.awt.Dimension(200, 158));
        btntick7.setPreferredSize(new java.awt.Dimension(200, 158));
        btntick7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntick7ActionPerformed(evt);
            }
        });
        jPanel3.add(btntick7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 220, 130));

        btntick5.setBackground(new java.awt.Color(255, 255, 255));
        btntick5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btntick5.setToolTipText("");
        btntick5.setMaximumSize(new java.awt.Dimension(200, 158));
        btntick5.setMinimumSize(new java.awt.Dimension(200, 158));
        btntick5.setPreferredSize(new java.awt.Dimension(200, 158));
        btntick5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntick5ActionPerformed(evt);
            }
        });
        jPanel3.add(btntick5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 220, 130));

        btntick6.setBackground(new java.awt.Color(255, 255, 255));
        btntick6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btntick6.setToolTipText("");
        btntick6.setMaximumSize(new java.awt.Dimension(200, 158));
        btntick6.setMinimumSize(new java.awt.Dimension(200, 158));
        btntick6.setPreferredSize(new java.awt.Dimension(200, 158));
        btntick6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntick6ActionPerformed(evt);
            }
        });
        jPanel3.add(btntick6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 220, 130));

        btntick8.setBackground(new java.awt.Color(255, 255, 255));
        btntick8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btntick8.setToolTipText("");
        btntick8.setMaximumSize(new java.awt.Dimension(200, 158));
        btntick8.setMinimumSize(new java.awt.Dimension(200, 158));
        btntick8.setPreferredSize(new java.awt.Dimension(200, 158));
        btntick8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntick8ActionPerformed(evt);
            }
        });
        jPanel3.add(btntick8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 220, 130));

        btntick9.setBackground(new java.awt.Color(255, 255, 255));
        btntick9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btntick9.setToolTipText("");
        btntick9.setMaximumSize(new java.awt.Dimension(200, 158));
        btntick9.setMinimumSize(new java.awt.Dimension(200, 158));
        btntick9.setPreferredSize(new java.awt.Dimension(200, 158));
        btntick9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntick9ActionPerformed(evt);
            }
        });
        jPanel3.add(btntick9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 220, 130));

        btntick1.setBackground(new java.awt.Color(255, 255, 255));
        btntick1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btntick1.setToolTipText("");
        btntick1.setMaximumSize(new java.awt.Dimension(200, 158));
        btntick1.setMinimumSize(new java.awt.Dimension(200, 158));
        btntick1.setPreferredSize(new java.awt.Dimension(200, 158));
        btntick1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntick1ActionPerformed(evt);
            }
        });
        jPanel3.add(btntick1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 130));

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton22.setToolTipText("");
        jButton22.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton22.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton22.setPreferredSize(new java.awt.Dimension(200, 158));
        jPanel3.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 130));

        jButton23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton23.setToolTipText("");
        jButton23.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton23.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton23.setPreferredSize(new java.awt.Dimension(200, 158));
        jPanel3.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 130));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 700, 430));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setAutoscrolls(true);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel6.setAutoscrolls(true);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Player O:");
        jLabel1.setToolTipText("");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, 60));

        jlblplayer0.setBackground(new java.awt.Color(255, 255, 255));
        jlblplayer0.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlblplayer0.setForeground(new java.awt.Color(51, 51, 51));
        jlblplayer0.setText("0");
        jlblplayer0.setToolTipText("");
        jlblplayer0.setOpaque(true);
        jPanel6.add(jlblplayer0, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 90, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Player X:");
        jLabel3.setToolTipText("");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 80));

        jlblplayerx.setBackground(new java.awt.Color(255, 255, 255));
        jlblplayerx.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlblplayerx.setForeground(new java.awt.Color(51, 51, 51));
        jlblplayerx.setText("0");
        jlblplayerx.setToolTipText("");
        jlblplayerx.setOpaque(true);
        jPanel6.add(jlblplayerx, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 90, 60));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 180));

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton25.setText("New Game");
        jButton25.setToolTipText("");
        jButton25.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton25.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton25.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 270, 100));

        btnreset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnreset.setText("Reset");
        btnreset.setToolTipText("");
        btnreset.setMaximumSize(new java.awt.Dimension(200, 158));
        btnreset.setMinimumSize(new java.awt.Dimension(200, 158));
        btnreset.setPreferredSize(new java.awt.Dimension(200, 158));
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel4.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 130, 70));

        btnexit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnexit.setText("Exit");
        btnexit.setToolTipText("");
        btnexit.setMaximumSize(new java.awt.Dimension(200, 158));
        btnexit.setMinimumSize(new java.awt.Dimension(200, 158));
        btnexit.setPreferredSize(new java.awt.Dimension(200, 158));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel4.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 130, 70));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 690, 200));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.setAutoscrolls(true);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("    Tic Tac Toe Game");
        jLabel4.setToolTipText("");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 530, 90));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 700, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 800, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private JFrame exitFrame;
    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        exitFrame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(exitFrame, "Confirm if You Want To exit ", "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnexitActionPerformed
    private JFrame rstframe;

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed

        btntick1.setEnabled(true);
        btntick2.setEnabled(true);
        btntick3.setEnabled(true);
        btntick4.setEnabled(true);
        btntick5.setEnabled(true);
        btntick6.setEnabled(true);
        btntick7.setEnabled(true);
        btntick8.setEnabled(true);
        btntick9.setEnabled(true);

        btntick1.setText("");
        btntick2.setText("");
        btntick3.setText("");
        btntick4.setText("");
        btntick5.setText("");
        btntick6.setText("");
        btntick7.setText("");
        btntick8.setText("");
        btntick9.setText("");

      
        btntick1.setBackground(Color.white);
        btntick2.setBackground(Color.white);
        btntick3.setBackground(Color.white);
        btntick4.setBackground(Color.white);
        btntick5.setBackground(Color.white);
        btntick6.setBackground(Color.white);
        btntick7.setBackground(Color.white);
        btntick8.setBackground(Color.white);
        btntick9.setBackground(Color.white);


    }//GEN-LAST:event_btnresetActionPerformed

    public void resetcolor() {
        btntick1.setEnabled(true);
        btntick2.setEnabled(true);
        btntick3.setEnabled(true);
        btntick4.setEnabled(true);
        btntick5.setEnabled(true);
        btntick6.setEnabled(true);
        btntick7.setEnabled(true);
        btntick8.setEnabled(true);
        btntick9.setEnabled(true);

        btntick1.setText("");
        btntick2.setText("");
        btntick3.setText("");
        btntick4.setText("");
        btntick5.setText("");
        btntick6.setText("");
        btntick7.setText("");
        btntick8.setText("");
        btntick9.setText("");

        btntick1.setBackground(Color.white);
        btntick2.setBackground(Color.white);
        btntick3.setBackground(Color.white);
        btntick4.setBackground(Color.white);
        btntick5.setBackground(Color.white);
        btntick6.setBackground(Color.white);
        btntick7.setBackground(Color.white);
        btntick8.setBackground(Color.white);
        btntick9.setBackground(Color.white);
    }
    private void btntick1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntick1ActionPerformed
        btntick1.setText(startgame);

        if (startgame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        
        choosePlayer();

        winGame();


    }//GEN-LAST:event_btntick1ActionPerformed

    private void btntick2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntick2ActionPerformed
        btntick2.setText(startgame);
        if (startgame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choosePlayer();

        winGame();


    }//GEN-LAST:event_btntick2ActionPerformed

    private void btntick3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntick3ActionPerformed
        btntick3.setText(startgame);
        if (startgame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choosePlayer();

        winGame();


    }//GEN-LAST:event_btntick3ActionPerformed

    private void btntick4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntick4ActionPerformed
        btntick4.setText(startgame);
        if (startgame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choosePlayer();

        winGame();


    }//GEN-LAST:event_btntick4ActionPerformed

    private void btntick5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntick5ActionPerformed
        btntick5.setText(startgame);
        if (startgame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choosePlayer();

        winGame();

    }//GEN-LAST:event_btntick5ActionPerformed

    private void btntick6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntick6ActionPerformed
        btntick6.setText(startgame);
        if (startgame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choosePlayer();

        winGame();


    }//GEN-LAST:event_btntick6ActionPerformed

    private void btntick7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntick7ActionPerformed
        btntick7.setText(startgame);
        if (startgame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choosePlayer();

        winGame();


    }//GEN-LAST:event_btntick7ActionPerformed

    private void btntick8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntick8ActionPerformed
        btntick8.setText(startgame);
        if (startgame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choosePlayer();

        winGame();


    }//GEN-LAST:event_btntick8ActionPerformed

    private void btntick9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntick9ActionPerformed
        btntick9.setText(startgame);
        if (startgame.equalsIgnoreCase("X")) {
            checker = false;
        } else {
            checker = true;
        }
        choosePlayer();

        winGame();

    }//GEN-LAST:event_btntick9ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        btntick1.setEnabled(true);
        btntick2.setEnabled(true);
        btntick3.setEnabled(true);
        btntick4.setEnabled(true);
        btntick5.setEnabled(true);
        btntick6.setEnabled(true);
        btntick7.setEnabled(true);
        btntick8.setEnabled(true);
        btntick9.setEnabled(true);

        btntick1.setText("");
        btntick2.setText("");
        btntick3.setText("");
        btntick4.setText("");
        btntick5.setText("");
        btntick6.setText("");
        btntick7.setText("");
        btntick8.setText("");
        btntick9.setText("");

        jlblplayer0.setText("0");
        jlblplayerx.setText("0");
        btntick1.setBackground(Color.white);
        btntick2.setBackground(Color.white);
        btntick3.setBackground(Color.white);
        btntick4.setBackground(Color.white);
        btntick5.setBackground(Color.white);
        btntick6.setBackground(Color.white);
        btntick7.setBackground(Color.white);
        btntick8.setBackground(Color.white);
        btntick9.setBackground(Color.white);
    }//GEN-LAST:event_jButton25ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btntick1;
    private javax.swing.JButton btntick2;
    private javax.swing.JButton btntick3;
    private javax.swing.JButton btntick4;
    private javax.swing.JButton btntick5;
    private javax.swing.JButton btntick6;
    private javax.swing.JButton btntick7;
    private javax.swing.JButton btntick8;
    private javax.swing.JButton btntick9;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton25;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jlblplayer0;
    private javax.swing.JLabel jlblplayerx;
    // End of variables declaration//GEN-END:variables
}
