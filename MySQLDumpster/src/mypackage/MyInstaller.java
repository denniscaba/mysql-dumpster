/*
 * Dennis Caba 
 * denniscaba.webdev@gmail.com
 *
 */
package mypackage;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.ibatis.jdbc.ScriptRunner;

/**
 *
 * @author Dennis
 */
public class MyInstaller extends javax.swing.JFrame {

    /**
     * Creates new form MyInstaller
     */
    public MyInstaller() {
        initComponents();
        initialize();
        
    }
    private void initialize(){
    this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/icon.png")));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnImport = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtServerName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        btnSelectFile = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtDatabase = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jFileChooser.setFileFilter(new FileNameExtensionFilter("SQL File", "sql", "txt"));
        jFileChooser.setCurrentDirectory(new java.io.File("C:\\"));

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("MySQL Dumpster");
            setMinimumSize(new java.awt.Dimension(700, 400));
            setPreferredSize(new java.awt.Dimension(700, 400));

            jPanel1.setBackground(new java.awt.Color(52, 152, 219));
            jPanel1.setMaximumSize(new java.awt.Dimension(200, 50));
            jPanel1.setMinimumSize(new java.awt.Dimension(200, 50));
            jPanel1.setPreferredSize(new java.awt.Dimension(200, 50));
            jPanel1.setLayout(new java.awt.BorderLayout());

            jPanel3.setBackground(new java.awt.Color(41, 128, 185));

            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackage/images/systemax.png"))); // NOI18N
            jLabel1.setText("Systemax");

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            );

            jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

            jPanel4.setBackground(new java.awt.Color(52, 152, 219));

            jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("MySQL Dumpster");

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(405, Short.MAX_VALUE))
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            );

            jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

            getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

            jPanel2.setBackground(new java.awt.Color(255, 255, 255));
            jPanel2.setPreferredSize(new java.awt.Dimension(400, 250));
            jPanel2.setLayout(new java.awt.BorderLayout());

            jPanel5.setBackground(new java.awt.Color(255, 255, 255));
            jPanel5.setMaximumSize(new java.awt.Dimension(550, 250));
            jPanel5.setMinimumSize(new java.awt.Dimension(550, 250));
            jPanel5.setPreferredSize(new java.awt.Dimension(550, 250));

            jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel4.setText("<html>This software will help you import your sql file into MySQL. Use at your own risk! I don't take responsibility for any lost of data (or otherwise) that may result from you using this software.</html>");

            btnImport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            btnImport.setForeground(new java.awt.Color(51, 51, 51));
            btnImport.setText("Import Database");
            btnImport.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnImportActionPerformed(evt);
                }
            });

            jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
            jLabel5.setText("Server Name:");

            txtServerName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            txtServerName.setText("localhost");

            jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
            jLabel6.setText("Username:");

            txtUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            txtUsername.setText("root");
            txtUsername.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtUsernameActionPerformed(evt);
                }
            });

            jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
            jLabel7.setText("Password:");

            txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            txtPassword.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtPasswordActionPerformed(evt);
                }
            });

            jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
            jLabel8.setText("SQL File:");

            txtFile.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            txtFile.setEnabled(false);
            txtFile.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtFileActionPerformed(evt);
                }
            });

            btnSelectFile.setText("Select File");
            btnSelectFile.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSelectFileActionPerformed(evt);
                }
            });

            jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
            jLabel9.setText("Database Name:");

            txtDatabase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            txtDatabase.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtDatabaseActionPerformed(evt);
                }
            });

            jLabel10.setText("Note: Make sure your XAMP or WAMP is running before performing this process.");

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7))
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtServerName, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtPassword)
                                            .addComponent(btnImport, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(57, 57, 57)
                                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSelectFile)))
                            .addGap(0, 159, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtServerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSelectFile))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnImport)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel10)
                    .addContainerGap(38, Short.MAX_VALUE))
            );

            jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

            jPanel6.setPreferredSize(new java.awt.Dimension(657, 30));

            jLabel3.setText("(C) Dennis Caba 2016");

            javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
            jPanel6.setLayout(jPanel6Layout);
            jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(556, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addContainerGap())
            );
            jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            );

            jPanel2.add(jPanel6, java.awt.BorderLayout.SOUTH);

            getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

            pack();
        }// </editor-fold>//GEN-END:initComponents
    public String getClassPath(){
        ClassLoader loader;
        loader = MyInstaller.class.getClassLoader();

        String className = loader.getResource("mypackage/MyInstaller.class").toString();
        className = className.replace("file:/", "");
        className = className.replace("jar:", "");
        className = className.replace("dist/MySQLDumpster.jar!", "build/classes");
        className = className.replace("/mypackage/MyInstaller.class", "");
        return className + "/mypackage/";
    }
//    public void installImageMagick() throws IOException{
//    Process p = Runtime.getRuntime().exec(new String[] {getClassPath()  +"thirdparties/ImageMagick-6.9.0-10-Q16-x64-dll.exe"});
//    }
    private void createDatabase(String fileName, String serverName, String username, 
            String password, String database) throws ClassNotFoundException, SQLException{
        //String aSQLScriptFilePath = getClassPath() + "database/coolwaves.sql";
	String aSQLScriptFilePath = fileName;	
		// Create MySql Connection
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
			"jdbc:mysql://"+serverName+":3306/", username, password);
		Statement stmt = null;

		try {
                        String sql = "DROP DATABASE IF EXISTS " + database;
                        stmt = con.createStatement();
                        stmt.executeUpdate(sql);
                        
                        sql = "CREATE DATABASE " + database;
                        stmt = con.createStatement();
                        stmt.executeUpdate(sql);
                        
		} catch (Exception e) {
			System.err.println("Failed to Execute" + aSQLScriptFilePath
					+ " The error is " + e.getMessage());
		}     
    }
    private void importDatabase(String fileName, String serverName, String username, 
            String password, String database) throws ClassNotFoundException, SQLException{
    		//String aSQLScriptFilePath = getClassPath() + "database/coolwaves.sql";
		String aSQLScriptFilePath = fileName;
                
		// Create MySql Connection
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
			"jdbc:mysql://"+serverName+":3306/"+database, username, password);
		Statement stmt = null;

		try {
			ScriptRunner sr = new ScriptRunner(con);

			// Give the input file to Reader
			Reader reader = new BufferedReader(
                               new FileReader(aSQLScriptFilePath));

			// Exctute script
			sr.runScript(reader);

		} catch (Exception e) {
			System.err.println("Failed to Execute" + aSQLScriptFilePath
					+ " The error is " + e.getMessage());
		}
    }
    
    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        if(txtServerName.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Please enter the server name.");
            return;
        }
        if(txtUsername.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Please enter the username.");
            return;
        }
        if(txtDatabase.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Please enter the database name.");
            return;
        }
        if(txtFile.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Please select a sql or text file.");
            return;
        }
        String serverName = txtServerName.getText().trim();
        String username = txtUsername.getText().trim();
        String password = txtPassword.getText().trim();
        String database = txtDatabase.getText().trim();
        String fileName = txtFile.getText().trim();
        try {
            createDatabase(fileName, serverName, username, password, database);
            importDatabase(fileName, serverName, username, password, database);
            JOptionPane.showMessageDialog(rootPane, "Database imported successfully!");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyInstaller.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Unable to import database.");
        }
    }//GEN-LAST:event_btnImportActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFileActionPerformed

    private void btnSelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectFileActionPerformed
        int returnVal = jFileChooser.showOpenDialog(jFileChooser);
        File f;
        String filepath="";
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            try {
                txtFile.setText(file.getAbsolutePath());
                filepath = txtFile.getText();
                f = new File(filepath);
            } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Problem accessing file!");
              return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "File access cancelled by user.");
            return;
        } 
    }//GEN-LAST:event_btnSelectFileActionPerformed

    private void txtDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatabaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatabaseActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyInstaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyInstaller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnSelectFile;
    private javax.swing.JFileChooser jFileChooser;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtDatabase;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtServerName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
