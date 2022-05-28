
package ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Loading extends javax.swing.JFrame {

   Timer timer;
   int x = 1;
   
    public Loading() {
        initComponents();
        setLocationRelativeTo(null);
        
        overlay.setBackground(new Color(0,0,0,15));
        
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pbr_loading.setValue(x++);
                           
              if(x<=100){
                  lbl_loading.setText("Loading "+x+"%");
              }else{
                  timer.stop();
                  
//                  show new window
                  Login login = new Login();
                  login.setVisible(true);
                  
//                  hide current window
                  dispose();
              }
            }
        });
        timer.start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pbr_loading = new javax.swing.JProgressBar();
        lbl_loading = new javax.swing.JLabel();
        overlay = new javax.swing.JPanel();
        lbl_system = new javax.swing.JLabel();
        lbl_management = new javax.swing.JLabel();
        lbl_student = new javax.swing.JLabel();
        lbl_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(pbr_loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 440, 20));

        lbl_loading.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_loading.setForeground(new java.awt.Color(255, 255, 255));
        lbl_loading.setText("Loading ");
        jPanel1.add(lbl_loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 150, 20));

        lbl_system.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        lbl_system.setForeground(new java.awt.Color(204, 255, 0));
        lbl_system.setText("SYSTEM");

        lbl_management.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        lbl_management.setForeground(new java.awt.Color(204, 255, 0));
        lbl_management.setText("MANAGEMENT");

        lbl_student.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        lbl_student.setForeground(new java.awt.Color(204, 255, 0));
        lbl_student.setText("STUDENT ");

        javax.swing.GroupLayout overlayLayout = new javax.swing.GroupLayout(overlay);
        overlay.setLayout(overlayLayout);
        overlayLayout.setHorizontalGroup(
            overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overlayLayout.createSequentialGroup()
                .addGroup(overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(overlayLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lbl_student, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(overlayLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lbl_management, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(overlayLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lbl_system, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(381, Short.MAX_VALUE))
        );
        overlayLayout.setVerticalGroup(
            overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overlayLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(lbl_student, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_management, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_system, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        jPanel1.add(overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 290));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/load.png"))); // NOI18N
        jPanel1.add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
//       try {
//           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//           
//           java.awt.EventQueue.invokeLater(new Runnable() {
//               public void run() {
//                   new Loading().setVisible(true);
//               }
//           });
//       } catch (ClassNotFoundException ex) {
//           Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
//       } catch (InstantiationException ex) {
//           Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
//       } catch (IllegalAccessException ex) {
//           Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
//       } catch (UnsupportedLookAndFeelException ex) {
//           Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
//       }
       
       
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_loading;
    private javax.swing.JLabel lbl_management;
    private javax.swing.JLabel lbl_student;
    private javax.swing.JLabel lbl_system;
    private javax.swing.JPanel overlay;
    private javax.swing.JProgressBar pbr_loading;
    // End of variables declaration//GEN-END:variables
}
