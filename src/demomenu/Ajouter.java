package demomenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;


public class Ajouter extends JFrame{
JLabel l1=new JLabel("saisir les information:",JLabel.CENTER);
JLabel l2=new JLabel("Nom:");
JLabel l3=new JLabel ("Prenom :");
JLabel l4=new JLabel ("sexe :");
JLabel l5=new JLabel ("filiere :");
JLabel l6=new JLabel ("Niveau :");
JTextField t1=new JTextField(20);
JTextField t2=new JTextField(20);
JButton b1=new JButton ("Ajouter");
JButton b2=new JButton ("Vider");
String T[]={" ","TS","T","Q"};
JComboBox C1=new JComboBox(T);
ButtonGroup G1=new ButtonGroup ();
ButtonGroup G2=new ButtonGroup();
JRadioButton R1=new JRadioButton("F");
JRadioButton R2=new JRadioButton("M");
JRadioButton R3=new JRadioButton("TDI");
JRadioButton R4=new JRadioButton("TRI");
JRadioButton R5=new JRadioButton("TDM");
JPanel p1=new JPanel();
JPanel p2=new JPanel();
JPanel p3=new JPanel();
JPanel p4=new JPanel();
public Ajouter ()  
{ 
 ImageIcon n = new ImageIcon("C:/Users/simo/Desktop/1.jpg");
            setIconImage(n.getImage());   
    setTitle ("Ajouter Stagiaire");
  setVisible (true);
  setSize (300,300);
  setBackground(Color.black);
  this.setLocation(450, 200);
  p1.setBackground(Color.LIGHT_GRAY);
  p2.setBackground(Color.LIGHT_GRAY);
  p3.setBackground(Color.LIGHT_GRAY);
  p4.setBackground(Color.LIGHT_GRAY);
  p1.add(l1);
  p2.setLayout(new GridLayout(0,2));
  p2.add(l2);
  p2.add(t1);
  p2.add(l3);
  p2.add(t2);
  p2.add(l4);
  p3.add(R1);
  p3.add(R2);
  p2.add(p3);
  p2.add(l5);
  p2.add(R3);
  p2.add(new JLabel ());
  p2.add(R4);
  p2.add(new JLabel ());
  p2.add(R5);
  G1.add(R1);
  G1.add(R2);
  G2.add(R3);
  G2.add(R4);
  G2.add(R5);
  p2.add(l6);
  p2.add(C1);
  p4.add(b1);
  p4.add(b2);
   
  setLayout(new BorderLayout());
  add(p1,BorderLayout.NORTH);
  add(p2,BorderLayout.CENTER);
  add(p4,BorderLayout.SOUTH);
  
  //ajouter Button
          b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

        String nom = t1.getText();
        String prenom = t2.getText();
        String sexe ="";
        if(R1.isSelected())
            sexe="Feminine";
        if(R2.isSelected())
            sexe="Masculine"; 
        String filiere ="";
        if(R3.isSelected())
            filiere="Technicien Développement informatique";
        if(R4.isSelected())
            filiere="Technicien Développement Multimedia";
        if(R5.isSelected())
            filiere="Technicien Reseaux informatique";
        String niveau =(String)C1.getSelectedItem();
            Stagiaire s = new Stagiaire(nom, prenom,sexe,filiere,niveau);
        Groupe.ajouter(s);
        JOptionPane.showMessageDialog(b1, "Le Stagiaire a ete Enregistre");
        
        
t2.setText("");
t1.setText("");
G1.clearSelection();
G2.clearSelection();
C1.setSelectedIndex(0);
            }
        });
          
          //Vider les zone de text
                    b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

t2.setText("");
t1.setText("");
G1.clearSelection();
G2.clearSelection();
C1.setSelectedIndex(0);
            }
        });
          //

 
}


    
}
