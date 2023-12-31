/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginform;

import java.awt.*;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import java.util.*;
import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;
import org.w3c.dom.events.MouseEvent;

/**
 *
 * @author algho
 */
public class AdminMode extends javax.swing.JFrame {

  Contact cont = new Contact();
  User use = new User();
  BookedContacts conts = new BookedContacts();

  /**
   * Creates new form NewJFrame
   */
  public AdminMode() {
    use.displayAllBooked();
    initComponents();
    setTitle("Book Phone"); // Set the title of the JFrame
    ImageIcon icon = new ImageIcon(
      "src\\main\\java\\com\\mycompany\\swing\\Icons\\4298389.png"
    );
    setIconImage(icon.getImage()); // Set the program icon

    // LOAD table
    ArrayList<Contact> tableValues = BookedContacts.contacts;
    if (tableValues.size() != 0) {
      DefaultTableModel model = (DefaultTableModel) adminBooked.getModel();
      for (Contact co : tableValues) {
        model.addRow(
          new Object[] {
            co.getEmail(),
            co.getName(),
            co.getPhone(),
            co.getAddress(),
          }
        );
      }
    }
    ArrayList<Registration> tableValues1 = RegistrationForm.form;
    if (tableValues.size() != 0) {
      DefaultTableModel model = (DefaultTableModel) systemEmails.getModel();
      for (Registration co : tableValues1) {
        model.addRow(
          new Object[] {
            co.getID(),
            co.getEmail(),
            // co.getNumberOfBook()
          }
        );
      }
    }
    ((AbstractTableModel) adminBooked.getModel()).fireTableDataChanged();
    pack(); // Resize the JFrame based on its contents
    setLocationRelativeTo(null); // Center the JFrame on the screen
    // row selector
    adminBooked
      .getSelectionModel()
      .addListSelectionListener(
        new ListSelectionListener() {
          @Override
          public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
              int selectedRow = adminBooked.getSelectedRow();
              if (selectedRow != -1) {
                String username = adminBooked
                  .getValueAt(selectedRow, 1)
                  .toString();
                String phoneValue = adminBooked
                  .getValueAt(selectedRow, 2)
                  .toString();
                String addressValue = adminBooked
                  .getValueAt(selectedRow, 3)
                  .toString();
                // Set the values in the text fields
                phoneNumber.setText(phoneValue);
                Name.setText(username);
                addressF.setText(addressValue);
              }
            }
          }
        }
      );
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
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    jTextField2 = new javax.swing.JTextField();
    jPanel1 = new javax.swing.JPanel();
    userDashboard = new javax.swing.JPanel();
    Name = new javax.swing.JTextField();
    phoneNumber = new javax.swing.JTextField();
    clearButton = new javax.swing.JButton();
    addButton = new javax.swing.JButton();
    deleteBook = new javax.swing.JButton();
    updateButton = new javax.swing.JButton();
    NameLable = new javax.swing.JLabel();
    phoneLable1 = new javax.swing.JLabel();
    addressF = new javax.swing.JTextField();
    NameLable1 = new javax.swing.JLabel();
    deleteButton1 = new javax.swing.JButton();
    javax.swing.JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
    systemEmails = new javax.swing.JTable();
    jLabel1 = new javax.swing.JLabel();
    Logout = new javax.swing.JButton();
    javax.swing.JScrollPane jScrollPane3 = new javax.swing.JScrollPane();
    adminBooked = new javax.swing.JTable();

    jTextField2.setText("jTextField1");
    jTextField2.setName("jTextField2"); // NOI18N

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setName("Form"); // NOI18N
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel1.setBackground(new java.awt.Color(25, 118, 211));
    jPanel1.setName("jPanel1"); // NOI18N
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    userDashboard.setBackground(new java.awt.Color(25, 118, 211));
    userDashboard.setBorder(
      new javax.swing.border.SoftBevelBorder(
        javax.swing.border.BevelBorder.RAISED,
        java.awt.Color.white,
        java.awt.Color.white,
        java.awt.Color.white,
        java.awt.Color.white
      )
    );
    userDashboard.setForeground(new java.awt.Color(255, 255, 255));
    userDashboard.setToolTipText("");
    userDashboard.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
    userDashboard.setName("userDashboard"); // NOI18N
    userDashboard.setOpaque(false);
    userDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    Name.setText("sad");
    Name.setToolTipText("");
    Name.setName("Name"); // NOI18N
    userDashboard.add(
      Name,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 148, 361, 49)
    );

    phoneNumber.setText("01000627666");
    phoneNumber.setName("phoneNumber"); // NOI18N
    userDashboard.add(
      phoneNumber,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 51, 360, 49)
    );

    clearButton.setBackground(new java.awt.Color(240, 240, 240));
    clearButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
    clearButton.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/com/mycompany/swing/Icons/eraser.png")
      )
    ); // NOI18N
    clearButton.setText("Clear");
    clearButton.setBorder(null);
    clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    clearButton.setName("clearButton"); // NOI18N
    clearButton.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          clearButtonActionPerformed(evt);
        }
      }
    );
    userDashboard.add(
      clearButton,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 396, 165, 41)
    );

    addButton.setBackground(new java.awt.Color(240, 240, 240));
    addButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
    addButton.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/com/mycompany/swing/Icons/add.png")
      )
    ); // NOI18N
    addButton.setText("Book");
    addButton.setBorder(null);
    addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    addButton.setName("addButton"); // NOI18N
    addButton.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          addButtonActionPerformed(evt);
        }
      }
    );
    userDashboard.add(
      addButton,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 396, 165, 41)
    );

    deleteBook.setBackground(new java.awt.Color(240, 240, 240));
    deleteBook.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
    deleteBook.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/com/mycompany/swing/Icons/delete.png")
      )
    ); // NOI18N
    deleteBook.setText("Delete Booking");
    deleteBook.setBorder(null);
    deleteBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    deleteBook.setName("deleteBook"); // NOI18N
    deleteBook.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          deleteBookActionPerformed(evt);
        }
      }
    );
    userDashboard.add(
      deleteBook,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 328, 165, 41)
    );

    updateButton.setBackground(new java.awt.Color(240, 240, 240));
    updateButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
    updateButton.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/com/mycompany/swing/Icons/updated.png")
      )
    ); // NOI18N
    updateButton.setText("Update");
    updateButton.setBorder(null);
    updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    updateButton.setName("updateButton"); // NOI18N
    updateButton.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          updateButtonActionPerformed(evt);
        }
      }
    );
    userDashboard.add(
      updateButton,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 475, 165, 41)
    );

    NameLable.setBackground(new java.awt.Color(255, 255, 255));
    NameLable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
    NameLable.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/com/mycompany/swing/Icons/signature.png")
      )
    ); // NOI18N
    NameLable.setLabelFor(NameLable);
    NameLable.setText("Name");
    NameLable.setName("NameLable"); // NOI18N
    userDashboard.add(
      NameLable,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 118, 392, -1)
    );

    phoneLable1.setBackground(new java.awt.Color(255, 255, 255));
    phoneLable1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
    phoneLable1.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/com/mycompany/swing/Icons/smartphone.png")
      )
    ); // NOI18N
    phoneLable1.setLabelFor(phoneNumber);
    phoneLable1.setText("Phone Number");
    phoneLable1.setName("phoneLable1"); // NOI18N
    userDashboard.add(
      phoneLable1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 13, 392, -1)
    );

    addressF.setText("sad123");
    addressF.setToolTipText("");
    addressF.setName("addressF"); // NOI18N
    userDashboard.add(
      addressF,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 245, 361, 49)
    );

    NameLable1.setBackground(new java.awt.Color(255, 255, 255));
    NameLable1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
    NameLable1.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/com/mycompany/swing/Icons/address.png")
      )
    ); // NOI18N
    NameLable1.setLabelFor(NameLable);
    NameLable1.setText("Address");
    NameLable1.setName("NameLable1"); // NOI18N
    userDashboard.add(
      NameLable1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 215, 398, -1)
    );

    deleteButton1.setBackground(new java.awt.Color(240, 240, 240));
    deleteButton1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
    deleteButton1.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/com/mycompany/swing/Icons/delete.png")
      )
    ); // NOI18N
    deleteButton1.setText("Delete Account");
    deleteButton1.setBorder(null);
    deleteButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    deleteButton1.setName("deleteButton1"); // NOI18N
    deleteButton1.addMouseListener(
      new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          deleteButton1MouseClicked(evt);
        }
      }
    );
    deleteButton1.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          deleteButton1ActionPerformed(evt);
        }
      }
    );
    userDashboard.add(
      deleteButton1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 475, 165, 41)
    );

    jScrollPane2.setName("jScrollPane2"); // NOI18N

    systemEmails.setBackground(new java.awt.Color(225, 225, 225));
    systemEmails.setBorder(
      javax.swing.BorderFactory.createEtchedBorder(
        javax.swing.border.EtchedBorder.RAISED
      )
    );
    systemEmails.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
    systemEmails.setModel(
      new javax.swing.table.DefaultTableModel(
        new Object[][] {},
        new String[] { "ID", "Email", "Name", "Number of books" }
      ) {
        Class[] types = new Class[] {
          java.lang.Integer.class,
          java.lang.String.class,
          java.lang.String.class,
          java.lang.Integer.class,
        };
        boolean[] canEdit = new boolean[] { false, false, false, false };

        public Class getColumnClass(int columnIndex) {
          return types[columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
          return canEdit[columnIndex];
        }
      }
    );
    systemEmails.setFocusable(false);
    systemEmails.setGridColor(new java.awt.Color(255, 255, 255));
    systemEmails.setName("systemEmails"); // NOI18N
    systemEmails.setShowGrid(true);
    jScrollPane2.setViewportView(systemEmails);

    userDashboard.add(
      jScrollPane2,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 490, 489)
    );

    jPanel1.add(
      userDashboard,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 23, -1, 540)
    );

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("X");
    jLabel1.setName("jLabel1"); // NOI18N
    jLabel1.addMouseListener(
      new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          jLabel1MouseClicked(evt);
        }
      }
    );
    jPanel1.add(
      jLabel1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 20, 20)
    );

    Logout.setBackground(new java.awt.Color(25, 118, 211));
    Logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    Logout.setForeground(new java.awt.Color(255, 255, 255));
    Logout.setText("Logout");
    Logout.setBorder(null);
    Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    Logout.setName("Logout"); // NOI18N
    Logout.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          LogoutActionPerformed(evt);
        }
      }
    );
    jPanel1.add(
      Logout,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 560, -1, -1)
    );

    jScrollPane3.setName("jScrollPane3"); // NOI18N

    adminBooked.setBackground(new java.awt.Color(225, 225, 225));
    adminBooked.setBorder(
      javax.swing.BorderFactory.createEtchedBorder(
        javax.swing.border.EtchedBorder.RAISED
      )
    );
    adminBooked.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
    adminBooked.setModel(
      new javax.swing.table.DefaultTableModel(
        new Object[][] {},
        new String[] { "Email", "Name", "Phone Number", "Address" }
      ) {
        Class[] types = new Class[] {
          java.lang.String.class,
          java.lang.String.class,
          java.lang.String.class,
          java.lang.String.class,
        };
        boolean[] canEdit = new boolean[] { false, false, false, false };

        public Class getColumnClass(int columnIndex) {
          return types[columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
          return canEdit[columnIndex];
        }
      }
    );
    adminBooked.setFocusable(false);
    adminBooked.setGridColor(new java.awt.Color(255, 255, 255));
    adminBooked.setName("adminBooked"); // NOI18N
    adminBooked.setShowGrid(true);
    jScrollPane3.setViewportView(adminBooked);
    if (adminBooked.getColumnModel().getColumnCount() > 0) {
      adminBooked.getColumnModel().getColumn(2).setHeaderValue("Phone Number");
      adminBooked.getColumnModel().getColumn(3).setHeaderValue("Address");
    }

    jPanel1.add(
      jScrollPane3,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 60, 490, 489)
    );

    getContentPane()
      .add(
        jPanel1,
        new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 580)
      );
    jPanel1.getAccessibleContext().setAccessibleName("Book phone");

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) { //GEN-FIRST:event_jLabel1MouseClicked
    System.exit(0);
  } //GEN-LAST:event_jLabel1MouseClicked

  private void LogoutActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_LogoutActionPerformed
    login LoginFrame = new login();
    LoginFrame.setVisible(true);
    LoginFrame.pack();
    LoginFrame.setLocationRelativeTo(null);
    this.dispose();
  } //GEN-LAST:event_LogoutActionPerformed

  private void deleteButton1MouseClicked(java.awt.event.MouseEvent evt) {} // GEN-FIRST:event_deleteButton1MouseClicked // GEN-LAST:event_deleteButton1MouseClicked

  private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
    int rowCount = booked.getSelectedRowCount();
    if (
      !Utils.displayError(
        new Validate(
          rowCount == 1,
          "Please select one row at a time",
          "Invalid Input"
        )
      )
    ) {
      return;
    }

    String name = Name.getText();
    String phone = phoneNumber.getText();
    String address = addressF.getText();

    DefaultTableModel model = (DefaultTableModel) booked.getModel();
    int selectedRow = booked.getSelectedRow();

    ArrayList<Validate> inputs = new ArrayList<>(
      Arrays.asList(
        new Validate(
          User.validPhone(phone),
          "Invalid phone format",
          "Invalid input"
        ),
        new Validate(
          User.validName(name) && !name.isEmpty(),
          "Invalid name",
          "Invalid input"
        ),
        new Validate(
          User.validAddress(address),
          "Invalid address: address should only consist of English letters, numbers, commas, and dots",
          "Invalid input"
        )
      )
    );

    if (!Utils.displayErrors(inputs)) {
      return;
    }

    try {
      int emailId = Integer.parseInt(
        JOptionPane.showInputDialog("Enter your ID")
      );

      ArrayList<Validate> err1 = new ArrayList<>(
        Arrays.asList(
          new Validate(
            !BookedContacts.isDuplicatedEdit(emailId, phone),
            "This Phone Number is registered with another contact",
            "Duplicated Phone Number"
          ),
          new Validate(
            RegistrationForm.findId(emailId),
            "Wrong id",
            "Invalid Input"
          )
        )
      );

      if (!Utils.displayErrors(err1)) {
        return;
      }

      // Assuming that your data model has columns like "Name", "PhoneNumber", "Address"
      // Replace these with the actual column names in your model
      model.setValueAt(name, selectedRow, 1);
      model.setValueAt(phone, selectedRow, 2);
      model.setValueAt(address, selectedRow, 3);

      JOptionPane.showMessageDialog(
        null,
        "Account has been updated",
        "Successful update",
        JOptionPane.INFORMATION_MESSAGE
      );
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_clearButtonActionPerformed
    String name = Name.getText();
    String phone = phoneNumber.getText();
    String address = addressF.getText();
    if (!phone.isEmpty() || !name.isEmpty() || !address.isEmpty()) {
      Name.setText("");
      phoneNumber.setText("");
      addressF.setText("");
    } else {
      JOptionPane.showMessageDialog(
        null,
        "Nothing to clear",
        "invalid Click",
        JOptionPane.WARNING_MESSAGE
      );
    }
  } // GEN-LAST:event_clearButtonActionPerformed

  private void deleteBookActionPerformed(java.awt.event.ActionEvent evt) {
    int rowCount = adminBooked.getRowCount();
    int[] selectedRows = adminBooked.getSelectedRows();

    ArrayList<Validate> validateSelectedRows = new ArrayList<>(
      Arrays.asList(
        new Validate(
          rowCount > 0,
          "Please select the row you want to delete",
          "Invalid input"
        ),
        new Validate(
          selectedRows.length > 0,
          "There are no rows to delete",
          "Invalid input"
        )
      )
    );

    if (!Utils.displayErrors(validateSelectedRows)) return;

    try {
      DefaultTableModel model = (DefaultTableModel) adminBooked.getModel();

      for (int i = selectedRows.length - 1; i >= 0; i--) {
        int row = selectedRows[i];
        String emailToDelete = (String) model.getValueAt(i, 2);

        model.removeRow(row);
        conts.deleteBookedContactsViaEmail(emailToDelete);
      }

      JOptionPane.showMessageDialog(
        null,
        "Selected bookings have been deleted successfully.",
        "Deletion Successful",
        JOptionPane.INFORMATION_MESSAGE
      );
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(
        null,
        "Something bad happened" + e.getMessage(),
        "Internal Error",
        JOptionPane.ERROR_MESSAGE
      );
    }
  }

  private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    String userEmail = JOptionPane.showInputDialog(
      null,
      "Enter your Email for confirmation:"
    );
    ArrayList<Validate> inputs = new ArrayList<>(
      Arrays.asList(
        new Validate(
          RegistrationForm.findEmail(userEmail),
          "The entered email does not exist",
          "Invalid input"
        )
      )
    );

    if (!Utils.displayErrors(inputs)) return;

    DefaultTableModel model = (DefaultTableModel) systemEmails.getModel();
    for (int i = 0; i < model.getRowCount(); i++) {
      model.removeRow(i);
    }

    RegistrationForm.deleteAccount(userEmail);

    JOptionPane.showMessageDialog(
      null,
      "Account has been deleted, redirecting....",
      "Successful deletion",
      JOptionPane.INFORMATION_MESSAGE
    );

    SignUp SignUpFrame = new SignUp();
    SignUpFrame.setVisible(true);
    SignUpFrame.pack();
    SignUpFrame.setLocationRelativeTo(null);
    this.dispose();
  }

  // GEN-LAST:event_deleteButton1ActionPerformed

  private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
    String name = Name.getText();
    String phone = phoneNumber.getText();
    String address = addressF.getText();

    DefaultTableModel model = (DefaultTableModel) adminBooked.getModel();
    String email = JOptionPane.showInputDialog(
      "Please Enter the email that will be linked that that booking:"
    );

    ArrayList<Validate> inputs = new ArrayList<>(
      Arrays.asList(
        new Validate(
          RegistrationForm.findEmail(email),
          "The entered email does not exist",
          "Invalid input"
        ),
        new Validate(
          User.validPhone(phone),
          "Invalid phone format",
          "Invalid input"
        ),
        new Validate(
          User.validName(name) && !name.isEmpty(),
          "Invalid name",
          "Invalid input"
        ),
        new Validate(
          User.validAddress(address),
          "Invalid address: address should only consist of English letters, numbers, commas, and dots",
          "Invalid input"
        ),
        new Validate(
          BookedContacts.isDuplicated(phone),
          "Duplicated Phone Number",
          "Invalid Phone Number"
        )
      )
    );

    if (!Utils.displayErrors(inputs)) return;
    try {
      Contact loginObject = BookedContacts.returnBookedObjViaEmail(email);
      String encryptedEmail = EmailEncryptor.encrypt(loginObject.getEmail());
      String encryptedPhone = PhoneNumberEncryptor.encrypt(phone);
      Contact obj = new Contact(
        name,
        phone,
        encryptedPhone,
        address,
        loginObject.getEmail(),
        encryptedEmail,
        loginObject.getID()
      );
      obj.setID(loginObject.getID());
      loginObject.seteEmail(encryptedEmail);
      conts.addContact(obj); // Use the addContact method consistently
      model.addRow(
        new Object[] { loginObject.getEmail(), name, phone, address }
      );
      use.displayAllBooked();
      Name.setText("sad");
      int n = (int) (Math.random() * 99);
      phoneNumber.setText("010006276" + String.valueOf(n));
      addressF.setText("sad dawg");
    } catch (Exception e) {
      // TODO: handle exception
    }
  }

  // GEN-LAST:event_addButtonActionPerformed

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
        .getLogger(AdminMode.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(AdminMode.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(AdminMode.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(AdminMode.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    // </editor-fold>
    // </editor-fold>
    // </editor-fold>
    // </editor-fold>
    // </editor-fold>
    // </editor-fold>
    // </editor-fold>
    // </editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new AdminMode().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton Logout;
  private javax.swing.JTextField Name;
  private javax.swing.JLabel NameLable;
  private javax.swing.JLabel NameLable1;
  private javax.swing.JButton addButton;
  private javax.swing.JTextField addressF;
  private javax.swing.JTable adminBooked;
  private javax.swing.JButton clearButton;
  private javax.swing.JButton deleteBook;
  private javax.swing.JButton deleteButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField jTextField2;
  private javax.swing.JLabel phoneLable1;
  private javax.swing.JTextField phoneNumber;
  private javax.swing.JTable systemEmails;
  private javax.swing.JButton updateButton;
  private javax.swing.JPanel userDashboard;
  // End of variables declaration//GEN-END:variables
}
