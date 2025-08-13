import java.awt.print.PrinterException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenerateBill extends javax.swing.JFrame {
    
    String id = CustomerDetailsBill.idd;
    String nm;
    String mobile;
    String email;
    String roomnumber;
    String bed;
    String type;
    String indate;
    String outdate;
    String price;
    String days;
    String amount;
    
    public GenerateBill() {
        initComponents();
        connect();
        txtbill.setText("\t\t-: JIYA Hotel :-\n");
        txtbill.setText(txtbill.getText() + "**********************************************************************************\n");
        txtbill.setText(txtbill.getText() + "Bill ID:- " + id + "\n");
        txtbill.setText(txtbill.getText() + "Customer Details:- \n");
        txtbill.setText(txtbill.getText() + "Name:- " + nm + "\n");
        txtbill.setText(txtbill.getText() + "Mobile Number:- " + mobile + "\n");
        txtbill.setText(txtbill.getText() + "Email:- " + email + "\n");
        txtbill.setText(txtbill.getText() + "**********************************************************************************\n");
        txtbill.setText(txtbill.getText() + "Room Details:- \n");
        txtbill.setText(txtbill.getText() + "Room Number:- " + roomnumber + "\n");
        txtbill.setText(txtbill.getText() + "Type:- " + type + "\n");
        txtbill.setText(txtbill.getText() + "Bed:- " + bed + "\n");
        txtbill.setText(txtbill.getText() + "Price:- " + price + "\n");
        txtbill.setText(txtbill.getText() + "Check IN Date=" + indate + "\t\tNumber of Days=" + days + "\n");
        txtbill.setText(txtbill.getText() + "Check OUT Date=" + outdate + "\t\tTotal Amount=" + amount + "\n");
        txtbill.setText(txtbill.getText() + "**********************************************************************************\n");
        txtbill.setText(txtbill.getText() + "\t\t" + "                    Thank You,Please Visit Again.");
    }
    
    public void connect() {
        PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "Sudhir@123");
            pst = con.prepareStatement("select * from customer where billid=?");
            pst.setString(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                email = rs.getString("email");
                nm = rs.getString("name");
                mobile = rs.getString("mobile");
                roomnumber = rs.getString("roomnumber");
                bed = rs.getString("bed");
                type = rs.getString("roomtype");
                indate = rs.getString("date");
                outdate = rs.getString("outdate");
                price = rs.getString("price");
                days = rs.getString("days");
                amount = rs.getString("amount");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GenerateBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtbill.setEditable(false);
        txtbill.setColumns(20);
        txtbill.setFont(new java.awt.Font("Segoe UI", 1, 14));
        txtbill.setRows(5);
        txtbill.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtbillFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtbill);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 520, 370));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png")));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 60, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/all pages background.png")));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 440));

        pack();
        setLocationRelativeTo(null);
    }

    private void formFocusLost(java.awt.event.FocusEvent evt) {
    }

    private void txtbillFocusLost(java.awt.event.FocusEvent evt) {
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            txtbill.print();
        } catch (PrinterException ex) {
            Logger.getLogger(GenerateBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GenerateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateBill().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtbill;
}
