package views;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Ahmet
 */
public class GameScene extends javax.swing.JFrame {

    Dices dices = new Dices();
    ArrayList<JLabel> labels = new ArrayList<>();
    
    public GameScene() {
        initComponents();
        loadDicePictures();
        labels.add(dice1lbl);
        labels.add(dice02lbl);
        labels.add(dice03lbl);
        labels.add(dice04lbl);
        labels.add(dice05lbl);   
    }
   

    public void loadDicePictures() {
        dice1lbl.setIcon(dices.getDice01Image());
        dice02lbl.setIcon(dices.getDice02Image());
        dice03lbl.setIcon(dices.getDice03Image());
        dice04lbl.setIcon(dices.getDice04Image());
        dice05lbl.setIcon(dices.getDice05Image());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ones = new javax.swing.JLabel();
        twos = new javax.swing.JLabel();
        threes = new javax.swing.JLabel();
        fours = new javax.swing.JLabel();
        fives = new javax.swing.JLabel();
        Sixes = new javax.swing.JLabel();
        onesValue1 = new javax.swing.JButton();
        onesValue2 = new javax.swing.JButton();
        foursValue2 = new javax.swing.JButton();
        twosValue1 = new javax.swing.JButton();
        twosValue2 = new javax.swing.JButton();
        threesValue1 = new javax.swing.JButton();
        threesValue2 = new javax.swing.JButton();
        fivesValue1 = new javax.swing.JButton();
        fivesValue2 = new javax.swing.JButton();
        sixesValue2 = new javax.swing.JButton();
        sum = new javax.swing.JLabel();
        threeKind = new javax.swing.JLabel();
        Sixes3 = new javax.swing.JLabel();
        threeKind1 = new javax.swing.JButton();
        sixesValue1 = new javax.swing.JButton();
        threeKind2 = new javax.swing.JButton();
        sumPlayer2 = new javax.swing.JLabel();
        totalPlayer2 = new javax.swing.JLabel();
        bonusPlayer2 = new javax.swing.JLabel();
        bonusPlayer1 = new javax.swing.JLabel();
        fourKind2 = new javax.swing.JButton();
        fourKind1 = new javax.swing.JButton();
        fourKind = new javax.swing.JLabel();
        largeS = new javax.swing.JLabel();
        full2 = new javax.swing.JButton();
        full1 = new javax.swing.JButton();
        smallS1 = new javax.swing.JButton();
        chance1 = new javax.swing.JButton();
        smallS2 = new javax.swing.JButton();
        largeS2 = new javax.swing.JButton();
        fullH = new javax.swing.JLabel();
        smallS = new javax.swing.JLabel();
        chance2 = new javax.swing.JButton();
        largeS1 = new javax.swing.JButton();
        yahtzee2 = new javax.swing.JButton();
        yahtzee1 = new javax.swing.JButton();
        large = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        sumPlayer3 = new javax.swing.JLabel();
        totalPlayer1 = new javax.swing.JLabel();
        largeS3 = new javax.swing.JLabel();
        dice1lbl = new javax.swing.JLabel();
        dice02lbl = new javax.swing.JLabel();
        dice03lbl = new javax.swing.JLabel();
        dice04lbl = new javax.swing.JLabel();
        dice05lbl = new javax.swing.JLabel();
        foursValue1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        roll = new javax.swing.JButton();
        h5 = new javax.swing.JButton();
        h1 = new javax.swing.JButton();
        h2 = new javax.swing.JButton();
        h3 = new javax.swing.JButton();
        h4 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Y A H T Z E E");
        setBackground(new java.awt.Color(126, 202, 156));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(126, 202, 156));
        setPreferredSize(new java.awt.Dimension(1130, 1014));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Player 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Player 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(968, 70, -1, -1));

        ones.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ones.setText("Ones");
        getContentPane().add(ones, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 108, 110, 30));

        twos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        twos.setText("Twos");
        getContentPane().add(twos, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 153, 110, 32));

        threes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        threes.setText("Threes");
        getContentPane().add(threes, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 205, 110, 32));

        fours.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fours.setText("Fours");
        getContentPane().add(fours, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 260, 110, 32));

        fives.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fives.setText("Fives");
        getContentPane().add(fives, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 311, 110, 32));

        Sixes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Sixes.setText("Sixes");
        getContentPane().add(Sixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 362, 110, 32));

        onesValue1.setText("-");
        onesValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onesValue1ActionPerformed(evt);
            }
        });
        getContentPane().add(onesValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 108, 94, 33));

        onesValue2.setText("-");
        onesValue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onesValue2ActionPerformed(evt);
            }
        });
        getContentPane().add(onesValue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 108, 94, 33));

        foursValue2.setText("-");
        foursValue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foursValue2ActionPerformed(evt);
            }
        });
        getContentPane().add(foursValue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 260, 94, 33));

        twosValue1.setText("-");
        twosValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twosValue1ActionPerformed(evt);
            }
        });
        getContentPane().add(twosValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 155, 94, 33));

        twosValue2.setText("-");
        twosValue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twosValue2ActionPerformed(evt);
            }
        });
        getContentPane().add(twosValue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 153, 94, 33));

        threesValue1.setText("-");
        threesValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threesValue1ActionPerformed(evt);
            }
        });
        getContentPane().add(threesValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 205, 94, 33));

        threesValue2.setText("-");
        threesValue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threesValue2ActionPerformed(evt);
            }
        });
        getContentPane().add(threesValue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 205, 94, 33));

        fivesValue1.setText("-");
        fivesValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivesValue1ActionPerformed(evt);
            }
        });
        getContentPane().add(fivesValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, 94, 33));

        fivesValue2.setText("-");
        fivesValue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivesValue2ActionPerformed(evt);
            }
        });
        getContentPane().add(fivesValue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 311, 94, 33));

        sixesValue2.setText("-");
        sixesValue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixesValue2ActionPerformed(evt);
            }
        });
        getContentPane().add(sixesValue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 362, 94, 35));

        sum.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        sum.setText("Sum");
        getContentPane().add(sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 424, 110, 32));

        threeKind.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        threeKind.setText("Three of a kind");
        getContentPane().add(threeKind, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 526, 110, 32));

        Sixes3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Sixes3.setText("Bonus");
        getContentPane().add(Sixes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 476, 110, 32));

        threeKind1.setText("-");
        getContentPane().add(threeKind1, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 528, 94, 33));

        sixesValue1.setText("-");
        sixesValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixesValue1ActionPerformed(evt);
            }
        });
        getContentPane().add(sixesValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 364, 94, 33));

        threeKind2.setText("-");
        getContentPane().add(threeKind2, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 528, 94, 33));

        sumPlayer2.setText("sumPlayer2");
        getContentPane().add(sumPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 425, 94, 33));

        totalPlayer2.setText("totalPlayer2");
        getContentPane().add(totalPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 895, 94, 33));

        bonusPlayer2.setText("bonusPlayer2");
        getContentPane().add(bonusPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(959, 477, 93, 33));

        bonusPlayer1.setText("bonusPlayer1");
        getContentPane().add(bonusPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 477, 94, 33));

        fourKind2.setText("-");
        getContentPane().add(fourKind2, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 578, 94, 33));

        fourKind1.setText("-");
        getContentPane().add(fourKind1, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 578, 94, 33));

        fourKind.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fourKind.setText("Four of a kind");
        getContentPane().add(fourKind, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 576, 110, 32));

        largeS.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        largeS.setText("Chance");
        getContentPane().add(largeS, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 788, 110, 32));

        full2.setText("-");
        getContentPane().add(full2, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 629, 94, 33));

        full1.setText("-");
        getContentPane().add(full1, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 631, 94, 33));

        smallS1.setText("-");
        getContentPane().add(smallS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 684, 94, 33));

        chance1.setText("-");
        getContentPane().add(chance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 790, 94, 33));

        smallS2.setText("-");
        getContentPane().add(smallS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 684, 94, 33));

        largeS2.setText("-");
        getContentPane().add(largeS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 737, 94, 33));

        fullH.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fullH.setText("Full House");
        getContentPane().add(fullH, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 629, 110, 32));

        smallS.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        smallS.setText("Small straight");
        getContentPane().add(smallS, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 682, 110, 32));

        chance2.setText("-");
        getContentPane().add(chance2, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 790, 94, 33));

        largeS1.setText("-");
        getContentPane().add(largeS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 737, 94, 33));

        yahtzee2.setText("-");
        getContentPane().add(yahtzee2, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 843, 94, 33));

        yahtzee1.setText("-");
        getContentPane().add(yahtzee1, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 843, 94, 33));

        large.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        large.setText("Large straight");
        getContentPane().add(large, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 735, 110, 32));

        total.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        total.setText("TOTAL SCORE");
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 894, 110, 32));

        sumPlayer3.setText("sumPlayer1");
        getContentPane().add(sumPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 424, 94, 33));

        totalPlayer1.setText("totalPlayer1");
        getContentPane().add(totalPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 895, 94, 33));

        largeS3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        largeS3.setText("YAHTZEE");
        getContentPane().add(largeS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 841, 110, 32));

        dice1lbl.setText("jLabel1");
        getContentPane().add(dice1lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 110, 110));

        dice02lbl.setText("jLabel1");
        getContentPane().add(dice02lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 110, 110));

        dice03lbl.setText("jLabel1");
        getContentPane().add(dice03lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 110, 110));

        dice04lbl.setText("jLabel1");
        getContentPane().add(dice04lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 110, 110));

        dice05lbl.setText("jLabel1");
        getContentPane().add(dice05lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 110, 110));

        foursValue1.setText("-");
        foursValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foursValue1ActionPerformed(evt);
            }
        });
        getContentPane().add(foursValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 260, 94, 33));

        jPanel1.setBackground(new java.awt.Color(220, 220, 220));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 450, 910));

        roll.setText("ROLL DICES");
        roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollActionPerformed(evt);
            }
        });
        getContentPane().add(roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 810, 340, 70));

        h5.setText("H");
        getContentPane().add(h5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 630, 40, 110));

        h1.setText("H");
        getContentPane().add(h1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 40, 110));

        h2.setText("H");
        getContentPane().add(h2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 40, 110));

        h3.setText("H");
        getContentPane().add(h3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 40, 110));

        h4.setText("H");
        getContentPane().add(h4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 40, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void onesValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onesValue1ActionPerformed
        onesValue1.setEnabled(false);

    }//GEN-LAST:event_onesValue1ActionPerformed

    private void onesValue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onesValue2ActionPerformed
        onesValue2.setEnabled(false);
    }//GEN-LAST:event_onesValue2ActionPerformed

    private void twosValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twosValue1ActionPerformed
        twosValue1.setEnabled(false);
    }//GEN-LAST:event_twosValue1ActionPerformed

    private void twosValue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twosValue2ActionPerformed
        twosValue2.setEnabled(false);
    }//GEN-LAST:event_twosValue2ActionPerformed

    private void threesValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threesValue1ActionPerformed
        threesValue1.setEnabled(false);
    }//GEN-LAST:event_threesValue1ActionPerformed

    private void threesValue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threesValue2ActionPerformed
        threesValue2.setEnabled(false);
    }//GEN-LAST:event_threesValue2ActionPerformed

    private void foursValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foursValue1ActionPerformed
        foursValue1.setEnabled(false);
    }//GEN-LAST:event_foursValue1ActionPerformed

    private void foursValue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foursValue2ActionPerformed
        foursValue2.setEnabled(false);
    }//GEN-LAST:event_foursValue2ActionPerformed

    private void fivesValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivesValue1ActionPerformed
        fivesValue1.setEnabled(false);
    }//GEN-LAST:event_fivesValue1ActionPerformed

    private void fivesValue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivesValue2ActionPerformed
        fivesValue2.setEnabled(false);
    }//GEN-LAST:event_fivesValue2ActionPerformed

    private void sixesValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixesValue1ActionPerformed
        sixesValue1.setEnabled(false);
    }//GEN-LAST:event_sixesValue1ActionPerformed

    private void sixesValue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixesValue2ActionPerformed
        sixesValue2.setEnabled(false);
    }//GEN-LAST:event_sixesValue2ActionPerformed

    private void rollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollActionPerformed
        
        System.out.println(dice1lbl.getWidth()+" "+dice1lbl.getHeight());
        // randomizing dices in array
        ArrayList<ImageIcon> icons = dices.getIcons();
        Random rand = new Random();
        
        // shuffle icons and labels and match them randomly
        Collections.shuffle(icons);
        Collections.shuffle(labels);
        
        // every label get random dice
        int random = 0;
        for (int i = 0; i < 5; i++) {
            random = rand.nextInt(4);
            System.out.println(random);
            labels.get(i).setIcon(icons.get(random));
        }
        System.out.println("---------");

        
         
        
    }//GEN-LAST:event_rollActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameScene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GameScene gs = new GameScene();
                gs.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sixes;
    private javax.swing.JLabel Sixes3;
    private javax.swing.JLabel bonusPlayer1;
    private javax.swing.JLabel bonusPlayer2;
    private javax.swing.JButton chance1;
    private javax.swing.JButton chance2;
    private javax.swing.JLabel dice02lbl;
    private javax.swing.JLabel dice03lbl;
    private javax.swing.JLabel dice04lbl;
    private javax.swing.JLabel dice05lbl;
    private javax.swing.JLabel dice1lbl;
    private javax.swing.JLabel fives;
    private javax.swing.JButton fivesValue1;
    private javax.swing.JButton fivesValue2;
    private javax.swing.JLabel fourKind;
    private javax.swing.JButton fourKind1;
    private javax.swing.JButton fourKind2;
    private javax.swing.JLabel fours;
    private javax.swing.JButton foursValue1;
    private javax.swing.JButton foursValue2;
    private javax.swing.JButton full1;
    private javax.swing.JButton full2;
    private javax.swing.JLabel fullH;
    private javax.swing.JButton h1;
    private javax.swing.JButton h2;
    private javax.swing.JButton h3;
    private javax.swing.JButton h4;
    private javax.swing.JButton h5;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel large;
    private javax.swing.JLabel largeS;
    private javax.swing.JButton largeS1;
    private javax.swing.JButton largeS2;
    private javax.swing.JLabel largeS3;
    private javax.swing.JLabel ones;
    private javax.swing.JButton onesValue1;
    private javax.swing.JButton onesValue2;
    private javax.swing.JButton roll;
    private javax.swing.JButton sixesValue1;
    private javax.swing.JButton sixesValue2;
    private javax.swing.JLabel smallS;
    private javax.swing.JButton smallS1;
    private javax.swing.JButton smallS2;
    private javax.swing.JLabel sum;
    private javax.swing.JLabel sumPlayer2;
    private javax.swing.JLabel sumPlayer3;
    private javax.swing.JLabel threeKind;
    private javax.swing.JButton threeKind1;
    private javax.swing.JButton threeKind2;
    private javax.swing.JLabel threes;
    private javax.swing.JButton threesValue1;
    private javax.swing.JButton threesValue2;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalPlayer1;
    private javax.swing.JLabel totalPlayer2;
    private javax.swing.JLabel twos;
    private javax.swing.JButton twosValue1;
    private javax.swing.JButton twosValue2;
    private javax.swing.JButton yahtzee1;
    private javax.swing.JButton yahtzee2;
    // End of variables declaration//GEN-END:variables
}