/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.FuncionarioDAO;
import javax.swing.JOptionPane;
import entities.Funcionario;
import java.awt.Color;
import utils.EmailValidator;
import utils.Validacao;

/**
 *
 * @author gustavo
 */
public class IfrFuncionario extends javax.swing.JInternalFrame {

    EmailValidator emailValidator = new EmailValidator();
    Validacao validar = new Validacao();
    FuncionarioDAO funcDAO = new FuncionarioDAO();
    Funcionario func = new FuncionarioDAO().getFuncionarioLogado();
    boolean isAdmin = func.getId() == 1;
    int id = 0;

    /**
     * Creates new form IfrFuncionario
     */
    public IfrFuncionario() {
        initComponents();
        setTitle("Funcionário");
        setClosable(true);
        limparCadastro();

        if (!isAdmin) {
            tbpFuncionario.setEnabledAt(1, false);
            btnEditar.setEnabled(false);
            btnNovo.setEnabled(false);
            txfUsuario.setEnabled(false);
            id = func.getId();
            carregarInfosFuncionarioLogado(id);
            hglSenha.setVisible(false);
            hglUsuario.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbpFuncionario = new javax.swing.JTabbedPane();
        pnlCadastro = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txfEmail = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblSituacao = new javax.swing.JLabel();
        txfNome = new javax.swing.JTextField();
        lblSobrenome = new javax.swing.JLabel();
        txfSobrenome = new javax.swing.JTextField();
        cbxSituacao = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txfUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pwfSenha = new javax.swing.JPasswordField();
        hglNome = new javax.swing.JLabel();
        hglSobrenome = new javax.swing.JLabel();
        hglEmail = new javax.swing.JLabel();
        hglUsuario = new javax.swing.JLabel();
        hglSenha = new javax.swing.JLabel();
        lblCamposObrig = new javax.swing.JLabel();
        pnlConsulta = new javax.swing.JPanel();
        lblCriterio = new javax.swing.JLabel();
        txfBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionario = new javax.swing.JTable();
        cbxTipo = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setToolTipText("Insira o sobrenome aqui");

        tbpFuncionario.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tbpFuncionarioStateChanged(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        lblEmail.setText("E-mail:");

        txfEmail.setToolTipText("Insira o e-mail aqui");
        txfEmail.setName("email"); // NOI18N
        txfEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfEmailMouseClicked(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        lblNome.setText("Nome:");

        lblSituacao.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        lblSituacao.setText("Situação:");

        txfNome.setToolTipText("Insira o nome aqui");
        txfNome.setName("nome"); // NOI18N
        txfNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfNomeMouseClicked(evt);
            }
        });

        lblSobrenome.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        lblSobrenome.setText("Sobrenome:");

        txfSobrenome.setToolTipText("Insira o sobrenome aqui");
        txfSobrenome.setName("sobrenome"); // NOI18N
        txfSobrenome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfSobrenomeMouseClicked(evt);
            }
        });

        cbxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        jLabel1.setText("Usuário:");

        txfUsuario.setName("usuario"); // NOI18N
        txfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfUsuarioMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        jLabel2.setText("Senha:");

        pwfSenha.setName("senha"); // NOI18N
        pwfSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pwfSenhaMouseClicked(evt);
            }
        });

        hglNome.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        hglNome.setForeground(new java.awt.Color(255, 0, 0));
        hglNome.setText("*");

        hglSobrenome.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        hglSobrenome.setForeground(new java.awt.Color(255, 0, 0));
        hglSobrenome.setText("*");

        hglEmail.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        hglEmail.setForeground(new java.awt.Color(255, 0, 0));
        hglEmail.setText("*");

        hglUsuario.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        hglUsuario.setForeground(new java.awt.Color(255, 0, 0));
        hglUsuario.setText("*");

        hglSenha.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        hglSenha.setForeground(new java.awt.Color(255, 0, 0));
        hglSenha.setText("*");

        lblCamposObrig.setText("* Campo obrigatório");

        javax.swing.GroupLayout pnlCadastroLayout = new javax.swing.GroupLayout(pnlCadastro);
        pnlCadastro.setLayout(pnlCadastroLayout);
        pnlCadastroLayout.setHorizontalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCamposObrig)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(lblSobrenome)
                            .addComponent(lblNome)
                            .addComponent(lblEmail)
                            .addComponent(lblSituacao))
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txfUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hglNome)
                    .addComponent(hglSobrenome)
                    .addComponent(hglEmail)
                    .addComponent(hglUsuario)
                    .addComponent(hglSenha))
                .addGap(52, 52, 52))
        );
        pnlCadastroLayout.setVerticalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hglNome))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSobrenome)
                    .addComponent(txfSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hglSobrenome))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hglEmail))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hglUsuario))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pwfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hglSenha))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSituacao)
                    .addComponent(cbxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(lblCamposObrig))
        );

        tbpFuncionario.addTab("Cadastro", pnlCadastro);

        lblCriterio.setText("Critério:");

        btnBuscar.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/loupe.png")); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Nome", "Sobrenome", "Email", "Usuário", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblFuncionario.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblFuncionario);
        if (tblFuncionario.getColumnModel().getColumnCount() > 0) {
            tblFuncionario.getColumnModel().getColumn(0).setMinWidth(50);
            tblFuncionario.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblFuncionario.getColumnModel().getColumn(0).setMaxWidth(50);
            tblFuncionario.getColumnModel().getColumn(1).setMinWidth(60);
            tblFuncionario.getColumnModel().getColumn(1).setPreferredWidth(60);
            tblFuncionario.getColumnModel().getColumn(1).setMaxWidth(60);
            tblFuncionario.getColumnModel().getColumn(2).setMinWidth(90);
            tblFuncionario.getColumnModel().getColumn(2).setPreferredWidth(90);
            tblFuncionario.getColumnModel().getColumn(2).setMaxWidth(90);
            tblFuncionario.getColumnModel().getColumn(4).setMinWidth(80);
            tblFuncionario.getColumnModel().getColumn(4).setPreferredWidth(80);
            tblFuncionario.getColumnModel().getColumn(4).setMaxWidth(80);
            tblFuncionario.getColumnModel().getColumn(5).setMinWidth(80);
            tblFuncionario.getColumnModel().getColumn(5).setPreferredWidth(80);
            tblFuncionario.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Sobrenome" }));

        lblTipo.setText("Tipo:");

        javax.swing.GroupLayout pnlConsultaLayout = new javax.swing.GroupLayout(pnlConsulta);
        pnlConsulta.setLayout(pnlConsultaLayout);
        pnlConsultaLayout.setHorizontalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlConsultaLayout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addGap(18, 18, 18)
                        .addComponent(cbxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCriterio)
                        .addGap(18, 18, 18)
                        .addComponent(txfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        pnlConsultaLayout.setVerticalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCriterio)
                    .addComponent(txfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tbpFuncionario.addTab("Consulta", pnlConsulta);

        btnEditar.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/edit.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/delete.png")); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
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
            .addComponent(tbpFuncionario)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbpFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCadastro() {
        txfNome.setText("");
        txfSobrenome.setText("");
        txfEmail.setText("");
        txfUsuario.setText("");
        pwfSenha.setText("");
        id = 0;
        txfUsuario.setEnabled(true);
        hglUsuario.setVisible(true);
        hglSenha.setVisible(true);

        tbpFuncionario.setSelectedIndex(0);

        txfNome.requestFocus();
    }

    private void carregarInfosFuncionarioLogado(int id) {
        func = funcDAO.consultarId(id);

        txfNome.setText(func.getNome());
        txfSobrenome.setText(func.getSobrenome());
        txfEmail.setText(func.getEmail());
        txfUsuario.setText(func.getUsuario());
        pwfSenha.setText("");

        if (func.getSituacao().equals("ativo")) {
            cbxSituacao.setSelectedIndex(0);
        } else if (func.getSituacao().equals("inativo")) {
            cbxSituacao.setSelectedIndex(1);
        }
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (cbxTipo.getSelectedItem().toString().equals("Nome")) {
            new FuncionarioDAO().popularTabela(tblFuncionario, txfBusca.getText(), "nome");
        } else if (cbxTipo.getSelectedItem().toString().equals("Sobrenome"))
            new FuncionarioDAO().popularTabela(tblFuncionario, txfBusca.getText(), "sobrenome");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            String idString = String.valueOf(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 0));

            id = Integer.parseInt(idString);

            func = new FuncionarioDAO().consultarId(id);

            tbpFuncionario.setSelectedIndex(0);

            carregarInfosFuncionarioLogado(id);
            txfUsuario.setEnabled(false);

            hglSenha.setVisible(false);
            hglUsuario.setVisible(false);

            btnExcluir.setEnabled(false);

            if (func.getSituacao().equals("ativo")) {
                cbxSituacao.setSelectedIndex(0);
            } else if (func.getSituacao().equals("inativo")) {
                cbxSituacao.setSelectedIndex(1);
            }

            txfNome.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhum funcionário selecionado.");
            System.out.println("Erro: " + e.toString());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            func = new Funcionario();

            String idString = String.valueOf(tblFuncionario
                    .getValueAt(tblFuncionario.getSelectedRow(), 0));
            id = Integer.parseInt(idString);

            func = funcDAO.consultarId(id);

            if (func.getSituacao().equals("inativo")) {
                JOptionPane.showMessageDialog(null, "Este registro já está inativo!");
            } else if (func.getId() == 1) {
                JOptionPane.showMessageDialog(null, "Você não pode excluir o admin!");
            } else {
                int opcao = JOptionPane.showConfirmDialog(null, "Desejar realmente excluir?");

                System.out.println("Opção = " + opcao);

                if (opcao == JOptionPane.OK_OPTION) {

                    String retorno = new FuncionarioDAO().excluir(id);

                    if (retorno == null) {
                        JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
                        new FuncionarioDAO().popularTabela(tblFuncionario, "", "nome");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ops, problemas ao excluir registro.");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhum funcionário selecionado.");
            System.out.println("Erro: " + e.toString());
        }


    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String usuarioLogado = funcDAO.getFuncionarioLogado()
                .getUsuario().toString();
        String retorno = null;

        String nome = txfNome.getText().trim();
        String sobrenome = txfSobrenome.getText().trim();
        String email = txfEmail.getText().trim();
        String usuario = txfUsuario.getText().trim();
        char[] getSenha = pwfSenha.getPassword();
        String senha = String.valueOf(getSenha);
        String situacao = cbxSituacao.getSelectedItem().toString().toLowerCase();

        func = new Funcionario();

        func.setId(id);
        func.setNome(nome);
        func.setSobrenome(sobrenome);
        func.setEmail(email);
        func.setUsuario(usuario);
        func.setSenha(senha);
        func.setSituacao(situacao);

        // VALIDAÇÃO DE CAMPOS EM BRANCO
        if (nome.isEmpty()
                || sobrenome.isEmpty()
                || email.isEmpty()
                || usuario.isEmpty()
                || (id == 0 && senha.isEmpty())) {
            pnlCadastro.setVisible(true);
            tbpFuncionario.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!");
            return;
        }

        // VALIDAÇÃO DE CAMPOS INVÁLIDOS
        if (validar.validarNome(nome) == false
                || validar.validarNome(sobrenome) == false
                || emailValidator.validate(email) == false) {

            if (validar.validarNome(nome) == false) {
                txfNome.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "Digite um nome válido!");
                txfNome.requestFocus();
            }

            if (validar.validarNome(sobrenome) == false) {
                txfSobrenome.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "Digite um sobrenome válido!");
                txfSobrenome.requestFocus();
            }

            if (emailValidator.validate(email) == false) {
                txfEmail.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "Digite um e-mail válido!");
                txfEmail.requestFocus();
            }

            return;
        }

        // VALIDAçÃO DE EMAIL E USUARIO JÁ CADASTRADOS
        if (funcDAO.emailExiste(email, id)) {
            txfEmail.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "O endereço de e-mail informado já está cadastrado no sistema!");
            txfEmail.requestFocus();
            return;
        }

        if (funcDAO.usuarioExiste(usuario, id)) {
            txfUsuario.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Este usuário já existe!");
            txfUsuario.requestFocus();
            return;
        }

        if (id != 0) {
            retorno = funcDAO.atualizar(func);

        } else {
            retorno = funcDAO.salvar(func);
        }

        // APÓS SALVAR/ATUALIZAR, LIMPA OS CAMPOS DO CADASTRO
        if (retorno == null) {
            if (isAdmin && id == 0) {
                JOptionPane.showMessageDialog(null, "Funcionário salvo com sucesso!");
                limparCadastro();
            }

            if (!isAdmin || id != 0) {
                JOptionPane.showMessageDialog(null, "Informações atualizadas com sucesso!");
                carregarInfosFuncionarioLogado(id);
            }

            funcDAO.popularTabela(tblFuncionario, "", "nome");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limparCadastro();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void tbpFuncionarioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tbpFuncionarioStateChanged
        btnExcluir.setEnabled(false);

        if (tbpFuncionario.getSelectedIndex() == 1) {
            btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_tbpFuncionarioStateChanged

    private void txfNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfNomeMouseClicked
        txfNome.setForeground(Color.black);
    }//GEN-LAST:event_txfNomeMouseClicked

    private void txfSobrenomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfSobrenomeMouseClicked
        txfSobrenome.setForeground(Color.black);
    }//GEN-LAST:event_txfSobrenomeMouseClicked

    private void txfEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfEmailMouseClicked
        txfEmail.setForeground(Color.black);
    }//GEN-LAST:event_txfEmailMouseClicked

    private void txfUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfUsuarioMouseClicked
        txfUsuario.setForeground(Color.black);
    }//GEN-LAST:event_txfUsuarioMouseClicked

    private void pwfSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwfSenhaMouseClicked
        pwfSenha.setForeground(Color.black);
    }//GEN-LAST:event_pwfSenhaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxSituacao;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel hglEmail;
    private javax.swing.JLabel hglNome;
    private javax.swing.JLabel hglSenha;
    private javax.swing.JLabel hglSobrenome;
    private javax.swing.JLabel hglUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCamposObrig;
    private javax.swing.JLabel lblCriterio;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JPasswordField pwfSenha;
    private javax.swing.JTable tblFuncionario;
    private javax.swing.JTabbedPane tbpFuncionario;
    private javax.swing.JTextField txfBusca;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JTextField txfNome;
    private javax.swing.JTextField txfSobrenome;
    private javax.swing.JTextField txfUsuario;
    // End of variables declaration//GEN-END:variables
}
