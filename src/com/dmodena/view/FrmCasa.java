/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import com.dmodena.model.Casa;
import java.util.ArrayList;

/**
 *
 * @author dmodena
 */
public class FrmCasa extends javax.swing.JFrame {
    Casa casa1;
    Casa casa2;
    Casa casa3;
    Casa casa4;
    
    /**
     * Creates new form FrmCasa
     */
    public FrmCasa() {
        initComponents();
        this.setLocationRelativeTo(null);
        casa1 = new Casa();
        casa2 = new Casa();
        casa3 = new Casa();
        casa4 = new Casa();
        tfTotalAluguel1.setText(String.valueOf(casa1.getTotalAluguel()));
        tfTotalAluguel2.setText(String.valueOf(casa2.getTotalAluguel()));
        tfTotalAluguel3.setText(String.valueOf(casa3.getTotalAluguel()));
        tfTotalAluguel4.setText(String.valueOf(casa4.getTotalAluguel()));
        atualizarTotais();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfAluguel1 = new javax.swing.JTextField();
        btnContratoCasa1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        tfTotalAluguel1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfAluguel2 = new javax.swing.JTextField();
        btnContratoCasa2 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        tfTotalAluguel2 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        tfAluguel3 = new javax.swing.JTextField();
        btnContratoCasa3 = new javax.swing.JToggleButton();
        jLabel24 = new javax.swing.JLabel();
        tfTotalAluguel3 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        tfAluguel4 = new javax.swing.JTextField();
        btnContratoCasa4 = new javax.swing.JToggleButton();
        jLabel26 = new javax.swing.JLabel();
        tfTotalAluguel4 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        tfCasasAlugadas = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tfTotalAlugueis = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aluguel de Casas");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Casa 1"));

        jLabel1.setText("Valor Aluguel");

        tfAluguel1.setDisabledTextColor(java.awt.Color.black);

        btnContratoCasa1.setText("Iniciar Contrato");
        btnContratoCasa1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnContratoCasa1StateChanged(evt);
            }
        });
        btnContratoCasa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoCasa1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Total Aluguel");

        tfTotalAluguel1.setDisabledTextColor(java.awt.Color.black);
        tfTotalAluguel1.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnContratoCasa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAluguel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTotalAluguel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfAluguel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnContratoCasa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfTotalAluguel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Casa 2"));

        jLabel3.setText("Valor Aluguel");

        tfAluguel2.setDisabledTextColor(java.awt.Color.black);

        btnContratoCasa2.setText("Iniciar Contrato");
        btnContratoCasa2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnContratoCasa2StateChanged(evt);
            }
        });
        btnContratoCasa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoCasa2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Total Aluguel");

        tfTotalAluguel2.setDisabledTextColor(java.awt.Color.black);
        tfTotalAluguel2.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnContratoCasa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAluguel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTotalAluguel2)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfAluguel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnContratoCasa2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfTotalAluguel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Casa 3"));

        jLabel23.setText("Valor Aluguel");

        tfAluguel3.setDisabledTextColor(java.awt.Color.black);

        btnContratoCasa3.setText("Iniciar Contrato");
        btnContratoCasa3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnContratoCasa3StateChanged(evt);
            }
        });
        btnContratoCasa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoCasa3ActionPerformed(evt);
            }
        });

        jLabel24.setText("Total Aluguel");

        tfTotalAluguel3.setDisabledTextColor(java.awt.Color.black);
        tfTotalAluguel3.setEnabled(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnContratoCasa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAluguel3))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTotalAluguel3)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tfAluguel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnContratoCasa3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tfTotalAluguel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Casa 4"));

        jLabel25.setText("Valor Aluguel");

        tfAluguel4.setDisabledTextColor(java.awt.Color.black);

        btnContratoCasa4.setText("Iniciar Contrato");
        btnContratoCasa4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnContratoCasa4StateChanged(evt);
            }
        });
        btnContratoCasa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoCasa4ActionPerformed(evt);
            }
        });

        jLabel26.setText("Total Aluguel");

        tfTotalAluguel4.setDisabledTextColor(java.awt.Color.black);
        tfTotalAluguel4.setEnabled(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnContratoCasa4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAluguel4))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTotalAluguel4)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tfAluguel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnContratoCasa4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tfTotalAluguel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumo"));

        jLabel27.setText("Casas alugadas");

        tfCasasAlugadas.setDisabledTextColor(java.awt.Color.black);
        tfCasasAlugadas.setEnabled(false);

        jLabel28.setText("Total dos aluguéis");

        tfTotalAlugueis.setDisabledTextColor(java.awt.Color.black);
        tfTotalAlugueis.setEnabled(false);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCasasAlugadas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTotalAlugueis)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tfCasasAlugadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(tfTotalAlugueis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContratoCasa1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnContratoCasa1StateChanged
        
    }//GEN-LAST:event_btnContratoCasa1StateChanged

    private void btnContratoCasa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoCasa1ActionPerformed
        if(btnContratoCasa1.isSelected()) {
            try {
                double aluguel = Double.parseDouble(tfAluguel1.getText().trim());
                casa1.iniciarContrato(aluguel);
                tfAluguel1.setEnabled(false);
                btnContratoCasa1.setText("Encerrar Contrato");
                atualizarTotais();
            }
            catch(Exception e) {
                btnContratoCasa1.setSelected(false);
                tfAluguel1.setText("");
                tfAluguel1.setEnabled(true);
                tfAluguel1.requestFocus();                
            }            
        }
        else {
            casa1.encerrarContrato();
            tfAluguel1.setText("");
            tfAluguel1.setEnabled(true);
            tfAluguel1.requestFocus();
            tfTotalAluguel1.setText(String.valueOf(casa1.getTotalAluguel()));
            btnContratoCasa1.setText("Iniciar Contrato");
            atualizarTotais();
        }
    }//GEN-LAST:event_btnContratoCasa1ActionPerformed

    private void btnContratoCasa2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnContratoCasa2StateChanged
        
    }//GEN-LAST:event_btnContratoCasa2StateChanged

    private void btnContratoCasa3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnContratoCasa3StateChanged

    }//GEN-LAST:event_btnContratoCasa3StateChanged

    private void btnContratoCasa4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnContratoCasa4StateChanged

    }//GEN-LAST:event_btnContratoCasa4StateChanged

    private void btnContratoCasa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoCasa2ActionPerformed
          if(btnContratoCasa2.isSelected()) {
            try {
                double aluguel = Double.parseDouble(tfAluguel2.getText().trim());
                casa2.iniciarContrato(aluguel);
                tfAluguel2.setEnabled(false);
                btnContratoCasa2.setText("Encerrar Contrato");
                atualizarTotais();
            }
            catch(Exception e) {
                btnContratoCasa2.setSelected(false);
                tfAluguel2.setText("");
                tfAluguel2.setEnabled(true);
                tfAluguel2.requestFocus();                
            }            
        }
        else {
            casa2.encerrarContrato();
            tfAluguel2.setText("");
            tfAluguel2.setEnabled(true);
            tfAluguel2.requestFocus();
            tfTotalAluguel2.setText(String.valueOf(casa2.getTotalAluguel()));
            btnContratoCasa2.setText("Iniciar Contrato");
            atualizarTotais();
        }
    }//GEN-LAST:event_btnContratoCasa2ActionPerformed

    private void btnContratoCasa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoCasa3ActionPerformed
          if(btnContratoCasa3.isSelected()) {
            try {
                double aluguel = Double.parseDouble(tfAluguel3.getText().trim());
                casa3.iniciarContrato(aluguel);
                tfAluguel3.setEnabled(false);
                btnContratoCasa3.setText("Encerrar Contrato");
                atualizarTotais();
            }
            catch(Exception e) {
                btnContratoCasa3.setSelected(false);
                tfAluguel3.setText("");
                tfAluguel3.setEnabled(true);
                tfAluguel3.requestFocus();                
            }            
        }
        else {
            casa3.encerrarContrato();
            tfAluguel3.setText("");
            tfAluguel3.setEnabled(true);
            tfAluguel3.requestFocus();
            tfTotalAluguel3.setText(String.valueOf(casa3.getTotalAluguel()));
            btnContratoCasa3.setText("Iniciar Contrato");
            atualizarTotais();
        }
    }//GEN-LAST:event_btnContratoCasa3ActionPerformed

    private void btnContratoCasa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoCasa4ActionPerformed
          if(btnContratoCasa4.isSelected()) {
            try {
                double aluguel = Double.parseDouble(tfAluguel4.getText().trim());
                casa4.iniciarContrato(aluguel);
                tfAluguel4.setEnabled(false);
                btnContratoCasa4.setText("Encerrar Contrato");
                atualizarTotais();
            }
            catch(Exception e) {
                btnContratoCasa4.setSelected(false);
                tfAluguel4.setText("");
                tfAluguel4.setEnabled(true);
                tfAluguel4.requestFocus();                
            }            
        }
        else {
            casa4.encerrarContrato();
            tfAluguel4.setText("");
            tfAluguel4.setEnabled(true);
            tfAluguel4.requestFocus();
            tfTotalAluguel4.setText(String.valueOf(casa4.getTotalAluguel()));
            btnContratoCasa4.setText("Iniciar Contrato");
            atualizarTotais();
        }
    }//GEN-LAST:event_btnContratoCasa4ActionPerformed

    private void atualizarTotais() {
        int casasAlugadas = 0;
        double valorTotalAlugueis = 0d;
        ArrayList<Casa> casas = new ArrayList<>();
        casas.add(casa1);
        casas.add(casa2);
        casas.add(casa3);
        casas.add(casa4);
        
        for(Casa casa : casas) {
            valorTotalAlugueis += casa.getTotalAluguel();
            if(casa.getAlugada()) casasAlugadas++;            
        }
        
        tfCasasAlugadas.setText(String.valueOf(casasAlugadas));
        tfTotalAlugueis.setText(String.valueOf(valorTotalAlugueis));
    }
    
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
            java.util.logging.Logger.getLogger(FrmCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCasa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnContratoCasa1;
    private javax.swing.JToggleButton btnContratoCasa2;
    private javax.swing.JToggleButton btnContratoCasa3;
    private javax.swing.JToggleButton btnContratoCasa4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField tfAluguel1;
    private javax.swing.JTextField tfAluguel2;
    private javax.swing.JTextField tfAluguel3;
    private javax.swing.JTextField tfAluguel4;
    private javax.swing.JTextField tfCasasAlugadas;
    private javax.swing.JTextField tfTotalAlugueis;
    private javax.swing.JTextField tfTotalAluguel1;
    private javax.swing.JTextField tfTotalAluguel2;
    private javax.swing.JTextField tfTotalAluguel3;
    private javax.swing.JTextField tfTotalAluguel4;
    // End of variables declaration//GEN-END:variables
}