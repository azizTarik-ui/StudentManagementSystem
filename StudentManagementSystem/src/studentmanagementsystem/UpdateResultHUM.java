/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class UpdateResultHUM extends javax.swing.JFrame {

    /**
     * Creates new form UpdateResultHUM
     */
    int flag1=0,flag2=0;
    
    public UpdateResultHUM() {
        initComponents();
        UpdateMarks.setEnabled(false);
        ClassField.setText(Integer.toString(StudentLogin.clas));
        SectionField.setText(StudentLogin.sec);
    }
    
    public static DashBoard db;
    public static void ObjPass(DashBoard obj)
    {
        db=obj;
    }
    
    Connection con;
    PreparedStatement pst,pst2,pst3;
    ResultSet rs,rs2,rs3;
    
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
    
    
    
public double return_grade(double firstpaper, double secondpaper)
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

    

    
    double Bangla1stTotal;
    double Bangla2ndTotal;
    double BanglaGrade;
    
    double Eng1stTotal;
    double Eng2ndTotal;
    double EngGrade;
    
    double ICTTotal;
    double ICTGrade;
    
    double Sociology1stTotal;
    double Sociology2ndTotal;
    double SociologyGrade;
    
    double Geography1Total;
    double Geography2Total;
    double GeographyGrade;
    
    double Economy1Total;
    double Economy2Total;
    double EconomyGrade;
    
    double Logic1Total;
    double Logic2Total;
    double LogicGrade;
    
    double History1Total;
    double History2Total;
    double HistoryGrade;
    
    double SocialScience1Total;
    double SocialScience2Total;
    double SocialScienceGrade;
    
    double CivicGG1Total;
    double CivicGG2Total;
    double CivicGGGrade;
    
    double ish1Total;
    double ish2Total;
    double ishGrade;
    
    double gpa;
    double totalmarks;
    double addGrade;
    String GPa;
    
    String OptionSub;
    
    double totalgrade;
    
    void calculate_gpa()
    {
        double addGrade = 0;
        
        OptionSub = OPT.getSelectedItem().toString();
        DecimalFormat df = new DecimalFormat("#.##");
        BanglaGrade = return_grade(Bangla1stTotal, Bangla2ndTotal);
        EngGrade = return_grade(Eng1stTotal, Eng2ndTotal);
        ICTGrade =  return_grade_ict(ICTTotal);
        SociologyGrade = return_grade(Sociology1stTotal, Sociology2ndTotal);
        GeographyGrade = return_grade(Geography1Total, Geography2Total);
        EconomyGrade = return_grade(Economy1Total, Economy2Total);
        LogicGrade = return_grade(Logic1Total, Logic2Total);
        HistoryGrade = return_grade(History1Total, History2Total);
        SocialScienceGrade = return_grade(SocialScience1Total, SocialScience2Total);
        CivicGGGrade = return_grade(CivicGG1Total, CivicGG2Total);
        ishGrade = return_grade(ish1Total, ish2Total);
      
        if("History".equals(OptionSub))
        {
            if(HistoryGrade > 2)
            {
                 addGrade = HistoryGrade - 2;
            }

            totalgrade = BanglaGrade + EngGrade + ICTGrade + SociologyGrade + GeographyGrade + EconomyGrade + LogicGrade + SocialScienceGrade + CivicGGGrade + ishGrade + addGrade;
            gpa = totalgrade / 6;
            if(gpa>5.00)
            {
                gpa=5.00;
            }
        }
        if("Geography".equals(OptionSub))
        {
            if(GeographyGrade > 2)
            {
                 addGrade = GeographyGrade - 2;
            }

            totalgrade = BanglaGrade + EngGrade + ICTGrade + SociologyGrade + EconomyGrade + LogicGrade + HistoryGrade + SocialScienceGrade + CivicGGGrade + ishGrade + addGrade;
            gpa = totalgrade / 6;
            if(gpa>5.00)
            {
                gpa=5.00;
            }
        }
        if("Logic".equals(OptionSub))
        {
            if(LogicGrade > 2)
            {
                 addGrade = LogicGrade - 2;
            }

            totalgrade = BanglaGrade + EngGrade + ICTGrade + SociologyGrade + GeographyGrade + EconomyGrade + HistoryGrade + SocialScienceGrade + CivicGGGrade + ishGrade + addGrade;
            gpa = totalgrade / 6;
            if(gpa>5.00)
            {
                gpa=5.00;
            }
        }
        if("Sociology".equals(OptionSub))
        {
            if(SociologyGrade > 2)
            {
                 addGrade = SociologyGrade - 2;
            }

            totalgrade = BanglaGrade + EngGrade + ICTGrade + LogicGrade + GeographyGrade + EconomyGrade + HistoryGrade + SocialScienceGrade + CivicGGGrade + ishGrade + addGrade;
            gpa = totalgrade / 6;
            if(gpa>5.00)
            {
                gpa=5.00;
            }
        }
        if("Social Science".equals(OptionSub))
        {
            if(SocialScienceGrade > 2)
            {
                 addGrade = SocialScienceGrade - 2;
            }

            totalgrade = BanglaGrade + EngGrade + ICTGrade + SociologyGrade + GeographyGrade + EconomyGrade + HistoryGrade + LogicGrade + CivicGGGrade + ishGrade + addGrade;
            gpa = totalgrade / 6;
            if(gpa>5.00)
            {
                gpa=5.00;
            }
        }
        if("Islamic History and Culture".equals(OptionSub))
        {
            if(ishGrade > 2)
            {
                 addGrade = ishGrade - 2;
            }

            totalgrade = BanglaGrade + EngGrade + ICTGrade + SociologyGrade + GeographyGrade + EconomyGrade + HistoryGrade + SocialScienceGrade + CivicGGGrade + LogicGrade + addGrade;
            gpa = totalgrade / 6;
            if(gpa>5.00)
            {
                gpa=5.00;
            }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ClassField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SectionField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        B1CQ = new javax.swing.JTextField();
        B1MCQ = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        CalculateTotalMarks = new javax.swing.JButton();
        CalCulateGPA = new javax.swing.JButton();
        UpdateMarks = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        B2CQ = new javax.swing.JTextField();
        B2MCQ = new javax.swing.JTextField();
        Eng1CQ = new javax.swing.JTextField();
        E1MCQ = new javax.swing.JTextField();
        Eng2CQ = new javax.swing.JTextField();
        E2MCQ = new javax.swing.JTextField();
        ictCQ = new javax.swing.JTextField();
        ictMCQ = new javax.swing.JTextField();
        Soc1CQ = new javax.swing.JTextField();
        Soc1MCQ = new javax.swing.JTextField();
        Soc2CQ = new javax.swing.JTextField();
        Soc2MCQ = new javax.swing.JTextField();
        Eco1CQ = new javax.swing.JTextField();
        Geo2CQ = new javax.swing.JTextField();
        Geo2MCQ = new javax.swing.JTextField();
        Eco1MCQ = new javax.swing.JTextField();
        Eco2CQ = new javax.swing.JTextField();
        Eco2MCQ = new javax.swing.JTextField();
        Geo1CQ = new javax.swing.JTextField();
        Geo1MCQ = new javax.swing.JTextField();
        Log1CQ = new javax.swing.JTextField();
        Log1MCQ = new javax.swing.JTextField();
        Log2CQ = new javax.swing.JTextField();
        Log2MCQ = new javax.swing.JTextField();
        His1CQ = new javax.swing.JTextField();
        His1MCQ = new javax.swing.JTextField();
        His2CQ = new javax.swing.JTextField();
        His2MCQ = new javax.swing.JTextField();
        Ss1CQ = new javax.swing.JTextField();
        Ss1MCQ = new javax.swing.JTextField();
        Ss2CQ = new javax.swing.JTextField();
        Ss2MCQ = new javax.swing.JTextField();
        CGG1CQ = new javax.swing.JTextField();
        CGG1MCQ = new javax.swing.JTextField();
        CGG2CQ = new javax.swing.JTextField();
        CGG2MCQ = new javax.swing.JTextField();
        IHS1CQ = new javax.swing.JTextField();
        IHS1MCQ = new javax.swing.JTextField();
        IHS2CQ = new javax.swing.JTextField();
        IHS2MCQ = new javax.swing.JTextField();
        TotalMark = new javax.swing.JTextField();
        GPA = new javax.swing.JTextField();
        B1Total = new javax.swing.JLabel();
        B2Total = new javax.swing.JLabel();
        E1Total = new javax.swing.JLabel();
        E2Total = new javax.swing.JLabel();
        ictTotal = new javax.swing.JLabel();
        Soc1Total = new javax.swing.JLabel();
        Soc2Total = new javax.swing.JLabel();
        Eco1Total = new javax.swing.JLabel();
        Eco2Total = new javax.swing.JLabel();
        Geo1Total = new javax.swing.JLabel();
        Geo2Total = new javax.swing.JLabel();
        Log1Total = new javax.swing.JLabel();
        Log2Total = new javax.swing.JLabel();
        His1Total = new javax.swing.JLabel();
        His2Total = new javax.swing.JLabel();
        Ss1Total = new javax.swing.JLabel();
        Ss2Total = new javax.swing.JLabel();
        CGG1Total = new javax.swing.JLabel();
        CGG2Total = new javax.swing.JLabel();
        IHS1Total = new javax.swing.JLabel();
        IHS2Total = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        OPT = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        ictLab = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(26, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Update Result(Humanities)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1085, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Class:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Section:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Marks of Each Subject:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Bangla 1st:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Bangla 2nd:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("English 1st:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("English 2nd:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("ICT              :");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Sociology 1st :");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Sociology 2nd :");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Economics 1st:");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Economics 2nd:");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Geography 1st:");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Geography 2nd:");

        B1CQ.setText("0");

        B1MCQ.setText("0");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Logic 1st:");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Logic 2nd :");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("History 1st: ");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("History 2nd:");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("Social Science 1st:");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("Social Science 2nd:");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setText("Civic & Good Governance 1st:");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("Civic & Good Governance 2nd:");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setText("Islamic History and Culture 1st:");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("Islamic History and Culture 2nd:");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("Total Marks:");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("GPA:");

        CalculateTotalMarks.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CalculateTotalMarks.setText("Calculate Total Marks");
        CalculateTotalMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateTotalMarksActionPerformed(evt);
            }
        });

        CalCulateGPA.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CalCulateGPA.setText("Calculate GPA");
        CalCulateGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalCulateGPAActionPerformed(evt);
            }
        });

        UpdateMarks.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        UpdateMarks.setText("Update Marks");
        UpdateMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateMarksActionPerformed(evt);
            }
        });

        Cancel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        B2CQ.setText("0");
        B2CQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2CQActionPerformed(evt);
            }
        });

        B2MCQ.setText("0");
        B2MCQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2MCQActionPerformed(evt);
            }
        });

        Eng1CQ.setText("0");

        E1MCQ.setText("0");

        Eng2CQ.setText("0");

        E2MCQ.setText("0");

        ictCQ.setText("0");

        ictMCQ.setText("0");

        Soc1CQ.setText("0");

        Soc1MCQ.setText("0");

        Soc2CQ.setText("0");

        Soc2MCQ.setText("0");

        Eco1CQ.setText("0");

        Geo2CQ.setText("0");
        Geo2CQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Geo2CQActionPerformed(evt);
            }
        });

        Geo2MCQ.setText("0");

        Eco1MCQ.setText("0");

        Eco2CQ.setText("0");

        Eco2MCQ.setText("0");

        Geo1CQ.setText("0");

        Geo1MCQ.setText("0");

        Log1CQ.setText("0");

        Log1MCQ.setText("0");

        Log2CQ.setText("0");
        Log2CQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log2CQActionPerformed(evt);
            }
        });

        Log2MCQ.setText("0");

        His1CQ.setText("0");

        His1MCQ.setText("0");
        His1MCQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                His1MCQActionPerformed(evt);
            }
        });

        His2CQ.setText("0");

        His2MCQ.setText("0");
        His2MCQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                His2MCQActionPerformed(evt);
            }
        });

        Ss1CQ.setText("0");

        Ss1MCQ.setText("0");

        Ss2CQ.setText("0");

        Ss2MCQ.setText("0");

        CGG1CQ.setText("0");

        CGG1MCQ.setText("0");
        CGG1MCQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CGG1MCQActionPerformed(evt);
            }
        });

        CGG2CQ.setText("0");

        CGG2MCQ.setText("0");
        CGG2MCQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CGG2MCQActionPerformed(evt);
            }
        });

        IHS1CQ.setText("0");

        IHS1MCQ.setText("0");
        IHS1MCQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHS1MCQActionPerformed(evt);
            }
        });

        IHS2CQ.setText("0");

        IHS2MCQ.setText("0");

        TotalMark.setText("0");
        TotalMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalMarkActionPerformed(evt);
            }
        });

        GPA.setText("0");

        B1Total.setText("0");

        B2Total.setText("0");

        E1Total.setText("0 ");

        E2Total.setText("0");

        ictTotal.setText("0");

        Soc1Total.setText("0");

        Soc2Total.setText("0");

        Eco1Total.setText("0");

        Eco2Total.setText("0");

        Geo1Total.setText("0");

        Geo2Total.setText("0");

        Log1Total.setText("0");

        Log2Total.setText("0");

        His1Total.setText("0");

        His2Total.setText("0");

        Ss1Total.setText("0");

        Ss2Total.setText("0");

        CGG1Total.setText("0");

        CGG2Total.setText("0");

        IHS1Total.setText("0");

        IHS2Total.setText("0");

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel49.setText("Total Marks");

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel50.setText("Total Marks");

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel51.setText("CQ");

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel52.setText("MCQ");

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel53.setText("CQ");

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel54.setText("MCQ");

        OPT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "History", "Sociology", "Logic", "Geography", "Social Science", "Islamic History and Culture" }));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setText("Optional Subject:");

        ictLab.setText("0");

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setText("Lab");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(ictCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ictMCQ, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(Eng1CQ, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Eng2CQ, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(E2MCQ))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(B2CQ)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(B2MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(E1MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(B1CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B1MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Geo1CQ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                            .addComponent(Eco2CQ, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Eco1CQ, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Soc2CQ, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Soc1CQ, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Geo2CQ))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Geo2MCQ, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                            .addComponent(Soc1MCQ, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Soc2MCQ, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Eco1MCQ)
                                            .addComponent(Eco2MCQ)
                                            .addComponent(Geo1MCQ)))
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(B2Total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                        .addComponent(B1Total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Geo2Total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Eco1Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Soc2Total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Soc1Total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ictTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(E2Total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(E1Total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                            .addComponent(Eco2Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Geo1Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ictLab, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Log1CQ)
                                                .addComponent(Log2CQ)
                                                .addComponent(His1CQ)
                                                .addComponent(His2CQ)
                                                .addComponent(Ss1CQ, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                                .addComponent(Ss2CQ)
                                                .addComponent(CGG1CQ)
                                                .addComponent(CGG2CQ)
                                                .addComponent(IHS1CQ)
                                                .addComponent(IHS2CQ))
                                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Log1MCQ)
                                            .addComponent(Log2MCQ)
                                            .addComponent(His1MCQ)
                                            .addComponent(His2MCQ)
                                            .addComponent(Ss1MCQ)
                                            .addComponent(Ss2MCQ, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                            .addComponent(CGG1MCQ)
                                            .addComponent(CGG2MCQ)
                                            .addComponent(IHS1MCQ)
                                            .addComponent(IHS2MCQ)
                                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Log2Total, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                    .addComponent(Log1Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(His1Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(His2Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Ss1Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Ss2Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CGG1Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CGG2Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(IHS1Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(IHS2Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ClassField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(171, 171, 171)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SectionField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel29)
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(GPA))
                                .addComponent(CalculateTotalMarks, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                .addComponent(CalCulateGPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UpdateMarks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TotalMark, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(OPT, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel50)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 454, Short.MAX_VALUE)
                        .addComponent(jLabel49)
                        .addGap(403, 403, 403))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClassField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SectionField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B1CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B1MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalMark, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B1Total, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel28)
                                    .addComponent(B2MCQ)
                                    .addComponent(B2CQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B2Total, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Eng1CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(E1MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19)
                            .addComponent(E1Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20)
                                .addComponent(Eng2CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(E2MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(CalculateTotalMarks))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(E2Total))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Log1CQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Log1MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Log1Total))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Log2MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Log2CQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(His1MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(His1CQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(Log2Total)
                                .addGap(18, 18, 18)
                                .addComponent(His1Total)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(His2CQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(His2MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(His2Total))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ictCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ictMCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ictTotal)
                                .addComponent(ictLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ss1CQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ss1MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ss1Total))
                        .addGap(2, 2, 2)
                        .addComponent(CalCulateGPA)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(Soc1CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Soc1MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ss2CQ, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ss2MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Soc1Total)
                    .addComponent(Ss2Total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Soc2CQ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Soc2MCQ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CGG1CQ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CGG1MCQ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23)
                        .addComponent(UpdateMarks)
                        .addComponent(Soc2Total)
                        .addComponent(CGG1Total)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Eco1CQ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Eco1MCQ)
                        .addComponent(Eco1Total))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CGG2MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CGG2CQ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CGG2Total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Eco2CQ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Eco2MCQ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IHS1CQ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IHS1MCQ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cancel)
                        .addComponent(Eco2Total)
                        .addComponent(IHS1Total)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Geo1CQ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Geo1MCQ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IHS2CQ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IHS2MCQ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26)
                        .addComponent(Geo1Total)
                        .addComponent(IHS2Total)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Geo2CQ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Geo2MCQ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Geo2Total)))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        this.setVisible(false);
        db.show();
    }//GEN-LAST:event_CancelActionPerformed

    private void B2MCQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2MCQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B2MCQActionPerformed

    private void B2CQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2CQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B2CQActionPerformed

    private void Log2CQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log2CQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Log2CQActionPerformed

    private void CalculateTotalMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateTotalMarksActionPerformed
        flag1=1;
        
        try
        {
            Bangla1stTotal=Double.parseDouble(B1CQ.getText())+Double.parseDouble(B1MCQ.getText());
            Bangla2ndTotal=Double.parseDouble(B2CQ.getText())+Double.parseDouble(B2MCQ.getText());
            B1Total.setText(Double.toString(Bangla1stTotal));
            B2Total.setText(Double.toString(Bangla2ndTotal));
            
            Eng1stTotal=Double.parseDouble(Eng1CQ.getText());
            Eng2ndTotal=Double.parseDouble(Eng2CQ.getText());
            E1Total.setText(Double.toString(Eng1stTotal));
            E2Total.setText(Double.toString(Eng2ndTotal));
            
            ICTTotal=Double.parseDouble(ictCQ.getText())+Double.parseDouble(ictMCQ.getText())+Double.parseDouble(ictLab.getText());
            ictTotal.setText(Double.toString(ICTTotal));
            
            Sociology1stTotal=Double.parseDouble(Soc1CQ.getText())+Double.parseDouble(Soc1MCQ.getText());
            Sociology2ndTotal=Double.parseDouble(Soc2CQ.getText())+Double.parseDouble(Soc2MCQ.getText());
            Soc1Total.setText(Double.toString(Sociology1stTotal));
            Soc2Total.setText(Double.toString(Sociology2ndTotal));
            
            Economy1Total=Double.parseDouble(Eco1CQ.getText())+Double.parseDouble(Eco1MCQ.getText());
            Economy2Total=Double.parseDouble(Eco2CQ.getText())+Double.parseDouble(Eco2MCQ.getText());
            Eco1Total.setText(Double.toString(Economy1Total));
            Eco2Total.setText(Double.toString(Economy2Total));
            
            Geography1Total=Double.parseDouble(Geo1CQ.getText())+Double.parseDouble(Geo1MCQ.getText());
            Geography2Total=Double.parseDouble(Geo2CQ.getText())+Double.parseDouble(Geo2MCQ.getText());
            Geo1Total.setText(Double.toString(Geography1Total));
            Geo2Total.setText(Double.toString(Geography2Total));
            
            Logic1Total=Double.parseDouble(Log1CQ.getText())+Double.parseDouble(Log1MCQ.getText());
            Logic2Total=Double.parseDouble(Log2CQ.getText())+Double.parseDouble(Log2MCQ.getText());
            Log1Total.setText(Double.toString(Logic1Total));
            Log2Total.setText(Double.toString(Logic2Total));
            
            History1Total=Double.parseDouble(His1CQ.getText())+Double.parseDouble(His1MCQ.getText());
            History2Total=Double.parseDouble(His2CQ.getText())+Double.parseDouble(His2MCQ.getText());
            His1Total.setText(Double.toString(History1Total));
            His2Total.setText(Double.toString(History2Total));
            
            SocialScience1Total=Double.parseDouble(Ss1CQ.getText())+Double.parseDouble(Ss1MCQ.getText());
            SocialScience2Total=Double.parseDouble(Ss2CQ.getText())+Double.parseDouble(Ss2MCQ.getText());
            Ss1Total.setText(Double.toString(SocialScience1Total));
            Ss2Total.setText(Double.toString(SocialScience2Total));
            
            CivicGG1Total=Double.parseDouble(CGG1CQ.getText())+Double.parseDouble(CGG1MCQ.getText());
            CivicGG2Total=Double.parseDouble(CGG2CQ.getText())+Double.parseDouble(CGG2MCQ.getText());
            CGG1Total.setText(Double.toString(CivicGG1Total));
            CGG2Total.setText(Double.toString(CivicGG2Total));
            
            ish1Total=Double.parseDouble(IHS1CQ.getText())+Double.parseDouble(IHS1MCQ.getText());
            ish2Total=Double.parseDouble(IHS2CQ.getText())+Double.parseDouble(IHS2MCQ.getText());
            IHS1Total.setText(Double.toString(ish1Total));
            IHS2Total.setText(Double.toString(ish2Total));
            
            totalmarks=Bangla1stTotal+Bangla2ndTotal+Eng1stTotal+Eng2ndTotal+ICTTotal+Sociology1stTotal+Sociology2ndTotal+Economy1Total+Economy2Total+Geography1Total+Geography2Total+Logic1Total+Logic2Total+History1Total+History2Total+SocialScience1Total+SocialScience2Total+CivicGG1Total+CivicGG2Total+ish1Total+ish2Total;
            TotalMark.setText(Double.toString(totalmarks));
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this,"Some Subjects Marks are empty.");
        }
    }//GEN-LAST:event_CalculateTotalMarksActionPerformed

    private void UpdateMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateMarksActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/studentmanagement","root","");
            pst=(PreparedStatement) con.prepareStatement("UPDATE humanitiessubjects SET Bangla1st=?,B1CQ=?,B1MCQ=?,Bangla2nd=?,B2CQ=?,B2MCQ=?,English1st=?,E1CQ=?,English2nd=?,E2CQ=?,ICT=?,ICTCQ=?,ICTMCQ=?,ICTLab=?,Sociology1st=?,SOC1CQ=?,SOC1MCQ=?,Sociology2nd=?,SOC2CQ=?,SOC2MCQ=?,Economics1st=?,ECO1CQ=?,ECO1MCQ=?,Economics2nd=?,ECO2CQ=?,ECO2MCQ=?,Geography1st=?,GEO1CQ=?,GEO1MCQ=?,Geography2nd=?,GEO2CQ=?,GEO2MCQ=?,Logic1st=?,LOG1CQ=?,LOG1MCQ=?,Logic2nd=?,LOG2CQ=?,LOG2MCQ=?,History1st=?,HIS1CQ=?,HIS1MCQ=?,History2nd=?,HIS2CQ=?,HIS2MCQ=?,SocialScience1st=?,Ss1CQ=?,Ss1MCQ=?,SocialScience2nd=?,Ss2CQ=?,Ss2MCQ=?,CivicandGoodGovernance1st=?,CGG1CQ=?,CGG1MCQ=?,CivicandGoodGovernance2nd=?,CGG2CQ=?,CGG2MCQ=?,IslamicHistoryandCulture1st=?,IHC1CQ=?,IHC1MCQ=?,IslamicHistoryandCulture2nd=?,IHC2CQ=?,IHC2MCQ=?,TotalMarks=? WHERE id=? and Class=? and Semester=? and Shift=?");
            pst2=(PreparedStatement) con.prepareStatement("UPDATE userinfo SET CGPA=? WHERE id=? and Dept=? and Shift=?");
            
            pst.setDouble(1, Bangla1stTotal);
            pst.setDouble(2, Double.parseDouble(B1CQ.getText()));
            pst.setDouble(3, Double.parseDouble(B1MCQ.getText()));
            pst.setDouble(4, Bangla2ndTotal);
            pst.setDouble(5 ,Double.parseDouble(B2CQ.getText()));
            pst.setDouble(6 ,Double.parseDouble(B2MCQ.getText()));
            pst.setDouble(7, Eng1stTotal);
            pst.setDouble(8, Eng1stTotal);
            pst.setDouble(9, Eng2ndTotal);
            pst.setDouble(10, Eng2ndTotal);
            pst.setDouble(11, ICTTotal);
            pst.setDouble(12, Double.parseDouble(ictCQ.getText()));
            pst.setDouble(13, Double.parseDouble(ictMCQ.getText()));
            pst.setDouble(14, Double.parseDouble(ictLab.getText()));
            pst.setDouble(15, Sociology1stTotal);
            pst.setDouble(16, Double.parseDouble(Soc1CQ.getText()));
            pst.setDouble(17, Double.parseDouble(Soc1MCQ.getText()));
            pst.setDouble(18, Sociology2ndTotal);
            pst.setDouble(19, Double.parseDouble(Soc2CQ.getText()));
            pst.setDouble(20, Double.parseDouble(Soc2CQ.getText()));
            pst.setDouble(21, Economy1Total);
            pst.setDouble(22, Double.parseDouble(Eco1CQ.getText()));
            pst.setDouble(23, Double.parseDouble(Eco1MCQ.getText()));
            pst.setDouble(24, Economy2Total);
            pst.setDouble(25, Double.parseDouble(Eco2CQ.getText()));
            pst.setDouble(26, Double.parseDouble(Eco2MCQ.getText()));
            pst.setDouble(27, Geography1Total);
            pst.setDouble(28, Double.parseDouble(Geo1CQ.getText()));
            pst.setDouble(29, Double.parseDouble(Geo1MCQ.getText()));
            pst.setDouble(30, Geography2Total);
            pst.setDouble(31, Double.parseDouble(Geo2CQ.getText()));
            pst.setDouble(32, Double.parseDouble(Geo2MCQ.getText()));
            pst.setDouble(33, Logic1Total);
            pst.setDouble(34, Double.parseDouble(Log1CQ.getText()));
            pst.setDouble(35, Double.parseDouble(Log1MCQ.getText()));
            pst.setDouble(36, Logic2Total);
            pst.setDouble(37, Double.parseDouble(Log2CQ.getText()));
            pst.setDouble(38, Double.parseDouble(Log2MCQ.getText()));
            pst.setDouble(39, History1Total);
            pst.setDouble(40, Double.parseDouble(His1CQ.getText()));
            pst.setDouble(41, Double.parseDouble(His1MCQ.getText()));
            pst.setDouble(42, History2Total);
            pst.setDouble(43, Double.parseDouble(His2CQ.getText()));
            pst.setDouble(44, Double.parseDouble(His2MCQ.getText()));
            pst.setDouble(45, SocialScience1Total);
            pst.setDouble(46, Double.parseDouble(Ss1CQ.getText()));
            pst.setDouble(47, Double.parseDouble(Ss1MCQ.getText()));
            pst.setDouble(48, SocialScience2Total);
            pst.setDouble(49, Double.parseDouble(Ss2CQ.getText()));
            pst.setDouble(50, Double.parseDouble(Ss2MCQ.getText()));
            pst.setDouble(51, CivicGG1Total);//CivicGG1Total=Double.parseDouble(CGG1CQ.getText())+Double.parseDouble(CGG1MCQ.getText());
            pst.setDouble(52, Double.parseDouble(CGG1CQ.getText()));
            pst.setDouble(53, Double.parseDouble(CGG1MCQ.getText()));
            pst.setDouble(54, CivicGG2Total);
            pst.setDouble(55, Double.parseDouble(CGG2CQ.getText()));
            pst.setDouble(56, Double.parseDouble(CGG2MCQ.getText()));
            pst.setDouble(57, ish1Total);//ish1Total=Double.parseDouble(IHS1CQ.getText())+Double.parseDouble(IHS1MCQ.getText());
            pst.setDouble(58, Double.parseDouble(IHS1CQ.getText()));
            pst.setDouble(59, Double.parseDouble(IHS1MCQ.getText()));
            pst.setDouble(60, ish2Total);
            pst.setDouble(61, Double.parseDouble(IHS2CQ.getText()));
            pst.setDouble(62, Double.parseDouble(IHS2MCQ.getText()));
            pst.setDouble(63, totalmarks);
            pst.setInt(64, Integer.parseInt(IDField.getText()));
            pst.setInt(65, Integer.parseInt(ClassField.getText()));
            pst.setString(66, SectionField.getText());
            pst.setString(67, StudentLogin.shift);
            
            pst2.setString(1 ,GPa);
            pst2.setInt(2, Integer.parseInt(IDField.getText()));
            pst2.setString(3, StudentLogin.dept);
            pst2.setString(4, StudentLogin.shift);
            
            
            pst.executeUpdate();
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(this,"Updated");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateResultHUM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateResultHUM.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "ID field is empty.");
        }
        
    }//GEN-LAST:event_UpdateMarksActionPerformed

    private void CalCulateGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalCulateGPAActionPerformed
       flag2=1;
        
        calculate_gpa();
        DecimalFormat df = new DecimalFormat("#.##");
        GPA.setText(df.format(gpa));
        GPa=df.format(gpa);
        
        enableUpdate();
    }//GEN-LAST:event_CalCulateGPAActionPerformed

    private void Geo2CQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Geo2CQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Geo2CQActionPerformed

    private void His1MCQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_His1MCQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_His1MCQActionPerformed

    private void His2MCQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_His2MCQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_His2MCQActionPerformed

    private void CGG1MCQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CGG1MCQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CGG1MCQActionPerformed

    private void CGG2MCQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CGG2MCQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CGG2MCQActionPerformed

    private void IHS1MCQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHS1MCQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IHS1MCQActionPerformed

    private void TotalMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalMarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalMarkActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateResultHUM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateResultHUM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateResultHUM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateResultHUM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateResultHUM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField B1CQ;
    private javax.swing.JTextField B1MCQ;
    private javax.swing.JLabel B1Total;
    private javax.swing.JTextField B2CQ;
    private javax.swing.JTextField B2MCQ;
    private javax.swing.JLabel B2Total;
    private javax.swing.JTextField CGG1CQ;
    private javax.swing.JTextField CGG1MCQ;
    private javax.swing.JLabel CGG1Total;
    private javax.swing.JTextField CGG2CQ;
    private javax.swing.JTextField CGG2MCQ;
    private javax.swing.JLabel CGG2Total;
    private javax.swing.JButton CalCulateGPA;
    private javax.swing.JButton CalculateTotalMarks;
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField ClassField;
    private javax.swing.JTextField E1MCQ;
    private javax.swing.JLabel E1Total;
    private javax.swing.JTextField E2MCQ;
    private javax.swing.JLabel E2Total;
    private javax.swing.JTextField Eco1CQ;
    private javax.swing.JTextField Eco1MCQ;
    private javax.swing.JLabel Eco1Total;
    private javax.swing.JTextField Eco2CQ;
    private javax.swing.JTextField Eco2MCQ;
    private javax.swing.JLabel Eco2Total;
    private javax.swing.JTextField Eng1CQ;
    private javax.swing.JTextField Eng2CQ;
    private javax.swing.JTextField GPA;
    private javax.swing.JTextField Geo1CQ;
    private javax.swing.JTextField Geo1MCQ;
    private javax.swing.JLabel Geo1Total;
    private javax.swing.JTextField Geo2CQ;
    private javax.swing.JTextField Geo2MCQ;
    private javax.swing.JLabel Geo2Total;
    private javax.swing.JTextField His1CQ;
    private javax.swing.JTextField His1MCQ;
    private javax.swing.JLabel His1Total;
    private javax.swing.JTextField His2CQ;
    private javax.swing.JTextField His2MCQ;
    private javax.swing.JLabel His2Total;
    private javax.swing.JTextField IDField;
    private javax.swing.JTextField IHS1CQ;
    private javax.swing.JTextField IHS1MCQ;
    private javax.swing.JLabel IHS1Total;
    private javax.swing.JTextField IHS2CQ;
    private javax.swing.JTextField IHS2MCQ;
    private javax.swing.JLabel IHS2Total;
    private javax.swing.JTextField Log1CQ;
    private javax.swing.JTextField Log1MCQ;
    private javax.swing.JLabel Log1Total;
    private javax.swing.JTextField Log2CQ;
    private javax.swing.JTextField Log2MCQ;
    private javax.swing.JLabel Log2Total;
    private javax.swing.JComboBox<String> OPT;
    private javax.swing.JTextField SectionField;
    private javax.swing.JTextField Soc1CQ;
    private javax.swing.JTextField Soc1MCQ;
    private javax.swing.JLabel Soc1Total;
    private javax.swing.JTextField Soc2CQ;
    private javax.swing.JTextField Soc2MCQ;
    private javax.swing.JLabel Soc2Total;
    private javax.swing.JTextField Ss1CQ;
    private javax.swing.JTextField Ss1MCQ;
    private javax.swing.JLabel Ss1Total;
    private javax.swing.JTextField Ss2CQ;
    private javax.swing.JTextField Ss2MCQ;
    private javax.swing.JLabel Ss2Total;
    private javax.swing.JTextField TotalMark;
    private javax.swing.JButton UpdateMarks;
    private javax.swing.JTextField ictCQ;
    private javax.swing.JTextField ictLab;
    private javax.swing.JTextField ictMCQ;
    private javax.swing.JLabel ictTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
