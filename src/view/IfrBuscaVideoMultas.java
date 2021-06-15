/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.MultaDAO;
import dao.UsuarioDAO;
import entities.Usuario;
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
public class IfrBuscaVideoMultas extends javax.swing.JInternalFrame {

    int cod_usuario = 0;
    int cod_emprestimo = 0;
    int cod_multa = 0;

    /**
     * Creates new form IfrBuscaVideo
     */
    public IfrBuscaVideoMultas() {
        initComponents();
        setTitle("Consultar Multas");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMultas = new javax.swing.JTable();
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
        jLabel10 = new javax.swing.JLabel();
        cbxOrdenar = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txfCodEmprestimo = new javax.swing.JFormattedTextField();
        txfUsuario = new javax.swing.JTextField();
        btnBuscarUsuario = new javax.swing.JButton();
        chbDesc = new javax.swing.JCheckBox();
        lblValorTotal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        txfCodMulta = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();

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

        tblMultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "Nome", "Sobrenome", "Multa", "Valor", "Pago", "Data Pgto", "Emprestimo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblMultas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblMultas);
        if (tblMultas.getColumnModel().getColumnCount() > 0) {
            tblMultas.getColumnModel().getColumn(0).setMinWidth(70);
            tblMultas.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblMultas.getColumnModel().getColumn(0).setMaxWidth(70);
            tblMultas.getColumnModel().getColumn(3).setMinWidth(70);
            tblMultas.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblMultas.getColumnModel().getColumn(3).setMaxWidth(70);
            tblMultas.getColumnModel().getColumn(7).setMinWidth(100);
            tblMultas.getColumnModel().getColumn(7).setPreferredWidth(100);
            tblMultas.getColumnModel().getColumn(7).setMaxWidth(100);
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

        jLabel5.setText("Total de multas:");

        lblTotal.setText("0");

        jLabel1.setText("Data pagamento:");

        jLabel6.setText("Situação:");

        cbxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Pago", "Pendente" }));

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel7.setText("Lista de multas");

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel8.setText("Opções de busca");

        jLabel9.setText("Usuário:");

        jLabel10.setText("Ordernar por:");

        cbxOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código Usuário", "Código Multa", "Código Empréstimo", "Nome", "Sobrenome", "Valor", "Data Pgto" }));

        jLabel11.setText("Cód. Empréstimo:");

        txfCodEmprestimo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txfUsuario.setEditable(false);

        btnBuscarUsuario.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/loupe.png")); // NOI18N
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        chbDesc.setText("Desc.");

        lblValorTotal.setText("R$ 0.00");

        jLabel12.setText("Valor total:");

        btnSair.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/close.png")); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txfCodMulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel13.setText("Cód. Multa:");

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
                            .addGap(18, 18, 18)
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSair))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnBuscar)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(ftfDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(ftfDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel9))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                                .addComponent(cbxOrdenar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                                .addComponent(chbDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel13))))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbxSituacao, javax.swing.GroupLayout.Alignment.TRAILING, 0, 160, Short.MAX_VALUE)
                                .addComponent(txfCodEmprestimo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txfCodMulta)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ftfDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ftfDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(cbxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(cbxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chbDesc)
                                    .addComponent(jLabel13)
                                    .addComponent(txfCodMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txfCodEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(btnLimpar))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblTotal)
                            .addComponent(jLabel12)
                            .addComponent(lblValorTotal)
                            .addComponent(btnSair)))
                    .addComponent(jLabel11))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCadastro() {
        ftfDataInicial.setText("");
        ftfDataFinal.setText("");
        txfUsuario.setText("");
        txfCodEmprestimo.setText("");
        txfCodMulta.setText("");
        cbxSituacao.setSelectedIndex(0);
        cbxOrdenar.setSelectedIndex(0);
        lblTotal.setText("0");
        lblValorTotal.setText("R$ 0.00");

        cod_usuario = 0;
        cod_emprestimo = 0;
        cod_multa = 0;

        new MultaDAO().popularTabelaBusca(tblMultas, "WHERE u.cod_usuario = 0", " ORDER BY u.cod_usuario");
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            ArrayList<String> opcoes = new ArrayList<>();
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
                    opcoes.add("m.data_pgto >= '" + Data.changeFormat(data_inicial) + "'");
                }
            }

            if (!data_final.isEmpty()) {
                if (!val.validarDataFormatada(data_final)) {
                    JOptionPane.showMessageDialog(null, "Insira data final válida!");
                    ftfDataFinal.setForeground(Color.red);
                    ftfDataFinal.requestFocus();
                    return;
                } else {
                    opcoes.add("m.data_pgto <= '" + Data.changeFormat(data_final) + "'");
                }
            }

            if (!data_inicial.isEmpty() && !data_final.isEmpty()) {
                if (Data.compareDates(Data.stringToDate(data_inicial), Data.stringToDate(data_final)) < 0) {
                    JOptionPane.showMessageDialog(null, "A data final precisa ser maior que a data inicial!");
                    return;
                }
            }

            if (cod_usuario != 0) {
                opcoes.add("u.cod_usuario = " + cod_usuario);
            }

            if (!txfCodEmprestimo.getText().isEmpty()) {
                cod_emprestimo = Integer.parseInt(txfCodEmprestimo.getText());
                opcoes.add("m.cod_emprestimo = " + cod_emprestimo);
            }

            if (!txfCodMulta.getText().isEmpty()) {
                cod_multa = Integer.parseInt(txfCodMulta.getText());
                opcoes.add("m.cod_multa = " + cod_multa);
            }

            if (cbxSituacao.getSelectedIndex() == 1) {
                opcoes.add("m.pago = true");
            } else if (cbxSituacao.getSelectedIndex() == 2) {
                opcoes.add("m.pago = false");
            }

            /*
            Código Usuário
            Código Multa
            Código Empréstimo
            Nome
            Sobrenome
            Valor
            Data Pgto
             */
            if (cbxOrdenar.getSelectedIndex() == 0) {
                order = " ORDER BY u.cod_usuario";
            } else if (cbxOrdenar.getSelectedIndex() == 1) {
                order = " ORDER BY m.cod_multa";
            } else if (cbxOrdenar.getSelectedIndex() == 2) {
                order = " ORDER BY m.cod_emprestimo";
            } else if (cbxOrdenar.getSelectedIndex() == 3) {
                order = " ORDER BY u.nome";
            } else if (cbxOrdenar.getSelectedIndex() == 4) {
                order = " ORDER BY u.sobrenome";
            } else if (cbxOrdenar.getSelectedIndex() == 5) {
                order = " ORDER BY m.valor";
            } else if (cbxOrdenar.getSelectedIndex() == 6) {
                order = " ORDER BY m.data_pgto";
            }

            if (chbDesc.isSelected()) {
                order += " DESC";
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

            new MultaDAO().popularTabelaBusca(tblMultas, sql, order);

            double valorTotal = 0;

            for (int i = 0; i < tblMultas.getRowCount(); i++) {
                String idString = String.valueOf(tblMultas.getValueAt(i, 4));
                double valor = Double.parseDouble(idString);
                
                valorTotal += valor;
            }
            
            lblValorTotal.setText("R$ " + valorTotal);

            lblTotal.setText(tblMultas.getRowCount() + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema ao consultar multa(s)!");
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

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        Frame parentFrame = (Frame) SwingUtilities.getAncestorOfClass(Window.class, this);
        DlgBuscaUsuario dlgBuscaUsuario = new DlgBuscaUsuario(parentFrame, true);
        dlgBuscaUsuario.setVisible(true);

        try {
            cod_usuario = dlgBuscaUsuario.cod_usuario;
            Usuario usuario = new UsuarioDAO().consultarId(cod_usuario);
            txfUsuario.setText(usuario.getId() + " - " + usuario.getNome() + " " + usuario.getSobrenome());
        } catch (Exception e) {
            System.out.println("Erro: " + e.toString());
        }
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxOrdenar;
    private javax.swing.JComboBox<String> cbxSituacao;
    private javax.swing.JCheckBox chbDesc;
    private javax.swing.JFormattedTextField ftfDataFinal;
    private javax.swing.JFormattedTextField ftfDataInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JTable tblMultas;
    private javax.swing.JFormattedTextField txfCodEmprestimo;
    private javax.swing.JFormattedTextField txfCodMulta;
    private javax.swing.JTextField txfUsuario;
    // End of variables declaration//GEN-END:variables
}
