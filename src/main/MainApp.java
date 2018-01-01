package main;


import library.EmailChecker;
import library.dateValidator;
import entity.*;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import library.*;


public class MainApp extends javax.swing.JFrame {
    private long phone;
    private int id,sal;
    private String name,email,department,dob,doj,addr,gender;
    private String filePath;
    private byte[] image;
    private String project;
    
    
    public MainApp() {
        initComponents();
        updateTable();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTSearch = new javax.swing.JTextField();
        jBSearchId = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBAdd = new javax.swing.JButton();
        jBDelete = new javax.swing.JButton();
        jBRefresh = new javax.swing.JButton();
        jBEdit = new javax.swing.JButton();
        jBClear = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jCSearch = new javax.swing.JComboBox<>();
        jBFeedback = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLID = new javax.swing.JLabel();
        jTId = new javax.swing.JTextField();
        jLFname = new javax.swing.JLabel();
        jTName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTDepartment = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTDob = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTDoj = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTPhone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTSalary = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jCGender = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTPath = new javax.swing.JTextField();
        jBChoose = new javax.swing.JButton();
        jPDefaultImage = new javax.swing.JPanel();
        jLImage = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTProject = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Management System");

        jPanel1.setBackground(new java.awt.Color(26, 198, 0));

        jPanel2.setBackground(new java.awt.Color(137, 137, 241));

        jBSearchId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/ss.png"))); // NOI18N
        jBSearchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search :- ");

        jBAdd.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jBAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/icons8-Add User Male Filled-50.png"))); // NOI18N
        jBAdd.setText("Add");
        jBAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddActionPerformed(evt);
            }
        });

        jBDelete.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jBDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/delete.jpg"))); // NOI18N
        jBDelete.setText("Delete");
        jBDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeleteActionPerformed(evt);
            }
        });

        jBRefresh.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jBRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/icons8-Refresh-26.png"))); // NOI18N
        jBRefresh.setText("Refresh");
        jBRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRefreshActionPerformed(evt);
            }
        });

        jBEdit.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jBEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/icons8-Edit File-50.png"))); // NOI18N
        jBEdit.setText("Update");
        jBEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditActionPerformed(evt);
            }
        });

        jBClear.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jBClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/icons8-Clear Symbol-48.png"))); // NOI18N
        jBClear.setText("Clear");
        jBClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClearActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("~~~Operations~~~");

        jCSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "By ID", "By Name", "By Project" }));

        jBFeedback.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jBFeedback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/feeds.png"))); // NOI18N
        jBFeedback.setText("FeedBacks");
        jBFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFeedbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCSearch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jBDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jBRefresh))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBFeedback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSearchId))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBClear)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jBDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRefresh)
                    .addComponent(jBFeedback))
                .addGap(26, 26, 26))
        );

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Email", "Phone", "Gender", "Department", "DOB", "Address", "DOJ", "Salary"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(6).setCellRenderer(new DateRenderer());
        }

        jPanel3.setBackground(new java.awt.Color(243, 254, 119));

        jLID.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        jLID.setText("Id :-");

        jTId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdActionPerformed(evt);
            }
        });

        jLFname.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLFname.setText("  Name :-");

        jTName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel4.setText("Email :-");

        jTEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel5.setText("Department :-");

        jTDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDepartmentActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel6.setText("DOB :-");

        jTDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDobActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel7.setText("Address :-");

        jTAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAddressActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel8.setText("  Joining Date :-");

        jTDoj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDojActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel9.setText("Phone :-");

        jTPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPhoneActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel10.setText("Salary :-");

        jTSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSalaryActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel11.setText("Gender :-");

        jCGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));

        jLabel13.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(231, 7, 7));
        jLabel13.setText("(dd-mm-yyyy)");

        jLabel14.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(225, 30, 30));
        jLabel14.setText("(dd-mm-yyyy)");

        jLabel15.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(13, 14, 23));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("~~~~Employee Details~~~~");

        jTPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPathActionPerformed(evt);
            }
        });

        jBChoose.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jBChoose.setText("Choose");
        jBChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBChooseActionPerformed(evt);
            }
        });

        jPDefaultImage.setBackground(new java.awt.Color(18, 14, 9));

        javax.swing.GroupLayout jPDefaultImageLayout = new javax.swing.GroupLayout(jPDefaultImage);
        jPDefaultImage.setLayout(jPDefaultImageLayout);
        jPDefaultImageLayout.setHorizontalGroup(
            jPDefaultImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDefaultImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImage, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPDefaultImageLayout.setVerticalGroup(
            jPDefaultImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDefaultImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImage, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel16.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel16.setText("Project :-");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLFname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTName, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jCGender, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPDefaultImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTDob, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                            .addComponent(jTProject))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel8)
                                .addGap(6, 6, 6)
                                .addComponent(jTDoj, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTPath, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBChoose)
                        .addGap(439, 439, 439))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLID)
                                .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(jTProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLFname)
                            .addComponent(jTName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTDoj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jCGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPDefaultImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBChoose)
                        .addComponent(jTPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(15, 15, 15))
        );

        jLabel1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("~~~~~~  Employee Management System  ~~~~~~");

        jBLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/exit.png"))); // NOI18N
        jBLogout.setText("Logout");
        jBLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jBLogout))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void updateTable(){
        try {
            ArrayList<Employee> arrayList;
            
            arrayList=Employee.showAllEmployee();
            
            DBModel.rahulModel(jTable, arrayList);
        } catch (Exception ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private boolean check() {
        if(filePath!=null)
        {
            if(filePath.endsWith(".jpeg")||filePath.endsWith(".gif")||filePath.endsWith(".jpg")||filePath.endsWith(".JPEG")||filePath.endsWith(".GIF")||filePath.endsWith(".JPG"))
            {
                return true;
            }
            return false;
        }
        return false;
    }
    
    
    private Image scaledImage(byte[] img,int width,int height)
    {
        BufferedImage resizedImage=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Graphics2D g;
        try
        {
            g=resizedImage.createGraphics();
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            
            //convert byte array back to buffered image
            
            ByteArrayInputStream in=new ByteArrayInputStream(img);
            BufferedImage bImage=ImageIO.read(in);
            g.drawImage(bImage,0,0,width,height,null);
            g.dispose();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,e);
        }
        return resizedImage;
    }
    
    private void searchByName()
    {
        try
        {
            ArrayList<Employee> arrayList;
            name=jTSearch.getText();
            arrayList=Employee.searchByName(name);
            DBModel.rahulModel(jTable,arrayList);
            
        } catch (Exception ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void searchByID()
    {
        try
        {
            Employee employee;
            id=Integer.parseInt(jTSearch.getText());
            employee=Employee.searchByID(id);
            DBModel.rahulModel(jTable,employee);
            
        } catch (Exception ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void searchByProject()
    {
        try
        {
            ArrayList<Employee> arrayList;
            name=jTSearch.getText();
            System.out.println(name);
            arrayList=Employee.searchByProject(name);
            DBModel.rahulModel(jTable,arrayList);
            
        } catch (Exception ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    private void jBAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddActionPerformed

        
        EmailChecker email1=new EmailChecker();
        dateValidator vd=new dateValidator();
        
         if(jTId.getText().equals("")&&jTName.getText().equals("")&&jTEmail.getText().equals("")&&jTPhone.getText().equals("")&&jCGender.getSelectedIndex()==0&&jTDepartment.getText().equals("")&&jTPath.getText().equals("")&&jTProject.getText().equals("")&&jTDob.getText().equals("")&&jTAddress.getText().equals("")&&jTDoj.getText().equals("")&&jTSalary.getText().equals(""))
             JOptionPane.showMessageDialog(null,"Fill The Blank Column","ERROR",JOptionPane.ERROR_MESSAGE);
         
         else if(!jTId.getText().matches("\\d+"))
             JOptionPane.showMessageDialog(null,"Invalid UserId","ERROR",JOptionPane.ERROR_MESSAGE);
         
//         else if(!Validation.isValidEmployee(Integer.parseInt(jTId.getText())))
//             JOptionPane.showMessageDialog(null,"UserId already exist !!","ERROR",JOptionPane.ERROR_MESSAGE);
//         
//         else if(Validation.isValidPhoneNo(Long.parseLong(jTPhone.getText()))==false)
//             JOptionPane.showMessageDialog(null,"Phone Number already exist !!","ERROR",JOptionPane.ERROR_MESSAGE);
//         
//         else if(Validation.isValidEmailId(jTEmail.getText())==false)
//             JOptionPane.showMessageDialog(null,"Email Id already exist !!","ERROR",JOptionPane.ERROR_MESSAGE);
         
         else if((!Pattern.matches("^[a-zA-Z]+$",jTName.getText()))||(!Pattern.matches("^[a-zA-Z]+$",jTDepartment.getText())))
             JOptionPane.showMessageDialog(null,"Invalid Name or Department or Project","ERROR",JOptionPane.ERROR_MESSAGE);
         
         else if(!jTPhone.getText().matches("\\d+"))
             JOptionPane.showMessageDialog(null,"Invalid PhoneNumber","ERROR",JOptionPane.ERROR_MESSAGE);
         
         else if(!jTSalary.getText().matches("\\d+"))  
             JOptionPane.showMessageDialog(null,"Invalid Salary ","ERROR",JOptionPane.ERROR_MESSAGE);
         
         else if(!email1.validate(jTEmail.getText()))
             JOptionPane.showMessageDialog(null,"Invalid Email","ERROR",JOptionPane.ERROR_MESSAGE);
         
         else if((!vd.isThisDateValid(jTDob.getText(),"dd-mm-yyyy"))||(!vd.isThisDateValid(jTDoj.getText(),"dd-mm-yyyy")))
             JOptionPane.showMessageDialog(null,"invalid Date Formate","ERROR",JOptionPane.ERROR_MESSAGE);
         
         else if(jTProject.getText().matches("\\d+"))  
             JOptionPane.showMessageDialog(null,"Invalid Project Type","ERROR",JOptionPane.ERROR_MESSAGE);
         
        else
        try
        {
            
                
                id=Integer.parseInt(jTId.getText());
                phone=Long.parseLong(jTPhone.getText());
                sal=Integer.parseInt(jTSalary.getText());
                project=jTProject.getText();
                name=jTName.getText();
                email=jTEmail.getText();
                department=jTDepartment.getText();
                dob=jTDob.getText();
                doj=jTDoj.getText();
                addr=jTAddress.getText();
                gender=jCGender.getSelectedItem().toString();
                
                Employee employee=new Employee(id,name,email,phone,gender,department,project,dob,addr,doj,sal,image);
                employee.saveToDB();
           // }
        }catch(SQLException e)
            {
                System.out.println("Exception: "+e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jBAddActionPerformed

    private void jBClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClearActionPerformed
        jTSearch.setText("");
        jCSearch.setSelectedItem("Select");
        jTId.setText("");
        jTName.setText("");
        jCGender.setSelectedItem("Select");
        jTEmail.setText("");
        jTPhone.setText("");
        jTDepartment.setText("");
        jTDob.setText("");
        jTDoj.setText("");
        jTSalary.setText("");
        jTAddress.setText("");
        jTPath.setText("");
        jLImage.setIcon(new ImageIcon());
        
    }//GEN-LAST:event_jBClearActionPerformed

    private void jBSearchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchIdActionPerformed
        String value=null;
        value=jCSearch.getSelectedItem().toString();
        if(value.equals("Select"))
            JOptionPane.showMessageDialog(null,"Please select a search type!!!");
        else if(value.equals("By ID"))
            searchByID();
        else if(value.equals("By Name"))
            searchByName();
        else if(value.equals("By Project"))
            searchByProject();
    }//GEN-LAST:event_jBSearchIdActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        try {
            DefaultTableModel model=(DefaultTableModel)jTable.getModel();
            int rowIndex=jTable.getSelectedRow();
            
            if(model.getColumnName(0).equals("Id"))
            {
                
                int id=Integer.parseInt(model.getValueAt(rowIndex,0).toString());
                Employee emp=Employee.searchByID(id);
                
                jTId.setText(model.getValueAt(rowIndex,0).toString());
                jTName.setText(model.getValueAt(rowIndex,1).toString());
                jTEmail.setText(model.getValueAt(rowIndex,2).toString());
                jTPhone.setText(model.getValueAt(rowIndex,3).toString());
                jCGender.setSelectedItem(model.getValueAt(rowIndex,4).toString());
                jTDepartment.setText(model.getValueAt(rowIndex,5).toString());
                jTProject.setText(model.getValueAt(rowIndex,6).toString());
                jTDob.setText("03-05-1994");
                jTAddress.setText(model.getValueAt(rowIndex,8).toString());
                jTDoj.setText("05-11-2016");
                jTSalary.setText(model.getValueAt(rowIndex,10).toString());
                jLImage.setIcon(new ImageIcon(scaledImage(emp.getImage(),jLImage.getWidth(),jLImage.getHeight())));
                image=emp.getImage();
            }
        } catch (Exception ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void jBRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRefreshActionPerformed
        updateTable();
    }//GEN-LAST:event_jBRefreshActionPerformed

    private void jBDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeleteActionPerformed
        try {
            Employee employee;
            id=Integer.parseInt(jTId.getText());
            employee=Employee.searchByID(id);
            employee.deleteFromDB();
        } catch (Exception ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBDeleteActionPerformed

    private void jBEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditActionPerformed
       
         if(jTId.getText().equals("")&&jTName.getText().equals("")&&jTEmail.getText().equals("")&&jTPhone.getText().equals("")&&jCGender.getSelectedIndex()==0&&jTDepartment.getText().equals("")&&jTPath.getText().equals("")&&jTProject.getText().equals("")&&jTDob.getText().equals("")&&jTAddress.getText().equals("")&&jTDoj.getText().equals("")&&jTSalary.getText().equals(""))
             JOptionPane.showMessageDialog(null,"Fill The Blank Column","ERROR",JOptionPane.ERROR_MESSAGE);
         
         else if(!jTId.getText().matches("\\d+"))
             JOptionPane.showMessageDialog(null,"Invalid UserId","ERROR",JOptionPane.ERROR_MESSAGE);        
        
         else if(!Validation.isValidPhoneLength(Integer.parseInt(jTPhone.getText())))
             JOptionPane.showMessageDialog(null,"Phone Number not valid !!","ERROR",JOptionPane.ERROR_MESSAGE);
         
         else if((!Pattern.matches("^[a-zA-Z]+$",jTName.getText()))||(!Pattern.matches("^[a-zA-Z]+$",jTDepartment.getText())))
             JOptionPane.showMessageDialog(null,"Invalid Name or Department or Project","ERROR",JOptionPane.ERROR_MESSAGE);
         
         else if(!jTPhone.getText().matches("\\d+"))
             JOptionPane.showMessageDialog(null,"Invalid PhoneNumber","ERROR",JOptionPane.ERROR_MESSAGE);
         
         else if(!jTSalary.getText().matches("\\d+"))  
             JOptionPane.showMessageDialog(null,"Invalid Salary ","ERROR",JOptionPane.ERROR_MESSAGE);
         
         else if(jTProject.getText().matches("\\d+"))
             JOptionPane.showMessageDialog(null,"invalid Project Name","ERROR",JOptionPane.ERROR_MESSAGE);
         
        else
        
        try {
            id=Integer.parseInt(jTId.getText());
            phone=Long.parseLong(jTPhone.getText());
            sal=Integer.parseInt(jTSalary.getText());
            project=jTProject.getText();
            name=jTName.getText();
            email=jTEmail.getText();
            department=jTDepartment.getText();
            dob=jTDob.getText();
            doj=jTDoj.getText();
            addr=jTAddress.getText();
            gender=jCGender.getSelectedItem().toString();
            
            Employee employee=new Employee(id,name,email,phone,gender,department,project,dob,addr,doj,sal,image);
            employee.updateDB();
        } catch (Exception ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBEditActionPerformed

    private void jTSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSalaryActionPerformed

    private void jTPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPhoneActionPerformed

    private void jTDojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDojActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDojActionPerformed

    private void jTAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAddressActionPerformed

    private void jTDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDobActionPerformed

    private void jTDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDepartmentActionPerformed

    private void jTEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTEmailActionPerformed

    private void jTNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNameActionPerformed

    private void jTIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdActionPerformed

    private void jTPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPathActionPerformed

    private void jBChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBChooseActionPerformed
        
        try
            
        {
            
            JFileChooser chooser=new JFileChooser(new File("/home/squad/Pictures/empImage/"));
            
            
            chooser.setMultiSelectionEnabled(false);
            chooser.setVisible(true);
            
            chooser.showOpenDialog(this);
            
            File file=chooser.getSelectedFile();
            if(file!=null){filePath=file.getPath();}
            if(filePath!=null){
                jTPath.setText("File:"+" "+filePath);
                jLImage.setIcon(new ImageIcon(filePath));
            }
            
            
            if(filePath!=null && check())
            {
                
                FileInputStream fileInputStream=new FileInputStream(filePath);
                image=new byte[fileInputStream.available()];
                fileInputStream.read(image);
                fileInputStream.close();
                
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Please select an Image of type .jpeg/gif/jpg...");
            }
            
        }catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }    
    }//GEN-LAST:event_jBChooseActionPerformed

    private void jBLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLogoutActionPerformed
        Login login=new Login();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_jBLogoutActionPerformed

    private void jBFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFeedbackActionPerformed
        try {
            ArrayList<FeedBack> arrayList;
            
            arrayList=FeedBack.getFeedBack();
            
            DBModel.rahulModel1(jTable, arrayList);
        } catch (Exception ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBFeedbackActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdd;
    private javax.swing.JButton jBChoose;
    private javax.swing.JButton jBClear;
    private javax.swing.JButton jBDelete;
    private javax.swing.JButton jBEdit;
    private javax.swing.JButton jBFeedback;
    private javax.swing.JButton jBLogout;
    private javax.swing.JButton jBRefresh;
    private javax.swing.JButton jBSearchId;
    private javax.swing.JComboBox<String> jCGender;
    private javax.swing.JComboBox<String> jCSearch;
    private javax.swing.JLabel jLFname;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDefaultImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAddress;
    private javax.swing.JTextField jTDepartment;
    private javax.swing.JTextField jTDob;
    private javax.swing.JTextField jTDoj;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTName;
    private javax.swing.JTextField jTPath;
    private javax.swing.JTextField jTPhone;
    private javax.swing.JTextField jTProject;
    private javax.swing.JTextField jTSalary;
    private javax.swing.JTextField jTSearch;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
    
    
}
