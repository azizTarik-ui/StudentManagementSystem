/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author USER
 */
public class ResultCard extends javax.swing.JFrame {

    /**
     * Creates new form ResultCard
     */
    public ResultCard() {
        initComponents();
        model=(DefaultTableModel) Result.getModel();
        Clas.setText(Integer.toString(StudentLogin.clas));
        Sec.setText(StudentLogin.sec);
    }
    DefaultTableModel model;
    Connection con;
    PreparedStatement pst,pst2,pst3;
    ResultSet rs,rs2,rs3;
    Object rowdata[]=new Object[11];
    String path="";
    String name,id,section,totaln,Present,absent,totalworkday,gpa;
    String dept=StudentLogin.dept;
    String sect=StudentLogin.sec;
    
    public static DashBoard db;
    public static void ObjPass(DashBoard obj)
    {
        db=obj;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Clas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Sec = new javax.swing.JTextField();
        GetResult = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Result = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TotalWork = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        present = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Absent = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TotalMark = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        GPALabel = new javax.swing.JLabel();
        PDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(26, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Result Card");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("ID    :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Class:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Section:");

        GetResult.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        GetResult.setText("Get Result");
        GetResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetResultActionPerformed(evt);
            }
        });

        Result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject", "CQ", "MCQ", "Lab", "Total"
            }
        ));
        jScrollPane1.setViewportView(Result);

        BackButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Name:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Total Working Days: ");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Present:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Absent:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Total Marks:");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("GPA:");

        PDF.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PDF.setText("Create PDF");
        PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(168, 168, 168)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Clas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sec, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                                .addComponent(GetResult, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TotalWork, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(present, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Absent, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(TotalMark, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GPALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(820, 820, 820)
                        .addComponent(PDF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sec, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GetResult, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TotalWork, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(present, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Absent, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TotalMark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GPALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(PDF))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GetResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetResultActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/studentmanagement","root","");
            
            if("Science".equals(StudentLogin.dept))
            {
                pst=(PreparedStatement) con.prepareStatement("SELECT * FROM sciencesubjects WHERE id=? and Semester=? and Class=?");
                pst2=(PreparedStatement) con.prepareStatement("SELECT * FROM parfoemance WHERE id=? and Section=? and Class=? and Dept=?");
                pst3=(PreparedStatement) con.prepareStatement("SELECT * FROM userinfo WHERE id=? and Semester=? and Class=? and Dept=?");
                
                pst.setInt(1, Integer.parseInt(ID.getText()));
                pst.setString(2, Sec.getText());
                pst.setInt(3, Integer.parseInt(Clas.getText()));
                rs=pst.executeQuery();
                
                pst2.setInt(1, Integer.parseInt(ID.getText()));
                pst2.setString(2, Sec.getText());
                pst2.setInt(3, Integer.parseInt(Clas.getText()));
                pst2.setString(4, StudentLogin.dept);
                rs2=pst2.executeQuery();
                
                pst3.setInt(1, Integer.parseInt(ID.getText()));
                pst3.setString(2, Sec.getText());
                pst3.setInt(3, Integer.parseInt(Clas.getText()));
                pst3.setString(4, StudentLogin.dept);
                rs3=pst3.executeQuery();
                
                if(rs.next())
                {
                    NameLabel.setText(rs.getString("Name"));
                    name=rs.getString("Name");
                    id=ID.getText();
                    
                    model.addRow(new Object[]{"Bangla 1st",rs.getInt("B1CQ"),rs.getInt("B1MCQ"),"0",rs.getInt("Bangla1st")});
                    model.addRow(new Object[]{"Bangla 2nd",rs.getInt("B2CQ"),rs.getInt("B2MCQ"),"0",rs.getInt("Bangla2nd")});
                    model.addRow(new Object[]{"English 1st",rs.getInt("English1st"),"0","0",rs.getInt("English1st")});
                    model.addRow(new Object[]{"English 2nd",rs.getInt("English2nd"),"0","0",rs.getInt("English2nd")});
                    model.addRow(new Object[]{"Higher Math 1st",rs.getInt("HM1CQ"),rs.getInt("HM1MCQ"),rs.getInt("HM1Lab"),rs.getInt("HigherMath1st")});
                    model.addRow(new Object[]{"Higher Math 2nd",rs.getInt("HM2CQ"),rs.getInt("HM2MCQ"),rs.getInt("HM2Lab"),rs.getInt("HigherMath2nd")});
                    model.addRow(new Object[]{"Physics 1st",rs.getInt("PHY1CQ"),rs.getInt("PHY1MCQ"),rs.getInt("PHY1Lab"),rs.getInt("Physics1st")});
                    model.addRow(new Object[]{"Physics 2nd",rs.getInt("PHY2CQ"),rs.getInt("PHY2MCQ"),rs.getInt("PHY2Lab"),rs.getInt("Physics2nd")});
                    model.addRow(new Object[]{"Chemistry 1st",rs.getInt("CHE1CQ"),rs.getInt("CHE1MCQ"),rs.getInt("CHE1Lab"),rs.getInt("Chemistry1st")});
                    model.addRow(new Object[]{"Chemistry 2nd",rs.getInt("CHE2CQ"),rs.getInt("CHE2MCQ"),rs.getInt("CHE2Lab"),rs.getInt("Chemistry2nd")});
                    model.addRow(new Object[]{"Biology 1st",rs.getInt("BIO1CQ"),rs.getInt("BIO1MCQ"),rs.getInt("BIO1Lab"),rs.getInt("Biology1st")});
                    model.addRow(new Object[]{"Biology 2nd",rs.getInt("BIO2CQ"),rs.getInt("BIO2MCQ"),rs.getInt("BIO2Lab"),rs.getInt("Biology2nd")});
                    model.addRow(new Object[]{"ICT",rs.getInt("ICTCQ"),rs.getInt("ICTMCQ"),rs.getInt("ICTLab"),rs.getInt("ICT")});
                    
                    TotalMark.setText(Double.toString(rs.getDouble("TotalMarks")));
                    totaln=Double.toString(rs.getDouble("TotalMarks"));
                }
                if(rs2.next())
                {
                    TotalWork.setText(Integer.toString(rs2.getInt("TotalWorkDays")));
                    present.setText(Integer.toString(rs2.getInt("Present")));
                    Absent.setText(Integer.toString(rs2.getInt("Absent")));
                    
                    totalworkday=Integer.toString(rs2.getInt("TotalWorkDays"));
                    Present=Integer.toString(rs2.getInt("Present"));
                    absent=Integer.toString(rs2.getInt("Absent"));
                    
                }
                if(rs3.next())
                {
                    GPALabel.setText(rs3.getString("CGPA"));
                    gpa=rs3.getString("CGPA");
                }
            }
            else if("Humanities".equals(StudentLogin.dept))
            {
                
                
                
                pst=(PreparedStatement) con.prepareStatement("SELECT * FROM humanitiessubjects WHERE id=? and Semester=? and Class=?");
                pst2=(PreparedStatement) con.prepareStatement("SELECT * FROM parfoemance WHERE id=? and Section=? and Class=? and Dept=?");
                pst3=(PreparedStatement) con.prepareStatement("SELECT * FROM userinfo WHERE id=? and Semester=? and Class=? and Dept=?");

                pst.setInt(1, Integer.parseInt(ID.getText()));
                pst.setInt(2, Integer.parseInt(Sec.getText()));
                pst.setInt(3, Integer.parseInt(Clas.getText()));
                rs=pst.executeQuery();
                
                pst2.setInt(1, Integer.parseInt(ID.getText()));
                pst2.setString(2, Sec.getText());
                pst2.setInt(3, Integer.parseInt(Clas.getText()));
                pst2.setString(4, StudentLogin.dept);
                rs2=pst2.executeQuery();
                
                pst3.setInt(1, Integer.parseInt(ID.getText()));
                pst3.setInt(2, Integer.parseInt(Sec.getText()));
                pst3.setInt(3, Integer.parseInt(Clas.getText()));
                pst3.setString(4, StudentLogin.dept);
                rs3=pst3.executeQuery();
                
                if(rs.next())
                {
                    NameLabel.setText(rs.getString("Name"));
                    NameLabel.setText(rs.getString("Name"));
                    name=rs.getString("Name");
                    id=ID.getText();
                    
                    model.addRow(new Object[]{"Bangla 1st",rs.getInt("B1CQ"),rs.getInt("B1MCQ"),"0",rs.getInt("Bangla1st")});
                    model.addRow(new Object[]{"Bangla 2nd",rs.getInt("B2CQ"),rs.getInt("B2MCQ"),"0",rs.getInt("Bangla2nd")});
                    model.addRow(new Object[]{"English 1st",rs.getInt("English1st"),"0","0",rs.getInt("English1st")});
                    model.addRow(new Object[]{"English 2nd",rs.getInt("English2nd"),"0","0",rs.getInt("English2nd")});
                    model.addRow(new Object[]{"ICT",rs.getInt("ICTCQ"),rs.getInt("ICTMCQ"),rs.getInt("ICTLab"),rs.getInt("ICT")});
                    model.addRow(new Object[]{"Sociology 1st",rs.getInt("SOC1CQ"),rs.getInt("SOC1MCQ"),"0",rs.getInt("Sociology1st")});
                    model.addRow(new Object[]{"Sociology 2nd",rs.getInt("SOC2CQ"),rs.getInt("SOC2MCQ"),"0",rs.getInt("Sociology2nd")});
                    model.addRow(new Object[]{"Economics 1st",rs.getInt("ECO1CQ"),rs.getInt("ECO1MCQ"),"0",rs.getInt("Economics1st")});
                    model.addRow(new Object[]{"Economics 2nd",rs.getInt("ECO2CQ"),rs.getInt("ECO2MCQ"),"0",rs.getInt("Economics2nd")});
                    model.addRow(new Object[]{"Geography 1st",rs.getInt("GEO1CQ"),rs.getInt("GEO1MCQ"),"0",rs.getInt("Geography1st")});
                    model.addRow(new Object[]{"Geography 2nd",rs.getInt("GEO2CQ"),rs.getInt("GEO2MCQ"),"0",rs.getInt("Geography2nd")});
                    model.addRow(new Object[]{"Logic 1st",rs.getInt("LOG1CQ"),rs.getInt("LOG1MCQ"),"0",rs.getInt("Logic1st")});
                    model.addRow(new Object[]{"Logic 2nd",rs.getInt("LOG2CQ"),rs.getInt("LOG2MCQ"),"0",rs.getInt("Logic2nd")});
                    model.addRow(new Object[]{"History 1st",rs.getInt("HIS1CQ"),rs.getInt("HIS1MCQ"),"0",rs.getInt("History1st")});
                    model.addRow(new Object[]{"History 2nd",rs.getInt("HIS2CQ"),rs.getInt("HIS2MCQ"),"0",rs.getInt("History2nd")});
                    model.addRow(new Object[]{"SocialScience 1st",rs.getInt("Ss1CQ"),rs.getInt("Ss1MCQ"),"0",rs.getInt("SocialScience1st")});
                    model.addRow(new Object[]{"SocialScience 2nd",rs.getInt("Ss2CQ"),rs.getInt("Ss2MCQ"),"0",rs.getInt("SocialScience2nd")});
                    model.addRow(new Object[]{"Civic and Good Governance 1st",rs.getInt("CGG1CQ"),rs.getInt("CGG1MCQ"),"0",rs.getInt("CivicandGoodGovernance1st")});
                    model.addRow(new Object[]{"Civic and Good Governance 2nd",rs.getInt("CGG2CQ"),rs.getInt("CGG2MCQ"),"0",rs.getInt("CivicandGoodGovernance2nd")});
                    model.addRow(new Object[]{"Islamic History and Culture 1st",rs.getInt("IHC1CQ"),rs.getInt("IHC1MCQ"),"0",rs.getInt("IslamicHistoryandCulture1st")});
                    model.addRow(new Object[]{"Islamic History and Culture 2nd",rs.getInt("IHC2CQ"),rs.getInt("IHC2MCQ"),"0",rs.getInt("IslamicHistoryandCulture2nd")});
                    TotalMark.setText(Double.toString(rs.getDouble("TotalMarks")));
                    
                    totaln=Double.toString(rs.getDouble("TotalMarks"));
                    
                    
                }
                if(rs2.next())
                {
                    TotalWork.setText(Integer.toString(rs2.getInt("TotalWorkDays")));
                    present.setText(Integer.toString(rs2.getInt("Present")));
                    Absent.setText(Integer.toString(rs2.getInt("Absent")));
                    
                    totalworkday=Integer.toString(rs2.getInt("TotalWorkDays"));
                    Present=Integer.toString(rs2.getInt("Present"));
                    absent=Integer.toString(rs2.getInt("Absent"));
                }
                if(rs3.next())
                {
                    GPALabel.setText(rs3.getString("CGPA"));
                    gpa=rs3.getString("CGPA");
                }
            }
            else if("Business Studies".equals(StudentLogin.dept))
            {
                
                pst=(PreparedStatement) con.prepareStatement("SELECT * FROM businessstudiessubjects WHERE id=? and Semester=? and Class=?");
                pst2=(PreparedStatement) con.prepareStatement("SELECT * FROM parfoemance WHERE id=? and Section=? and Class=? and Dept=?");
                pst3=(PreparedStatement) con.prepareStatement("SELECT * FROM userinfo WHERE id=? and Semester=? and Class=? and Dept=?");


                pst.setInt(1, Integer.parseInt(ID.getText()));
                pst.setInt(2, Integer.parseInt(Sec.getText()));
                pst.setInt(3, Integer.parseInt(Clas.getText()));
                rs=pst.executeQuery();
                
                pst2.setInt(1, Integer.parseInt(ID.getText()));
                pst2.setString(2, Sec.getText());
                pst2.setInt(3, Integer.parseInt(Clas.getText()));
                pst2.setString(4, StudentLogin.dept);
                rs2=pst2.executeQuery();
                
                pst3.setInt(1, Integer.parseInt(ID.getText()));
                pst3.setInt(2, Integer.parseInt(Sec.getText()));
                pst3.setInt(3, Integer.parseInt(Clas.getText()));
                pst3.setString(4, StudentLogin.dept);
                rs3=pst3.executeQuery();
                
                if(rs.next())
                {
                    NameLabel.setText(rs.getString("Name"));
                    name=rs.getString("Name");
                    id=ID.getText();
                    
                    NameLabel.setText(rs.getString("Name"));
                    model.addRow(new Object[]{"Bangla 1st",rs.getInt("B1CQ"),rs.getInt("B1MCQ"),"0",rs.getInt("Bangla1st")});
                    model.addRow(new Object[]{"Bangla 2nd",rs.getInt("B2CQ"),rs.getInt("B2MCQ"),"0",rs.getInt("Bangla2nd")});
                    model.addRow(new Object[]{"English 1st",rs.getInt("English1st"),"0","0",rs.getInt("English1st")});
                    model.addRow(new Object[]{"English 2nd",rs.getInt("English2nd"),"0","0",rs.getInt("English2nd")});
                    model.addRow(new Object[]{"ICT",rs.getInt("ICTCQ"),rs.getInt("ICTMCQ"),rs.getInt("ICTLab"),rs.getInt("ICT")});
                    model.addRow(new Object[]{"Accounting 1st",rs.getInt("ACC1CQ"),rs.getInt("ACC1MCQ"),"0",rs.getInt("Accounting1st")});
                    model.addRow(new Object[]{"Accounting 2nd",rs.getInt("ACC2CQ"),rs.getInt("ACC2MCQ"),"0",rs.getInt("Accounting2nd")});
                    model.addRow(new Object[]{"Economics 1st",rs.getInt("ECO1CQ"),rs.getInt("ECO1MCQ"),"0",rs.getInt("Economics1st")});
                    model.addRow(new Object[]{"Economics 2nd",rs.getInt("ECO2CQ"),rs.getInt("ECO2MCQ"),"0",rs.getInt("Economics2nd")});
                    model.addRow(new Object[]{"FinanceBankingandInsurance 1st",rs.getInt("FBI1CQ"),rs.getInt("FBI1MCQ"),"0",rs.getInt("FinanceBankingandInsurance1st")});
                    model.addRow(new Object[]{"FinanceBankingandInsurance 2nd",rs.getInt("FBI2CQ"),rs.getInt("FBI2MCQ"),"0",rs.getInt("FinanceBankingandInsurance2nd")});
                    model.addRow(new Object[]{"Business Organization and Management 1st",rs.getInt("BOM1CQ"),rs.getInt("BOM1MCQ"),"0",rs.getInt("BusinessOrgandManagement1st")});
                    model.addRow(new Object[]{"Business Organization and Management 2nd",rs.getInt("BOM2CQ"),rs.getInt("BOM2MCQ"),"0",rs.getInt("BusinessOrgandManagement2nd")});
                    TotalMark.setText(Double.toString(rs.getDouble("TotalMarks")));
                    
                    totaln=Double.toString(rs.getDouble("TotalMarks"));
                    
                }
                if(rs2.next())
                {
                    TotalWork.setText(Integer.toString(rs2.getInt("TotalWorkDays")));
                    present.setText(Integer.toString(rs2.getInt("Present")));
                    Absent.setText(Integer.toString(rs2.getInt("Absent")));
                    
                    totalworkday=Integer.toString(rs2.getInt("TotalWorkDays"));
                    Present=Integer.toString(rs2.getInt("Present"));
                    absent=Integer.toString(rs2.getInt("Absent"));
                    
                }
                if(rs3.next())
                {
                    GPALabel.setText(rs3.getString("CGPA"));
                    gpa=rs3.getString("CGPA");
                }
            }
        }
        catch(SQLException ex)
        { Logger.getLogger(AllStudentShow.class.getName()).log(Level.SEVERE, null, ex);}
        catch (ClassNotFoundException ex)
        { Logger.getLogger(AllStudentShow.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_GetResultActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        db.show();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFActionPerformed
        
        JFileChooser j=new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x=j.showSaveDialog(this);
        if(x==JFileChooser.APPROVE_OPTION)
        {
            path=j.getSelectedFile().getPath();
        }
        String filename=id+".pdf";
        Document doc=new Document();
        
        try 
        {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"\\"+filename));
            
            String par="                                                                   Report Card\n";
            String par2="Name= "+name+"\n"+"ID= "+id+"\n"+"Class= "+Clas.getText()+"\n"+"Section= "+sect+"\n";
            String par3="Total Marks="+totaln+"\n"+"GPA= "+gpa+"\n";
            String par4="Total Working days= "+totalworkday+"\n"+"Present= "+Present+"\n"+"Absent= "+absent+"\n";
            String par5="Marks of Each subject"+"\n"+"\n";
            String par6="\n\n\t\t\t Class Teachers Signature";
            
            //adding strings into pdf doc file
            Paragraph para1=new Paragraph(par);
            Paragraph para2=new Paragraph(par2);
            Paragraph para3=new Paragraph(par3);
            Paragraph para4=new Paragraph(par4);
            Paragraph para5=new Paragraph(par5);
            Paragraph para6=new Paragraph(par6);
            
            doc.open();
            
            doc.add(para1);
            doc.add(para2);
            doc.add(para5);
            
            //creating table
            //crating the header
            PdfPTable table=new PdfPTable(5);
            PdfPCell pcel=new PdfPCell(new Phrase("Subject"));
            table.addCell(pcel);
            
            pcel=new PdfPCell(new Phrase("CQ"));
            table.addCell(pcel);
            
            pcel=new PdfPCell(new Phrase("MCQ"));
            table.addCell(pcel);
            
            pcel=new PdfPCell(new Phrase("Lab"));
            table.addCell(pcel);
            
            pcel=new PdfPCell(new Phrase("Total"));
            table.addCell(pcel);
            table.setHeaderRows(1);
            //end header creation
            
            //creating the marks chart
            
            for(int i=0;i<model.getRowCount();i++)
            {
                String sub=model.getValueAt(i, 0).toString();
                String cq=model.getValueAt(i, 1).toString();
                String mcq=model.getValueAt(i, 2).toString();
                String lab=model.getValueAt(i, 3).toString();
                String total=model.getValueAt(i, 4).toString();
                
                table.addCell(sub);
                table.addCell(cq);
                table.addCell(mcq);
                table.addCell(lab);
                table.addCell(total);
            }
            
            doc.add(table);
            
            doc.add(para3);
            doc.add(para4);
            doc.add(para6);
            
            doc.close();
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(ResultCard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) 
        {
            Logger.getLogger(ResultCard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_PDFActionPerformed

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
            java.util.logging.Logger.getLogger(ResultCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultCard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Absent;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField Clas;
    private javax.swing.JLabel GPALabel;
    private javax.swing.JButton GetResult;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton PDF;
    private javax.swing.JTable Result;
    private javax.swing.JTextField Sec;
    private javax.swing.JLabel TotalMark;
    private javax.swing.JLabel TotalWork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel present;
    // End of variables declaration//GEN-END:variables
}