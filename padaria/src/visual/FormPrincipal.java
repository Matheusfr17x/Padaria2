package visual;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBarra = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuFuncionario = new javax.swing.JMenuItem();
        menuFornecedor = new javax.swing.JMenuItem();
        menuProduto = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenuItem();
        menuEndereco = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Padaria Pão de Mel");
        setResizable(false);

        menuBarra.setBorder(null);
        menuBarra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuCadastro.setText("Cadastros");
        menuCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuFuncionario.setText("Funcionario");
        menuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuFuncionario);

        menuFornecedor.setText("Fornecedor");
        menuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFornecedorActionPerformed(evt);
            }
        });
        menuCadastro.add(menuFornecedor);

        menuProduto.setText("Produto");
        menuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuProduto);

        menuCliente.setText("Cliente");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCliente);

        menuEndereco.setText("Endereco");
        menuEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEnderecoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuEndereco);

        menuBarra.add(menuCadastro);

        menuAjuda.setText("Ajuda");
        menuAjuda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuSobre);

        menuBarra.add(menuAjuda);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
        // TODO add your handling code here:
        FormCliente form = new FormCliente(this,true); 
        //true: Define como janela modal: Sobrepõe o FormPrincipal e não deixa acessa-lo
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionarioActionPerformed
        // TODO add your handling code here:
        FormFuncionario form = new FormFuncionario(this,true); 
        //true: Define como janela modal: Sobrepõe o FormPrincipal e não deixa acessa-lo
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuFuncionarioActionPerformed

    private void menuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutoActionPerformed
        // TODO add your handling code here:
        FormProduto form = new FormProduto(this,true); 
        //true: Define como janela modal: Sobrepõe o FormPrincipal e não deixa acessa-lo
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuProdutoActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Padaria Pão de Mel\nDireitos Reservados\nVersão 1.0");
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFornecedorActionPerformed
        // TODO add your handling code here:
        FormFornecedor form = new FormFornecedor(this,true); 
        //true: Define como janela modal: Sobrepõe o FormPrincipal e não deixa acessa-lo
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuFornecedorActionPerformed

    private void menuEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEnderecoActionPerformed
       // TODO add your handling code here:
        FormEndereco form = new FormEndereco(this,true); 
        //true: Define como janela modal: Sobrepõe o FormPrincipal e não deixa acessa-lo
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuEnderecoActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenuItem menuEndereco;
    private javax.swing.JMenuItem menuFornecedor;
    private javax.swing.JMenuItem menuFuncionario;
    private javax.swing.JMenuItem menuProduto;
    private javax.swing.JMenuItem menuSobre;
    // End of variables declaration//GEN-END:variables
}
