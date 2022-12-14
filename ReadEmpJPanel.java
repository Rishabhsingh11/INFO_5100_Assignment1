/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui;

import java.awt.Image;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.EmployeeDirectory;
import model.EmployeeDirectoryHistory;

/**
 *
 * @author risha
 */
public class ReadEmpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReadEmpJPanel
     */
    EmployeeDirectoryHistory emphistory;
    public ReadEmpJPanel(EmployeeDirectoryHistory emphistory) 
    {
        initComponents();
        this.emphistory = emphistory;
        
        populateTable();
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
        txtCellNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmailid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        imageLable = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnUpdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BtnView = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmpid = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbleEmphist = new javax.swing.JTable();
        txtTeam = new javax.swing.JTextField();
        txtPosition = new javax.swing.JTextField();
        txtPhoto = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Maintain");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtCellNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtCellNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellNumberActionPerformed(evt);
            }
        });
        txtCellNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCellNumberKeyPressed(evt);
            }
        });

        jLabel2.setText("Name");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtEmailid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtEmailid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailidActionPerformed(evt);
            }
        });
        txtEmailid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailidKeyPressed(evt);
            }
        });

        jLabel3.setText("EmpID");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        imageLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLable.setText("Image");
        imageLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel4.setText("Age");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        BtnUpdate.setText("Update");
        BtnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        jLabel5.setText("Gender");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        BtnView.setText("Pull Record");
        BtnView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        BtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewActionPerformed(evt);
            }
        });

        BtnDelete.setText("Delete");
        BtnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        jLabel6.setText("StartDate");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtEmpid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });

        txtGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        txtGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGenderKeyPressed(evt);
            }
        });

        txtStartDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtStartDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStartDateKeyPressed(evt);
            }
        });

        jLabel7.setText("Level");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel8.setText("Team");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel9.setText("Position");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel10.setText("Cell Number");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel11.setText("Email ID");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtLevel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        tbleEmphist.setBackground(new java.awt.Color(153, 153, 153));
        tbleEmphist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        tbleEmphist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee Id", "Age", "Gender", "Start Date", "Level", "Team Info", "Project Info", "Cell Number", "Email Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbleEmphist);

        txtTeam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtPosition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtPhoto.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnView, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAge)
                                .addComponent(txtEmpid)
                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPosition)
                                        .addComponent(txtCellNumber)
                                        .addComponent(txtEmailid, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTeam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(imageLable, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnView, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCellNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtEmailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imageLable, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCellNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellNumberActionPerformed

    private void txtEmailidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailidActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tbleEmphist.getSelectedRow();
        
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete");
            return; 
        }
        DefaultTableModel model = (DefaultTableModel)tbleEmphist.getModel();
        EmployeeDirectory selectedEmployee = (EmployeeDirectory) model.getValueAt(selectedRowIndex,0);
        emphistory.deleteEmployee(selectedEmployee);
        JOptionPane.showMessageDialog(this, "Employees Record deleted from directory");
        
        populateTable();
        
        txtName.setText("");
        txtEmpid.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtStartDate.setText("");
        txtLevel.setText("");
        txtTeam.setText("");
        txtPosition.setText("");
        txtCellNumber.setText("");
        txtEmailid.setText("");
        txtPhoto.setText("");
        imageLable.setIcon(null);
        
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tbleEmphist.getSelectedRow();
        if(selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please Select a row to Update");
            return; 
        }
        DefaultTableModel model = (DefaultTableModel)tbleEmphist.getModel();
        EmployeeDirectory selectedEmployee = (EmployeeDirectory) model.getValueAt(tbleEmphist.getSelectedRow(),0);
        /*if(tbleEmphist.getSelectedRowCount()== 0)
        {
            JOptionPane.showMessageDialog(this, "Please Select a row to Update");
            return; 
        }*/
        if(tbleEmphist.getSelectedRowCount()== 1)
        {
          String name = txtName.getText();
          String empid = txtEmpid.getText();
          String age = txtAge.getText();
          String gender = txtGender.getText();
          String startdate = txtStartDate.getText();
          String level = txtLevel.getText();
          String team_info = txtTeam.getText();
          String position_title = txtPosition.getText();
          String cell_number = txtCellNumber.getText();
          String email_id = txtEmailid.getText();
          String photo = txtPhoto.getText();
          
          txtEmpid.setEnabled(false);
          
           
          if (!Pattern.matches("^\\d+$", txtAge.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Age cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
             BtnUpdate.setEnabled(false);
         }
        else if (!Pattern.matches("^(1[89]|2[0-9]|3[0-9]|4[0-9]|5[0-9]|6[0-5])$", txtAge.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Age should be between 18 to 65", "Error", JOptionPane.ERROR_MESSAGE);
             BtnUpdate.setEnabled(false);
         }
        else if (!Pattern.matches("^^(?:male|Male|MALE|female|Female|FEMALE)$",txtGender.getText()))
        {
          JOptionPane.showMessageDialog(null, "Gender has to be male or female", "Error", JOptionPane.ERROR_MESSAGE);
          BtnUpdate.setEnabled(false);  
        }
        else if (!(Pattern.matches("^[0,1]?\\d{1}\\/(([0-2]?\\d{1})|([3][0,1]{1}))\\/(([1]{1}[9]{1}[9]{1}\\d{1})|([2-9]{1}\\d{3}))$", txtStartDate.getText())))
        {
          JOptionPane.showMessageDialog(null, "Please enter date in mm/dd/yyyy format", "Error", JOptionPane.ERROR_MESSAGE);
          BtnUpdate.setEnabled(false);
        }
        else if (!Pattern.matches("^[1-9]{1}[0-9]{9}", txtCellNumber.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Enter valid 10 digit number", "Error", JOptionPane.ERROR_MESSAGE);
             BtnUpdate.setEnabled(false);
         }
        else if (!(Pattern.matches("^[a-zA-Z0-9]*+[@]{1}+[a-zA-Z0-9]*+[.]{1}+[a-zA-Z0-9]*+$", txtEmailid.getText()))) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            BtnUpdate.setEnabled(false);
            }
        else {
          
          selectedEmployee.setName(name);
          selectedEmployee.setAge(age);
          selectedEmployee.setGender(gender);
          selectedEmployee.setStartdate(startdate);
          selectedEmployee.setLevel(level);
          selectedEmployee.setTeam_info(team_info);
          selectedEmployee.setPosition_title(position_title);
          selectedEmployee.setCell_number(cell_number);
          selectedEmployee.setEmail_id(email_id);
          //selectedEmployee.setPhoto_path(photo);
          
          model.setValueAt(name,tbleEmphist.getSelectedRow(),0);
          model.setValueAt(empid, tbleEmphist.getSelectedRow(),1);
          model.setValueAt(age, tbleEmphist.getSelectedRow(),2);
          model.setValueAt(gender, tbleEmphist.getSelectedRow(),3);
          model.setValueAt(startdate, tbleEmphist.getSelectedRow(),4);
          model.setValueAt(level, tbleEmphist.getSelectedRow(),5);
          model.setValueAt(team_info, tbleEmphist.getSelectedRow(),6);
          model.setValueAt(position_title, tbleEmphist.getSelectedRow(),7);
          model.setValueAt(cell_number, tbleEmphist.getSelectedRow(),8);
          model.setValueAt(email_id, tbleEmphist.getSelectedRow(),9);
          //model.setValueAt(photo, tbleEmphist.getSelectedRow(),10);
          //emphistory.updateEmployee(selectedEmployee);         
          JOptionPane.showMessageDialog(this, "Employees Record have been updated");
          populateTable();
        
          txtName.setText("");
          txtEmpid.setText("");
          txtAge.setText("");
          txtGender.setText("");
          txtStartDate.setText("");
          txtLevel.setText("");
          txtTeam.setText("");
          txtPosition.setText("");
          txtCellNumber.setText("");
          txtEmailid.setText("");
          txtPhoto.setText("");
          imageLable.setIcon(null);
        }
        }
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tbleEmphist.getSelectedRow();
        
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Please Select a row to view data");
            return; 
        }
        DefaultTableModel model = (DefaultTableModel)tbleEmphist.getModel();
        EmployeeDirectory selectedEmployee = (EmployeeDirectory) model.getValueAt(selectedRowIndex,0);
        txtName.setText(selectedEmployee.getName());
        txtEmpid.setText(selectedEmployee.getEmpid());
        txtAge.setText(selectedEmployee.getAge());
        txtGender.setText(selectedEmployee.getGender());
        txtStartDate.setText(selectedEmployee.getStartdate());
        txtLevel.setText(selectedEmployee.getLevel());
        txtTeam.setText(selectedEmployee.getTeam_info());
        txtPosition.setText((selectedEmployee.getPosition_title()));
        txtCellNumber.setText(selectedEmployee.getCell_number());
        txtEmailid.setText(selectedEmployee.getEmail_id());
        txtPhoto.setText(selectedEmployee.getPhoto_path());
        imageLable.setIcon(resize_image(selectedEmployee.getPhoto_path()));
        txtEmpid.setEnabled(false);
    }//GEN-LAST:event_BtnViewActionPerformed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        // TODO add your handling code here:
        BtnUpdate.setEnabled(true);
    }//GEN-LAST:event_txtAgeKeyPressed

    private void txtGenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyPressed
        // TODO add your handling code here:
        BtnUpdate.setEnabled(true);
    }//GEN-LAST:event_txtGenderKeyPressed

    private void txtStartDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartDateKeyPressed
        // TODO add your handling code here:
        BtnUpdate.setEnabled(true);
    }//GEN-LAST:event_txtStartDateKeyPressed

    private void txtCellNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellNumberKeyPressed
        // TODO add your handling code here:
        BtnUpdate.setEnabled(true);
    }//GEN-LAST:event_txtCellNumberKeyPressed

    private void txtEmailidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailidKeyPressed
        // TODO add your handling code here:
        BtnUpdate.setEnabled(true);
    }//GEN-LAST:event_txtEmailidKeyPressed
    
    public ImageIcon resize_image(String image_path){
        ImageIcon image_icon = new ImageIcon(image_path);
        Image img = image_icon.getImage();
        Image new_image = img.getScaledInstance(300,300,Image.SCALE_SMOOTH);
        ImageIcon new_image_icon = new ImageIcon(new_image);
        return new_image_icon;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JButton BtnView;
    private javax.swing.JLabel imageLable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbleEmphist;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellNumber;
    private javax.swing.JTextField txtEmailid;
    private javax.swing.JTextField txtEmpid;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoto;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeam;
    // End of variables declaration//GEN-END:variables

    private void populateTable() 
    {
       DefaultTableModel model = (DefaultTableModel)tbleEmphist.getModel();
       model.setRowCount(0);
       
       for(EmployeeDirectory ed : emphistory.getEmphistory())
       {
           Object [] row = new Object[11];
           row[0] = ed;
           row[1] = ed.getEmpid();
           row[2] = ed.getAge();
           row[3] = ed.getGender();
           row[4] = ed.getStartdate();
           row[5] = ed.getLevel();
           row[6] = ed.getTeam_info();
           row[7] = ed.getPosition_title();
           row[8] = ed.getCell_number();
           row[9] = ed.getEmail_id();
           row[10] = ed.getPhoto_path();
           
           model.addRow(row);
       }
       }
}