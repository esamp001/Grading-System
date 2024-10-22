package grading_system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;





public class Grading_System1 extends javax.swing.JFrame {


    public Grading_System1() {
        initComponents();
    }
    

 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_form = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        prelim_attendance = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        midterm_attendance = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        final_attendance = new javax.swing.JTextField();
        prelim_cp = new javax.swing.JTextField();
        prelim_quiz = new javax.swing.JTextField();
        midterm_cp = new javax.swing.JTextField();
        midterm_quiz = new javax.swing.JTextField();
        final_cp = new javax.swing.JTextField();
        final_quiz = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        prelim_exam = new javax.swing.JTextField();
        midterm_exam = new javax.swing.JTextField();
        final_exam = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        update1 = new javax.swing.JButton();
        retrieve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("First Name:");

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Last Name:");

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });

        table_form.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Prelim", "Midterm ", "Final", "Remarks"
            }
        ));
        table_form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_formMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_form);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Prelim");

        prelim_attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prelim_attendanceActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Midterm");

        midterm_attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midterm_attendanceActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Tentative Final");

        final_attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                final_attendanceActionPerformed(evt);
            }
        });

        prelim_cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prelim_cpActionPerformed(evt);
            }
        });

        prelim_quiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prelim_quizActionPerformed(evt);
            }
        });

        midterm_cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midterm_cpActionPerformed(evt);
            }
        });

        midterm_quiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midterm_quizActionPerformed(evt);
            }
        });

        final_cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                final_cpActionPerformed(evt);
            }
        });

        final_quiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                final_quizActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setText("Attendance(5%)");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setText("CP(15%)");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setText("Quiz(30%)");

        prelim_exam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prelim_examActionPerformed(evt);
            }
        });

        midterm_exam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midterm_examActionPerformed(evt);
            }
        });

        final_exam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                final_examActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setText("Exam(50%)");

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel13.setText("Search Student:");

        update1.setText("REMOVE ALL RECORDS");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });

        retrieve.setText("RETRIEVE");
        retrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(retrieve, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(3, 3, 3)
                                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(midterm_attendance, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(final_attendance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(prelim_attendance, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel10)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel11)
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(prelim_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(prelim_quiz, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(prelim_exam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(midterm_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(midterm_quiz, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(midterm_exam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(final_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(final_quiz, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(final_exam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lastname))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel6)
                    .addComponent(prelim_attendance)
                    .addComponent(prelim_cp)
                    .addComponent(prelim_quiz)
                    .addComponent(prelim_exam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel7)
                    .addComponent(midterm_attendance)
                    .addComponent(midterm_cp)
                    .addComponent(midterm_quiz)
                    .addComponent(midterm_exam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel8)
                    .addComponent(final_attendance)
                    .addComponent(final_cp)
                    .addComponent(final_quiz)
                    .addComponent(final_exam))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add)
                        .addComponent(jLabel13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(delete)
                        .addGap(18, 18, 18)
                        .addComponent(update)
                        .addGap(18, 18, 18)
                        .addComponent(update1)
                        .addGap(18, 18, 18)
                        .addComponent(retrieve)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed

    }//GEN-LAST:event_firstnameActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
    // Get the text from the first name and last name fields
    String firstName = firstname.getText().trim();
    String lastName = lastname.getText().trim();
    

    // Prelim
    double attendance = Double.parseDouble(prelim_attendance.getText());
    double cp = Double.parseDouble(prelim_cp.getText());
    double quiz = Double.parseDouble(prelim_quiz.getText());
    double exam = Double.parseDouble(prelim_exam.getText());
    
    // Midterm
    double mid_attendance = Double.parseDouble(midterm_attendance.getText());
    double mid_cp = Double.parseDouble(midterm_cp.getText());
    double mid_quiz = Double.parseDouble(midterm_quiz.getText());
    double mid_exam = Double.parseDouble(midterm_exam.getText());
    
    // Tentative Final
    double final_attendances = Double.parseDouble(final_attendance.getText());
    double final_cps = Double.parseDouble(final_cp.getText());
    double final_quizs = Double.parseDouble(final_quiz.getText());
    double final_exams = Double.parseDouble(final_exam.getText());
 
    
    // Calculate the prelim grade
    double prelimGrade = (attendance * 0.05) + (cp * 0.15) + (quiz * 0.30) + (exam * 0.50);
    String formattedPrelimGrade = String.format("%.2f", prelimGrade);
    // Calculate the midterm grade
    double midtermGrade = (mid_attendance * 0.05) + (mid_cp * 0.15) + (mid_quiz * 0.30) + (mid_exam * 0.50);
    String formattedMidTermGrade = String.format("%.2f", midtermGrade);
    // Calculate the final grade
    double tenfinalGrade = (final_attendances * 0.05) + (final_cps * 0.15) + (final_quizs * 0.30) + (final_exams * 0.50);
    //Calculate the Sem grade
    double soper_final = (prelimGrade + midtermGrade + tenfinalGrade) / 3;
    String formattedFinalGrade = String.format("%.2f", soper_final);
    
    // Determine remarks based on semester grade
    String remarks;
    if (soper_final >= 75) {
        remarks = "Passed";
    } else if (soper_final >= 60) {
        remarks = "Failed";
    } else {
        remarks = "Failed"; // you might want to handle grades below 60 differently
    }

    // Combine the first name and last name
    String name = firstName + " " + lastName;

    // Add the name,prelim grade,midterm grade, sem grade and remarks to the table
    DefaultTableModel model = (DefaultTableModel) table_form.getModel();
    model.addRow(new Object[]{name, formattedPrelimGrade, formattedMidTermGrade, formattedFinalGrade, remarks});

    // Write the records to a text file
try (BufferedWriter writer = new BufferedWriter(new FileWriter("records.txt", true))) {
    // Write the record as a line in the text file
    writer.write("Name: " + name);
    writer.newLine();
    writer.write("Prelim Grade: " + formattedPrelimGrade);
    writer.newLine();
    writer.write("Midterm Grade: " + formattedMidTermGrade);
    writer.newLine();
    writer.write("Tentative Final Grade: " + tenfinalGrade);
    writer.newLine();
    writer.write("Final Grade: " + formattedFinalGrade);
    writer.newLine();
    writer.write("Remarks: " + remarks);
    writer.newLine();
    writer.newLine();
} catch (IOException e) {
    JOptionPane.showMessageDialog(null, "Error writing to file: " + e.getMessage());
}

// Your existing code to handle adding data to records.txt and updating the table

    // Additional logic to write raw data to rawdata.txt
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("rawdata.txt", true))) {
        // Write the student's raw data to rawdata.txt
        writer.write(firstname.getText().trim() + " " + lastname.getText().trim() + ",");
        writer.write(prelim_attendance.getText().trim() + "," + prelim_cp.getText().trim() + "," + prelim_quiz.getText().trim() + "," + prelim_exam.getText().trim() + ",");
        writer.write(midterm_attendance.getText().trim() + "," + midterm_cp.getText().trim() + "," + midterm_quiz.getText().trim() + "," + midterm_exam.getText().trim() + ",");
        writer.write(final_attendance.getText().trim() + "," + final_cp.getText().trim() + "," + final_quiz.getText().trim() + "," + final_exam.getText().trim());
        writer.newLine();
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    firstname.setText("");
    lastname.setText("");
    prelim_attendance.setText("");
    prelim_cp.setText("");
    prelim_quiz.setText("");
    prelim_exam.setText("");
    midterm_attendance.setText("");
    midterm_cp.setText("");
    midterm_quiz.setText("");
    midterm_exam.setText("");
    final_attendance.setText("");
    final_cp.setText("");
    final_quiz.setText("");
    final_exam.setText("");

    }//GEN-LAST:event_addActionPerformed
    
    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed

    }//GEN-LAST:event_lastnameActionPerformed

    private void table_formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_formMouseClicked
        table_form.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        // Check if the mouse click is a double-click
        if (e.getClickCount() == 2) {
            // Get the selected row index
            int selectedRow = table_form.getSelectedRow();
            if (selectedRow != -1) {
                // Get the values from the selected row
                String name = (String) table_form.getValueAt(selectedRow, 0);
                double prelimGrade = (Double) table_form.getValueAt(selectedRow, 1);
                double midtermGrade = (Double) table_form.getValueAt(selectedRow, 2);
                double finalGrade = (Double) table_form.getValueAt(selectedRow, 3);
                double semesterGrade = (Double) table_form.getValueAt(selectedRow, 4);
                String remarks = (String) table_form.getValueAt(selectedRow, 5);

                // Split the name to get first name and last name
                String[] nameParts = name.split(" ");
                if (nameParts.length >= 2) {
                    firstname.setText(nameParts[0]); // First name
                    lastname.setText(nameParts[1]);   // Last name
                }

                // Populate the prelim text fields
                prelim_attendance.setText(String.valueOf(prelimGrade * 0.05 / (0.05 + 0.15 + 0.30 + 0.50) * 100));
                prelim_cp.setText(String.valueOf(prelimGrade * 0.15 / (0.05 + 0.15 + 0.30 + 0.50) * 100));
                prelim_quiz.setText(String.valueOf(prelimGrade * 0.30 / (0.05 + 0.15 + 0.30 + 0.50) * 100));
                prelim_exam.setText(String.valueOf(prelimGrade * 0.50 / (0.05 + 0.15 + 0.30 + 0.50) * 100));

                // Populate midterm and final text fields if needed
                midterm_attendance.setText(String.valueOf(midtermGrade * 0.05 / (0.05 + 0.15 + 0.30 + 0.50) * 100));
                midterm_cp.setText(String.valueOf(midtermGrade * 0.15 / (0.05 + 0.15 + 0.30 + 0.50) * 100));
                midterm_quiz.setText(String.valueOf(midtermGrade * 0.30 / (0.05 + 0.15 + 0.30 + 0.50) * 100));
                midterm_exam.setText(String.valueOf(midtermGrade * 0.50 / (0.05 + 0.15 + 0.30 + 0.50) * 100));

                final_attendance.setText(String.valueOf(finalGrade * 0.05 / (0.05 + 0.15 + 0.30 + 0.50) * 100));
                final_cp.setText(String.valueOf(finalGrade * 0.15 / (0.05 + 0.15 + 0.30 + 0.50) * 100));
                final_quiz.setText(String.valueOf(finalGrade * 0.30 / (0.05 + 0.15 + 0.30 + 0.50) * 100));
                final_exam.setText(String.valueOf(finalGrade * 0.50 / (0.05 + 0.15 + 0.30 + 0.50) * 100));
            }
        }
    }
});


    }//GEN-LAST:event_table_formMouseClicked

    private void prelim_attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prelim_attendanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prelim_attendanceActionPerformed

    private void midterm_attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midterm_attendanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midterm_attendanceActionPerformed

    private void final_attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_final_attendanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_final_attendanceActionPerformed

    private void prelim_cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prelim_cpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prelim_cpActionPerformed

    private void prelim_quizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prelim_quizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prelim_quizActionPerformed

    private void midterm_cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midterm_cpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midterm_cpActionPerformed

    private void midterm_quizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midterm_quizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midterm_quizActionPerformed

    private void final_cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_final_cpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_final_cpActionPerformed

    private void final_quizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_final_quizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_final_quizActionPerformed

    private void prelim_examActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prelim_examActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prelim_examActionPerformed

    private void midterm_examActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midterm_examActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midterm_examActionPerformed

    private void final_examActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_final_examActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_final_examActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // Get the selected row index
int selectedRow = table_form.getSelectedRow();

// Check if a row is selected
if (selectedRow != -1) {
    // Show a confirmation dialog
    int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm Delete", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    
    // If the user clicks "Yes", delete the row
    if (response == JOptionPane.YES_OPTION) {
        // Get the table model
        DefaultTableModel model = (DefaultTableModel) table_form.getModel();
        
        // Get the name of the selected row to identify in the text file
        String nameToDelete = model.getValueAt(selectedRow, 0).toString();

        // Remove the selected row from the model
        model.removeRow(selectedRow);

        // Delete the corresponding entry in records.txt
        File inputFile = new File("records.txt");
        File tempFile = new File("tempRecords.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            boolean skipRecord = false;

            // Read through the records.txt and write all entries except the one being deleted
            while ((line = reader.readLine()) != null) {
                // If the current line matches the "Name" line of the record to be deleted, skip the entire record
                if (line.startsWith("Name: " + nameToDelete)) {
                    skipRecord = true;
                }

                // If the record ends (empty line), reset skipRecord
                if (line.trim().isEmpty()) {
                    skipRecord = false;
                }

                // Write lines to the temp file, excluding the record to be deleted
                if (!skipRecord) {
                    writer.write(line);
                    writer.newLine();
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error updating file: " + e.getMessage());
        }

        // Rename temp file to original file name
        if (inputFile.delete()) {
            tempFile.renameTo(inputFile);
        }

        // Optionally, show a message that the deletion was successful
        JOptionPane.showMessageDialog(null, "Record deleted successfully.");
    }
} else {
    // Show a warning dialog if no row is selected
    JOptionPane.showMessageDialog(null, "Please select a row to delete.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
}

    }//GEN-LAST:event_deleteActionPerformed

    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
     // Get the selected row index
int selectedRow = table_form.getSelectedRow();

// Check if a row is selected
if (selectedRow != -1) {
    // Get the updated text from the input fields
    String firstName = firstname.getText().trim();
    String lastName = lastname.getText().trim();

    // Prelim
    double attendance = Double.parseDouble(prelim_attendance.getText());
    double cp = Double.parseDouble(prelim_cp.getText());
    double quiz = Double.parseDouble(prelim_quiz.getText());
    double exam = Double.parseDouble(prelim_exam.getText());
    
    // Midterm
    double mid_attendance = Double.parseDouble(midterm_attendance.getText());
    double mid_cp = Double.parseDouble(midterm_cp.getText());
    double mid_quiz = Double.parseDouble(midterm_quiz.getText());
    double mid_exam = Double.parseDouble(midterm_exam.getText());
    
    // Final
    double final_attendances = Double.parseDouble(final_attendance.getText());
    double final_cps = Double.parseDouble(final_cp.getText());
    double final_quizs = Double.parseDouble(final_quiz.getText());
    double final_exams = Double.parseDouble(final_exam.getText());

    // Calculate the grades
    double prelimGrade = (attendance * 0.05) + (cp * 0.15) + (quiz * 0.30) + (exam * 0.50);
    String formattedPrelimGrade = String.format("%.2f", prelimGrade);
    double midtermGrade = (mid_attendance * 0.05) + (mid_cp * 0.15) + (mid_quiz * 0.30) + (mid_exam * 0.50);
    String formattedmidtermGrade = String.format("%.2f", midtermGrade);
    double finalGrade = (final_attendances * 0.05) + (final_cps * 0.15) + (final_quizs * 0.30) + (final_exams * 0.50);
    String formattedfinalGrade = String.format("%.2f", finalGrade);
    double semesterGrade = (prelimGrade + midtermGrade + finalGrade) / 3;

    // Determine remarks based on semester grade
    String remarks;
    if (semesterGrade >= 75) {
        remarks = "Passed";
    } else if (semesterGrade >= 60) {
        remarks = "Failed";
    } else {
        remarks = "Failed"; // handle grades below 60 if needed
    }

    // Combine first name and last name
    String updatedName = firstName + " " + lastName;
    
    // Get the table model
    DefaultTableModel model = (DefaultTableModel) table_form.getModel();
    
    // Get the name of the selected row to find the entry in the text file
    String originalName = model.getValueAt(selectedRow, 0).toString();
    
    // Update the values in the selected row
    model.setValueAt(updatedName, selectedRow, 0);           // Update name
    model.setValueAt(formattedPrelimGrade, selectedRow, 1);    // Update prelim grade
    model.setValueAt(formattedmidtermGrade, selectedRow, 2);   // Update midterm grade
    model.setValueAt(formattedfinalGrade, selectedRow, 3);     // Update final grade
    model.setValueAt(remarks, selectedRow, 4);        // Update remarks
    
    // Optionally, clear the input fields after updating
    firstname.setText("");
    lastname.setText("");

    // Update the corresponding entry in records.txt
    File inputFile = new File("records.txt");
    File tempFile = new File("tempRecords.txt");

    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

        String line;
        boolean skipRecord = false;
        boolean recordFound = false;

        // Read through records.txt and update the matching entry
        while ((line = reader.readLine()) != null) {
            // If we find the record to update (based on the original name)
            if (line.startsWith("Name: " + originalName)) {
                recordFound = true;
                skipRecord = true;  // Skip writing the old record

                // Write the updated record instead
                writer.write("Name: " + updatedName);
                writer.newLine();
                writer.write("Prelim Grade: " + formattedPrelimGrade);
                writer.newLine();
                writer.write("Midterm Grade: " + formattedmidtermGrade);
                writer.newLine();
                writer.write("Final Grade: " + formattedfinalGrade);
                writer.newLine();
                writer.write("Remarks: " + remarks);
                writer.newLine();
                writer.newLine();  // Add an extra newline to separate records

                // Skip the old record lines
                for (int i = 0; i < 5; i++) {
                    reader.readLine();
                }
            }

            // Write lines for all other records
            if (!skipRecord) {
                writer.write(line);
                writer.newLine();
            }

            // Reset skipping after processing each record
            if (line.trim().isEmpty()) {
                skipRecord = false;
            }
        }

        if (!recordFound) {
            JOptionPane.showMessageDialog(null, "Record not found in file.");
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error updating file: " + e.getMessage());
    }

    // Rename temp file to original file name
    if (inputFile.delete()) {
        tempFile.renameTo(inputFile);
    }

    // Display a message to the user that the update was successful
    JOptionPane.showMessageDialog(null, "Record updated successfully.");

} else {
    // Display a message if no row is selected
    JOptionPane.showMessageDialog(null, "Please select a row to update.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
}




    // Your current code for records.txt remains unchanged
    
    firstname.setText("");
    lastname.setText("");
    prelim_attendance.setText("");
    prelim_cp.setText("");
    prelim_quiz.setText("");
    prelim_exam.setText("");
    midterm_attendance.setText("");
    midterm_cp.setText("");
    midterm_quiz.setText("");
    midterm_exam.setText("");
    final_attendance.setText("");
    final_cp.setText("");
    final_quiz.setText("");
    final_exam.setText("");







    }//GEN-LAST:event_updateActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // Get the search query from the text field
    String query = search.getText().trim().toLowerCase();

    // Get the table model
    DefaultTableModel model = (DefaultTableModel) table_form.getModel();

    // Loop through the rows of the table
    for (int i = 0; i < model.getRowCount(); i++) {
        // Get the value in the first column (assuming you're searching names)
        String name = model.getValueAt(i, 0).toString().toLowerCase(); // Column 0 for names

        // Check if the name contains the search query
        if (name.contains(query)) {
            // If found, select the row in the table
            table_form.setRowSelectionInterval(i, i); // Highlight the row
        }
    }
    }//GEN-LAST:event_searchKeyReleased

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        // Confirm if the user wants to remove all records
int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove all records?", "Confirm Remove All", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

// If the user clicks "Yes", clear the table and the file
if (response == JOptionPane.YES_OPTION) {
    // Get the table model
    DefaultTableModel model = (DefaultTableModel) table_form.getModel();
    
    // Remove all rows from the table model
    model.setRowCount(0);
    
    // Clear the contents of records.txt by overwriting it with an empty file
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("records.txt", false))) {
        // Write nothing to effectively clear the file
        writer.write("");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error clearing file: " + e.getMessage());
    }
    
    // Optionally, display a message that all records were removed
    JOptionPane.showMessageDialog(null, "All records have been removed from both the table and the file.");
}

    }//GEN-LAST:event_update1ActionPerformed

    private void retrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveActionPerformed

    // Get the selected row index from the table
    int selectedRow = table_form.getSelectedRow();

    // Check if a row is selected
    if (selectedRow != -1) {
        // Get the student's name from the table
        String selectedName = (String) table_form.getValueAt(selectedRow, 0);

        // Read rawdata.txt and retrieve the raw data
        try (BufferedReader reader = new BufferedReader(new FileReader("rawdata.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                
                // Check if the current line matches the selected student's name
                if (parts[0].equals(selectedName)) {
                    // Set the Prelim fields
                    prelim_attendance.setText(parts[1]);
                    prelim_cp.setText(parts[2]);
                    prelim_quiz.setText(parts[3]);
                    prelim_exam.setText(parts[4]);

                    // Set the Midterm fields
                    midterm_attendance.setText(parts[5]);
                    midterm_cp.setText(parts[6]);
                    midterm_quiz.setText(parts[7]);
                    midterm_exam.setText(parts[8]);

                    // Set the Final fields
                    final_attendance.setText(parts[9]);
                    final_cp.setText(parts[10]);
                    final_quiz.setText(parts[11]);
                    final_exam.setText(parts[12]);

                    break;  // Stop reading once the correct student is found
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    } else {
        // Show a warning if no row is selected
        JOptionPane.showMessageDialog(null, "Please select a row to retrieve data.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
    }


    }//GEN-LAST:event_retrieveActionPerformed

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
            java.util.logging.Logger.getLogger(Grading_System1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grading_System1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grading_System1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grading_System1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grading_System1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JTextField final_attendance;
    private javax.swing.JTextField final_cp;
    private javax.swing.JTextField final_exam;
    private javax.swing.JTextField final_quiz;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField midterm_attendance;
    private javax.swing.JTextField midterm_cp;
    private javax.swing.JTextField midterm_exam;
    private javax.swing.JTextField midterm_quiz;
    private javax.swing.JTextField prelim_attendance;
    private javax.swing.JTextField prelim_cp;
    private javax.swing.JTextField prelim_exam;
    private javax.swing.JTextField prelim_quiz;
    private javax.swing.JButton retrieve;
    private javax.swing.JTextField search;
    private javax.swing.JTable table_form;
    private javax.swing.JButton update;
    private javax.swing.JButton update1;
    // End of variables declaration//GEN-END:variables
}
