
package demomenu;

import static demomenu.Groupe.L;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Tableau extends JFrame {
    private JLabel l1 = new JLabel("Liste des Stagiaires",JLabel.CENTER);
    DefaultTableModel m=new DefaultTableModel();
    JTable jl = new JTable(m);
    String E[] = {"Nom" ,"Prenom" , "Sexe", "Fillier","Niveau"};
    private JButton b1 =new JButton("Supprimer");
    private JButton b2 =new JButton("Fermer");
    
    private JPanel p2 = new JPanel();
    private JPanel p3 = new JPanel();
    private JScrollPane js = new JScrollPane(jl);
public Tableau(){
    ImageIcon n = new ImageIcon("C:/Users/simo/Desktop/1.jpg");
            setIconImage(n.getImage());
    setVisible(true);
    setSize(300,300);
    setTitle("Tableau Stagiaire");
    this.setLocation(250, 200);
    setSize(800,400);
    m.setColumnIdentifiers(E);
    m.addColumn("nom");
    m.addColumn("Prenom");
    m.addColumn("Sexe");
    m.addColumn("Fillier");
    m.addColumn("Niveau");
    Vector<Stagiaire> l= Groupe.L;
    for(int i=0;i<l.size();i++){
    m.addRow(new Object[]{Groupe.L.get(i).getNom(),Groupe.L.get(i).getPrenom(),Groupe.L.get(i).getSexe(),Groupe.L.get(i).getFiliere(),Groupe.L.get(i).getNiveau()});
    }
    
    p3.setForeground(Color.white);
    l1.setForeground(Color.white);
    jl.setForeground(Color.white);
    p3.add(l1);
    
    js.add(jl);
    
    p2.add(b1);
    p2.add(b2);
    add(js);
    add(p2,BorderLayout.SOUTH);
    add(js,BorderLayout.CENTER);
    add(p3,BorderLayout.NORTH);
js.setBackground(Color.DARK_GRAY);
p2.setBackground(Color.DARK_GRAY);
p3.setBackground(Color.DARK_GRAY);
m.addRow(Groupe.L);

    js.setForeground(Color.DARK_GRAY);
    js.setForeground(Color.white);
    int i = jl.getSelectedRow();
    m.removeRow(i);
    
}
    
}