/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentcar.car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rentcar.DbConnection;
import rentcar.MenuNavigation;

/**
 *
 * @author Admin
 */
public class AddCarType extends javax.swing.JFrame {

    private Connection con;
    private Statement statment;
    private MenuNavigation menuNav;

    /**
     * Creates new form AddCar
     */
    public AddCarType() {
        initComponents();
        DbConnection DB = new DbConnection();
        DB.Connect();
        con = DB.conn;
        statment = DB.stmt;
        this.menuNav = new MenuNavigation();
        loadData();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        statusGroup = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        userLogin = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        btnLogin1 = new com.k33ptoo.components.KButton();
        btnLogin2 = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartypeList = new javax.swing.JTable();
        listorders = new javax.swing.JLabel();
        employees = new javax.swing.JLabel();
        customers = new javax.swing.JLabel();
        financial = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cars = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentcar/images/logo_app.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(245, 248, 196));
        kGradientPanel1.setkStartColor(new java.awt.Color(117, 190, 251));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1376, 768));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkGradientFocus(0);
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(1376, 768));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(75, 160, 175));
        jLabel29.setText("Add Car Type");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 83, 131)));
        jPanel3.setForeground(new java.awt.Color(0, 83, 131));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("Add new car type");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentcar/images/ic_user1.png"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(20, 18));

        userLogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        userLogin.setForeground(new java.awt.Color(75, 160, 175));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentcar/images/image-removebg-preview (13).png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(75, 160, 175));
        jLabel7.setText("Car Type :");

        nama.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nama.setForeground(new java.awt.Color(75, 160, 175));
        nama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(75, 160, 175)));
        nama.setSelectionColor(new java.awt.Color(0, 153, 153));
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        btnLogin1.setText("Save");
        btnLogin1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLogin1.setkBackGroundColor(new java.awt.Color(75, 160, 175));
        btnLogin1.setkEndColor(new java.awt.Color(255, 255, 255));
        btnLogin1.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        btnLogin1.setkHoverForeGround(new java.awt.Color(255, 255, 204));
        btnLogin1.setkHoverStartColor(new java.awt.Color(75, 160, 175));
        btnLogin1.setkStartColor(new java.awt.Color(75, 160, 175));
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });

        btnLogin2.setText("Cancel");
        btnLogin2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLogin2.setkBackGroundColor(new java.awt.Color(75, 160, 175));
        btnLogin2.setkEndColor(new java.awt.Color(255, 255, 255));
        btnLogin2.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        btnLogin2.setkHoverForeGround(new java.awt.Color(255, 255, 204));
        btnLogin2.setkHoverStartColor(new java.awt.Color(75, 160, 175));
        btnLogin2.setkStartColor(new java.awt.Color(75, 160, 175));
        btnLogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin2ActionPerformed(evt);
            }
        });

        cartypeList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Car Type Id", "Type Name"
            }
        ));
        jScrollPane1.setViewportView(cartypeList);

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(466, 466, 466))
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 229, Short.MAX_VALUE))
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel2Layout.createSequentialGroup()
                                    .addComponent(btnLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(nama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                .addGap(184, 184, 184))
        );

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 1470, 780));

        listorders.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        listorders.setForeground(new java.awt.Color(0, 83, 131));
        listorders.setText("List Orders");
        kGradientPanel1.add(listorders, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 187, 57));

        employees.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        employees.setForeground(new java.awt.Color(0, 83, 131));
        employees.setText("Employees");
        employees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeesMouseClicked(evt);
            }
        });
        kGradientPanel1.add(employees, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 187, 57));

        customers.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        customers.setForeground(new java.awt.Color(0, 83, 131));
        customers.setText("Customers");
        customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersMouseClicked(evt);
            }
        });
        kGradientPanel1.add(customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 187, 57));

        financial.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        financial.setForeground(new java.awt.Color(0, 83, 131));
        financial.setText("Financial");
        kGradientPanel1.add(financial, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 187, 57));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentcar/images/logo-1.png"))); // NOI18N

        cars.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cars.setForeground(new java.awt.Color(75, 160, 175));
        cars.setText("Cars");
        cars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cars, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cars, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 370, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentcar/images/logo-1.png"))); // NOI18N
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 40));

        dashboard.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dashboard.setForeground(new java.awt.Color(0, 83, 131));
        dashboard.setText("Dashboard");
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });
        kGradientPanel1.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 187, 57));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentcar/images/logo-1.png"))); // NOI18N
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentcar/images/logo-1.png"))); // NOI18N
        kGradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentcar/images/logo-1.png"))); // NOI18N
        kGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentcar/images/logo-1.png"))); // NOI18N
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentcar/images/logo_app-removebg-preview (1).png"))); // NOI18N
        kGradientPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 83, 131));
        jLabel23.setText("Role");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 187, 57));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentcar/images/logo-1.png"))); // NOI18N
        kGradientPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, 40));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 83, 131));
        jLabel22.setText("MyProfile");
        kGradientPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 630, 187, 57));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentcar/images/logo-1.png"))); // NOI18N
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, -1, 40));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Logout Success");
        menuNav.login(this);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void carsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carsMouseClicked
        // TODO add your handling code here:
        menuNav.car(this);
    }//GEN-LAST:event_carsMouseClicked

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
        try {
            String insertQuery = "INSERT INTO tb_tipe_mobil VALUES ('0','"
                    + nama.getText() + "')";

            PreparedStatement prepare = con.prepareStatement(insertQuery);
            prepare.execute();
            JOptionPane.showMessageDialog(this, "Car Type Added");
            menuNav.car(this);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void btnLogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin2ActionPerformed
        // TODO add your handling code here:
        menuNav.car(this);
    }//GEN-LAST:event_btnLogin2ActionPerformed

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        // TODO add your handling code here:
        menuNav.adminDashboard(this);
    }//GEN-LAST:event_dashboardMouseClicked

    private void employeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeesMouseClicked
        // TODO add your handling code here:
        menuNav.employee(this);
    }//GEN-LAST:event_employeesMouseClicked

    private void customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseClicked
        // TODO add your handling code here:
        menuNav.customer(this);
    }//GEN-LAST:event_customersMouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        menuNav.Role(this);
    }//GEN-LAST:event_jLabel23MouseClicked
    private void loadData() {
        try {
            DefaultTableModel model = (DefaultTableModel) cartypeList.getModel();
            // clear data
            model.setRowCount(0);
            String selectQuery = "SELECT * FROM tb_tipe_mobil";
            ResultSet result = statment.executeQuery(selectQuery);
            while (result.next()) {
                model.addRow(new Object[]{
                    result.getInt("id_tipe"),
                    result.getString("tipe")});

                cartypeList.setModel(model);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(AddCarType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCarType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCarType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCarType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCarType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnLogin1;
    private com.k33ptoo.components.KButton btnLogin2;
    private javax.swing.JLabel cars;
    private javax.swing.JTable cartypeList;
    private javax.swing.JLabel customers;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel employees;
    private javax.swing.JLabel financial;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel listorders;
    private javax.swing.JTextField nama;
    private javax.swing.ButtonGroup statusGroup;
    private javax.swing.JLabel userLogin;
    // End of variables declaration//GEN-END:variables
}
