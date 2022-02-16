package studentmanagementsystem;

import java.io.*;
import Information.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class StudentLogin extends javax.swing.JFrame {
    
    
    public StudentLogin() {
        initComponents();
        //System.out.println(RemeberBox.isSelected());
        this.RememberCred();
    }
    
    static boolean vis;
    public static int id;
    
    Connection con;
    PreparedStatement pst,pst2,pst3;
    ResultSet rs,rs2,rs3;
    public static String dept,nam,email;
    public static int clas;
    public static String sec,desig,shift;
    
    public static AccountInfo acc;
    File out;
    
    public void RememberCred()
    {
        String sel,dep;
        try
           {
             Class.forName("com.mysql.jdbc.Driver");
             con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/studentmanagement","root","");
             pst3=(PreparedStatement) con.prepareStatement("SELECT * FROM remembercred WHERE SL=1");
             rs3=pst3.executeQuery();
             
             if(rs3.next())
             {
                sel=rs3.getString("State");
                //dep=rs3.getString("dept");
                //System.out.println(sel);

                
                if(sel.equals("true"))
                {
                    RemeberBox.setSelected(true);
                    usernameField.setText(rs3.getString("name"));
                    jPasswordField1.setText(rs3.getString("pass"));
                }
                else
                {
                    RemeberBox.setSelected(false);
                    usernameField.setText("");
                    jPasswordField1.setText("");
                }
             }
             
           }
           catch(SQLException ex)
           {
                Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
           }
           catch(ClassNotFoundException ex)
           {
                Logger.getLogger(StudSignIn.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameField = new javax.swing.JTextField();
        userLebel = new javax.swing.JLabel();
        passWordLebel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        RemeberBox = new javax.swing.JCheckBox();
        ResetPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));

        usernameField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        userLebel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        userLebel.setText("Name:");

        passWordLebel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passWordLebel.setText("Password :");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Log in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Panel.setBackground(new java.awt.Color(26, 204, 225));
        Panel.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Student Management System");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jLabel2.setText("Create an account >>");

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Sign up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        RemeberBox.setText("Remember Me");
        RemeberBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemeberBoxActionPerformed(evt);
            }
        });

        ResetPass.setText("Forgot Password?");
        ResetPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ResetPassMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userLebel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passWordLebel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RemeberBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ResetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                    .addComponent(jPasswordField1))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passWordLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemeberBox)
                    .addComponent(ResetPass))
                .addGap(14, 14, 14)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           StudSignIn sign=new StudSignIn();
           StudentLogin.vis=true;
           sign.setVisible(StudentLogin.vis);
           
           //System.out.println(StudentLogin.vis);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try{
            if(usernameField.getText().length()==0 || jPasswordField1.getText().length()==0)
            {
                JOptionPane.showMessageDialog(this, "Error! User name or password not found");
            }
            
            String user=usernameField.getText();
            String pass=jPasswordField1.getText();
            
                Class.forName("com.mysql.jdbc.Driver");
                con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/studentmanagement","root","");
                 pst=(PreparedStatement) con.prepareStatement("select * from userlog where name=? and password=?");
                 pst.setString(1, user);
                 pst.setString(2, pass);
                 rs=pst.executeQuery();
                 
                 
                 if(rs.next())
                 {
                     dept=rs.getString("Dept");
                     id=rs.getInt("id");
                     clas=rs.getInt("Class");
                     sec=rs.getString("Section");
                     nam=rs.getString("name");
                     email=rs.getString("email");
                     desig=rs.getString("Designation");
                     shift=rs.getString("Shift");
                     
                     DashBoard Db=new DashBoard();
                     ParsonalInformationShow.ObjPass(Db);
                     UpdateInfo.ObjPass(Db);
                     AllStudentShow.ObjPass(Db);
                     Search.ObjPass(Db);
                     Result.ObjPass(Db);
                     ResultOptions.ObjPass(Db);
                     Parformance.ObjPass(Db);
                     UpdateResult.ObjPass(Db);
                     UpdateResultHUM.ObjPass(Db);
                     UpdateResultCOMM.ObjPass(Db);
                     Attendence.ObjPass(Db);
                     //Routine.ObjPass(Db);
                     ResultCard.ObjPass(Db);
                     TeacherParsonalInfo.ObjPass(Db);
                     DeleteStud.ObjectPass(Db);
                     
                     this.hide();
                     Db.setVisible(true);
                     System.out.println(dept);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(this, "Error! User name or password is not correct");
                     usernameField.setText("");
                     jPasswordField1.setText("");
                     usernameField.requestFocus();
                 }
                 
            } catch (SQLException ex) {
                Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (ClassNotFoundException ex)
            {
                Logger.getLogger(StudSignIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RemeberBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemeberBoxActionPerformed
                    String recordUser,recordPass,recorddept;
                    boolean lastCheck;
                    recordUser=usernameField.getText();
                    recordPass=jPasswordField1.getText();
                    recorddept=dept;
                    String select;
                    if(RemeberBox.isSelected()==true)
                    {
                        select="true";
                    }
                    else
                    {
                        select="false";
                    }
                    /*
                    System.out.println("Recorded name and pass  ="+recordUser+" "+recordPass);
                    System.out.println(RemeberBox.isSelected());
                    */
                    
                    
                    
                    
                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/studentmanagement","root","");
                        pst2=(PreparedStatement) con.prepareStatement("UPDATE remembercred SET name=?,pass=?,State=? WHERE SL=1");
                        pst2.setString(1, recordUser);
                        pst2.setString(2, recordPass);
                        pst2.setString(3, select);
                        pst2.executeUpdate();
                    }
                    catch(SQLException ex)
                    {
                        Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    catch(ClassNotFoundException ex)
                    {
                        Logger.getLogger(StudSignIn.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                    
    }//GEN-LAST:event_RemeberBoxActionPerformed

    private void ResetPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetPassMousePressed
        ResetPass rp=new ResetPass();
        rp.setVisible(true);
    }//GEN-LAST:event_ResetPassMousePressed
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
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JCheckBox RemeberBox;
    private javax.swing.JLabel ResetPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel passWordLebel;
    private javax.swing.JLabel userLebel;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
