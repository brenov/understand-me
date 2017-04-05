/*
 * GNU License.
 */
package canachat;

import java.io.PrintWriter;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Chat window.
 *
 * @author Breno Viana
 * @version 04/04/2017
 */
public class ChatWindow extends javax.swing.JFrame {

    // Printer
    PrintWriter out;

    /**
     * Creates new form ChatWindow.
     */
    public ChatWindow(PrintWriter out) {
        this.out = out;
        initComponents();
        // Center window
        setLocationRelativeTo(this);
    }

    public JTextField getjTextField() {
        return jTextField;
    }

    public JTextArea getjMessageArea() {
        return jMessageArea;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMessageArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CanaChat");

        jTextField.setEditable(false);
        jTextField.setToolTipText("To send a message press Enter");
        jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActionPerformed(evt);
            }
        });

        jMessageArea.setEditable(false);
        jMessageArea.setColumns(20);
        jMessageArea.setForeground(new java.awt.Color(51, 51, 51));
        jMessageArea.setRows(5);
        jScrollPane1.setViewportView(jMessageArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActionPerformed
        out.println(jTextField.getText());
        jTextField.setText("");
    }//GEN-LAST:event_jTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jMessageArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField;
    // End of variables declaration//GEN-END:variables
}