/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ehtesham
 */
public class PostAd extends javax.swing.JFrame {

    /**
     * Creates new form PostAd
     */
    Connection conn;
    String  imgname;
    String  imgPath;
    String name;
    String pid;
    
    
    public PostAd(String name , String x) {
        initComponents();
        try {  
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/buyitdb","root","Shirin98@");
            System.out.println("Connected to Database");
        } catch (SQLException ex) {
           System.out.println("Not connected");
        }
        this.name=name;
        editButton.setVisible(false);
        
    }
    
    public PostAd(String pid , int x) {
        initComponents();
        jButton1.setVisible(false);
        jLabel2.setVisible(false);
        pidTF.setVisible(false);
        this.pid=pid;
        try {  
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/buyitdb","root","Shirin98@");
            System.out.println("Connected to Database");
        } catch (Exception ex) {
           System.out.println("Not connected");
        }
    }

    public PostAd() {
        initComponents();
        try {  
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/buyitdb","root","Shirin98@");
            System.out.println("Connected to Database");
        } catch (Exception ex) {
           System.out.println("Not connected");
        }
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        chooseImage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pidTF = new javax.swing.JTextField();
        sdescTF = new javax.swing.JTextField();
        ldescTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        editButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chooseImage.setText("Choose Image");
        chooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseImageActionPerformed(evt);
            }
        });

        jLabel2.setText("PID :");

        jLabel3.setText("Short Desc :");

        jLabel4.setText("Long desc :");

        sdescTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdescTFActionPerformed(evt);
            }
        });

        jButton1.setText("Post");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(editButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(chooseImage)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ldescTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addComponent(sdescTF, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pidTF, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sdescTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ldescTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(chooseImage)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(editButton))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseImageActionPerformed
        // TODO add your handling code here:
        JFileChooser j=new JFileChooser();
        int r=j.showOpenDialog(null);
        if(r==JFileChooser.APPROVE_OPTION)
        {
            String name=j.getSelectedFile().getName();
            if(!(name.contains(".jpg")||name.contains(".png")||name.contains(".jpeg")))
            {
                JOptionPane.showMessageDialog(null, "Select an image file");
                return;
            }
           // imgname.setText(name);
            imgPath=j.getSelectedFile().getAbsolutePath();
        }
    }//GEN-LAST:event_chooseImageActionPerformed

    private void sdescTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdescTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sdescTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String sql1 = "insert into items values(?,?)";
        String sql2= "insert into itemdesc values(?,?,?,?)";
        try{
            PreparedStatement ps1=conn.prepareStatement(sql1);
            ps1.setString(1, this.name);
            ps1.setString(2,pidTF.getText());
            ps1.execute();
            
           PreparedStatement ps2=conn.prepareStatement(sql2);
            ps2.setString(1,pidTF.getText() );
            ps2.setString(2,sdescTF.getText());
            ps2.setString(3, ldescTF.getText());
            ps2.setString(4, imgPath);
            ps2.execute();
            imgPath ="";
            ldescTF.setText("");
            sdescTF.setText("");
            
        }
        catch(Exception e)
        {System.out.println("error in post button");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        try{
            PreparedStatement ps3;
        if(sdescTF.getText()!=null)
        {
            String sql1= "update itemdesc set shortdesc = ? where pid =?";
            ps3=conn.prepareStatement(sql1);
            ps3.setString(1, sdescTF.getText());
            ps3.setString(2,this.pid);
            ps3.execute();
        }
        if(ldescTF.getText()!=null)
        {
            String sql2= "update itemdesc set longdesc = ? where pid=?";
            ps3=conn.prepareStatement(sql2);
            ps3.setString(1, ldescTF.getText());
            ps3.setString(2,this.pid);
            ps3.execute();
        }
        if(imgPath!=null)
        {
            String sql3= "update itemdesc set imgpath = ? where pid =?";
            ps3=conn.prepareStatement(sql3);
            ps3.setString(1, imgPath);
            ps3.setString(2,this.pid);
            ps3.execute();
        }
        
        JOptionPane.showMessageDialog(this,"Edited Ad");
        
        }catch(Exception e){
        System.out.println("error in edit buton");
        }
      
    }//GEN-LAST:event_editButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PostAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostAd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseImage;
    private javax.swing.JButton editButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField ldescTF;
    private javax.swing.JTextField pidTF;
    private javax.swing.JTextField sdescTF;
    // End of variables declaration//GEN-END:variables
}
