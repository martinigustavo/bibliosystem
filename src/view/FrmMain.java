/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.FuncionarioDAO;
import javax.swing.JInternalFrame;
import reports.ReportsGenerator;

/**
 *
 * @author gustavo
 */
public class FrmMain extends javax.swing.JFrame {

    private JInternalFrame[] allFrames;

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {

        initComponents();
        setTitle("BiblioSystem™: Library Management Software");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        lblFuncionario.setText(new FuncionarioDAO().getFuncionarioLogado()
                .getNome().toUpperCase());
    }

    private boolean contemFrame(JInternalFrame newframe) {
        this.allFrames = dkpMain.getAllFrames();

        String newframeTitle = newframe.getTitle();

        for (JInternalFrame frame : allFrames) {

            String frameTitle = frame.getTitle();

            if (frameTitle == newframeTitle) {
                try {
                    frame.toFront();
                    frame.setSelected(true);
                    frame.setLocation(0, 0);
                } catch (Exception ex) {
                    System.out.println("Erro: " + ex.getMessage());
                }

                return true;
            }
        }

        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpMain = new javax.swing.JDesktopPane();
        lblFuncionario = new javax.swing.JLabel();
        mnbMain = new javax.swing.JMenuBar();
        mnuCadastros = new javax.swing.JMenu();
        mnuLivros = new javax.swing.JMenu();
        mniLivro = new javax.swing.JMenuItem();
        mniAutor = new javax.swing.JMenuItem();
        mniEditora = new javax.swing.JMenuItem();
        mniGenero = new javax.swing.JMenuItem();
        mniPerfil = new javax.swing.JMenuItem();
        mnuUsuarios = new javax.swing.JMenu();
        mniLeitor = new javax.swing.JMenuItem();
        mniFuncionario = new javax.swing.JMenuItem();
        mnuEmprestimos = new javax.swing.JMenu();
        mniEmprestimoNovo = new javax.swing.JMenuItem();
        mniEmprestimoDevolucao = new javax.swing.JMenuItem();
        mniConsultarEmprestimos = new javax.swing.JMenuItem();
        mnuRelatorios = new javax.swing.JMenu();
        mniRelatorioLivrosCadastrados = new javax.swing.JMenuItem();
        mniRelatorioUsuariosCadastrados = new javax.swing.JMenuItem();
        mniRelatorioLivros = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1621, 1000));

        dkpMain.setBackground(new java.awt.Color(100, 209, 160));
        dkpMain.setPreferredSize(new java.awt.Dimension(1024, 576));

        lblFuncionario.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 16)); // NOI18N
        lblFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        lblFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFuncionario.setText("FUNCIONÁRIO");
        lblFuncionario.setToolTipText("");

        dkpMain.setLayer(lblFuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkpMainLayout = new javax.swing.GroupLayout(dkpMain);
        dkpMain.setLayout(dkpMainLayout);
        dkpMainLayout.setHorizontalGroup(
            dkpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1415, Short.MAX_VALUE))
        );
        dkpMainLayout.setVerticalGroup(
            dkpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dkpMainLayout.createSequentialGroup()
                .addContainerGap(914, Short.MAX_VALUE)
                .addComponent(lblFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mnuCadastros.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/add48.png")); // NOI18N
        mnuCadastros.setText("Cadastros");

        mnuLivros.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/books48.png")); // NOI18N
        mnuLivros.setText("Livros");
        mnuLivros.setToolTipText("Cadastro e consulta de livros");

        mniLivro.setText("Livro");
        mniLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLivroActionPerformed(evt);
            }
        });
        mnuLivros.add(mniLivro);

        mniAutor.setText("Autor");
        mniAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAutorActionPerformed(evt);
            }
        });
        mnuLivros.add(mniAutor);

        mniEditora.setText("Editora");
        mniEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEditoraActionPerformed(evt);
            }
        });
        mnuLivros.add(mniEditora);

        mniGenero.setText("Gênero");
        mniGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGeneroActionPerformed(evt);
            }
        });
        mnuLivros.add(mniGenero);

        mniPerfil.setText("Perfil");
        mniPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPerfilActionPerformed(evt);
            }
        });
        mnuLivros.add(mniPerfil);

        mnuCadastros.add(mnuLivros);

        mnuUsuarios.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/user48.png")); // NOI18N
        mnuUsuarios.setText("Usuários");

        mniLeitor.setText("Leitor");
        mniLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLeitorActionPerformed(evt);
            }
        });
        mnuUsuarios.add(mniLeitor);

        mniFuncionario.setText("Funcionário");
        mniFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniFuncionarioActionPerformed(evt);
            }
        });
        mnuUsuarios.add(mniFuncionario);

        mnuCadastros.add(mnuUsuarios);

        mnbMain.add(mnuCadastros);

        mnuEmprestimos.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/book_exchange48.png")); // NOI18N
        mnuEmprestimos.setText("Empréstimos");

        mniEmprestimoNovo.setText("Novo Empréstimo");
        mniEmprestimoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEmprestimoNovoActionPerformed(evt);
            }
        });
        mnuEmprestimos.add(mniEmprestimoNovo);

        mniEmprestimoDevolucao.setText("Devolver / Renovar");
        mniEmprestimoDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEmprestimoDevolucaoActionPerformed(evt);
            }
        });
        mnuEmprestimos.add(mniEmprestimoDevolucao);

        mniConsultarEmprestimos.setText("Consultar Empréstimos");
        mniConsultarEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConsultarEmprestimosActionPerformed(evt);
            }
        });
        mnuEmprestimos.add(mniConsultarEmprestimos);

        mnbMain.add(mnuEmprestimos);

        mnuRelatorios.setIcon(new javax.swing.ImageIcon("/home/gustavo/NetBeansProjects/Biblioteca/icons/pie-chart48.png")); // NOI18N
        mnuRelatorios.setText("Relatórios");

        mniRelatorioLivrosCadastrados.setText("Todos livros cadastrados");
        mniRelatorioLivrosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelatorioLivrosCadastradosActionPerformed(evt);
            }
        });
        mnuRelatorios.add(mniRelatorioLivrosCadastrados);

        mniRelatorioUsuariosCadastrados.setText("Todos usuários cadastrados");
        mniRelatorioUsuariosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelatorioUsuariosCadastradosActionPerformed(evt);
            }
        });
        mnuRelatorios.add(mniRelatorioUsuariosCadastrados);

        mniRelatorioLivros.setText("Livros por categoria");
        mniRelatorioLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelatorioLivrosActionPerformed(evt);
            }
        });
        mnuRelatorios.add(mniRelatorioLivros);

        mnbMain.add(mnuRelatorios);

        setJMenuBar(mnbMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1621, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPerfilActionPerformed
        IfrPerfil ifrPerfil = new IfrPerfil();
        if (!contemFrame(ifrPerfil)) {
            dkpMain.add(ifrPerfil);
            ifrPerfil.setVisible(true);
        }
    }//GEN-LAST:event_mniPerfilActionPerformed

    private void mniGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGeneroActionPerformed
        IfrGenero ifrGenero = new IfrGenero();
        if (!contemFrame(ifrGenero)) {
            dkpMain.add(ifrGenero);
            ifrGenero.setVisible(true);
        }
    }//GEN-LAST:event_mniGeneroActionPerformed

    private void mniEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEditoraActionPerformed
        IfrEditora ifrEditora = new IfrEditora();
        if (!contemFrame(ifrEditora)) {
            dkpMain.add(ifrEditora);
            ifrEditora.setVisible(true);
        }
    }//GEN-LAST:event_mniEditoraActionPerformed

    private void mniAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAutorActionPerformed
        IfrAutor ifrAutor = new IfrAutor();
        if (!contemFrame(ifrAutor)) {
            dkpMain.add(ifrAutor);
            ifrAutor.setVisible(true);
        }
    }//GEN-LAST:event_mniAutorActionPerformed

    private void mniLeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLeitorActionPerformed
        IfrUsuario ifrUsuario = new IfrUsuario();
        if (!contemFrame(ifrUsuario)) {
            dkpMain.add(ifrUsuario);
            ifrUsuario.setVisible(true);
        }
    }//GEN-LAST:event_mniLeitorActionPerformed

    private void mniLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLivroActionPerformed
        IfrLivro ifrLivro = new IfrLivro();
        if (!contemFrame(ifrLivro)) {
            dkpMain.add(ifrLivro);
            ifrLivro.setVisible(true);
        }
    }//GEN-LAST:event_mniLivroActionPerformed

    private void mniFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFuncionarioActionPerformed
        IfrFuncionario ifrFuncionario = new IfrFuncionario();
        if (!contemFrame(ifrFuncionario)) {
            dkpMain.add(ifrFuncionario);
            ifrFuncionario.setVisible(true);
        }
    }//GEN-LAST:event_mniFuncionarioActionPerformed

    private void mniEmprestimoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEmprestimoNovoActionPerformed
        IfrEmprestimoNovo ifrEmprestimoNovo = new IfrEmprestimoNovo();
        if (!contemFrame(ifrEmprestimoNovo)) {
            dkpMain.add(ifrEmprestimoNovo);
            ifrEmprestimoNovo.setVisible(true);
        }
    }//GEN-LAST:event_mniEmprestimoNovoActionPerformed

    private void mniEmprestimoDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEmprestimoDevolucaoActionPerformed
        IfrEmprestimoDevolucao ifrEmprestimoDevolucao = new IfrEmprestimoDevolucao();
        if (!contemFrame(ifrEmprestimoDevolucao)) {
            dkpMain.add(ifrEmprestimoDevolucao);
            ifrEmprestimoDevolucao.setVisible(true);
        }    }//GEN-LAST:event_mniEmprestimoDevolucaoActionPerformed

    private void mniConsultarEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConsultarEmprestimosActionPerformed
        IfrBuscaVideo ifrBuscaVideo = new IfrBuscaVideo();
        if (!contemFrame(ifrBuscaVideo)) {
            dkpMain.add(ifrBuscaVideo);
            ifrBuscaVideo.setVisible(true);
        }
    }//GEN-LAST:event_mniConsultarEmprestimosActionPerformed

    private void mniRelatorioLivrosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelatorioLivrosCadastradosActionPerformed
        new ReportsGenerator().gerarRelatorioSimples("/reports/report_livros_landscape.jrxml");
    }//GEN-LAST:event_mniRelatorioLivrosCadastradosActionPerformed

    private void mniRelatorioUsuariosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelatorioUsuariosCadastradosActionPerformed
        new ReportsGenerator().gerarRelatorioSimples("/reports/report_usuarios_landscape.jrxml");
    }//GEN-LAST:event_mniRelatorioUsuariosCadastradosActionPerformed

    private void mniRelatorioLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelatorioLivrosActionPerformed
        IfrRelatorioLivro ifrRelatorioLivro = new IfrRelatorioLivro();
        if (!contemFrame(ifrRelatorioLivro)) {
            dkpMain.add(ifrRelatorioLivro);
            ifrRelatorioLivro.setVisible(true);
        }
    }//GEN-LAST:event_mniRelatorioLivrosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dkpMain;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JMenuBar mnbMain;
    private javax.swing.JMenuItem mniAutor;
    private javax.swing.JMenuItem mniConsultarEmprestimos;
    private javax.swing.JMenuItem mniEditora;
    private javax.swing.JMenuItem mniEmprestimoDevolucao;
    private javax.swing.JMenuItem mniEmprestimoNovo;
    private javax.swing.JMenuItem mniFuncionario;
    private javax.swing.JMenuItem mniGenero;
    private javax.swing.JMenuItem mniLeitor;
    private javax.swing.JMenuItem mniLivro;
    private javax.swing.JMenuItem mniPerfil;
    private javax.swing.JMenuItem mniRelatorioLivros;
    private javax.swing.JMenuItem mniRelatorioLivrosCadastrados;
    private javax.swing.JMenuItem mniRelatorioUsuariosCadastrados;
    private javax.swing.JMenu mnuCadastros;
    private javax.swing.JMenu mnuEmprestimos;
    private javax.swing.JMenu mnuLivros;
    private javax.swing.JMenu mnuRelatorios;
    private javax.swing.JMenu mnuUsuarios;
    // End of variables declaration//GEN-END:variables
}
