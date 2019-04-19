/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Fixer Sam
 */
public class Steamsignup extends javax.swing.JFrame{

    private Connection con;
    private Statement st;
    private ResultSet rs;
    public Steamsignup() {
        initComponents();
        emailcheckrmsg.setVisible(false);
        passcheckmsg.setVisible(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("steam.png")));
        Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
          
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kButton2 = new keeptoo.KButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        emailcheckrmsg = new javax.swing.JLabel();
        passcheckmsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(89, 199, 198));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Inspire to Aspire");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 270, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/steamiconinsignuppage2.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 280, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 530));

        jPanel2.setBackground(new java.awt.Color(24, 26, 68));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Exit_25px.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 40, 50));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 260, 10));

        jTextField1.setBackground(new java.awt.Color(24, 26, 68));
        jTextField1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Enter Your Name");
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 260, -1));

        jTextField2.setBackground(new java.awt.Color(24, 26, 68));
        jTextField2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Enter Email Address ");
        jTextField2.setBorder(null);
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 260, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("UserName:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 260, 10));

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("E-Mail: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 242, 260, 10));

        jPasswordField1.setBackground(new java.awt.Color(24, 26, 68));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setText("...............");
        jPasswordField1.setBorder(null);
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 260, 20));

        jComboBox1.setBackground(new java.awt.Color(24, 26, 68));
        jComboBox1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(24, 26, 68));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select country", "Bangladesh", "India", "Australia", "England", "Newzeland", "Spain", "Portugal", "Germany" }));
        jComboBox1.setBorder(null);
        jComboBox1.setOpaque(false);
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 260, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Country:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Password:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        kButton2.setText("SIGN UP");
        kButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        kButton2.setkHoverEndColor(new java.awt.Color(51, 204, 255));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverStartColor(new java.awt.Color(89, 196, 192));
        kButton2.setkSelectedColor(new java.awt.Color(51, 255, 255));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 170, 30));

        jCheckBox1.setBackground(new java.awt.Color(24, 26, 68));
        jCheckBox1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox1.setText("I ,Agree The Terms & Conditions");
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 290, -1));

        emailcheckrmsg.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        emailcheckrmsg.setForeground(new java.awt.Color(255, 102, 102));
        emailcheckrmsg.setText("*Please enter a valid email address");
        jPanel2.add(emailcheckrmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 280, -1));

        passcheckmsg.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        passcheckmsg.setForeground(new java.awt.Color(255, 102, 102));
        passcheckmsg.setText("*Please enter a alphanumeric password with more than 8 characters");
        jPanel2.add(passcheckmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 420, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 730, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        // TODO add your handling code here:
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        String s=jTextField1.getText();
        if(s.equals("Enter Your Name"))
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        // TODO add your handling code here:
        String s=  jTextField2.getText();
        if(s.equals("Enter Email Address "))
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2MouseClicked

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
      
       
        String name=jTextField1.getText();
        String mail=jTextField2.getText();
        String pass=jPasswordField1.getText();
        //String country =jComboBox1.getItemAt(0);
        String country =jComboBox1.getSelectedItem().toString();
        Stringcheck strchk=new Stringcheck();
        boolean a=false,b=false,d=false,c=jCheckBox1.isSelected();
        a=strchk.chk(pass);
        b=strchk.chkmail(mail);
        d=strchk.chkcountry(country);
        
       
        if(a && b && c &&d && !name.isEmpty())
        {
            Dbconnect db=new Dbconnect();
            String sql="insert into data values('"+name+"','"+pass+"','"+"Neteller"+"')";
            db.setData(sql);
            JOptionPane.showMessageDialog(null,"Your are successfully signed up");
            Steam login =new Steam();
            login.setVisible(true);
            WindowEvent clossed = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
            Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(clossed);
        }
        else if(a && !b && c)
        {
            JOptionPane.showMessageDialog(null,"Invalid mail");
            emailcheckrmsg.setVisible(true);
            passcheckmsg.setVisible(false);
        }
        else if(!a && b && c)
        {   
            JOptionPane.showMessageDialog(null,"Invalid password");
            passcheckmsg.setVisible(true);
            emailcheckrmsg.setVisible(false);
            
        }
        else if(!a && !b && c && d)
            JOptionPane.showMessageDialog(null,"Invalid mail & password");
        else if(a && b && !c && d)
            JOptionPane.showMessageDialog(null,"You need to agree to terms and conditions");
         else if(a && b && c && !d)
            JOptionPane.showMessageDialog(null,"You need to select a country");
        
        else if(b)
        {
             passcheckmsg.setVisible(false); 
        }
        else if(a)
        {
             emailcheckrmsg.setVisible(false);   
        }
        
    }//GEN-LAST:event_kButton2ActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        // TODO add your handling code here:
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Exit_30px.png")));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        // TODO add your handling code here:
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Exit_25px.png")));
    }//GEN-LAST:event_exitMouseExited
    //-----------------------------------
     public class Stringcheck{
        public String s;
        public boolean chk(String a)
        {
            if(a.length()<8 || a.isEmpty()==true)
                    return false;
            int alpha=0,num=0;
            for(int i=0;i<a.length();i++)
            {
                if(a.charAt(i)>='a' && a.charAt(i)<='z')
                    alpha++;
                else if(a.charAt(i)>='0' && a.charAt(i)<='9')
                    num++;
            }
            if(alpha==0 || num==0)
                return false;
            else if(alpha+num!=a.length())
                return false;  
            return true;
        }
        public boolean chkmail(String b)
        {
            if(b.isEmpty()==true)
               return false;
            boolean at=false,dot=false;
            for(int i=0;i<b.length();i++)
            {
                if(b.charAt(i)=='@')
                    at=true;
                if(b.charAt(i)=='.')
                    dot=true;
                if(!(b.contains("com")))
                    return false;
                if((b.indexOf('@')-b.indexOf('.'))==1||(b.indexOf('.')-b.indexOf('@'))==1)
                   return false; 
                if(b.contains(".."))
                    return false;
                if(b.indexOf('@')>b.indexOf('.'))
                     return false;
            }
            if(dot && at)
                return true;
            return false;
        }
        public boolean chkcountry(String d)
        {
           if(d.contains("Select country"))
           return false;
           else
           return true;
        }
    }
    
    
    
    //----------------------------------
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
            java.util.logging.Logger.getLogger(Steamsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Steamsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Steamsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Steamsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Steamsignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailcheckrmsg;
    private javax.swing.JLabel exit;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private keeptoo.KButton kButton2;
    private javax.swing.JLabel passcheckmsg;
    // End of variables declaration//GEN-END:variables
}
