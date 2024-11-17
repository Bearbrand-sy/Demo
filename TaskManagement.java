/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.taskmanangementsystemgui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Stack;
/**
 *
 * @author intel
 */
public class TaskManagement extends javax.swing.JFrame {
    
   LinkedList<TaskManagement> taskList = new LinkedList<>();
   Stack<TaskManagement> stack = new Stack<>();
   
    private String taskName;
    private String dueDate;
    
   //Constructor
    public TaskManagement(String taskName, String dueDate) {
        this.taskName = taskName;
        this.dueDate = dueDate;
    }
    // Getter methods for task details
            public String getTaskName() {
                return taskName;
                    }
            public String getDueDate() {
                return dueDate;
                    }

    public TaskManagement() {
        initComponents();     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jDayChooser2 = new com.toedter.calendar.JDayChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        task = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tasktable = new javax.swing.JTable();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();
        Undo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\intel\\Downloads\\icons8-task-48.png")); // NOI18N
        jLabel1.setText("Task Management System");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 10, 450, 40);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Task Name:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 70, 69, 24);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date: ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 110, 69, 16);

        add.setBackground(new java.awt.Color(0, 153, 153));
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add Task");
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add);
        add.setBounds(390, 70, 110, 20);

        task.setBackground(new java.awt.Color(255, 255, 255));
        task.setForeground(new java.awt.Color(0, 0, 0));
        task.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskActionPerformed(evt);
            }
        });
        jPanel2.add(task);
        task.setBounds(120, 70, 253, 22);

        tasktable.setBackground(new java.awt.Color(102, 102, 102));
        tasktable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tasktable.setForeground(new java.awt.Color(0, 0, 0));
        tasktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task List", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tasktable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tasktable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tasktable.setGridColor(new java.awt.Color(0, 0, 0));
        tasktable.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tasktable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tasktable);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 150, 469, 257);

        update.setBackground(new java.awt.Color(0, 153, 153));
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update);
        update.setBounds(520, 290, 90, 20);

        delete.setBackground(new java.awt.Color(0, 153, 153));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete);
        delete.setBounds(518, 325, 90, 23);

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(date);
        date.setBounds(120, 110, 173, 22);

        Undo.setBackground(new java.awt.Color(0, 153, 153));
        Undo.setForeground(new java.awt.Color(255, 255, 255));
        Undo.setText("Undo");
        Undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoActionPerformed(evt);
            }
        });
        jPanel2.add(Undo);
        Undo.setBounds(518, 360, 90, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(641, 472));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String taskName = task.getText();  
        Date selectedDate = date.getDate(); 

        // Check if task field is empty or date is not selected
        if (taskName.isEmpty() || selectedDate == null) {
            JOptionPane.showMessageDialog(this, "Please fill all fields", "Try again", JOptionPane.ERROR_MESSAGE);
                                          
        } else {
            // Format the selected date to string
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
            String dueDate = dateFormat.format(selectedDate);  // Format the date as a string

            // Create a new Task object and add it to the LinkedList
            TaskManagement newTask = new TaskManagement(taskName, dueDate);
            taskList.add(newTask);
            
            //Sorting the task list by due date using Bubble Sort
            sortByDate();

            // Update the table to show the new task from the taskList
            addListTable();
            
            task.setText("");  // Clear task input field
            date.setDate(null);  // Reset date picker
        }
        
    }//GEN-LAST:event_addActionPerformed
   
    //Method for adding task in the table
    private void addListTable() {
        DefaultTableModel dm = (DefaultTableModel) tasktable.getModel();
        dm.setRowCount(0); // Clear the table before adding updated data

        // Add each task from the LinkedList to the table
        for (TaskManagement task : taskList) {
            dm.addRow(new Object[]{task.getTaskName(), task.getDueDate()});
        }
    }
    //Bubble sort 
    private void sortByDate() {
        int n = taskList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                TaskManagement task1 = taskList.get(j);
                TaskManagement task2 = taskList.get(j + 1);
                
                // Compare the due dates
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
                    Date date1 = dateFormat.parse(task1.getDueDate());
                    Date date2 = dateFormat.parse(task2.getDueDate());
                    
                    // Swap tasks if the dueDate of task1 is greater than task2
                    if (date1.after(date2)) {
                        taskList.set(j, task2);
                        taskList.set(j + 1, task1);
                    }
                } catch (Exception e) {
                    // Handle parsing exceptions if necessary
                    e.printStackTrace();
                }
            }
        }
    }
    private void taskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    int deleteTask = tasktable.getSelectedRow();

    // Check if a row is selected
    if (deleteTask != -1) {
        // Get the task to be deleted
        TaskManagement deletedTask = taskList.get(deleteTask);
        
        // Push the deleted task onto the undo stack
        stack.push(deletedTask);

        // Remove the task from taskList
        taskList.remove(deleteTask);

        //Sorting the list by due date using Bubble Sort
        sortByDate();

        // Update the table to show the changes
        addListTable();
    } else {
        JOptionPane.showMessageDialog(this, "Please select a task to delete.", "No task selected", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        int updateTask = tasktable.getSelectedRow();

        // Check if a row is selected
        if (updateTask != -1) {
            // Get the task to be updated
            TaskManagement updated = taskList.get(updateTask);

            // This line of code is for getting the new task
            String newTaskName = task.getText();
            Date selectedDate = date.getDate();
            if (newTaskName.isEmpty() || selectedDate == null) {
                JOptionPane.showMessageDialog(this, "To update the task please fill all fields above to update the task", "Try again", JOptionPane.ERROR_MESSAGE);
                                              
            } else {
                // Format the selected date to string
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
                String newDueDate = dateFormat.format(selectedDate);  // Format the date as a string

                // Create the updated task
                TaskManagement updatedTask = new TaskManagement(newTaskName, newDueDate);
                sortByDate();

                // Push the old task to the undo stack before updating
                stack.push(updated);
                 
                // Update the task in the list
                taskList.set(updateTask, updatedTask);
               
             // Update the table to show the changes
                addListTable();
                task.setText("");  // Clear task input field
                date.setDate(null);  // Reset date 
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a task to update.", "No task selected", JOptionPane.WARNING_MESSAGE);
        }
                                          
    }//GEN-LAST:event_updateActionPerformed

    private void UndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoActionPerformed
        // TODO add your handling code here:
        if (!stack.isEmpty()) {
        // Pop the last task from the stack the most recently deleted task or update task
        TaskManagement undoTask = stack.pop();
        
        // Add the delete  task back to the taskList
        taskList.add(undoTask); 
  
        // Sorting the list by due date using Bubble Sort 
        sortByDate();

        // Update the table to show the changes
        addListTable();
    } else {
        JOptionPane.showMessageDialog(this, "No actions to undo.", "Undo Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_UndoActionPerformed
    
    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskManagement().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Undo;
    private javax.swing.JButton add;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton delete;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private com.toedter.calendar.JDayChooser jDayChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField task;
    private javax.swing.JTable tasktable;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
