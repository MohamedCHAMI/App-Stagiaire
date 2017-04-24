
package demomenu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;




public class DemoMenu extends JFrame
{
   private JMenuBar barre = new JMenuBar ();
   private JMenu fichier = new JMenu ("Fichier");
   private JMenu edition = new JMenu ("Edition");
   private JMenu afficher = new JMenu ("Affiche");
   private JMenuItem ouvrir = new JMenuItem ("Ouvrir");
   private JMenuItem enregistrer = new JMenuItem ("Enregistrer");
   private JMenuItem quitter = new JMenuItem ("Quitter");
   private JMenuItem ajouter = new JMenuItem ("Ajouter");
   private JMenuItem supprimer = new JMenuItem ("Supprimer");
   private JMenuItem modifier = new JMenuItem ("Modifier");
   private JMenuItem list = new JMenuItem ("List Stagiaire");
   private JMenuItem tableau = new JMenuItem ("Tableau Stagiaire");
   
   private JTextArea affiche = new JTextArea();
    public DemoMenu ()
    {
            ImageIcon n = new ImageIcon("C:/Users/simo/Desktop/1.jpg");
            setIconImage(n.getImage());
        setTitle("Les Menus");
        setSize(800,400);
        setBackground(Color.black);
        this.setLocation(250, 200);
        setJMenuBar (barre);
        ouvrir.setBackground(Color.LIGHT_GRAY);
        enregistrer.setBackground(Color.LIGHT_GRAY);
        supprimer.setBackground(Color.LIGHT_GRAY);
        ajouter.setBackground(Color.LIGHT_GRAY);
        modifier.setBackground(Color.LIGHT_GRAY);
        quitter.setBackground(Color.LIGHT_GRAY);
        edition.setBackground(Color.LIGHT_GRAY);
        fichier.setBackground(Color.LIGHT_GRAY);
        
        tableau.setBackground(Color.LIGHT_GRAY);
        list.setBackground(Color.LIGHT_GRAY);
        afficher.setBackground(Color.LIGHT_GRAY);
        barre.setBackground(Color.LIGHT_GRAY);
        barre.add (fichier);
        barre.add (edition);
        add(affiche);
        affiche.setForeground(Color.white);
        affiche.setBackground(Color.DARK_GRAY);
        
        afficher.add(list);
        afficher.add(tableau);
        barre.add(afficher);
        
        affiche.setEditable(false);
        fichier.add(ouvrir);
        //  read an entire text file and display in a JTextField 
                ouvrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
  
                     JFileChooser chooser = new JFileChooser();
                     FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt", "doc" ,"docx");
                     chooser.setFileFilter(filter);
                     chooser.showOpenDialog(null);
                     File f = chooser.getSelectedFile();
                     String filename = f.getAbsolutePath();
                     try{
                         FileReader reader = new FileReader(f);
                         BufferedReader br = new BufferedReader(reader);
                         affiche.read(br, null);
                         br.close();
                         affiche.requestFocus();
                         
                     }catch(Exception exx){
                     }
                     finally{
                         JOptionPane.showMessageDialog(null, "File was opened");

                     }
           }
        });
        fichier.addSeparator ();
        
        
        //Save File TXT
        fichier.add(enregistrer);
            fichier.add(enregistrer);
                         
                          enregistrer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Stagiaire s = new Stagiaire();
        JFileChooser f = new JFileChooser();
        int reponse = f.showSaveDialog(null);
        if(reponse == JFileChooser.APPROVE_OPTION){
            //(reponse == f.JFileChooser.APPROVE_OPTION)
            Groupe.enregister(f.getSelectedFile().toString());
            JOptionPane.showMessageDialog(enregistrer, "Fichier a ete Enregistre");
        }
      //  Groupe.enregister();
        
            }
        });

        fichier.addSeparator ();
        fichier.add(quitter);
        
        //Close Windows
        addWindowListener(new WindowAdapter() {
                     public void windowClosing(WindowEvent e){
                         
                     
                if(JOptionPane.showConfirmDialog(DemoMenu.this, "Voulez_vous quitter ?")==JOptionPane.YES_NO_OPTION){ 
                    System.exit(0);
               }     
                
            }
            });
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        //Menu Quitter
        
        quitter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(JOptionPane.showConfirmDialog(quitter, "Voulez_vous  quitter ?","Quitter",JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
        

        edition.add (ajouter);
                ajouter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Ajouter A = new Ajouter();
            }
        });
        edition.addSeparator ();
        edition.add (supprimer);
                edition.add (supprimer);
                supprimer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Supprimer A = new Supprimer();
                
                    
                
            }
        });
        edition.addSeparator ();
        
        
    edition.add (modifier);
                modifier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Modifier A = new Modifier(); 
            }
        });
                
        fichier.addSeparator ();
        
        
        //Save File TXT
            afficher.add(list);
                         
                          list.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            List l = new List();
            }
        });
                          
                                      afficher.add(tableau);
                         
                          tableau.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tableau t = new Tableau();
            }
        });
                          
        setVisible(true);
        }
    
    public static void main (String[] args){
        DemoMenu D = new DemoMenu ();
    }
}