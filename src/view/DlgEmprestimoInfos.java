/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.EmprestimoDAO;
import dao.EmprestimoExemplarDAO;
import dao.FuncionarioDAO;
import dao.MultaDAO;
import dao.UsuarioDAO;
import entities.Emprestimo;
import entities.Funcionario;
import entities.Multa;
import entities.Usuario;

/**
 *
 * @author Gustavo Martini
 */
public class DlgEmprestimoInfos extends javax.swing.JDialog {

    Emprestimo emprestimo;

    /**
     * Creates new form DlgEmprestimoInfos
     */
    public DlgEmprestimoInfos(java.awt.Frame parent, boolean modal, int cod_emprestimo, int cod_usuario) {
        super(parent, modal);
        initComponents();
        setTitle("Informações de empréstimo");
        setLocationRelativeTo(parent);
        setResizable(false);

        emprestimo = new EmprestimoDAO().consultarId(cod_emprestimo);
        Usuario usuario = new UsuarioDAO().consultarId(cod_usuario);
        
        String nomeUsuario = usuario.getNome() + " " + usuario.getSobrenome();
        Funcionario func = new FuncionarioDAO().consultarId(emprestimo.getCod_func());
        String nomeFunc = func.getNome() + " " + func.getSobrenome();
        String data_devolucao = emprestimo.getData_devolucao() == null
                ? "" : emprestimo.getData_devolucao();
        String devolvido = emprestimo.isDevolvido() ? "Devolvido" : "Pendente";
        
        boolean pendente = new MultaDAO().consultar(usuario.getId());
        if (pendente) {
            Multa multa = new MultaDAO().consultarId(emprestimo.getId() + "");
            lblMulta.setText("R$ " + multa.getValor());
        } else {
            lblMulta.setText("Sem multa");
        }

        lblCodEmprestimo.setText(cod_emprestimo + "");
        lblUsuario.setText(nomeUsuario);
        lblFuncionario.setText(nomeFunc);
        lblDataRetirada.setText(emprestimo.getData_retirada());
        lblDataDevolucao.setText(emprestimo.getData_devolucao());
        lblDataDevolvido.setText(emprestimo.getData_devolvido());
        lblRenovacoes.setText(emprestimo.getRenovacoes() + "");
        lblDevolvido.setText(devolvido);

        new EmprestimoExemplarDAO().popularTabela(tblExemplares, cod_emprestimo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExemplares = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCodEmprestimo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblFuncionario = new javax.swing.JLabel();
        lblDataRetirada = new javax.swing.JLabel();
        lblDataDevolucao = new javax.swing.JLabel();
        lblRenovacoes = new javax.swing.JLabel();
        lblDevolvido = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblMulta = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblDataDevolvido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSair.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/close.png")); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        tblExemplares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Título"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblExemplares);
        if (tblExemplares.getColumnModel().getColumnCount() > 0) {
            tblExemplares.getColumnModel().getColumn(0).setMinWidth(70);
            tblExemplares.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblExemplares.getColumnModel().getColumn(0).setMaxWidth(70);
        }

        jLabel1.setText("Exemplares:");

        jLabel2.setText("Usuário:");

        jLabel3.setText("Cód. Empréstimo:");

        jLabel4.setText("Data retirada:");

        jLabel5.setText("Data devolução:");

        jLabel6.setText("Renovações:");

        jLabel7.setText("Devolvido:");

        jLabel8.setText("Funcionário:");

        lblCodEmprestimo.setText(" ");

        lblUsuario.setText(" ");

        lblFuncionario.setText(" ");

        lblDataRetirada.setText(" ");

        lblDataDevolucao.setText(" ");

        lblRenovacoes.setText(" ");

        lblDevolvido.setText(" ");

        jLabel9.setText("Multa:");

        lblMulta.setText(" ");

        jLabel10.setText("Data devolvido:");

        lblDataDevolvido.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCodEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDataRetirada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDataDevolucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDataDevolvido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblRenovacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDevolvido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMulta, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(lblCodEmprestimo)
                    .addComponent(lblRenovacoes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(lblUsuario)
                    .addComponent(lblDevolvido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblFuncionario)
                    .addComponent(jLabel9)
                    .addComponent(lblMulta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblDataRetirada))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblDataDevolucao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblDataDevolvido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnSair)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(DlgEmprestimoInfos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgEmprestimoInfos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgEmprestimoInfos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgEmprestimoInfos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgEmprestimoInfos dialog = new DlgEmprestimoInfos(new javax.swing.JFrame(), true, 0, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodEmprestimo;
    private javax.swing.JLabel lblDataDevolucao;
    private javax.swing.JLabel lblDataDevolvido;
    private javax.swing.JLabel lblDataRetirada;
    private javax.swing.JLabel lblDevolvido;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblMulta;
    private javax.swing.JLabel lblRenovacoes;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblExemplares;
    // End of variables declaration//GEN-END:variables
}
