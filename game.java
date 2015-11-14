/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impossible;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;

/**
 *
 * @author Gautham
 */
public class game extends javax.swing.JFrame {
    static String s;

    String[][] qpa;
    String[][] qca;
    int score;
    int q=1;
    int count;
    /**
     * Creates new form game
     */
    public game() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        initComponents();
        score=0;
        count=0;
         qpa=new String[10][5];

                        qpa[0][0]="How to run Java program on the command prompt?";
                        qpa[0][1]="javac JavaProgram";
                        qpa[0][2]="java JavaProgram";
                        qpa[0][3]="javac JavaProgram.java";
                        qpa[0][4]="No one";

                        qpa[1][0]="What is the use of the println method?";
                        qpa[1][1]="It is used to print text on the screen.";
                        qpa[1][2]="It is used to print text on the screen with the line break.";
                        qpa[1][3]="It is used to read text from keyboard.";
                        qpa[1][4]="It is used to read text from a file.";
                       
                        qpa[2][0]="How to read a character from the keyboard?";
                        qpa[2][1]="char c=System.read()";
                        qpa[2][2]="char c=System.in.read()";
                        qpa[2][3]="char c=(char)System.read()";
                        qpa[2][4]="char c=(char)System.in.read()";

                        qpa[3][0]="Which one is a single-line comment?";
                        qpa[3][1]="/...";
                        qpa[3][2]="//...";
                        qpa[3][3]="/*...";
                        qpa[3][4]="/*...*/";

                        qpa[4][0]="How do you declare an integer variable x?";
                        qpa[4][1]="int x";
                        qpa[4][2]="x as Integer";
                        qpa[4][3]="Int[] x";
                        qpa[4][4]="No one is correct.";

                        qpa[5][0]="How do you convert a string of number to a number?";
                        qpa[5][1]="int num=Integer.parseInt(str_num)";
                        qpa[5][2]="int num=str_num.toInteger()";
                        qpa[5][3]="int num=(int)str_num";
                        qpa[5][4]="int num=(Integer)str_num";

                        qpa[6][0]="What is the value of x? int x=3>>2";
                        qpa[6][1]="1";
                        qpa[6][2]="0";
                        qpa[6][3]="3";
                        qpa[6][4]="-3";

                        qpa[7][0]="How to do exit a loop?";
                        qpa[7][1]="Using exit";
                        qpa[7][2]="Using break";
                        qpa[7][3]="Using continue";
                        qpa[7][4]="Using terminate";

                        qpa[8][0]="What is the correct way to allocate one-dimensional array?";
                        qpa[8][1]="int[size] arr=new int[]";
                        qpa[8][2]="int arr[size]=new int[]";
                        qpa[8][3]="int[size] arr=new int[size]";
                        qpa[8][4]="int[] arr=new int[size]";

                        qpa[9][0]="What is the correct way to allocate two-dimensional array?";
                        qpa[9][1]="int[size][] arr=new int[][]";
                        qpa[9][2]="int arr=new int[rows][cols]";
                        qpa[9][3]="int arr[rows][]=new int[rows][cols]";
                        qpa[9][4]="int[][] arr=new int[rows][cols]";

                       
                        //qca stores pairs of question and its correct answer
                        qca=new String[10][2];
                       
                        qca[0][0]="How to run Java program on the command prompt?";
                        qca[0][1]="java JavaProgram";

                        qca[1][0]="What is the use of the println method?";
                        qca[1][1]="It is used to print text on the screen with the line break.";

                        qca[2][0]="How to read a character from the keyboard?";
                        qca[2][1]="char c=(char)System.in.read()";

                        qca[3][0]="Which one is a single-line comment?";
                        qca[3][1]="//...";


                        qca[4][0]="How do you declare an integer variable x?";
                        qca[4][1]="int x";

                        qca[5][0]="How do you convert a string of number to a number?";
                        qca[5][1]="int num=Integer.parseInt(str_num)";

                        qca[6][0]="What is the value of x? int x=3>>2";
                        qca[6][1]="0";
                       
                        qca[7][0]="How to do exit a loop?";
                        qca[7][1]="Using break";
                       
                        qca[8][0]="What is the correct way to allocate one-dimensional array?";
                        qca[8][1]="int[] arr=new int[size]";

                        qca[9][0]="What is the correct way to allocate two-dimensional array?";
                        qca[9][1]="int[][] arr=new int[rows][cols]";
                       
                        
      start(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jColorChooser1 = new javax.swing.JColorChooser();
        bg = new javax.swing.ButtonGroup();
        b1 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        b3 = new javax.swing.JRadioButton();
        b4 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bbnxt = new javax.swing.JButton();
        skip = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.add(b1);
        b1.setText("option1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        bg.add(b2);
        b2.setText("jRadioButton2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        bg.add(b3);
        b3.setText("jRadioButton3");

        bg.add(b4);
        b4.setText("jRadioButton4");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel2.setText("Score:000");

        bbnxt.setText("Next");
        bbnxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbnxtActionPerformed(evt);
            }
        });

        skip.setText("Skip");
        skip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipActionPerformed(evt);
            }
        });

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1)
                    .addComponent(b3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b2)
                    .addComponent(b4))
                .addGap(60, 60, 60))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(642, 642, 642)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bbnxt, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(skip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bbnxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(skip))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b3)
                    .addComponent(b4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    String getSelectedButtonText(ButtonGroup buttonGroup) {
    for (Enumeration buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
        AbstractButton button = (AbstractButton) buttons.nextElement();

        if (button.isSelected()) {
            return button.getText();
        }
    }

    return null;
}
    private void bbnxtActionPerformed(java.awt.event.ActionEvent evt) {                                      
     if(count<3)
     {
        
         
        if(getSelectedButtonText(bg)==qca[q][1])
        {score=score+100;
        
        }else{
            count++;
        }
         q++;
         start(q);
         jLabel2.setText("Score :"+score);
        System.out.println(score+" and " + count);
     
     }
     else
     { dispose();
          end e=new end();
          e.ending(score,s);}
// TODO add your handling code here:
    }                                     

    private void skipActionPerformed(java.awt.event.ActionEvent evt) {                                     
            q++;
            start(q);
        // TODO add your handling code here:
    }                                    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
System.exit(0);
        // TODO add your handling code here:
    }                                        
    public void start(int i){
        
            jLabel1.setText(qpa[i][0]);
            b1.setText(qpa[i][1]);
            b2.setText(qpa[i][2]);
            b3.setText(qpa[i][3]);
            b4.setText(qpa[i][4]);
       
    }
    /**
     * @param args the command line arguments
     */
    public static void Newgame(String user) {
        /* Set the Nimbu
        s look and feel */
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
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
s=user;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.JRadioButton b3;
    private javax.swing.JRadioButton b4;
    private javax.swing.JButton bbnxt;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton skip;
    // End of variables declaration                   
}
