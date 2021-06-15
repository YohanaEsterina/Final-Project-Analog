
package YOHANA;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Kasir extends javax.swing.JFrame {

    public ArrayList menu = new ArrayList();
    public ArrayList harga = new ArrayList();
    public ArrayList jumlah = new ArrayList();
    public ArrayList subtotal = new ArrayList();
    
    public Kasir() {
        initComponents();
    }

    private void setHargaMakanan(){
        int harga = 0;
        int pilihan = cbMakanan.getSelectedIndex();
        switch(pilihan){
            case 1:
                harga = 13000;
                break;
            case 2:
                harga = 12000;
                break;
            case 3:
                harga = 7000;
                break;
            case 4:
                harga = 12000;
                break;
            case 5:
                harga = 7000;
                break;
        }
        txtHargaMakanan.setText("" + harga);
    }
    
    private void setHargaMinuman(){
       
        int harga = 0;
        int pilihan = cbMinuman.getSelectedIndex();
        switch(pilihan){
            case 1:
                harga = 3000;
                break;
            case 2:
                harga = 5000;
                break;
            case 3:
                harga = 5000;
                break;
            case 4:
                harga = 3000;
                break;
            case 5:
                harga = 3000;
                break;
        }
        txtHargaMinuman.setText("" + harga);
        
//        int harga;
//        if(cbMinuman.getSelectedIndex() == 0)
//            harga = 0;
//        else
//            harga = 4000;
//        
//        txtHargaMinuman.setText("" + harga);
    }
    
    private void setTable(){
        int total = 0;
        double pajak = 0;
        int bayar = 0;
        
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Menu");
        tbl.addColumn("Harga");
        tbl.addColumn("Jumlah");
        tbl.addColumn("Sub Total");
        
        for(int n=0; n<menu.size(); n++){
            total = total + Integer.parseInt(subtotal.get(n).toString());
            
            tbl.addRow(new Object[]{
                menu.get(n),
                harga.get(n),
                jumlah.get(n),
                subtotal.get(n),
            });
        }
        pajak = total * 0.03;
        bayar = (int) (total + pajak);
        
        dataTabel.setModel(tbl);
        txtTotal.setText("" + total);
        txtPajak.setText("" + pajak);
        txtTotalBayar.setText("" + bayar);
    }
    
    private boolean cekKosong(boolean makanan){
        boolean hasil = true;
        
        if(makanan == true){
            if(txtJumlahMakanan.getText().isEmpty() == true){
                JOptionPane.showMessageDialog(null, "Jumlah makanan harus diisi!");
                hasil = true;
            }
        }else{
            if(txtJumlahMinuman.getText().isEmpty() == true){
                JOptionPane.showMessageDialog(null, "Jumlah minuman harus diisi!");
                hasil = true;
            }
        }
        return false;
    }
    
    private boolean cekDataTabel(String data){
       boolean hasil = menu.contains(data);
       if(hasil == true) JOptionPane.showMessageDialog(null, "Menu sudah ditambahkan sebelumnya.");
       return hasil;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbMakanan = new javax.swing.JComboBox<>();
        txtHargaMakanan = new javax.swing.JTextField();
        btnMakanan = new javax.swing.JButton();
        txtJumlahMakanan = new javax.swing.JTextField();
        txtSubTotalMakanan = new javax.swing.JTextField();
        btnTambahMinuman = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbMinuman = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtHargaMinuman = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtJumlahMinuman = new javax.swing.JTextField();
        txtSubTotalMinuman = new javax.swing.JTextField();
        btnMinuman = new javax.swing.JButton();
        btnTambahMakanan = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTabel = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtPajak = new javax.swing.JTextField();
        txtTotalBayar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtJumlahBayar = new javax.swing.JTextField();
        txtKembalian = new javax.swing.JTextField();
        btnBayar = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yohana Esterina_H1051201057");
        setResizable(false);

        jLabel2.setText("Menu Makanan :");

        jLabel3.setText("Harga :");

        jLabel4.setText("Jumlah :");

        jLabel5.setText("Sub Total :");

        cbMakanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -", "Ayam Geprek", "Nasi Goreng", "Nasi Kuning", "Mie Tiaw Goreng", "Bubur Ayam", " " }));
        cbMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMakananActionPerformed(evt);
            }
        });

        txtHargaMakanan.setEditable(false);
        txtHargaMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaMakananActionPerformed(evt);
            }
        });

        btnMakanan.setText("*");
        btnMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakananActionPerformed(evt);
            }
        });

        txtSubTotalMakanan.setEditable(false);

        btnTambahMinuman.setText("Tambahkan");
        btnTambahMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahMinumanActionPerformed(evt);
            }
        });

        jLabel6.setText("Menu Minuman :");

        cbMinuman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -", "Es Teh", "Es Jeruk", "Es Kelapa", "Es Tahu", "Air Mineral" }));
        cbMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMinumanActionPerformed(evt);
            }
        });

        jLabel7.setText("Harga :");

        txtHargaMinuman.setEditable(false);

        jLabel8.setText("Jumlah :");

        txtSubTotalMinuman.setEditable(false);

        btnMinuman.setText("*");
        btnMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinumanActionPerformed(evt);
            }
        });

        btnTambahMakanan.setText("Tambahkan");
        btnTambahMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahMakananActionPerformed(evt);
            }
        });

        jLabel10.setText("Sub Total :");

        dataTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Menu", "Harga", "Jumlah", "Sub Total"
            }
        ));
        jScrollPane1.setViewportView(dataTabel);

        jLabel11.setText("Total :");

        jLabel12.setText("Pajak (3%) :");

        jLabel13.setText("Total Bayar :");

        txtTotal.setEditable(false);

        txtPajak.setEditable(false);

        txtTotalBayar.setEditable(false);

        jLabel14.setText("Jumlah Bayar :");

        jLabel15.setText("Kembalian :");

        txtKembalian.setEditable(false);

        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblInfo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("RUMAH MAKAN SISKOM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(182, 182, 182))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPajak, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtTotal)
                            .addComponent(txtTotalBayar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtJumlahBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKembalian, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnBayar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtJumlahMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMakanan, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                                    .addComponent(txtSubTotalMakanan)
                                    .addComponent(cbMakanan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHargaMakanan)))
                            .addComponent(btnTambahMakanan))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtJumlahMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnTambahMinuman)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbMinuman, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)
                                    .addComponent(txtSubTotalMinuman, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHargaMinuman, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(cbMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHargaMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtHargaMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(btnMakanan)
                        .addComponent(txtJumlahMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMinuman)
                        .addComponent(txtJumlahMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSubTotalMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubTotalMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahMakanan)
                    .addComponent(btnTambahMinuman))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtJumlahBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPajak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBayar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        setBounds(380, 40, 612, 636);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahMinumanActionPerformed
        // TODO add your handling code here:
        if(cekKosong(false) == false){
            String menuItem = cbMinuman.getSelectedItem().toString();
            if(cekDataTabel(menuItem) == false){
                int hrg = Integer.parseInt(txtHargaMinuman.getText());
                int kuantiti = Integer.parseInt(txtJumlahMinuman.getText());
                txtSubTotalMinuman.setText("" + (hrg*kuantiti));
                
                menu.add(menuItem);
                harga.add(txtHargaMinuman.getText());
                jumlah.add(txtJumlahMinuman.getText());
                subtotal.add(txtSubTotalMinuman.getText());
                
                setTable();
            }
        }
        cbMinuman.setSelectedIndex(0);
        txtHargaMinuman.setText("");
        txtJumlahMinuman.setText("");
        txtSubTotalMinuman.setText("");
    }//GEN-LAST:event_btnTambahMinumanActionPerformed

    private void btnTambahMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahMakananActionPerformed
        // TODO add your handling code here:
        if(cekKosong(true) == false){
            String menuItem = cbMakanan.getSelectedItem().toString();
            if(cekDataTabel(menuItem) == false){
                int hrg = Integer.parseInt(txtHargaMakanan.getText());
                int kuantiti = Integer.parseInt(txtJumlahMakanan.getText());
                txtSubTotalMakanan.setText("" + (hrg*kuantiti));
                
                menu.add(menuItem);
                harga.add(txtHargaMakanan.getText());
                jumlah.add(txtJumlahMakanan.getText());
                subtotal.add(txtSubTotalMakanan.getText());
                
                setTable();
            }
        }
        cbMakanan.setSelectedIndex(0);
        txtHargaMakanan.setText("");
        txtJumlahMakanan.setText("");
        txtSubTotalMakanan.setText("");
    }//GEN-LAST:event_btnTambahMakananActionPerformed

    private void txtHargaMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaMakananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaMakananActionPerformed

    private void cbMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMakananActionPerformed
        // TODO add your handling code here:
        setHargaMakanan();
    }//GEN-LAST:event_cbMakananActionPerformed

    private void btnMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakananActionPerformed
        // TODO add your handling code here:
        try{
            int hargaMakanan = Integer.parseInt(txtHargaMakanan.getText());
            int jumlahMakanan = Integer.parseInt(txtJumlahMakanan.getText());
            txtSubTotalMakanan.setText("" + (hargaMakanan*jumlahMakanan));
        }catch(NumberFormatException e){
            txtSubTotalMakanan.setText("0");
        }
    }//GEN-LAST:event_btnMakananActionPerformed

    private void cbMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMinumanActionPerformed
        // TODO add your handling code here:
        setHargaMinuman();
    }//GEN-LAST:event_cbMinumanActionPerformed

    private void btnMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinumanActionPerformed
        // TODO add your handling code here:
        try{
            int hargaMinuman = Integer.parseInt(txtHargaMinuman.getText());
            int jumlahMinuman = Integer.parseInt(txtJumlahMinuman.getText());
            txtSubTotalMinuman.setText("" + (hargaMinuman*jumlahMinuman));
        }catch(NumberFormatException e){
            txtSubTotalMinuman.setText("0");
        }
    }//GEN-LAST:event_btnMinumanActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        // TODO add your handling code here:
        int totalBayar = Integer.parseInt(txtTotalBayar.getText());
        int jumlahBayar = Integer.parseInt(txtJumlahBayar.getText());
        
        txtKembalian.setText("" + (jumlahBayar-totalBayar));
        
        lblInfo.setText("*** TERIMA KASIH TELAH BERKUNJUNG ***");
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
//        txtTotal.setText("");
//        txtPajak.setText("");
//        txtTotalBayar.setText("");
        txtJumlahBayar.setText("");
        txtKembalian.setText("");
        lblInfo.setText("");
        
        menu.clear();
        harga.clear();
        jumlah.clear();
        subtotal.clear();
        
        setTable();
        
        
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnMakanan;
    private javax.swing.JButton btnMinuman;
    private javax.swing.JButton btnTambahMakanan;
    private javax.swing.JButton btnTambahMinuman;
    private javax.swing.JComboBox<String> cbMakanan;
    private javax.swing.JComboBox<String> cbMinuman;
    private javax.swing.JTable dataTabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JTextField txtHargaMakanan;
    private javax.swing.JTextField txtHargaMinuman;
    private javax.swing.JTextField txtJumlahBayar;
    private javax.swing.JTextField txtJumlahMakanan;
    private javax.swing.JTextField txtJumlahMinuman;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtPajak;
    private javax.swing.JTextField txtSubTotalMakanan;
    private javax.swing.JTextField txtSubTotalMinuman;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalBayar;
    // End of variables declaration//GEN-END:variables


}
