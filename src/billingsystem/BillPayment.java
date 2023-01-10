package billingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BillPayment extends javax.swing.JFrame {

    public BillPayment() {
        initComponents();
        loadmeterno();
        loadslno();

    }
    Connection con;
    PreparedStatement pst;
    String url = "jdbc:mysql://localhost:3306/electricitybill";
    String sqluser = "root";
    String sqlpassword = "nclc123";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tfcustomername = new javax.swing.JTextField();
        tfaddress = new javax.swing.JTextField();
        tfcity = new javax.swing.JTextField();
        tfarea = new javax.swing.JTextField();
        tfconsumedunit = new javax.swing.JTextField();
        tfunitprice = new javax.swing.JTextField();
        tftotalbill = new javax.swing.JTextField();
        ddmmeterno = new javax.swing.JComboBox<>();
        tfservicecharge = new javax.swing.JTextField();
        tfmetercharge = new javax.swing.JTextField();
        tfvat = new javax.swing.JTextField();
        tfslno = new javax.swing.JTextField();
        ddmmonth = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tfemail = new javax.swing.JTextField();
        tfphone = new javax.swing.JTextField();
        ddmstatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(204, 0, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Meter_No : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Customer_Name : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("City : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Area : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Consumed_Unit : ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Unit_Price : ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Total_Bill : ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Service_Charge : ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Meter_Charge : ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Vat : ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("SL_No : ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Month : ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Status : ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Email : ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Phone : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Bill Payment");

        jPanel3.setBackground(new java.awt.Color(204, 0, 204));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfcustomername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfaddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfcity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfarea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfconsumedunit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfconsumedunit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfconsumedunitActionPerformed(evt);
            }
        });
        tfconsumedunit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfconsumedunitKeyReleased(evt);
            }
        });

        tfunitprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfunitprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfunitpriceActionPerformed(evt);
            }
        });

        tftotalbill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tftotalbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftotalbillActionPerformed(evt);
            }
        });

        ddmmeterno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ddmmeterno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ddmmeternoItemStateChanged(evt);
            }
        });

        tfservicecharge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfmetercharge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfvat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfslno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ddmmonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ddmmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jPanel4.setBackground(new java.awt.Color(204, 0, 204));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("PAYMENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tfemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfphone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ddmstatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ddmstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Paid" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ddmstatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfcustomername, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfaddress, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfcity, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfarea, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfconsumedunit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfunitprice, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tftotalbill, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ddmmeterno, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfservicecharge, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfmetercharge, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfvat, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfslno, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ddmmonth, javax.swing.GroupLayout.Alignment.LEADING, 0, 190, Short.MAX_VALUE)
                    .addComponent(tfemail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfphone, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ddmmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfslno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ddmmeterno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(tfaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfcity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfarea, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfphone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(tfconsumedunit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfunitprice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfservicecharge, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfmetercharge, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfvat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tftotalbill, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ddmstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tftotalbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftotalbillActionPerformed

    }//GEN-LAST:event_tftotalbillActionPerformed
    void loadmeterno() {
        try {
            con = DriverManager.getConnection(url, sqluser, sqlpassword);
            pst = con.prepareStatement("SELECT meter_no FROM new_customer");
            ResultSet rs = pst.executeQuery();
            String data = "";
            while (rs.next()) {
                data = rs.getString(1);
                ddmmeterno.addItem(data);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                pst.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
    void loadslno(){
        try {
        con = DriverManager.getConnection(url, sqluser, sqlpassword);
        pst = con.prepareStatement("SELECT sl_no FROM show_status ");
        ResultSet rs = pst.executeQuery();
        int slno = 0;
        while(rs.next()){
            slno = rs.getInt(1)+1;
        }
        tfslno.setText(String.valueOf(slno));
        } catch (SQLException e) {
            System.out.println(e);
        }finally {
            try {
                pst.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        
    }

    void loadcustomerinfo() {
        int meterno = Integer.parseInt((String) ddmmeterno.getSelectedItem());
        String cname = "";
        String address = "";
        String city = "";
        String area = "";
        String email = "";
        String phone = "";

        try {
            con = DriverManager.getConnection(url, sqluser, sqlpassword);
            pst = con.prepareStatement("SELECT customer_name,address,city,area,email,phone FROM new_customer WHERE meter_no = ? ");
            pst.setInt(1, meterno);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                cname = rs.getString(1);
                address = rs.getString(2);
                city = rs.getString(3);
                area = rs.getString(4);
                email = rs.getString(5);
                phone = rs.getString(6);
            }
            tfcustomername.setText(cname);
            tfaddress.setText(address);
            tfcity.setText(city);
            tfarea.setText(area);
            tfemail.setText(email);
            tfphone.setText(phone);

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                pst.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
    
    
    void statusinsert(){
        String month = ddmmonth.getSelectedItem().toString();
        int slno = Integer.parseInt(tfslno.getText());
        int meterno = Integer.parseInt((String) ddmmeterno.getSelectedItem());
        String customername = tfcustomername.getText();
        String address = tfaddress.getText();
        String city = tfcity.getText();
        String area = tfarea.getText();
        String email = tfemail.getText();
        String phone = tfphone.getText();
        int consumedunit = Integer.parseInt(tfconsumedunit.getText());
        int unitprice = Integer.parseInt(tfunitprice.getText());
        int servicecharge = Integer.parseInt(tfservicecharge.getText());
        int metercharge = Integer.parseInt(tfmetercharge.getText());
        int vat = Integer.parseInt(tfvat.getText());
        int totalbill = Integer.parseInt(tftotalbill.getText());
        String status = ddmstatus.getSelectedItem().toString();
        
        try {
            con = DriverManager.getConnection(url, sqluser, sqlpassword);
            pst = con.prepareStatement("INSERT INTO show_status VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, month);
            pst.setInt(2, slno);
            pst.setInt(3, meterno);
            pst.setString(4, customername);
            pst.setString(5, address);
            pst.setString(6, city);
            pst.setString(7, area);
            pst.setString(8, email);
            pst.setString(9, phone);
            pst.setInt(10, consumedunit);
            pst.setInt(11, unitprice);
            pst.setInt(12, servicecharge);
            pst.setInt(13, metercharge);
            pst.setInt(14, vat);
            pst.setInt(15, totalbill);
            pst.setString(16, status);
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Your Bill is Already Created");
        } finally {
            try {
                pst.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

        
        
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        statusinsert();
    }//GEN-LAST:event_jButton1ActionPerformed
    void back(){
        MainPage mp = new MainPage();
        mp.setVisible(true);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        back();
    }//GEN-LAST:event_jButton2ActionPerformed


    private void ddmmeternoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ddmmeternoItemStateChanged
        loadcustomerinfo();
    }//GEN-LAST:event_ddmmeternoItemStateChanged

    private void tfconsumedunitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfconsumedunitKeyReleased
        int unitconsumed = Integer.parseInt(tfconsumedunit.getText());
        int unitprice = 0;
        int servicecharge = 30;
        int metercharge = 15;
        int vat = 0;
        int total = 0;
        

        if (unitconsumed > 0 && unitconsumed <= 100) {
            unitprice = 8;
            vat = 5;
            total = (unitconsumed * unitprice)+servicecharge+metercharge+vat;
            tfunitprice.setText(String.valueOf(unitprice));
            tfservicecharge.setText(String.valueOf(servicecharge));
            tfmetercharge.setText(String.valueOf(metercharge));
            tfvat.setText(String.valueOf(vat));
            tftotalbill.setText(String.valueOf(total));
        } else if (unitconsumed > 0 && unitconsumed <= 100) {
            unitprice = 8;
            total = unitconsumed * unitprice;
            tfunitprice.setText(String.valueOf(unitprice));
            tftotalbill.setText(String.valueOf(total));
        } else if (unitconsumed > 100 && unitconsumed <= 200) {
            unitprice = 10;
            total = unitconsumed * unitprice;
            tfunitprice.setText(String.valueOf(unitprice));
            tftotalbill.setText(String.valueOf(total));
        } else if (unitconsumed > 200 && unitconsumed <= 300) {
            unitprice = 12;
            total = unitconsumed * unitprice;
            tfunitprice.setText(String.valueOf(unitprice));
            tftotalbill.setText(String.valueOf(total));
        } else if (unitconsumed > 300 && unitconsumed <= 400) {
            unitprice = 14;
            total = unitconsumed * unitprice;
            tfunitprice.setText(String.valueOf(unitprice));
            tftotalbill.setText(String.valueOf(total));
        } else if (unitconsumed > 400 && unitconsumed <= 500) {
            unitprice = 16;
            total = unitconsumed * unitprice;
            tfunitprice.setText(String.valueOf(unitprice));
            tftotalbill.setText(String.valueOf(total));
        } else if (unitconsumed > 500 && unitconsumed <= 600) {
            unitprice = 18;
            total = unitconsumed * unitprice;
            tfunitprice.setText(String.valueOf(unitprice));
            tftotalbill.setText(String.valueOf(total));
        } else if (unitconsumed > 600 && unitconsumed <= 700) {
            unitprice = 20;
            total = unitconsumed * unitprice;
            tfunitprice.setText(String.valueOf(unitprice));
            tftotalbill.setText(String.valueOf(total));
        } else if (unitconsumed > 700 && unitconsumed <= 800) {
            unitprice = 22;
            total = unitconsumed * unitprice;
            tfunitprice.setText(String.valueOf(unitprice));
            tftotalbill.setText(String.valueOf(total));
        }

    }//GEN-LAST:event_tfconsumedunitKeyReleased

    private void tfunitpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfunitpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfunitpriceActionPerformed

    private void tfconsumedunitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfconsumedunitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfconsumedunitActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ddmmeterno;
    private javax.swing.JComboBox<String> ddmmonth;
    private javax.swing.JComboBox<String> ddmstatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTextField tfaddress;
    private javax.swing.JTextField tfarea;
    private javax.swing.JTextField tfcity;
    private javax.swing.JTextField tfconsumedunit;
    private javax.swing.JTextField tfcustomername;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfmetercharge;
    private javax.swing.JTextField tfphone;
    private javax.swing.JTextField tfservicecharge;
    private javax.swing.JTextField tfslno;
    private javax.swing.JTextField tftotalbill;
    private javax.swing.JTextField tfunitprice;
    private javax.swing.JTextField tfvat;
    // End of variables declaration//GEN-END:variables
}
