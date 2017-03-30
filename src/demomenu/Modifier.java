package demomenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;


public class Modifier extends JFrame{
    private String value1="Chami";
    private String value2="Mohamed";
JLabel l1=new JLabel("saisir les information:",JLabel.CENTER);
JLabel l2=new JLabel("Nom:");
JLabel l3=new JLabel ("Prenom :");
JLabel l4=new JLabel ("sexe :");
JLabel l5=new JLabel ("filiere :");
JLabel l6=new JLabel ("Niveau :");
JTextField t1=new JTextField(20);
JTextField t2=new JTextField(20);
JButton b1=new JButton ("Rechercher");
JButton b2=new JButton ("Modifier");
String T[]={"TS","T","Q"};
JComboBox C1=new JComboBox(T);
ButtonGroup G1=new ButtonGroup ();
ButtonGroup G2=new ButtonGroup();
JRadioButton R1=new JRadioButton("F");
JRadioButton R2=new JRadioButton("M");
JRadioButton R3=new JRadioButton("TDI");
JRadioButton R4=new JRadioButton("TRI");
JRadioButton R5=new JRadioButton("TDM");
JPanel p2=new JPanel();
JPanel p3=new JPanel();
JPanel p4=new JPanel();
public Modifier ()  
        
{
    ImageIcon n = new ImageIcon("C:/Users/simo/Desktop/1.jpg");
            setIconImage(n.getImage());
            setTitle ("Ajouter Stagiaire");
  setVisible (true);
  setSize (300,300);
  this.setLocation(450, 200);
  setBackground(Color.LIGHT_GRAY);
  p2.setBackground(Color.LIGHT_GRAY);
  p3.setBackground(Color.LIGHT_GRAY);
  p4.setBackground(Color.LIGHT_GRAY);
  add(l1);
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
  l4.setVisible(false);
  l5.setVisible(false);
  R1.setVisible(false);
  R2.setVisible(false);
  R3.setVisible(false);
  R4.setVisible(false);
  R5.setVisible(false);
  l6.setVisible(false);
  C1.setVisible(false);
  setLayout(new BorderLayout());
  add(l1,BorderLayout.NORTH);
  add(p2,BorderLayout.CENTER);
  add(p4,BorderLayout.SOUTH);
 

  
  
          b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
               
                 int r=Groupe.cherch(t1.getText(), t2.getText());
        if(r!=(-1)){
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
                Groupe.Modifier(t1.getText(),t2.getText(),s);
                JOptionPane.showMessageDialog(b2, "Le Statagiaire a ete Modifier ");
                
        }
      /*  JFileChooser f = new JFileChooser();
        int reponse = f.showSaveDialog(null);
        if(reponse == JFileChooser.APPROVE_OPTION){
            //(reponse == f.JFileChooser.APPROVE_OPTION)
            Groupe.enregister(f.getSelectedFile().toString());
            JOptionPane.showMessageDialog(b2, "Stagiaire modifier");
        }*/
      
      
            }
        });

                  b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
        String nom = t1.getText();
        String prenom = t2.getText();
        Stagiaire s = new Stagiaire(nom, prenom);
        int r=Groupe.cherch(nom, prenom);
        if(r==(-1)){
            JOptionPane.showMessageDialog(b1, "Stagiaire inconnu","erreur",JOptionPane.ERROR_MESSAGE);
            b2.setEnabled(false);
        }else{
              l4.setVisible(true);
  l5.setVisible(true);
  R1.setVisible(true);
  R2.setVisible(true);
  R3.setVisible(true);
  R4.setVisible(true);
  R5.setVisible(true);
  l6.setVisible(true);
  C1.setVisible(true);
  b2.setEnabled(true);
        }

        
            }
        });
                  
}

    
}