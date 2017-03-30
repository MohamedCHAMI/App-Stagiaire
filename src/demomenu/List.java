
package demomenu;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class List extends JFrame {
    private JLabel l1 = new JLabel("Liste des Stagiaires",JLabel.CENTER);
     JList jl = new JList(Groupe.L);
    private JButton b1 =new JButton("Supprimer");
    private JButton b2 =new JButton("Fermer");
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JPanel p3 = new JPanel();
public List(){
    ImageIcon n = new ImageIcon("C:/Users/simo/Desktop/1.jpg");
            setIconImage(n.getImage());
    setVisible(true);
    setSize(300,300);
    setTitle("List Stagiaire");
    this.setLocation(250, 200);
    setSize(800,400);
    p3.setForeground(Color.white);
    l1.setForeground(Color.white);
    jl.setForeground(Color.white);
    p3.add(l1);
    p1.add(jl);
    p2.add(b1);
    p2.add(b2);
    add(p1,BorderLayout.CENTER);
    add(p2,BorderLayout.SOUTH);
    add(p3,BorderLayout.NORTH);
p1.setBackground(Color.DARK_GRAY);
p2.setBackground(Color.DARK_GRAY);
p3.setBackground(Color.DARK_GRAY);
jl.setListData(Groupe.L);

                  b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

int i = jl.getSelectedIndex();
if(i!=(-1)){
    Groupe.L.remove(i);
    
    jl.setListData(Groupe.L);
    
}else
    JOptionPane.showMessageDialog(List.this, "Selectionner une Ligne");
            }
        });

    
    
}
    
}
