/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.EmprestimoDAO;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import utils.Data;
import utils.Validacao;

/**
 *
 * @author Gustavo Martini
 */
public class IfrBuscaVideo extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfrBuscaVideo
     */
    public IfrBuscaVideo() {
        initComponents();
        setTitle("Consultar Empréstimos");
        setClosable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        ftfDataInicial = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        ftfDataFinal = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txfCodFunc = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmprestimos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxSituacao = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txfCodUsuario = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        cbxOrdenar = new javax.swing.JComboBox<>();
        btnEmprestimoInfos = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txfCodEmprestimo = new javax.swing.JFormattedTextField();

        jLabel2.setText("De ");

        try {
            ftfDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfDataInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftfDataInicialMouseClicked(evt);
            }
        });

        jLabel3.setText("até");

        try {
            ftfDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfDataFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftfDataFinalMouseClicked(evt);
            }
        });

        jLabel4.setText("Cód. Funcionário:");

        txfCodFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        tblEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Data Retirada", "Data Devolução", "Renovações", "Devolvido", "Usuário", "Funcionário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblEmprestimos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblEmprestimos);
        if (tblEmprestimos.getColumnModel().getColumnCount() > 0) {
            tblEmprestimos.getColumnModel().getColumn(0).setMinWidth(70);
            tblEmprestimos.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblEmprestimos.getColumnModel().getColumn(0).setMaxWidth(70);
        }

        btnBuscar.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/loupe.png")); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/clean.png")); // NOI18N
        btnLimpar.setText("Limpar campos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel5.setText("Total:");

        lblTotal.setText("0");

        jLabel1.setText("Data empréstimo:");

        jLabel6.setText("Situação:");

        cbxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Devolvidos", "Pendentes" }));

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel7.setText("Lista de empréstimos");

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel8.setText("Opções de busca");

        jLabel9.setText("Cód. Usuário:");

        txfCodUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel10.setText("Ordernar por:");

        cbxOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Data Retirada", "Data Devolução", "Situação", "Usuário", "Funcionário", "Renovações" }));

        btnEmprestimoInfos.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/info.png")); // NOI18N
        btnEmprestimoInfos.setText("Informações do empréstimo");
        btnEmprestimoInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestimoInfosActionPerformed(evt);
            }
        });

        jLabel11.setText("Cód. Empréstimo:");

        txfCodEmprestimo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEmprestimoInfos))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(ftfDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(ftfDataFinal))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4))
                                            .addGap(24, 24, 24)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txfCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txfCodFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txfCodEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(210, 210, 210)))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnBuscar)
                                .addComponent(jLabel6)
                                .addComponent(jLabel10))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbxSituacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxOrdenar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ftfDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ftfDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cbxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txfCodFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txfCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(btnLimpar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txfCodEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblTotal)
                    .addComponent(btnEmprestimoInfos))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCadastro() {
        ftfDataInicial.setText("");
        ftfDataFinal.setText("");
        txfCodFunc.setText("");
        txfCodUsuario.setText("");
        txfCodEmprestimo.setText("");
        cbxSituacao.setSelectedIndex(0);
        cbxOrdenar.setSelectedIndex(0);
        lblTotal.setText("0");

        new EmprestimoDAO().popularTabelaBusca(tblEmprestimos, "WHERE cod_emprestimo = 0", " ORDER BY cod_emprestimo");
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            ArrayList<String> opcoes = new ArrayList<>();
//            opcoes.clear();
            int cod_func = 0;
            int cod_usuario = 0;
            int cod_emprestimo = 0;
            String sql = "WHERE ";
            String order = "";

            String data_inicial = ftfDataInicial.getText().equals("  /  /    ")
                    ? "" : ftfDataInicial.getText();
            String data_final = ftfDataFinal.getText().equals("  /  /    ")
                    ? "" : ftfDataFinal.getText();

            Validacao val = new Validacao();
            if (!data_inicial.isEmpty()) {
                if (!val.validarDataFormatada(data_inicial)) {
                    JOptionPane.showMessageDialog(null, "Insira data inicial válida!");
                    ftfDataInicial.setForeground(Color.red);
                    ftfDataInicial.requestFocus();
                    return;
                } else {
                    opcoes.add("data_retirada >= '" + Data.changeFormat(data_inicial) + "'");
                }
            }

            if (!data_final.isEmpty()) {
                if (!val.validarDataFormatada(data_final)) {
                    JOptionPane.showMessageDialog(null, "Insira data final válida!");
                    ftfDataFinal.setForeground(Color.red);
                    ftfDataFinal.requestFocus();
                    return;
                } else {
                    opcoes.add("data_retirada <= '" + Data.changeFormat(data_final) + "'");
                }
            }

            if (!data_inicial.isEmpty() && !data_final.isEmpty()) {
                if (Data.compareDates(Data.stringToDate(data_inicial), Data.stringToDate(data_final)) < 0) {
                    JOptionPane.showMessageDialog(null, "A data final precisa ser maior que a data inicial!");
                    return;
                }
            }

            if (!txfCodFunc.getText().isEmpty()) {
                cod_func = Integer.parseInt(txfCodFunc.getText());
                opcoes.add("cod_func = " + cod_func);
            }

            if (!txfCodUsuario.getText().isEmpty()) {
                cod_usuario = Integer.parseInt(txfCodUsuario.getText());
                opcoes.add("cod_usuario = " + cod_usuario);
            }
            
            if (!txfCodEmprestimo.getText().isEmpty()) {
                cod_emprestimo = Integer.parseInt(txfCodEmprestimo.getText());
                opcoes.add("cod_emprestimo = " + cod_emprestimo);
            }

            if (cbxSituacao.getSelectedIndex() == 1) {
                opcoes.add("devolvido = true");
            } else if (cbxSituacao.getSelectedIndex() == 2) {
                opcoes.add("devolvido = false");
            }

            if (cbxOrdenar.getSelectedIndex() == 0) {
                order = " ORDER BY cod_emprestimo";
            } else if (cbxOrdenar.getSelectedIndex() == 1) {
                order = " ORDER BY data_retirada DESC";
            } else if (cbxOrdenar.getSelectedIndex() == 2) {
                order = " ORDER BY data_devolucao DESC";
            } else if (cbxOrdenar.getSelectedIndex() == 3) {
                order = " ORDER BY devolvido DESC";
            } else if (cbxOrdenar.getSelectedIndex() == 4) {
                order = " ORDER BY cod_usuario";
            } else if (cbxOrdenar.getSelectedIndex() == 5) {
                order = " ORDER BY cod_func";
            } else if (cbxOrdenar.getSelectedIndex() == 6) {
                order = " ORDER BY renovacoes DESC";
            }

            if (!opcoes.isEmpty()) {
                for (String s : opcoes) {
                    sql += s;
                    
                    if (!opcoes.get(opcoes.size() - 1).equals(s)) {
                        sql += " AND ";
                    }
                }
            } else {
                sql = "";
            }
            
            new EmprestimoDAO().popularTabelaBusca(tblEmprestimos, sql, order);
            
            lblTotal.setText(tblEmprestimos.getRowCount() + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema ao consultar empréstimo(s)!");
            System.out.println("Erro: " + e.toString());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void ftfDataInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftfDataInicialMouseClicked
        ftfDataInicial.setForeground(Color.BLACK);
    }//GEN-LAST:event_ftfDataInicialMouseClicked

    private void ftfDataFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftfDataFinalMouseClicked
        ftfDataFinal.setForeground(Color.BLACK);
    }//GEN-LAST:event_ftfDataFinalMouseClicked

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCadastro();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEmprestimoInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestimoInfosActionPerformed
        try {
            String idString = String.valueOf(tblEmprestimos.getValueAt(tblEmprestimos.getSelectedRow(), 0));
            int cod_emprestimo = Integer.parseInt(idString);
            
            idString = String.valueOf(tblEmprestimos.getValueAt(tblEmprestimos.getSelectedRow(), 5));
            int cod_usuario = Integer.parseInt(idString);

            Frame parentFrame = (Frame) SwingUtilities.getAncestorOfClass(Window.class, this);
            DlgEmprestimoInfos dlgEmprestimoInfos = new DlgEmprestimoInfos(parentFrame, true, cod_emprestimo, cod_usuario);
            dlgEmprestimoInfos.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhum empréstimo selecionado.");
            System.out.println("Erro: " + e.toString());
        }
    }//GEN-LAST:event_btnEmprestimoInfosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEmprestimoInfos;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cbxOrdenar;
    private javax.swing.JComboBox<String> cbxSituacao;
    private javax.swing.JFormattedTextField ftfDataFinal;
    private javax.swing.JFormattedTextField ftfDataInicial;
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
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblEmprestimos;
    private javax.swing.JFormattedTextField txfCodEmprestimo;
    private javax.swing.JFormattedTextField txfCodFunc;
    private javax.swing.JFormattedTextField txfCodUsuario;
    // End of variables declaration//GEN-END:variables
}
