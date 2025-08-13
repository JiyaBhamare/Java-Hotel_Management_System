
import java.util.logging.Level;
import java.util.logging.Logger;


public class Start extends javax.swing.JFrame {

   
    public Start() {
        initComponents();
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                    try {
                        Thread.sleep(1000);
                        new Start1().setVisible(true);
                    } catch (InterruptedException ex) {
                }      
            }
        });
        t.start();
    }

    
    @SuppressWarnings("unchecked")
 
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     

  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }


    private javax.swing.JLabel jLabel1;
    
}
