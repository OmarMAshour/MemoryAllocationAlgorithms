/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author n0krashy
 */
public class GUI extends javax.swing.JFrame {

    public static List<Process> sortedList = new ArrayList<Process>();
    List<Process> entryList = new ArrayList<Process>();
    List<String> nameList = new ArrayList<String>();
    int r = 0;
    static int n = 0;
    boolean exceed = false;

    boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public GUI() {
        initComponents();
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeallocateButton = new javax.swing.JButton();
        AllocateButton = new javax.swing.JButton();
        ProcessNameField = new javax.swing.JTextField();
        ProcessSizeField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProcessesTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AlgorithmBox = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DeallocateButton.setText("Deallocate");
        DeallocateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeallocateButtonActionPerformed(evt);
            }
        });

        AllocateButton.setText("Allocate");
        AllocateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllocateButtonActionPerformed(evt);
            }
        });

        ProcessesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Size", "From", "To"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ProcessesTable);
        if (ProcessesTable.getColumnModel().getColumnCount() > 0) {
            ProcessesTable.getColumnModel().getColumn(0).setResizable(false);
            ProcessesTable.getColumnModel().getColumn(1).setResizable(false);
            ProcessesTable.getColumnModel().getColumn(2).setResizable(false);
            ProcessesTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Size");

        jLabel3.setFont(new java.awt.Font("Good Times Rg", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Process");

        AlgorithmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "First-Fit", "Best-Fit" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AlgorithmBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AllocateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProcessNameField)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ProcessSizeField)
                            .addComponent(DeallocateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AlgorithmBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProcessNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProcessSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeallocateButton)
                            .addComponent(AllocateButton))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AllocateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllocateButtonActionPerformed
        if (nameList.contains(ProcessNameField.getText())) {
            JOptionPane.showMessageDialog(this, "There is already a process with the same name, please enter a different name.", "Process name error", JOptionPane.ERROR_MESSAGE);
        } else if (ProcessNameField.getText().isEmpty() || ProcessSizeField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "There is an empty field, please fill in all of the required fields.", "Incomplete fields", JOptionPane.ERROR_MESSAGE);
        } else if (!isInt(ProcessSizeField.getText())) {
            JOptionPane.showMessageDialog(this, "Process Size field can't contain characters, please enter numbers only.", "Fields entries error", JOptionPane.ERROR_MESSAGE);
        } else if (Integer.parseInt(ProcessSizeField.getText()) < 0) {
            JOptionPane.showMessageDialog(this, "Process Size field can't be in negative value, please enter non-negative value.", "Invalid size value", JOptionPane.ERROR_MESSAGE);
        } else {

            Process p1 = new Process(Integer.parseInt(ProcessSizeField.getText()), ProcessNameField.getText());
            exceed = false;
            
            if (AlgorithmBox.getSelectedIndex() == 0) {
                if (entryList.isEmpty()) {
                    if (p1.getSize() > 1000) {
                        JOptionPane.showMessageDialog(this, "Process Size exceeds free spaces.", "Invalid size value", JOptionPane.ERROR_MESSAGE);
                        exceed = true;
                    }
                } else {
                    Process p2 = entryList.get(0);
                    while (n + p1.getSize() > p2.getFrom()) {
                        n = p2.getTo();
                        if (entryList.indexOf(p2) == entryList.size() - 1 && n + p1.getSize() > 1000) {
                            JOptionPane.showMessageDialog(this, "Process Size exceeds free spaces.", "Invalid size value", JOptionPane.ERROR_MESSAGE);
                            exceed = true;
                            break;
                        }
                        if (entryList.indexOf(p2) == entryList.size() - 1) {
                            break;
                        }
                        p2 = entryList.get(entryList.indexOf(p2) + 1);
                    }
                }

                if (exceed == false) {
                    p1.setFrom(n);
                    p1.setTo(n + p1.getSize());
                    nameList.add(ProcessNameField.getText());
                    entryList.add(p1);
                    entryList.sort(Comparator.comparing(Process::getFrom));
                }

            } else {
                int space = 999999;
                if (entryList.isEmpty()) {
                } else {
                    for (Process p : entryList) {
                        if (entryList.indexOf(p) == entryList.size() - 1 && space == 999999) {
                            n = p.getTo();
                            break;
                        } else if(entryList.indexOf(p) == entryList.size() - 1){
                            break;
                        }
                        Process p2 = entryList.get(entryList.indexOf(p) + 1);
                        if (p1.getSize() <= p2.getFrom() - p.getTo() && p2.getFrom() - p.getTo() < space) {
                            space = p2.getFrom() - p.getTo();
                            n = p.getTo();
                        }
                    }
                }
                if (n + p1.getSize() <= 1000) {
                    p1.setFrom(n);
                    p1.setTo(n + p1.getSize());
                    nameList.add(ProcessNameField.getText());
                    entryList.add(p1);
                    entryList.sort(Comparator.comparing(Process::getFrom));
                    exceed = false;
                } else {
                    JOptionPane.showMessageDialog(this, "Process Size exceeds free spaces.", "Invalid size value", JOptionPane.ERROR_MESSAGE);
                    exceed = true;
                }
            }
            if (exceed == false) {
                DefaultTableModel dtm = (DefaultTableModel) ProcessesTable.getModel();
                dtm.addRow(new Object[]{null, null, null, null});

                ProcessesTable.setValueAt(ProcessNameField.getText(), r, 0);
                ProcessesTable.setValueAt(Integer.parseInt(ProcessSizeField.getText()), r, 1);
                ProcessesTable.setValueAt(p1.getFrom(), r, 2);
                ProcessesTable.setValueAt(p1.getTo(), r, 3);

                r++;

                ProcessNameField.setText(null);
                ProcessSizeField.setText(null);
                ProcessNameField.requestFocus();
            }
        }
    }//GEN-LAST:event_AllocateButtonActionPerformed

    private void DeallocateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeallocateButtonActionPerformed

        if (ProcessesTable.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "There is not selected process, please select a process to be deallocated.", "Process deallocation error", JOptionPane.ERROR_MESSAGE);
        } else {
            String s = (String) ProcessesTable.getValueAt(ProcessesTable.getSelectedRow(), 0);
            for (Process p : entryList) {
                if (s.equals(p.getName())) {
                    entryList.remove(p);
                    nameList.remove(s);
                    break;
                }
            }

            DefaultTableModel dtm = (DefaultTableModel) ProcessesTable.getModel();
            dtm.removeRow(ProcessesTable.getSelectedRow());
            r--;
            n = 0;
        }
        
    }//GEN-LAST:event_DeallocateButtonActionPerformed

    @Override
    public void paint(Graphics ga){
        super.paint(ga);
        Graphics2D g = (Graphics2D)ga;
        g.setColor(Color.red);
        
        g.fillRect(0, 0, 50, 50);
    }
    
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AlgorithmBox;
    private javax.swing.JButton AllocateButton;
    private javax.swing.JButton DeallocateButton;
    private javax.swing.JTextField ProcessNameField;
    private javax.swing.JTextField ProcessSizeField;
    private javax.swing.JTable ProcessesTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
