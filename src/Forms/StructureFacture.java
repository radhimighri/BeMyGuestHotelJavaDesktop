/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import DB.ConnexionDB;
import DB.Parameter;
import DB.ResultSetTableModel;
import DB.db_connection;
import Entities.Facture;
import static Forms.StructureClients.isNumeric;
import Services.FactureServiceImplement;
import java.awt.Color;
import static java.awt.Color.green;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

import javax.swing.JOptionPane;

/**
 *
 * @author Radhi Mighri
 */
public class StructureFacture extends JFrame {
    ResultSet rs;
    db_connection db;
    Connection cn = ConnexionDB.getConnexion();


    /**
     * Creates new form StructureClients
     */
    public StructureFacture() {
         db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB, new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
         initComponents();
         table();
        setUndecorated(true);
            }
    
 
     
      public void table() {
        FactureServiceImplement fac = new FactureServiceImplement();
        rs= fac.getAllFacture();
        jTable1.setModel(new ResultSetTableModel(rs));
        
        txtamount.setBackground(white);
        datefact.setBackground(white);
        ClientSelect.setBackground(white);        
                CBshowName();

    }
    
     void actualiser() {
        //txtamount.setBackground(new Color(255, 255, 255));
         datefact.setText("");
        txtamount.setText("");
        table();
     }
     
            public void CBshowName(){
     	try {
                        String sql = "SELECT client FROM `reservation` ";
                        Statement stat = cn.createStatement();
                        ResultSet rs = stat.executeQuery(sql);		
                        while(rs.next()){
                            ClientSelect.addItem(rs.getString(1));
                        }
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
 }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        comrecher = new javax.swing.JComboBox();
        txtrecherche = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        reftable = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        datefact = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        Addbtn = new javax.swing.JButton();
        Modifybtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        Refreshbtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ClientSelect = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        ResDetailArea = new javax.swing.JTextArea();
        ShowFactureBtn = new javax.swing.JButton();
        PrintBtn = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clients Management Window");
        setBackground(new java.awt.Color(153, 153, 255));
        setExtendedState(50);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "BILL_ID", "Amount", "Bill_Date"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 102, 102));
        jTable1.setPreferredSize(new java.awt.Dimension(1000, 560));
        jTable1.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTable1.setSelectionForeground(new java.awt.Color(0, 102, 102));
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setBackground(new java.awt.Color(153, 255, 204));
        jLabel7.setFont(new java.awt.Font("Trajan Pro 3", 1, 18)); // NOI18N
        jLabel7.setText("Bills Management");

        jButton1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        comrecher.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "id_facture", "datefacture", "montant" }));
        comrecher.setAlignmentX(1.0F);
        comrecher.setAlignmentY(5.0F);
        comrecher.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        comrecher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comrecherActionPerformed(evt);
            }
        });

        txtrecherche.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Searching by category");

        reftable.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        reftable.setText("Refresh");
        reftable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        reftable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reftableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtrecherche))
                                .addComponent(comrecher, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(reftable, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(116, 116, 116))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comrecher, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtrecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reftable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(155, 155, 155))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 920, 240));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setPreferredSize(new java.awt.Dimension(357, 47));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Bill Date");

        txtamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamountActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Amount");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datefact, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datefact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 255, 204));
        jPanel9.setBorder(new javax.swing.border.MatteBorder(null));

        Addbtn.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Addbtn.setText("Add");
        Addbtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        Modifybtn.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Modifybtn.setText("Modify");
        Modifybtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        Modifybtn.setMaximumSize(new java.awt.Dimension(37, 29));
        Modifybtn.setMinimumSize(new java.awt.Dimension(37, 29));
        Modifybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifybtnActionPerformed(evt);
            }
        });

        Deletebtn.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Deletebtn.setText("Delete");
        Deletebtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        Deletebtn.setMaximumSize(new java.awt.Dimension(37, 29));
        Deletebtn.setMinimumSize(new java.awt.Dimension(37, 29));
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        Refreshbtn.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Refreshbtn.setText("Refresh");
        Refreshbtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        Refreshbtn.setMaximumSize(new java.awt.Dimension(37, 29));
        Refreshbtn.setMinimumSize(new java.awt.Dimension(37, 29));
        Refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Refreshbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(Deletebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Modifybtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Addbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Addbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Modifybtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel6.setPreferredSize(new java.awt.Dimension(357, 47));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Client");

        ClientSelect.setBackground(new java.awt.Color(204, 255, 204));
        ClientSelect.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ClientSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Client" }));
        ClientSelect.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ClientSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ClientSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(ClientSelect, 0, 307, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClientSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ResDetailArea.setColumns(20);
        ResDetailArea.setRows(5);
        jScrollPane2.setViewportView(ResDetailArea);

        ShowFactureBtn.setText("Show Bill");
        ShowFactureBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowFactureBtnActionPerformed(evt);
            }
        });

        PrintBtn.setText("Print it");
        PrintBtn.setToolTipText("");
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(ShowFactureBtn)
                        .addGap(18, 18, 18)
                        .addComponent(PrintBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ShowFactureBtn)
                            .addComponent(PrintBtn)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 920, 270));

        jPanel10.setBackground(new java.awt.Color(255, 0, 0));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Exit.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("X");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Exit.setInheritsPopupMenu(false);
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 600));

        setSize(new java.awt.Dimension(938, 596));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
       if (txtamount.getText().equals("")  ) {
            JOptionPane.showMessageDialog(this, "Please Verify the amount field !!! ");
            txtamount.setBackground(red);
        }
       else if(datefact.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Please Verify the date field !!! ");
                    datefact.setBackground(red);

       }
      else if (isNumeric(txtamount.getText()) == false ){
            txtamount.setBackground(red);
          JOptionPane.showMessageDialog(this, "Amount must be a numeric value!");
      }
       else if (ClientSelect.getSelectedItem()== "Choose Client"){
        JOptionPane.showMessageDialog(this, "Please select a Client!");
         ClientSelect.setBackground(red);

        }
      else {
            Date datef = null;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");

    String date1 = datefact.getText();

    try {
      datef = simpleDateFormat.parse(date1);
        
                  Facture f = new Facture(null,txtamount.getText() , datefact.getText(),ClientSelect.getSelectedItem().toString());
                  FactureServiceImplement fact = new FactureServiceImplement(); 
                  fact.addFacture(f);
                  
                    table();  
                    txtamount.setBackground(green);
                    datefact.setBackground(green);
                    JOptionPane.showMessageDialog(this, "Bill was added with success");  

    } catch (ParseException e) {
     JOptionPane.showMessageDialog(this, "Please verify the date format (DD/MM/YYYY) !");
      System.out.println("Errerrrrr");
    }

      
       }
        
   
      
    }//GEN-LAST:event_AddbtnActionPerformed

    private void comrecherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comrecherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comrecherActionPerformed

    private void RefreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshbtnActionPerformed

        actualiser();
       
  
    }//GEN-LAST:event_RefreshbtnActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed


        String id = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
         if (!txtamount.getText().equals("")){
             if (JOptionPane.showConfirmDialog(this, "Are you sure you want permanently delete this bill?", "Delete Bill", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                 
                  FactureServiceImplement fact = new FactureServiceImplement(); 
                  fact.delFacture(id);
                    actualiser();  
           
        } else {
            return;
        }
        table();        
    }else
           JOptionPane.showMessageDialog(this,"Please select a bill !","ATTENTION",JOptionPane.OK_OPTION);    
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        txtamount.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1)));
        datefact.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2)));
        ClientSelect.setSelectedItem(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 3)));

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtrecherche.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Field cannot be empty!");
        } 
        else {
            if (comrecher.getSelectedItem().equals("datefacture")) {
                System.out.println("\n Done Test 1 \n");
                FactureServiceImplement cl = new FactureServiceImplement();
                rs= cl.getAllFactureWhere("datefacture LIKE '%" + txtrecherche.getText() + "%' ");
                jTable1.setModel(new ResultSetTableModel(rs));            
            } 
            else if (comrecher.getSelectedItem().equals("id_facture")) {
                
                 FactureServiceImplement fac = new FactureServiceImplement();
                rs= fac.getAllFactureWhere("id_facture LIKE '%" + txtrecherche.getText() + "%' ");
                jTable1.setModel(new ResultSetTableModel(rs));
            
            }
            else if (comrecher.getSelectedItem().equals("montant")) {
                FactureServiceImplement fac = new FactureServiceImplement();
                rs= fac.getAllFactureWhere("montant LIKE '%" + txtrecherche.getText() + "%' ");
                jTable1.setModel(new ResultSetTableModel(rs));
            }
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtamountActionPerformed

    private void ModifybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifybtnActionPerformed

       if (txtamount.getText().equals("")  ) {
            JOptionPane.showMessageDialog(this, "Please Verify the amount field !!! ");
            txtamount.setBackground(red);
        }
       else if(datefact.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Please Verify the date field !!! ");
                    datefact.setBackground(red);

       }
       else if( isNumeric(txtamount.getText()) == false )
              {           
                  txtamount.setBackground(red);
                  JOptionPane.showMessageDialog(this, "Person number must be a numeric !!! ");
              }
         else if (ClientSelect.getSelectedItem()== "Choose Client"){
        JOptionPane.showMessageDialog(this, "Please select a Client!");
         ClientSelect.setBackground(red);

        }
       else {

            String id = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                  
                  Facture f = new Facture(null,txtamount.getText(),datefact.getText(),ClientSelect.getSelectedItem().toString());
                  FactureServiceImplement fact = new FactureServiceImplement(); 
                  fact.EditFact(f,id);
                  table(); 
                  txtamount.setBackground(green);
                  datefact.setBackground(green);
                  JOptionPane.showMessageDialog(this, "Bill was modified with success");  
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ModifybtnActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
       this.setVisible(false);
       System.out.println("Exit");
        
    }//GEN-LAST:event_ExitMouseClicked

    private void reftableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reftableActionPerformed
        table();
        txtrecherche.setText("");
    }//GEN-LAST:event_reftableActionPerformed

    private void ClientSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientSelectActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_ClientSelectActionPerformed

    private void ShowFactureBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowFactureBtnActionPerformed
        ResDetailArea.setText("\tWelcome To BeMy Guest Hotel\n\n\t          Bill Details: \n\n" +
            "\nClient : \t\t\t"+ ClientSelect.getSelectedItem().toString()+
            "\n=================================================================\n"+
            "\nBill Date : \t\t\t"+datefact.getText()+
            "\nGuest Name : \t\t\t"+ ClientSelect.getSelectedItem().toString()+
            "\nAmount : \t\t\t"+txtamount.getText()
        );

    }//GEN-LAST:event_ShowFactureBtnActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed

        try {
            ResDetailArea.print();
            jPanel1.setFocusable(false);

            // TODO add your handling code here:
        } catch (PrinterException ex) {
            Logger.getLogger(StructureFacture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintBtnActionPerformed

    


    
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
            java.util.logging.Logger.getLogger(StructureFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StructureFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StructureFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StructureFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StructureFacture().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JComboBox ClientSelect;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JLabel Exit;
    private javax.swing.JButton Modifybtn;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JButton Refreshbtn;
    private javax.swing.JTextArea ResDetailArea;
    private javax.swing.JButton ShowFactureBtn;
    private javax.swing.JComboBox comrecher;
    private javax.swing.JTextField datefact;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton reftable;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtrecherche;
    // End of variables declaration//GEN-END:variables
}
