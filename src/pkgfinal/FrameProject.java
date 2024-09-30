package pkgfinal;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;

public class FrameProject extends javax.swing.JFrame{
    
    public int uang;
    public int hasil_diskon, kembalian, diskon;
    public int x;
    
    //format agar harga menjadi format uang, misal 10000 menjadi 10.000
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
    public FrameProject(){     
        initComponents();
        Kodebarang();
        total();
        Diskon();
    }
    
    //KOP sebagai superclass dan child sebagai subclass, inheritance
    //membuat kelas kop yang berisi string baris, penjaga, dan nama toko
    public class KOP {
        String penjaga = "Kasir : Maryadi";
        String namaToko = "Amanah Swalayan";
        
    }
    
    //membuat kelas turunan dari KOP untuk mengakses String baris, penjaga dan namaToko
    public class child extends KOP {
        public String getBaris(){
            return "=============================================";
        }

        public String getPenjaga(){
            return penjaga;
        }

        public String getNamaToko() {
            return namaToko;
        }
        
        public String terimakasih(){
            return "TERIMAKSIH";
        }
    }

//overriding    
    public class child2 extends child{
        public String terimakasih(){
            return "TERIMAKASIH ATAS KUNJUNGAN ANDA";
        }
        public String getBaris(){
            return "======================^^=====================";
        }
        
    }
    child pep = new child(); //membuat inisialisasi kelas child
    child2 cetak = new child2();

//Override    
//Kode supaya ketika mengetik kode barang akan muncul nama dan harga barang    
    public void Kodebarang(){
        txtKodeBarang.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String kodeBarang;
                kodeBarang = (String) txtKodeBarang.getText();
                
                switch(kodeBarang){
                    case "MLT101" :
                        txtNamaBarang.setText("Molto");
                        txtHargaSatuan.setText("11000");
                        txtQTY.grabFocus();
                        break;
                    case "MYK202" :
                        txtNamaBarang.setText("Minyak");
                        txtHargaSatuan.setText("12000");
                        txtQTY.grabFocus();
                        break;
                    case "PG303" :
                        txtNamaBarang.setText("Pasta Gigi");
                        txtHargaSatuan.setText("8000");
                        txtQTY.grabFocus();
                        break;
                    case "TS404" :
                        txtNamaBarang.setText("Tisu");
                        txtHargaSatuan.setText("6000");
                        txtQTY.grabFocus();
                        break;
                    case "KP505" :
                        txtNamaBarang.setText("Kopi");
                        txtHargaSatuan.setText("2000");
                        txtQTY.grabFocus();
                        break;
                    case "TLR606" :
                        txtNamaBarang.setText("Telur");
                        txtHargaSatuan.setText("20000");
                        txtQTY.grabFocus();
                    case "TPG707" :
                        txtNamaBarang.setText("Tepung");
                        txtHargaSatuan.setText("3000");
                        txtQTY.grabFocus();
                        break;
                    case "BRS808" :
                        txtNamaBarang.setText("Beras");
                        txtHargaSatuan.setText("14500");
                        txtQTY.grabFocus();
                        break;
                    case "GRM919" :
                        txtNamaBarang.setText("Garam");
                        txtHargaSatuan.setText("3000");
                        txtQTY.grabFocus();
                        break;
                    case "SNL212" :
                        txtNamaBarang.setText("Sunlight");
                        txtHargaSatuan.setText("7000");
                        txtQTY.grabFocus();
                        break;
                    case "RNS313" :
                        txtNamaBarang.setText("Rinso");
                        txtHargaSatuan.setText("10000");
                        txtQTY.grabFocus();
                        break;
                    case "INM414" :
                        txtNamaBarang.setText("Indomie");
                        txtHargaSatuan.setText("3000");
                        txtQTY.grabFocus();
                        break;
                    case "SS515" :
                        txtNamaBarang.setText("Susu");
                        txtHargaSatuan.setText("12000");
                        txtQTY.grabFocus();
                        break;
                    case "GL616" :
                        txtNamaBarang.setText("Gula");
                        txtHargaSatuan.setText("9000");
                        txtQTY.grabFocus();
                        break;
                    case "TH717" :
                        txtNamaBarang.setText("Teh");
                        txtHargaSatuan.setText("4000");
                        txtQTY.grabFocus();
                        break;
                    default :
                        txtNamaBarang.setText("");
                        txtHargaSatuan.setText("");
                }
                
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String kodeBarang;
                kodeBarang = (String) txtKodeBarang.getText();
                
                switch(kodeBarang){
                    case "MLT101" :
                        txtNamaBarang.setText("Molto");
                        txtHargaSatuan.setText("11000");
                        txtQTY.grabFocus();
                        break;
                    case "MYK202" :
                        txtNamaBarang.setText("Minyak");
                        txtHargaSatuan.setText("12000");
                        txtQTY.grabFocus();
                        break;
                    case "PG303" :
                        txtNamaBarang.setText("Pasta Gigi");
                        txtHargaSatuan.setText("8000");
                        txtQTY.grabFocus();
                        break;
                    case "TS404" :
                        txtNamaBarang.setText("Tisu");
                        txtHargaSatuan.setText("6000");
                        txtQTY.grabFocus();
                        break;
                    case "KP505" :
                        txtNamaBarang.setText("Kopi");
                        txtHargaSatuan.setText("2000");
                        txtQTY.grabFocus();
                        break;
                    case "TLR606" :
                        txtNamaBarang.setText("Telur");
                        txtHargaSatuan.setText("20000");
                        txtQTY.grabFocus();
                    case "TPG707" :
                        txtNamaBarang.setText("Tepung");
                        txtHargaSatuan.setText("3000");
                        txtQTY.grabFocus();
                        break;
                    case "BRS808" :
                        txtNamaBarang.setText("Beras");
                        txtHargaSatuan.setText("14500");
                        txtQTY.grabFocus();
                        break;
                    case "GRM919" :
                        txtNamaBarang.setText("Garam");
                        txtHargaSatuan.setText("3000");
                        txtQTY.grabFocus();
                        break;
                    case "SNL212" :
                        txtNamaBarang.setText("Sunlight");
                        txtHargaSatuan.setText("7000");
                        txtQTY.grabFocus();
                        break;
                    case "RNS313" :
                        txtNamaBarang.setText("Rinso");
                        txtHargaSatuan.setText("10000");
                        txtQTY.grabFocus();
                        break;
                    case "INM414" :
                        txtNamaBarang.setText("Indomie");
                        txtHargaSatuan.setText("3000");
                        txtQTY.grabFocus();
                        break;
                    case "SS515" :
                        txtNamaBarang.setText("Susu");
                        txtHargaSatuan.setText("12000");
                        txtQTY.grabFocus();
                        break;
                    case "GL616" :
                        txtNamaBarang.setText("Gula");
                        txtHargaSatuan.setText("9000");
                        txtQTY.grabFocus();
                        break;
                    case "TH717" :
                        txtNamaBarang.setText("Teh");
                        txtHargaSatuan.setText("4000");
                        txtQTY.grabFocus();
                        break;
                    default :
                        txtNamaBarang.setText("");
                        txtHargaSatuan.setText("");
                }}

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
  
    
// Kode untuk mengkalikan harga satuan dengan qty yang akan menghasilkan total harga   
    public void total(){
        txtQTY.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent arg0) {
                try{ 
                    int hasil = 0;
                    if(txtQTY.getText().equals("")){
                        hasil = Integer.parseInt(txtHargaSatuan.getText())*0;
                    }
                    else{
                        hasil = Integer.parseInt(txtHargaSatuan.getText())*
                                Integer.parseInt(txtQTY.getText());
                    }
                   txtHargaTotal.setText(String.valueOf(hasil));
                }
                catch (Exception e){
                }
            }
            
            @Override
            public void removeUpdate(DocumentEvent arg0) {
                try{ 
                    int hasil = 0;
                    if(txtQTY.getText().equals("")){
                        hasil = Integer.parseInt(txtHargaSatuan.getText())*0;
                    }
                    else{
                        hasil = Integer.parseInt(txtHargaSatuan.getText())*
                                Integer.parseInt(txtQTY.getText());
                    }
                   txtHargaTotal.setText(String.valueOf(hasil));
                }
                catch (Exception e){
                    
                }
            }

            @Override
            public void changedUpdate(DocumentEvent arg0) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
    }

//membuat kode untuk menambahkan harga satuan yang telah dikalikan dengan qty dan diletakkan di
//textField txtTotalHarga dan di lblHarga    
    private void jmlTotalHarga() {
        int sub_total = 0;
        for(int a = 0; a < tblList.getRowCount(); a++){
            sub_total += Integer.parseInt((String) tblList.getValueAt(a, 5).toString().toString().replace(".",""));
        }
        txtTotalHarga.setText(String.valueOf(sub_total));
       
        //membuat kode total harga bersih di lblHarga
        int totalBersih;
        totalBersih = sub_total;
        lblHarga.setText("Rp. " + nf.format(totalBersih));
    }
    
    //kode action diskon agar bisa muncul nilainya ketika dirun
    private void Diskon(){
        txtDiskon.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {                
                int diskon;
                int x = Integer.parseInt(txtTotalHarga.getText().replace(".", ""));
                diskon = Integer.parseInt(txtTotalHarga.getText().replace(".", "")) * Integer.parseInt(txtDiskon.getText().replace("", "")) / 100;
                hasil_diskon = Integer.parseInt(txtTotalHarga.getText().replace(".", "")) - diskon;
                txtHasilDiskon.setText(nf.format(diskon));
                
                //membuat kode total harga bersih
                int totalBersih;
                totalBersih = hasil_diskon;
                lblHarga.setText("Rp. " + nf.format(totalBersih));}
            @Override
            public void removeUpdate(DocumentEvent e) {
                int diskon, hasil_diskon;
                diskon = Integer.parseInt(txtTotalHarga.getText().replace(".", "")) * (Integer.parseInt(txtDiskon.getText().replace("", "0")) / 100);
                hasil_diskon = Integer.parseInt(txtTotalHarga.getText().replace(".", "")) - diskon;

                txtHasilDiskon.setText(nf.format(diskon));
                
                //membuat kode total harga bersih
                int totalBersih;
                totalBersih = hasil_diskon;
                lblHarga.setText("Rp. " + nf.format(totalBersih));
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                }
        });
    }
//overloading    
    public int info(int x, int diskon) {
        int itung = x - diskon;
        return itung;
    }
    
    
//Kode agar ketika dienter maka akan hilang tulisan yang ada di txtkodebarang dll
    private void kosongkan() {
        txtKodeBarang.setText("");
        txtNamaBarang.setText("");
        txtKodeBarang.grabFocus();
        txtQTY.setText("");
        txtHargaTotal.setText("");
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtKodeBarang = new javax.swing.JTextField();
        txtNoFaktur = new javax.swing.JTextField();
        txtNamaBarang = new javax.swing.JTextField();
        txtHargaSatuan = new javax.swing.JTextField();
        txtQTY = new javax.swing.JTextField();
        txtHargaTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDiskon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblHarga = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ButtonBuy = new javax.swing.JButton();
        ButtonNota = new javax.swing.JButton();
        txtTotalHarga = new javax.swing.JLabel();
        txtHasilDiskon = new javax.swing.JLabel();
        txtKembalian = new javax.swing.JLabel();
        txtUang = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 15)); // NOI18N
        jLabel2.setText("No Faktur");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 15)); // NOI18N
        jLabel3.setText("Kode Barang");

        txtQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoFaktur, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHargaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNoFaktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHargaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tblList.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Kode Barang", "Nama Barang", "Harga", "Jumlah Barang", "Jumlah Harga Barang"
            }
        ));
        jScrollPane1.setViewportView(tblList);

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 15)); // NOI18N
        jLabel4.setText("Total Harga");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 15)); // NOI18N
        jLabel5.setText("Diskon");

        txtDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiskonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 15)); // NOI18N
        jLabel6.setText("Kembalian");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lblHarga.setFont(new java.awt.Font("Kozuka Gothic Pro R", 1, 48)); // NOI18N
        lblHarga.setForeground(new java.awt.Color(255, 255, 255));
        lblHarga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHarga.setText("Rp.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(lblHarga)
                .addGap(26, 26, 26))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setText("Uang");

        ButtonBuy.setText("BUY");
        ButtonBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuyActionPerformed(evt);
            }
        });

        ButtonNota.setText("Cetak Nota");
        ButtonNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNotaActionPerformed(evt);
            }
        });

        txtTotalHarga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtHasilDiskon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtKembalian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtUang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(291, 291, 291)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHasilDiskon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ButtonBuy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                .addComponent(ButtonNota))
                            .addComponent(txtTotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUang))
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel8))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHasilDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBuy)
                    .addComponent(ButtonNota))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiskonActionPerformed
        
    }//GEN-LAST:event_txtDiskonActionPerformed
//Membuat kode agar ketika di enter maka objek dibawah ini akan berpindah ke tabel yang sudah tersedia dan kosong
//ketika sudah di enter
    private void txtQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTYActionPerformed
        if (txtQTY.getText().equals("")){
            return;
        }
        else{
            //inisialisasi objek yang akan dimasukkan ke dalam tabel
            DefaultTableModel model = (DefaultTableModel) tblList.getModel();
            
            Object obj [] = new Object[6];
            obj[1] = txtKodeBarang.getText();
            obj[2] = txtNamaBarang.getText();
            obj[3] = txtHargaSatuan.getText();
            obj[4] = txtQTY.getText();
            obj[5] = txtHargaTotal.getText();
            
            model.addRow(obj);
            //membuat angka nomor pada tabel
            int baris = model.getRowCount();
            for (int a = 0; a < baris; a++){
                String no = String.valueOf(a + 1);
                model.setValueAt(no + ".", a, 0);
            }
            
            tblList.setRowHeight(30);
            
            jmlTotalHarga();
            kosongkan();
        }
    }//GEN-LAST:event_txtQTYActionPerformed
//membuat kode kembalian dengann menggunakan button BUY
    private void ButtonBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuyActionPerformed

        int kembalian;
        uang = Integer.parseInt(txtUang.getText());
        kembalian = uang - hasil_diskon;
        
        if(uang > hasil_diskon){
            txtKembalian.setText(""+kembalian);
            lblHarga.setText("KEMBALIAN ANDA        Rp." + nf.format(kembalian));
        }
        else{
            txtKembalian.setText("Uang anda kurang");
        }
    }//GEN-LAST:event_ButtonBuyActionPerformed
//Membuat kode nota, dimana ketika buuton nota di klik maka akan tampil frame nota yang menunjukkan
    //uang, total belanja, diskon, dan kembalian
    private void ButtonNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNotaActionPerformed
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
        JFrame nota = new JFrame("NOTA BELANJA");
        nota.setDefaultCloseOperation(EXIT_ON_CLOSE);
        nota.setBounds(500, 500, 350, 470);
        nota.setVisible(true);
         
        JPanel panel = new JPanel();
        panel.setBackground(new Color(238, 235, 235));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(new BorderLayout(0, 0));
        setContentPane(panel);
        nota.getContentPane().add(panel);
        
        JLayeredPane layeredpane = new JLayeredPane();
        panel.add(layeredpane, BorderLayout.CENTER);

        JLabel label_1 = new JLabel(pep.getNamaToko());
        label_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
        label_1.setBounds(100, 15, 200, 20);
        layeredpane.add(label_1);

        JLabel line = new JLabel(pep.getBaris());
        line.setBounds(0, 55, 315, 16);
        layeredpane.add(line);

        String today = formatDate.format(new Date());
        JLabel tgl = new JLabel("Tgl : " + today);
        tgl.setBounds(5, 70, 100, 16);
        layeredpane.add(tgl);

        JLabel nama = new JLabel(pep.getPenjaga());
        nama.setBounds(200, 70, 300, 16);
        layeredpane.add(nama);

        JLabel line_2 = new JLabel(pep.getBaris());
        line_2.setBounds(0, 87, 315, 16);
        layeredpane.add(line_2);
        
        JLabel Total = new JLabel("Total Belanja");
        Total.setBounds(10, 120, 315, 16);
        layeredpane.add(Total);
        
        JLabel TotalHarga = new JLabel("Rp."+ txtTotalHarga.getText());
        TotalHarga.setBounds(200, 120, 315, 16);
        layeredpane.add(TotalHarga);
        
        JLabel Uang = new JLabel("Uang Tunai");
        Uang.setBounds(10, 180, 315, 16);
        layeredpane.add(Uang);
        
        JLabel UangTunai = new JLabel("Rp."+ txtUang.getText());
        UangTunai.setBounds(200, 180, 315, 16);
        layeredpane.add(UangTunai);
        
        JLabel HasilDiskon = new JLabel("Diskon");
        HasilDiskon.setBounds(10, 150, 315, 16);
        layeredpane.add(HasilDiskon);
        
        JLabel Diskon = new JLabel("Rp." + txtHasilDiskon.getText().replace(".", ""));
        Diskon.setBounds(200, 150, 315, 16);
        layeredpane.add(Diskon);
        
        JLabel txtKembalian = new JLabel("Kembalian");
        txtKembalian.setBounds(10, 210, 315, 16);
        layeredpane.add(txtKembalian);
        
        JLabel bersih = new JLabel(lblHarga.getText().replace("KEMBALIAN ANDA        ", ""));
        bersih.setBounds(200,210, 315, 16);
        layeredpane.add(bersih);
        
        JLabel line_4 = new JLabel(pep.getBaris());
        line_4.setBounds(0, 240, 315, 16);
        layeredpane.add(line_4);
        
        JLabel akhiran = new JLabel(cetak.terimakasih());
        akhiran.setBounds(40, 270, 315, 16);
        layeredpane.add(akhiran);
        
        JLabel akhiranBaris = new JLabel(cetak.getBaris());
        akhiranBaris.setBounds(0, 290, 315, 16);
        layeredpane.add(akhiranBaris);

    }//GEN-LAST:event_ButtonNotaActionPerformed

    private void txtUangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUangActionPerformed

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
            java.util.logging.Logger.getLogger(FrameProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameProject a = new FrameProject();
                a.setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuy;
    private javax.swing.JButton ButtonNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtHargaSatuan;
    private javax.swing.JTextField txtHargaTotal;
    private javax.swing.JLabel txtHasilDiskon;
    private javax.swing.JLabel txtKembalian;
    private javax.swing.JTextField txtKodeBarang;
    protected static javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtNoFaktur;
    private javax.swing.JTextField txtQTY;
    public javax.swing.JLabel txtTotalHarga;
    private javax.swing.JTextField txtUang;
    // End of variables declaration//GEN-END:variables

    
// membuat tampilan login
    

}

//---------------------NOTE-------------------------//
//set untuk memasukkan nilai, misal di txtTotalHarga.setText(..) itu akan memsukkan nilai pada text field txtTotalHarga
//kemudian untuk memanggil nilai pada set tersebut menggunakan get, misal txtTotalHarga.getText(), disitu akan
//memanggil nilai dari txtTotalHarga yang sebelumnya sudah kita masukkan di txtTotalHarga.setText().

//@Override digunakan untuk menunjukkan bahwa metode (insertUpdate dan deleteUpdate) sengaja mengesampingkan 
//metode dari antarmuka ini. Anotasi @Override membantu menangkap kesalahan pada waktu kompilasi jika metode tidak 
//cocok dengan tanda tangan metode antarmuka yang seharusnya ditimpa.

