/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Radhi Mighri
 */
public class MenuReceptionisteJava extends JFrame{
    private JPanel GestionPanel = null;
     private JToolBar toolbar = null;
    private  JButton GestionClientsBtn = null;
    private JButton GestionFactsBtn = null;
    private  JButton GestionResvBtn = null;
    private  JButton Disconnect = null;
    
    public MenuReceptionisteJava() {
        setTitle("Receptionist Menu ");
        this.setExtendedState(MAXIMIZED_BOTH);
        GestionPanel = (JPanel)getContentPane();
        
        toolbar = new JToolBar(JToolBar.CENTER);
        toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator(); toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator(); toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();
        toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator(); toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator(); toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();
        toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator(); toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator(); toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();toolbar.addSeparator();
        
        
        
        StructureClients ClientS = new StructureClients();
        StructureFacture BillS = new StructureFacture();
        StructureReservation ReservS = new StructureReservation();
        Login LoginI = new Login();
        
        GestionClientsBtn = new JButton("Customer Management");
        GestionClientsBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 ClientS.setVisible(true);
                 BillS.setVisible(false);
                 ReservS.setVisible(false);
            }
        });        
        toolbar.add(GestionClientsBtn);
        toolbar.addSeparator();
        
        GestionFactsBtn = new JButton("Bills Management");
        GestionFactsBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 ClientS.setVisible(false);
                 BillS.setVisible(true);
                 ReservS.setVisible(false);
            }
        });
        toolbar.add(GestionFactsBtn);
        toolbar.addSeparator();
        
        
        GestionResvBtn = new JButton("Reservation Management");
        GestionResvBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 ClientS.setVisible(false);
                 BillS.setVisible(false);
                 ReservS.setVisible(true);
            }
        });
        toolbar.add(GestionResvBtn);
        toolbar.addSeparator();
        
        Disconnect = new JButton("Disconnect");
        Disconnect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 setVisible(false);
                 LoginI.setVisible(true);
                 ClientS.setVisible(false);
                 BillS.setVisible(false);
                 ReservS.setVisible(false);
            }
        });
        toolbar.add(Disconnect);
        toolbar.addSeparator();
        
        toolbar.setFloatable(false);
        GestionPanel.add(toolbar,BorderLayout.NORTH);
        
        
        JLabel imgLabel = new JLabel(new ImageIcon("2.jpg"));
        GestionPanel.add(imgLabel);

        
       
        
    }

     
}
