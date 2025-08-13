import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14));
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/manage.png")));
        jButton1.setText("Manage Room");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 100, 220, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14));
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/checked.png")));
        jButton2.setText("Customer Check In");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 230, 220, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14));
        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.jpg")));
        jButton3.setText("Customer Check out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 360, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14));
        jButton4.setForeground(new java.awt.Color(0, 0, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bill.jpg")));
        jButton4.setText("Customer Details Bill");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 500, 220, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log out.jpg")));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 640, 200, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png")));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 60, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.jpg")));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        int yes = JOptionPane.showConfirmDialog(this, "Are you really Logout ?", "Logut", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == yes) {
            new SignIn().setVisible(true);
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        int yes = JOptionPane.showConfirmDialog(this, "Are You Really Close This Application ?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (yes == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        new ManageRoom().setVisible(true);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        new CustomerCheckIn().setVisible(true);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        new CustomerCheckOut().setVisible(true);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        new CustomerDetailsBill().setVisible(true);
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
}
