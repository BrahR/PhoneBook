/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author ME1
 */
public class login extends javax.swing.JFrame {

  RegistrationForm registerForm = new RegistrationForm();
  User use = new User();

  public login() {
    RegistrationForm.form.add(new Registration(true));
    initComponents();
    txtusername.setBackground(new java.awt.Color(0, 0, 0, 1));
    txtpassword.setBackground(new java.awt.Color(0, 0, 0, 1));
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    jPanel1 = new javax.swing.JPanel();
    jLabel12 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    txtusername = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    txtpassword = new javax.swing.JPasswordField();
    jLabel9 = new javax.swing.JLabel();
    disable = new javax.swing.JLabel();
    show = new javax.swing.JLabel();
    jCheckBox1 = new javax.swing.JCheckBox();
    jLabel11 = new javax.swing.JLabel();
    loginBtn = new javax.swing.JButton();
    jLabel14 = new javax.swing.JLabel();
    SignUp = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setUndecorated(true);
    addWindowListener(
      new java.awt.event.WindowAdapter() {
        public void windowOpened(java.awt.event.WindowEvent evt) {
          formWindowOpened(evt);
        }
      }
    );
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(25, 118, 211));
    jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel12.setText("copyright © Kemet All rights reserved");
    jPanel1.add(
      jLabel12,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 500, -1)
    );

    jLabel1.setIcon(
      new javax.swing.ImageIcon(getClass().getResource("/icon/bg-login.png"))
    ); // NOI18N
    jPanel1.add(
      jLabel1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 500, 340)
    );

    getContentPane()
      .add(
        jPanel1,
        new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 440)
      );

    jPanel2.setBackground(new java.awt.Color(25, 118, 211));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("X");
    jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel2.addMouseListener(
      new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          jLabel2MouseClicked(evt);
        }
      }
    );
    jPanel2.add(
      jLabel2,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 40, 29)
    );

    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("Login");
    jPanel2.add(
      jLabel3,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 420, 41)
    );

    jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("Hello! Let's get started");
    jPanel2.add(
      jLabel4,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 420, -1)
    );

    jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(199, 226, 255));
    jLabel5.setText("Email");
    jPanel2.add(
      jLabel5,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 341, -1)
    );

    txtusername.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
    txtusername.setForeground(new java.awt.Color(255, 255, 255));
    txtusername.setBorder(null);
    txtusername.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          txtusernameActionPerformed(evt);
        }
      }
    );
    jPanel2.add(
      txtusername,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 140, 240, 30)
    );

    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("_________________________________________");
    jPanel2.add(
      jLabel6,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 147, 290, 39)
    );

    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel7.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/icon/icons8_user_20px_1.png")
      )
    ); // NOI18N
    jPanel2.add(
      jLabel7,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 147, 40, 39)
    );

    jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(199, 226, 255));
    jLabel8.setText("Password");
    jPanel2.add(
      jLabel8,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 341, -1)
    );

    txtpassword.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
    txtpassword.setForeground(new java.awt.Color(255, 255, 255));
    txtpassword.setBorder(null);
    txtpassword.setCaretColor(new java.awt.Color(255, 255, 255));
    jPanel2.add(
      txtpassword,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 240, 30)
    );

    jLabel9.setForeground(new java.awt.Color(255, 255, 255));
    jLabel9.setText("_________________________________________");
    jPanel2.add(
      jLabel9,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 216, 290, 40)
    );

    disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    disable.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/icon/icons8_invisible_20px_1.png")
      )
    ); // NOI18N
    disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    disable.addMouseListener(
      new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          disableMouseClicked(evt);
        }
      }
    );
    jPanel2.add(
      disable,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 216, 40, 40)
    );

    show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    show.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/icon/icons8_eye_20px_1.png")
      )
    ); // NOI18N
    show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    show.addMouseListener(
      new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          showMouseClicked(evt);
        }
      }
    );
    jPanel2.add(
      show,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 216, 40, 40)
    );

    jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jCheckBox1.setForeground(new java.awt.Color(199, 226, 255));
    jCheckBox1.setText("Remember Password");
    jCheckBox1.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jCheckBox1ActionPerformed(evt);
        }
      }
    );
    jPanel2.add(
      jCheckBox1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 261, -1, -1)
    );

    jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(199, 226, 255));
    jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel11.setText("Forget Password?");
    jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel11.addMouseListener(
      new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          jLabel11MouseClicked(evt);
        }
      }
    );
    jPanel2.add(
      jLabel11,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 261, 121, 27)
    );

    loginBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
    loginBtn.setForeground(new java.awt.Color(25, 118, 211));
    loginBtn.setText("LOGIN");
    loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    loginBtn.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          loginBtnActionPerformed(evt);
        }
      }
    );
    jPanel2.add(
      loginBtn,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 306, 341, 40)
    );

    jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel14.setForeground(new java.awt.Color(199, 226, 255));
    jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel14.setText("Don't have an account?");
    jPanel2.add(
      jLabel14,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 213, -1)
    );

    SignUp.setBackground(new java.awt.Color(25, 118, 211));
    SignUp.setForeground(new java.awt.Color(199, 226, 255));
    SignUp.setText("SignUp");
    SignUp.setBorder(null);
    SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    SignUp.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          SignUpActionPerformed(evt);
        }
      }
    );
    jPanel2.add(
      SignUp,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 360, 70, 20)
    );

    getContentPane()
      .add(
        jPanel2,
        new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 420, 440)
      );

    setSize(new java.awt.Dimension(916, 440));
    setLocationRelativeTo(null);
  } // </editor-fold>//GEN-END:initComponents

  private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jCheckBox1ActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_jCheckBox1ActionPerformed

  private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) { // GEN-FIRST:event_jLabel2MouseClicked
    System.exit(0);
  } // GEN-LAST:event_jLabel2MouseClicked

  private void disableMouseClicked(java.awt.event.MouseEvent evt) { // GEN-FIRST:event_disableMouseClicked
    txtpassword.setEchoChar((char) 0);
    disable.setVisible(false);
    disable.setEnabled(false);
    show.setEnabled(true);
    show.setEnabled(true);
  } // GEN-LAST:event_disableMouseClicked

  private void showMouseClicked(java.awt.event.MouseEvent evt) { // GEN-FIRST:event_showMouseClicked
    txtpassword.setEchoChar((char) 8226);
    disable.setVisible(true);
    disable.setEnabled(true);
    show.setEnabled(false);
    show.setEnabled(false);
  } // GEN-LAST:event_showMouseClicked

  private void formWindowOpened(java.awt.event.WindowEvent evt) { // GEN-FIRST:event_formWindowOpened
    for (double i = 0.0; i <= 1.0; i = i + 0.1) {
      String val = i + "";
      float f = Float.valueOf(val);
      this.setOpacity(f);
      try {
        Thread.sleep(50);
      } catch (Exception e) {}
    }
  } // GEN-LAST:event_formWindowOpened

  private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) { // GEN-FIRST:event_jLabel11MouseClicked
    // TODO add your handling code here:
  } // GEN-LAST:event_jLabel11MouseClicked

  private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {
    String filledEmail = txtusername.getText();
    String filledPassword = txtpassword.getText();

    // Validate email and password
    ArrayList<Validate> inputs = new ArrayList<>(
      Arrays.asList(
        new Validate(
          RegistrationForm.isValidLogin(filledEmail, filledPassword),
          "Invalid email or password",
          "Invalid input"
        )
      )
    );

    if (!Utils.displayErrors(inputs)) {
      return;
    }

    // Check if the user is an admin
    if (RegistrationForm.checkAdmin(filledEmail, filledPassword)) {
      try {
        int ID = Integer.parseInt(
          JOptionPane.showInputDialog(null, "Enter your ID:")
        );

        // Validate admin ID
        if (
          !Utils.displayError(
            new Validate(ID == 69, "Invalid ID for Admin mode", "Invalid id")
          )
        ) {
          return;
        }

        // Admin login successful, open AdminMode window
        AdminMode adminApp = new AdminMode();
        adminApp.setVisible(true);
        adminApp.pack();
        adminApp.setLocationRelativeTo(null);
        this.dispose(); // Close the current login window
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(
          null,
          "Error: The ID must be an integer",
          "Wrong data type entered",
          JOptionPane.ERROR_MESSAGE
        );
      }
    } else {
      // Regular user login successful, open UserMode window
      UserMode app = new UserMode();
      app.setVisible(true);
      app.pack();
      app.setLocationRelativeTo(null);
      this.dispose(); // Close the current login window
    }
  }

  private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {} // GEN-FIRST:event_txtusernameActionPerformed // GEN-LAST:event_txtusernameActionPerformed

  private void SignUpActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_SignUpActionPerformed
    SignUp SignUpFrame = new SignUp();
    SignUpFrame.setVisible(true);
    SignUpFrame.pack();
    SignUpFrame.setLocationRelativeTo(null);
    this.dispose();
  } // GEN-LAST:event_SignUpActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
    // (optional) ">
    /*
     * If Nimbus (introduced in Java SE 6) is not available, stay with the default
     * look and feel.
     * For details see
     * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger
        .getLogger(login.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(login.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(login.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(login.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    // </editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new login().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton SignUp;
  private javax.swing.JLabel disable;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JButton loginBtn;
  private javax.swing.JLabel show;
  private javax.swing.JPasswordField txtpassword;
  private javax.swing.JTextField txtusername;
  // End of variables declaration//GEN-END:variables
}
