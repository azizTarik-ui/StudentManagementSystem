/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Update Result of Science student 
package studentmanagementsystem;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import static java.lang.Math.round;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class UpdateResult extends javax.swing.JFrame {

    private double additionalGrade;

    /**
     * Creates new form UpdateResult
     */
    int flag1=0,flag2=0;
    
    public UpdateResult() {
        initComponents();
        
        UpdateMarks.setEnabled(false);
        SectionField.setText(StudentLogin.sec);
        ClassField.setText(Integer.toString(StudentLogin.clas));
        
    }
    Connection con;
    PreparedStatement pst,pst2,pst3;
    ResultSet rs,rs2,rs3;
    
    //static int fla=0;
    void enableUpdate()
    {
        if(flag1==1 && flag2==1 && IDField.toString().length()>0)
        {
            UpdateMarks.setEnabled(true);
        }
        else
        {
            UpdateMarks.setEnabled(false);
        }
    }
    
    
double return_grade(double firstpaper, double secondpaper)
{
double grade=0.0;

    double avg = round((firstpaper+secondpaper)/2);
    if(avg < 33)
        grade = 0.00;
    else if(avg >= 33 && avg <= 39)
        grade = 1.00;
    else if(avg >= 40 && avg <= 49)
        grade = 2.00;
    else if(avg >= 50 && avg <= 59)
        grade = 3.00;
    else if(avg >= 60 && avg <= 69)
        grade = 3.50;
    else if(avg >= 70 && avg <= 79)
        grade = 4.00;
    else if(avg >= 80 && avg <= 100)
        grade = 5.00;

    return grade;
}

double return_grade_ict(double marks) {
        
        double grade = 0.0;
        if (marks < 33) {
            grade = 0.00;
        } else if (marks >= 33 && marks <= 39) {
            grade = 1.00;
        } else if (marks >= 40 && marks <= 49) {
            grade = 2.00;
        } else if (marks >= 50 && marks <= 59) {
            grade = 3.00;
        } else if (marks >= 60 && marks <= 69) {
            grade = 3.50;
        } else if (marks >= 70 && marks <= 79) {
            grade = 4.00;
        } else if (marks >= 80 && marks <= 100) {
            grade = 5.00;
        }

        return grade;
    }



    
    String GPa;
    
    double Bangla1stTotal;
    double Bangla2ndTotal;
    double BanglaGrade;
    
    double Eng1Total;
    double Eng2Total;
    double EngGrade;
    
    double ictTotal;
    double ictGrade;
    
    double HMath1Total;
    double HMath2Total;
    double HMathGarde;
    
    double Physics1Total;
    double Physics2Total;
    double PhysicsGrade;
    
    double Chemistry1Total;
    double Chemistry2Total;
    double ChemGrade;
    
    
    double Biology1Total;
    double Biology2Total;
    double BioGrade;
    
    double statsTotal;
    double gpa;
    double totalMark;
    
    double optional;
    double totalGrade;
    
    double additonalGrade ;
    
    String OptionalSub;
    
    public static DashBoard db;
    public static void ObjPass(DashBoard obj)
    {
        db=obj;
    }
    
    void calculate_gpa()
    {
        double additonalgrade = 0;
        //nicher variable gulo globally declare korsos maybe
        OptionalSub=OptSub.getSelectedItem().toString();
        DecimalFormat df = new DecimalFormat("#.##");
        BanglaGrade = return_grade(Bangla1stTotal, Bangla2ndTotal);
        EngGrade = return_grade(Eng1Total, Eng2Total);
        ictGrade = return_grade_ict(ictTotal);
        HMathGarde = return_grade(HMath1Total, HMath2Total);
        PhysicsGrade = return_grade(Physics1Total, Physics2Total);
        ChemGrade = return_grade(Chemistry1Total, Chemistry2Total);
        BioGrade = return_grade(Biology1Total, Biology2Total);

        if( "Higher Math".equals(OptionalSub))
        {
            if(HMathGarde > 2)
            {
                 additionalGrade = HMathGarde - 2;
            }

            totalGrade = BanglaGrade + EngGrade + ictGrade + BioGrade + PhysicsGrade + ChemGrade + additionalGrade;
            gpa = totalGrade / 6;
            if(gpa>5.00)
            {
                gpa=5.00;
            }
        }
        else if("Biology".equals(OptionalSub))
        {
            if(BioGrade > 2)
            {
                additionalGrade = BioGrade - 2;
            }

            totalGrade = BanglaGrade + EngGrade + ictGrade + HMathGarde + PhysicsGrade + ChemGrade + additionalGrade;
            gpa = totalGrade / 6;
            if(gpa>5.00)
            {
                gpa=5.00;
            }
        }

    //  code to show gpa on the gpa textfield
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
        IDField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ClassField = new javax.swing.JTextField();
        SectoinField = new javax.swing.JLabel();
        SectionField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        B1CQ = new javax.swing.JTextField();
        B2CQ = new javax.swing.JTextField();
        E1CQ = new javax.swing.JTextField();
        E2CQ = new javax.swing.JTextField();
        ICTCQ = new javax.swing.JTextField();
        HM1CQ = new javax.swing.JTextField();
        HM2CQ = new javax.swing.JTextField();
        Phy1CQ = new javax.swing.JTextField();
        Phy2CQ = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        B1MCQ = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        E1MCQ = new javax.swing.JTextField();
        E2MCQ = new javax.swing.JTextField();
        ICTMCQ = new javax.swing.JTextField();
        B2MCQ = new javax.swing.JTextField();
        Phy1MCQ = new javax.swing.JTextField();
        Phy2MCQ = new javax.swing.JTextField();
        HM1MCQ = new javax.swing.JTextField();
        HM2MCQ = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Che1CQ = new javax.swing.JTextField();
        Che2CQ = new javax.swing.JTextField();
        Bio1CQ = new javax.swing.JTextField();
        Bio2CQ = new javax.swing.JTextField();
        TotalMarks = new javax.swing.JTextField();
        GPA = new javax.swing.JTextField();
        Che1MCQ = new javax.swing.JTextField();
        Che2MCQ = new javax.swing.JTextField();
        Bio1MCQ = new javax.swing.JTextField();
        Bio2MCQ = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        ICTLab = new javax.swing.JTextField();
        Phy1Lab = new javax.swing.JTextField();
        Phy2Lab = new javax.swing.JTextField();
        Che1Lab = new javax.swing.JTextField();
        CHe2Lab = new javax.swing.JTextField();
        HM1Lab = new javax.swing.JTextField();
        HM2Lab = new javax.swing.JTextField();
        Bio1Lab = new javax.swing.JTextField();
        Bio2Lab = new javax.swing.JTextField();
        CalculateTotalMarks = new javax.swing.JButton();
        GPACalc = new javax.swing.JButton();
        UpdateMarks = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        TotalB2 = new javax.swing.JLabel();
        TotalE1 = new javax.swing.JLabel();
        E2Total = new javax.swing.JLabel();
        ICTTotal = new javax.swing.JLabel();
        HM1Total = new javax.swing.JLabel();
        HM2Total = new javax.swing.JLabel();
        Phy1Total = new javax.swing.JLabel();
        Phy2Total = new javax.swing.JLabel();
        Che1Total = new javax.swing.JLabel();
        Che2Total = new javax.swing.JLabel();
        Bio1Total = new javax.swing.JLabel();
        Bio2Total = new javax.swing.JLabel();
        StatTotal = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        OptSub = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(26, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Update Result(Science)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("ID        :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Class   :");

        SectoinField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SectoinField.setText("Section        :");

        SectionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SectionFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Marks for Each Subject:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Bangla  1st:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Bangla 2nd  :");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("English 1st  :");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("English 2nd :");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("ICT               :");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Higher Math  1st :");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Higher Math  2nd :");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Physics 1st :");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Physics 2nd :");

        B1CQ.setText("0");

        B2CQ.setText("0");

        E1CQ.setText("0");

        E2CQ.setText("0");

        ICTCQ.setText("0");

        HM1CQ.setText("0");

        HM2CQ.setText("0");
        HM2CQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HM2CQActionPerformed(evt);
            }
        });

        Phy1CQ.setText("0");
        Phy1CQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Phy1CQActionPerformed(evt);
            }
        });

        Phy2CQ.setText("0");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Chemistry 1st:");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Chemistry 2nd :");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Biology 1st:");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Biology 2nd:");

        B1MCQ.setText("0");

        E1MCQ.setText("0");

        E2MCQ.setText("0");

        ICTMCQ.setText("0");

        B2MCQ.setText("0");

        Phy1MCQ.setText("0");

        Phy2MCQ.setText("0");

        HM1MCQ.setText("0");

        HM2MCQ.setText("0");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Total Marks :");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("GPA           :");

        Che1CQ.setText("0");
        Che1CQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Che1CQActionPerformed(evt);
            }
        });

        Che2CQ.setText("0");

        Bio1CQ.setText("0");

        Bio2CQ.setText("0");

        TotalMarks.setText("0");
        TotalMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalMarksActionPerformed(evt);
            }
        });

        GPA.setText("0");

        Che1MCQ.setText("0");

        Che2MCQ.setText("0");

        Bio1MCQ.setText("0");

        Bio2MCQ.setText("0");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel22.setText("Lab Marks: ");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setText("ICT       :");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("Physics 1st:");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setText("Physics 2nd:");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("Chemistry 1st:");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("Chemistry 2nd:");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("Higher Math 1st:");

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setText("Higher Math 2nd:");

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setText("Biology  1st    :");

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setText("Biology 2nd    :");

        ICTLab.setText("0");
        ICTLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICTLabActionPerformed(evt);
            }
        });

        Phy1Lab.setText("0");

        Phy2Lab.setText("0");

        Che1Lab.setText("0");

        CHe2Lab.setText("0");
        CHe2Lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHe2LabActionPerformed(evt);
            }
        });

        HM1Lab.setText("0");

        HM2Lab.setText("0");

        Bio1Lab.setText("0");

        Bio2Lab.setText("0");

        CalculateTotalMarks.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CalculateTotalMarks.setText("Calculate Total");
        CalculateTotalMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateTotalMarksActionPerformed(evt);
            }
        });

        GPACalc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        GPACalc.setText("Calculate GPA");
        GPACalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPACalcActionPerformed(evt);
            }
        });

        UpdateMarks.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        UpdateMarks.setText("Update Marks");
        UpdateMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateMarksActionPerformed(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setText("CQ");

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel33.setText("MCQ");

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setText("Total");

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setText("Total");

        OptSub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biology", "Higher Math" }));
        OptSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptSubActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setText("Optional Subject:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Phy1Lab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(HM2Lab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(169, 169, 169)
                                                        .addComponent(StatTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(Bio2CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(Bio2MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(Bio2Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(Bio1CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(Bio1MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(Bio1Total, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Che2CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Che2MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Che2Total, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Che1CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Che1MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Che1Total, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel25)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Phy2Lab, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel26)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Che1Lab, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(HM1Lab, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel24)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(23, 23, 23)
                                                        .addComponent(Bio1Lab, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 8, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ICTLab, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CHe2Lab, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(164, 164, 164))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ClassField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(SectoinField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SectionField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OptSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(B1CQ)
                                            .addComponent(B2CQ)
                                            .addComponent(E1CQ)
                                            .addComponent(E2CQ)
                                            .addComponent(ICTCQ, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Phy2CQ, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                        .addGap(6, 6, 6)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Phy2MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Phy2Total, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(E2MCQ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B1MCQ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(E1MCQ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B2MCQ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ICTMCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ICTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(E2Total, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TotalE1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel19)
                                                    .addGap(10, 10, 10)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(TotalB2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Phy1CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Phy1MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Phy1Total, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(906, 906, 906)
                                .addComponent(Bio2Lab, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HM2CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HM1CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(HM1MCQ, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(HM2MCQ))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HM1Total, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HM2Total, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(CalculateTotalMarks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GPACalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UpdateMarks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClassField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SectoinField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SectionField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OptSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Che1CQ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TotalMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ICTLab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B1CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B1MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Che1MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(B2CQ))
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B2MCQ)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Che2MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Che2CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Phy1Lab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TotalB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(E1CQ)
                            .addComponent(E1MCQ)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bio1CQ)
                            .addComponent(jLabel25)
                            .addComponent(Bio1MCQ)
                            .addComponent(TotalE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Phy2Lab))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(E2MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(E2CQ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(E2Total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(Bio2CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(Bio2MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(Che1Lab, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(ICTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(ICTCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(ICTMCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(4, 4, 4)))
                                                        .addGap(9, 9, 9))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(CHe2Lab, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(HM1Total, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(HM1CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(HM1MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(5, 5, 5))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(HM1Lab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(GPACalc)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(HM2CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(HM2MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6))
                                    .addComponent(UpdateMarks)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(HM2Lab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(HM2Total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CalculateTotalMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Phy1CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Phy1MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Bio1Lab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Phy1Total, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Phy2Total, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Phy2CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Phy2MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(4, 4, 4)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Bio2Lab, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CancelButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel33)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35)
                                .addGap(18, 18, 18)))
                        .addComponent(Che1Total, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Che2Total, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bio1Total, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bio2Total, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(StatTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HM2CQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HM2CQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HM2CQActionPerformed

    private void SectionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SectionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SectionFieldActionPerformed

    private void Che1CQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Che1CQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Che1CQActionPerformed

    private void TotalMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalMarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalMarksActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.setVisible(false);
        db.show();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void CalculateTotalMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateTotalMarksActionPerformed
        flag1=1;
        
        try{
            Bangla1stTotal=Double.parseDouble(B1CQ.getText())+Double.parseDouble(B1MCQ.getText());
            Bangla2ndTotal=Double.parseDouble(B2CQ.getText())+Double.parseDouble(B2MCQ.getText());
            Total.setText(Double.toString(Bangla1stTotal));
            TotalB2.setText(Double.toString(Bangla2ndTotal));

            Eng1Total=Double.parseDouble(E1CQ.getText());
            Eng2Total=Double.parseDouble(E2CQ.getText());
            E2Total.setText(Double.toString(Eng2Total));
            TotalE1.setText(Double.toString(Eng1Total));

            ictTotal=Double.parseDouble(ICTCQ.getText())+Double.parseDouble(ICTMCQ.getText())+Double.parseDouble(ICTLab.getText());
            ICTTotal.setText(Double.toString(ictTotal));

            HMath1Total=Double.parseDouble(HM1CQ.getText())+Double.parseDouble(HM1MCQ.getText())+Double.parseDouble(HM1Lab.getText());
            HMath2Total=Double.parseDouble(HM2CQ.getText())+Double.parseDouble(HM2MCQ.getText())+Double.parseDouble(HM2Lab.getText());
            HM1Total.setText(Double.toString(HMath1Total));
            HM2Total.setText(Double.toString(HMath2Total));

            Physics1Total=Double.parseDouble(Phy1CQ.getText())+Double.parseDouble(Phy1MCQ.getText())+Double.parseDouble(Phy1Lab.getText());
            Physics2Total=Double.parseDouble(Phy2CQ.getText())+Double.parseDouble(Phy2MCQ.getText())+Double.parseDouble(Phy2Lab.getText());
            Phy1Total.setText(Double.toString(Physics1Total));
            Phy2Total.setText(Double.toString(Physics2Total));

            Chemistry1Total=Double.parseDouble(Che1CQ.getText())+Double.parseDouble(Che1MCQ.getText())+Double.parseDouble(Che1Lab.getText());
            Chemistry2Total=Double.parseDouble(Che2CQ.getText())+Double.parseDouble(Che2MCQ.getText())+Double.parseDouble(CHe2Lab.getText());
            Che1Total.setText(Double.toString(Chemistry1Total));
            Che2Total.setText(Double.toString(Chemistry2Total));

            Biology1Total=Double.parseDouble(Bio1CQ.getText())+Double.parseDouble(Bio1MCQ.getText())+Double.parseDouble(Bio1Lab.getText());
            Biology2Total=Double.parseDouble(Bio1CQ.getText())+Double.parseDouble(Bio1MCQ.getText())+Double.parseDouble(Bio1Lab.getText());
            Bio1Total.setText(Double.toString(Biology1Total));
            Bio2Total.setText(Double.toString(Biology2Total));
            
            totalMark=Bangla1stTotal+Bangla2ndTotal+Eng1Total+Eng2Total+ictTotal+HMath1Total+HMath2Total+Physics1Total+Physics2Total+Chemistry1Total+Chemistry2Total+Biology1Total+Biology2Total;
            TotalMarks.setText(Double.toString(totalMark));
           }
           catch(NumberFormatException e)
           {
              JOptionPane.showMessageDialog(this,"Some Subjects Marks are empty.");
           }
           
    }//GEN-LAST:event_CalculateTotalMarksActionPerformed

    private void ICTLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICTLabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ICTLabActionPerformed

    private void CHe2LabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHe2LabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHe2LabActionPerformed

    private void UpdateMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateMarksActionPerformed
        
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/studentmanagement","root","");
            pst=(PreparedStatement) con.prepareStatement("UPDATE sciencesubjects SET Bangla1st=?,B1CQ=?,B1MCQ=?,Bangla2nd=?,B2CQ=?,B2MCQ=?,English1st=?,English2nd=?,HigherMath1st=?,HM1CQ=?,HM1MCQ=?,HM1Lab=?,HigherMath2nd=?,HM2CQ=?,HM2MCQ=?,HM2Lab=?,Physics1st=?,PHY1CQ=?,PHY1MCQ=?,PHY1Lab=?,Physics2nd=?,PHY2CQ=?,PHY2MCQ=?,PHY2Lab=?,Chemistry1st=?,CHE1CQ=?,CHE1MCQ=?,CHE1Lab=?,Chemistry2nd=?,CHE2CQ=?,CHE2MCQ=?,CHE2Lab=?,Biology1st=?,BIO1CQ=?,BIO1MCQ=?,BIO1Lab=?,Biology2nd=?,BIO2CQ=?,BIO2MCQ=?,BIO2Lab=?,ICT=?,ICTCQ=?,ICTMCQ=?,ICTLab=?,TotalMarks=? WHERE id=? and Class=? and Semester=? and Shift=?");
            pst2=(PreparedStatement) con.prepareStatement("UPDATE userinfo SET CGPA=? WHERE id=? and Dept=? and Shift=?");
            
            pst.setDouble(1, Bangla1stTotal);
            pst.setDouble(2, Double.parseDouble(B1CQ.getText()));
            pst.setDouble(3, Double.parseDouble(B1MCQ.getText()));
            pst.setDouble(4, Bangla2ndTotal);
            pst.setDouble(5, Double.parseDouble(B2CQ.getText()));
            pst.setDouble(6, Double.parseDouble(B2MCQ.getText()));
            pst.setDouble(7, Eng1Total);
            pst.setDouble(8, Eng2Total);
            pst.setDouble(9, HMath1Total);
            pst.setDouble(10, Double.parseDouble(HM1CQ.getText()));
            pst.setDouble(11, Double.parseDouble(HM1MCQ.getText()));
            pst.setDouble(12, Double.parseDouble(HM1Lab.getText()));
            pst.setDouble(13,  HMath2Total);
            pst.setDouble(14, Double.parseDouble(HM2CQ.getText()));
            pst.setDouble(15, Double.parseDouble(HM2MCQ.getText()));
            pst.setDouble(16, Double.parseDouble(HM2Lab.getText()));
            pst.setDouble(17, Physics1Total);
            pst.setDouble(18, Double.parseDouble(Phy1CQ.getText()));
            pst.setDouble(19, Double.parseDouble(Phy1MCQ.getText()));
            pst.setDouble(20, Double.parseDouble(Phy1Lab.getText()));
            pst.setDouble(21, Physics2Total);
            pst.setDouble(22, Double.parseDouble(Phy2CQ.getText()));
            pst.setDouble(23, Double.parseDouble(Phy2MCQ.getText()));
            pst.setDouble(24, Double.parseDouble(Phy2Lab.getText()));
            pst.setDouble(25, Chemistry1Total);
            pst.setDouble(26, Double.parseDouble(Che1CQ.getText()));
            pst.setDouble(27, Double.parseDouble(Che1MCQ.getText()));
            pst.setDouble(28, Double.parseDouble(Che1Lab.getText()));
            pst.setDouble(29, Chemistry2Total);
            pst.setDouble(30, Double.parseDouble(Che2CQ.getText()));
            pst.setDouble(31, Double.parseDouble(Che2MCQ.getText()));
            pst.setDouble(32, Double.parseDouble(CHe2Lab.getText()));
            pst.setDouble(33, Biology1Total);
            pst.setDouble(34, Double.parseDouble(Bio1CQ.getText()));
            pst.setDouble(35, Double.parseDouble(Bio1MCQ.getText()));
            pst.setDouble(36, Double.parseDouble(Bio1Lab.getText()));
            pst.setDouble(37, Biology2Total);
            pst.setDouble(38, Double.parseDouble(Bio2CQ.getText()));
            pst.setDouble(39, Double.parseDouble(Bio2MCQ.getText()));
            pst.setDouble(40, Double.parseDouble(Bio2Lab.getText()));
            pst.setDouble(41, ictTotal);
            pst.setDouble(42, Double.parseDouble(ICTCQ.getText()));
            pst.setDouble(43, Double.parseDouble(ICTMCQ.getText()));
            pst.setDouble(44, Double.parseDouble(ICTLab.getText()));
            pst.setDouble(45, totalMark);
            pst.setInt(46, Integer.parseInt(IDField.getText()));
            pst.setInt(47, Integer.parseInt(ClassField.getText()));
            pst.setString(48, SectionField.getText());
            pst.setString(49, StudentLogin.shift);
        
        
            pst2.setString(1 ,GPa);
            pst2.setInt(2, Integer.parseInt(IDField.getText()));
            pst2.setString(3, StudentLogin.dept);
            pst2.setString(4, StudentLogin.shift);
            
            pst.executeUpdate();
            pst2.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Updated");
            
        }
        catch(SQLException ex)
        {
            Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateResult.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "ID field is empty.");
        }
        
    }//GEN-LAST:event_UpdateMarksActionPerformed

    private void GPACalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPACalcActionPerformed
        
        flag2=1;
        
        calculate_gpa();
        DecimalFormat df = new DecimalFormat("#.##");
        GPA.setText(df.format(gpa));
        GPa=df.format(gpa);
        
        enableUpdate();
        
    }//GEN-LAST:event_GPACalcActionPerformed

    private void OptSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptSubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OptSubActionPerformed

    private void Phy1CQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Phy1CQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Phy1CQActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateResult().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField B1CQ;
    private javax.swing.JTextField B1MCQ;
    private javax.swing.JTextField B2CQ;
    private javax.swing.JTextField B2MCQ;
    private javax.swing.JTextField Bio1CQ;
    private javax.swing.JTextField Bio1Lab;
    private javax.swing.JTextField Bio1MCQ;
    private javax.swing.JLabel Bio1Total;
    private javax.swing.JTextField Bio2CQ;
    private javax.swing.JTextField Bio2Lab;
    private javax.swing.JTextField Bio2MCQ;
    private javax.swing.JLabel Bio2Total;
    private javax.swing.JTextField CHe2Lab;
    private javax.swing.JButton CalculateTotalMarks;
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField Che1CQ;
    private javax.swing.JTextField Che1Lab;
    private javax.swing.JTextField Che1MCQ;
    private javax.swing.JLabel Che1Total;
    private javax.swing.JTextField Che2CQ;
    private javax.swing.JTextField Che2MCQ;
    private javax.swing.JLabel Che2Total;
    private javax.swing.JTextField ClassField;
    private javax.swing.JTextField E1CQ;
    private javax.swing.JTextField E1MCQ;
    private javax.swing.JTextField E2CQ;
    private javax.swing.JTextField E2MCQ;
    private javax.swing.JLabel E2Total;
    private javax.swing.JTextField GPA;
    private javax.swing.JButton GPACalc;
    private javax.swing.JTextField HM1CQ;
    private javax.swing.JTextField HM1Lab;
    private javax.swing.JTextField HM1MCQ;
    private javax.swing.JLabel HM1Total;
    private javax.swing.JTextField HM2CQ;
    private javax.swing.JTextField HM2Lab;
    private javax.swing.JTextField HM2MCQ;
    private javax.swing.JLabel HM2Total;
    private javax.swing.JTextField ICTCQ;
    private javax.swing.JTextField ICTLab;
    private javax.swing.JTextField ICTMCQ;
    private javax.swing.JLabel ICTTotal;
    private javax.swing.JTextField IDField;
    private javax.swing.JComboBox<String> OptSub;
    private javax.swing.JTextField Phy1CQ;
    private javax.swing.JTextField Phy1Lab;
    private javax.swing.JTextField Phy1MCQ;
    private javax.swing.JLabel Phy1Total;
    private javax.swing.JTextField Phy2CQ;
    private javax.swing.JTextField Phy2Lab;
    private javax.swing.JTextField Phy2MCQ;
    private javax.swing.JLabel Phy2Total;
    private javax.swing.JTextField SectionField;
    private javax.swing.JLabel SectoinField;
    private javax.swing.JLabel StatTotal;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel TotalB2;
    private javax.swing.JLabel TotalE1;
    private javax.swing.JTextField TotalMarks;
    private javax.swing.JButton UpdateMarks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
