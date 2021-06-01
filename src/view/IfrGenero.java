/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.GeneroDAO;
import javax.swing.JOptionPane;
import entities.Genero;
import java.awt.Color;
import utils.Validacao;

/**
 *
 * @author gustavo
 */
public class IfrGenero extends javax.swing.JInternalFrame {

    GeneroDAO generoDAO = new GeneroDAO();
    Genero gnr = null;
    int id = 0;

    /**
     * Creates new form IfrAutor
     */
    public IfrGenero() {
        initComponents();
        setTitle("Gênero");
        setClosable(true);
        limparCadastro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbpGenero = new javax.swing.JTabbedPane();
        pnlCadastro = new javax.swing.JPanel();
        lblGenero = new javax.swing.JLabel();
        txfGenero = new javax.swing.JTextField();
        hglNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlConsulta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txfBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGenero = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        tbpGenero.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tbpGeneroStateChanged(evt);
            }
        });

        lblGenero.setText("Gênero:");

        txfGenero.setName("nome"); // NOI18N
        txfGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfGeneroMouseClicked(evt);
            }
        });

        hglNome.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        hglNome.setForeground(new java.awt.Color(255, 0, 51));
        hglNome.setText("*");

        jLabel2.setText("* Campo obrigatório");

        javax.swing.GroupLayout pnlCadastroLayout = new javax.swing.GroupLayout(pnlCadastro);
        pnlCadastro.setLayout(pnlCadastroLayout);
        pnlCadastroLayout.setHorizontalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroLayout.createSequentialGroup()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addContainerGap(403, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblGenero)
                        .addGap(18, 18, 18)
                        .addComponent(txfGenero)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hglNome)
                .addGap(52, 52, 52))
        );
        pnlCadastroLayout.setVerticalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(txfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hglNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        tbpGenero.addTab("Cadastro", pnlCadastro);

        jLabel1.setText("Critério:");

        btnBuscar.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/loupe.png")); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblGenero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Gênero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblGenero.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblGenero);
        if (tblGenero.getColumnModel().getColumnCount() > 0) {
            tblGenero.getColumnModel().getColumn(0).setMinWidth(50);
            tblGenero.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblGenero.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout pnlConsultaLayout = new javax.swing.GroupLayout(pnlConsulta);
        pnlConsulta.setLayout(pnlConsultaLayout);
        pnlConsultaLayout.setHorizontalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txfBusca)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlConsultaLayout.setVerticalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbpGenero.addTab("Consulta", pnlConsulta);

        btnExcluir.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/delete.png")); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/edit.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/floppy-disk.png")); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/new.png")); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(60, 60, 60))
            .addComponent(tbpGenero)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbpGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCadastro() {
        txfGenero.setText("");
        txfGenero.requestFocus();
        id = 0;
        tbpGenero.setSelectedIndex(0);
    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        gnr = new Genero();
        gnr.setId(id);

        Validacao validar = new Validacao();
        String genero = txfGenero.getText().trim();

        String retorno = null;

        // valida campo em branco
        if (genero.isEmpty()) {
            pnlCadastro.setVisible(true);
            tbpGenero.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, "Preencha o campo gênero!");
            txfGenero.requestFocus();
            return;
        }

        // valida a escrita
        if (validar.validarNome(genero) == false) {
            txfGenero.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Digite uma gênero válida!");
            txfGenero.requestFocus();
            return;
        }
        
        // valida a existencia de registro
        if (generoDAO.generoExistente(genero, id)) {
            txfGenero.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Este gênero já existe!");
            txfGenero.requestFocus();
            return;
        }

        gnr.setGenero(genero);        
        
        if (gnr.getId() == 0) {
            retorno = generoDAO.salvar(gnr);
        } else {
            retorno = generoDAO.atualizar(gnr);
        }

        if (retorno == null) {
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");

            limparCadastro();

            generoDAO.popularTabela(tblGenero, "");
        } else {
            JOptionPane.showMessageDialog(null, "Problemas ao salvar registro!\n\n"
                    + "Mensagem técnica:\n"
                    + "Erro: " + retorno);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            String idString = String.valueOf(tblGenero.getValueAt(tblGenero.getSelectedRow(), 0));

            id = Integer.parseInt(idString);

            gnr = generoDAO.consultarId(id);

            tbpGenero.setSelectedIndex(0);

            txfGenero.setText(gnr.getGenero());

            txfGenero.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhum gênero selecionad.");
            System.out.println("Erro: " + e.toString());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            gnr = new Genero();

            String idString = String.valueOf(tblGenero.getValueAt(tblGenero.getSelectedRow(), 0));
            id = Integer.parseInt(idString);

            gnr = generoDAO.consultarId(id);

            int opcao = JOptionPane.showConfirmDialog(null, "Desejar realmente excluir?");

            System.out.println("Opção = " + opcao);

            if (opcao == JOptionPane.OK_OPTION) {

                String retorno = generoDAO.excluir(id);

                if (retorno == null) {
                    JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
                    generoDAO.popularTabela(tblGenero, "");
                } else {
                    JOptionPane.showMessageDialog(null, "Ops, problemas ao excluir registro.");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhum gênero selecionado.");
            System.out.println("Erro: " + e.toString());
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        generoDAO.popularTabela(tblGenero, txfBusca.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limparCadastro();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void tbpGeneroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tbpGeneroStateChanged
        btnExcluir.setEnabled(false);

        if (tbpGenero.getSelectedIndex() == 1) {
            btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_tbpGeneroStateChanged

    private void txfGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfGeneroMouseClicked
        txfGenero.setForeground(Color.black);
    }//GEN-LAST:event_txfGeneroMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel hglNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JTable tblGenero;
    private javax.swing.JTabbedPane tbpGenero;
    private javax.swing.JTextField txfBusca;
    private javax.swing.JTextField txfGenero;
    // End of variables declaration//GEN-END:variables
}
