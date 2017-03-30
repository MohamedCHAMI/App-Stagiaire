package demomenu ;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Supprimer extends JFrame
{
    private JLabel l1 = new JLabel ("Saisir le nom du stagiaire à supprimer :",JLabel.CENTER);
    private JLabel l2 = new JLabel ("Nom :");
    private JLabel l3 = new JLabel ("Prenom :");
    private JTextField t1 = new JTextField (15);
    private JTextField t2 = new JTextField (15);
    private JButton b1 = new JButton ("Supprimer");
    private JButton b2 = new JButton ("Annuler");
    
    private JPanel p2 = new JPanel ();
    private JPanel p3 = new JPanel ();
    public Supprimer ()
    {
        ImageIcon n = new ImageIcon("C:/Users/simo/Desktop/1.jpg");
            setIconImage(n.getImage());
        setTitle("Supprimer Stagiaire");
        setSize (300,150);
        setVisible(true);
        this.setLocation(450, 200);
        setBackground(Color.LIGHT_GRAY);
  p2.setBackground(Color.LIGHT_GRAY);
  p3.setBackground(Color.LIGHT_GRAY);
    l1.setBackground(Color.LIGHT_GRAY);

        add(l1);
        p2.setLayout(new GridLayout (2,2));
        p2.add(l2);
        p2.add(t1);
        p2.add(l3);
        p2.add(t2);
        p3.add(b1);
        p3.add(b2);
        add(l1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.SOUTH);
        
                  b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

        String nom = t1.getText();
        String prenom = t2.getText();
        Groupe.Supprimer(nom, prenom);
        JOptionPane.showMessageDialog(b1, "Le Stagiaire a ete Supprimer");
        
        
t2.setText("");
t1.setText("");

            }
        });
                  
                  
                                    b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {    
t2.setText("");
t1.setText("");
            }
        });
        
    }
    

}

