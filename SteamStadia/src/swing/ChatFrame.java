package swing;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import swing.History;
import swing.Message;
import swing.SocketClient;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.UIManager;
import oracle.jrockit.jfr.JFR;

public class ChatFrame extends javax.swing.JFrame {

    public SocketClient client;
    public int port;
    public String serverAddr, username, password;
    public Thread clientThread;
    public DefaultListModel model;
    public File file;
    public String historyFile = "D:/History.xml";
    public HistoryFrame historyFrame;
    public History hist;
    boolean unfolds=false,folds=true;
    public ChatFrame() {
        initComponents();
        this.setTitle("jMessenger");
        model.addElement("All");
        jList1.setSelectedIndex(0);
        
        jTextField6.setEditable(false);
        
        this.addWindowListener(new WindowListener() {

            @Override public void windowOpened(WindowEvent e) {}
            @Override public void windowClosing(WindowEvent e) { try{ client.send(new Message("message", username, ".bye", "SERVER")); clientThread.stop();  }catch(Exception ex){} }
            @Override public void windowClosed(WindowEvent e) {}
            @Override public void windowIconified(WindowEvent e) {}
            @Override public void windowDeiconified(WindowEvent e) {}
            @Override public void windowActivated(WindowEvent e) {}
            @Override public void windowDeactivated(WindowEvent e) {}
        });
        
        hist = new History(historyFile);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("steam.png")));
         Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
         this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    public boolean isWin32(){
        return System.getProperty("os.name").startsWith("Windows");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        parentpanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        jList1.setModel((model = new DefaultListModel()));
        jScrollPane2.setViewportView(jList1);

        jButton8.setText("Show");
        jButton8.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setText("...");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1138, 613));
        setPreferredSize(new java.awt.Dimension(1138, 613));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Send Message ");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 840, 108, -1));

        jPanel1.setBackground(new java.awt.Color(30, 32, 44));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/menuicon2.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/whataspp2.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/messenger2.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 210, 60, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/discord2.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 60, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/skype2.png"))); // NOI18N
        jLabel22.setText("jLabel22");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 50, 50));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/twitter2.png"))); // NOI18N
        jLabel23.setText("jLabel23");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 70, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 610));

        parentpanel.setBackground(new java.awt.Color(255, 255, 255));
        parentpanel.setLayout(new java.awt.CardLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 0, 51));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 880, 560));

        jPanel2.setBackground(new java.awt.Color(42, 47, 58));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(52, 59, 69));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/home-icon-25px.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Exit_25px.png"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Search_18px.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 30, 30));

        jTextField5.setBackground(new java.awt.Color(52, 59, 69));
        jTextField5.setForeground(new java.awt.Color(153, 153, 153));
        jTextField5.setText(" Search.....");
        jTextField5.setBorder(null);
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 31, 170, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/gameicon.png"))); // NOI18N
        jLabel11.setText("jLabel10");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 40, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Activity");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 80, 20));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/friendsicon.png"))); // NOI18N
        jLabel13.setText("jLabel12");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 40, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Friends");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 90, 20));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/home-icon-25px.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 40, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Exit_25px.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 60));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setText("Home");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
        });
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 50, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("Exit");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Port:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 40));

        jTextField2.setBackground(new java.awt.Color(52, 59, 69));
        jTextField2.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.setText("13000");
        jTextField2.setBorder(null);
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 113, 20));

        jTextField1.setBackground(new java.awt.Color(52, 59, 69));
        jTextField1.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("localhost");
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 110, 20));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("IP: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Username :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Password :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(52, 59, 69));
        jPasswordField1.setText("password");
        jPasswordField1.setEnabled(false);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 170, -1));

        jButton1.setBackground(new java.awt.Color(52, 59, 69));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Connect");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 80, -1));

        jButton2.setBackground(new java.awt.Color(52, 59, 69));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Login");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 70, -1));

        jButton3.setBackground(new java.awt.Color(52, 59, 69));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setText("SignUp");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, 81, -1));

        jTextField3.setBackground(new java.awt.Color(52, 59, 69));
        jTextField3.setText("Enter A Name...");
        jTextField3.setEnabled(false);
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 170, -1));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 610));

        jTextField4.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(102, 102, 102));
        jTextField4.setText("Type Your Message..........");
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 750, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setAlignmentX(0.0F);
        jPanel5.setAlignmentY(0.0F);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/sendicon.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/attachicon2.png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 880, 60));

        parentpanel.add(jPanel4, "card2");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 560));
        jPanel6.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 960, 50));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/sendicon.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 560, 70, 50));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/attachicon2.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel25MouseExited(evt);
            }
        });
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, -1, -1));

        parentpanel.add(jPanel6, "card3");

        getContentPane().add(parentpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 1080, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        serverAddr = jTextField1.getText(); port = Integer.parseInt(jTextField2.getText());
        
        if(!serverAddr.isEmpty() && !jTextField2.getText().isEmpty()){
            try{
                client = new SocketClient(this);
                clientThread = new Thread(client);
                clientThread.start();
                client.send(new Message("test", "testUser", "testContent", "SERVER"));
            }
            catch(Exception ex){
                jTextArea1.append("[Application > Me] : Server not found\n");
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        username = jTextField3.getText();
        password = jPasswordField1.getText();
        
        if(!username.isEmpty() && !password.isEmpty()){
            client.send(new Message("login", username, password, "SERVER"));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String msg = jTextField4.getText();
        String target = jList1.getSelectedValue().toString();
        
        if(!msg.isEmpty() && !target.isEmpty()){
            jTextField4.setText("");
            client.send(new Message("message", username, msg, target));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        username = jTextField3.getText();
        password = jPasswordField1.getText();
        
        if(!username.isEmpty() && !password.isEmpty()){
            client.send(new Message("signup", username, password, "SERVER"));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.showDialog(this, "Select File");
        
        if(!jf.getSelectedFile().getPath().isEmpty()){
            historyFile = jf.getSelectedFile().getPath();
            if(this.isWin32()){
                historyFile = historyFile.replace("/", "\\");
            }
            jTextField6.setText(historyFile);
            jTextField6.setEditable(false);
            jButton7.setEnabled(false);
            jButton8.setEnabled(true);
            hist = new History(historyFile);
                    
            //historyFrame = new HistoryFrame(hist);
            historyFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            historyFrame.setVisible(false);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        historyFrame.setLocation(this.getLocation());
        historyFrame.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        GLibrary game =new GLibrary();
        game.setVisible(true);
        WindowEvent closed = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closed);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        // TODO add your handling code here:
        jLabel20.setForeground(new java.awt.Color(104, 195, 245));
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        // TODO add your handling code here:
        jLabel20.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        // TODO add your handling code here:
        jLabel21.setForeground(new java.awt.Color(104, 195, 245));
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        // TODO add your handling code here:
        jLabel21.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
         String msg = jTextField4.getText();
        String target = jList1.getSelectedValue().toString();
        
        if(!msg.isEmpty() && !target.isEmpty()){
            jTextField4.setText("");
            client.send(new Message("message", username, msg, target));
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        
        if(folds)
        {
            unfolds=true;
            folds=false;
        }
        else if(unfolds)
        {
            folds=true;
            unfolds=false;
        }
        
        if(unfolds)
        { 
        parentpanel.removeAll();
        parentpanel.add(jPanel6);
        parentpanel.repaint();
        parentpanel.revalidate();
        }
         if(folds)
        { 
        parentpanel.removeAll();
        parentpanel.add(jPanel4);
        parentpanel.repaint();
        parentpanel.revalidate();
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
                 String msg = jTextField4.getText();
        String target = jList1.getSelectedValue().toString();
        
        if(!msg.isEmpty() && !target.isEmpty()){
            jTextField4.setText("");
            client.send(new Message("message", username, msg, target));
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        
          if (Desktop.isDesktopSupported()) {
		                Desktop desktop = Desktop.getDesktop();
		                try {
		                		URI uri = new URI("https://www.whatsapp.com");
		                        desktop.browse(uri);
		                } catch (IOException ex) {
		                        // do nothing
		                } catch (URISyntaxException ex) {
							//do nothing
						}
		        } else {
		               //do nothing
		        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        
          if (Desktop.isDesktopSupported()) {
		                Desktop desktop = Desktop.getDesktop();
		                try {
		                		URI uri = new URI("https://www.messenger.com");
		                        desktop.browse(uri);
		                } catch (IOException ex) {
		                        // do nothing
		                } catch (URISyntaxException ex) {
							//do nothing
						}
		        } else {
		               //do nothing
		        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        
          if (Desktop.isDesktopSupported()) {
		                Desktop desktop = Desktop.getDesktop();
		                try {
		                		URI uri = new URI("https://www.twitter.com");
		                        desktop.browse(uri);
		                } catch (IOException ex) {
		                        // do nothing
		                } catch (URISyntaxException ex) {
							//do nothing
						}
		        } else {
		               //do nothing
		        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        
          if (Desktop.isDesktopSupported()) {
		                Desktop desktop = Desktop.getDesktop();
		                try {
		                		URI uri = new URI("https://www.skype.com");
		                        desktop.browse(uri);
		                } catch (IOException ex) {
		                        // do nothing
		                } catch (URISyntaxException ex) {
							//do nothing
						}
		        } else {
		               //do nothing
		        }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        
          if (Desktop.isDesktopSupported()) {
		                Desktop desktop = Desktop.getDesktop();
		                try {
		                		URI uri = new URI("https://www.discord.com");
		                        desktop.browse(uri);
		                } catch (IOException ex) {
		                        // do nothing
		                } catch (URISyntaxException ex) {
							//do nothing
						}
		        } else {
		               //do nothing
		        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/whataspp3.png")));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/whataspp2.png")));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        // TODO add your handling code here:
         jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/messenger3.png")));
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        // TODO add your handling code here:
         jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/messenger2.png")));
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        // TODO add your handling code here:
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/skype2.png")));
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        // TODO add your handling code here:
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/skype3.png")));
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        // TODO add your handling code here:
         jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/twitter3.png")));
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        // TODO add your handling code here:
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/twitter2.png")));
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        // TODO add your handling code here:
                 jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/discord3.png")));
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        // TODO add your handling code here:
           jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/discord2.png")));
    }//GEN-LAST:event_jLabel17MouseExited

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        // TODO add your handling code here:
        String s=jTextField3.getText();
        if(s.equals("Enter A Name..."))
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
          String s=jTextField1.getText();
        if(s.equals("localhost"))
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        // TODO add your handling code here:
        String s=jTextField4.getText();
        if(s.equals("Type Your Message.........."))
        jTextField4.setText("");
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
         jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/sendicon2.png")));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
         jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/sendicon.png")));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
              JFileChooser choose=new JFileChooser() ;
        choose.showOpenDialog(null);
        File f= choose.getSelectedFile();
        String filename= f.getAbsolutePath();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        // TODO add your handling code here:
           jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/attachicon3.png")));
    }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        // TODO add your handling code here:
           jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/attachicon2.png")));
    }//GEN-LAST:event_jLabel24MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:
         jLabel12.setForeground(new java.awt.Color(104, 195, 245));
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        // TODO add your handling code here:
              jLabel12.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        // TODO add your handling code here:
         jLabel14.setForeground(new java.awt.Color(104, 195, 245));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        // TODO add your handling code here:
              jLabel14.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        JFileChooser choose=new JFileChooser() ;
        choose.showOpenDialog(null);
        File f= choose.getSelectedFile();
        String filename= f.getAbsolutePath();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
        // TODO add your handling code here:
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/attachicon3.png")));
    }//GEN-LAST:event_jLabel25MouseEntered

    private void jLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseExited
        // TODO add your handling code here:
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/attachicon2.png")));
    }//GEN-LAST:event_jLabel25MouseExited

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        // TODO add your handling code here:
         jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/sendicon2.png")));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        // TODO add your handling code here:
         jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/sendicon.png")));
    }//GEN-LAST:event_jLabel16MouseExited

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch(Exception ex){
            System.out.println("Look & Feel exception");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextArea jTextArea3;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField8;
    private javax.swing.JPanel parentpanel;
    // End of variables declaration//GEN-END:variables
}
