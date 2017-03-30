
package demomenu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.JFileChooser;


public class Groupe {
    static Vector<Stagiaire> L = new Vector<Stagiaire>();
    
    
    
    
    public static void ajouter(Stagiaire s){
      
       L.add(s);


}
    
    
    
     public static void Supprimer (String nom,String prenom){
          
              for(int i=0;i<=L.size();i++){
                  if(nom.equals(L.get(i).getNom())&&prenom.equals(L.get(i).getPrenom()))
                  L.remove(i);
                  
              }
          

    }
     public static int cherch(String nom , String prenom ){
           
         for(int i=0;i<L.size();i++){
                  if(nom.equals(L.get(i).getNom())&&prenom.equals(L.get(i).getPrenom())){
                      return (i);
                      
              }
     }
        return -1;
     }
     
         public static void Modifier(String nom , String prenom, Stagiaire s )
       {
           for(int i=0;i<L.size();i++){
                  if(nom.equals(L.get(i).getNom())&&prenom.equals(L.get(i).getPrenom())){
                      L.set(i,s);
                      break ;
              }
           
       }
       }
         public static void enregister(String fichier){
             BufferedWriter ecrire =null ;
             try{
                 ecrire =new BufferedWriter(new FileWriter(fichier+".txt"));
                 for(int i =0 ;i<L.size();i++){
                     ecrire.write(L.get(i).toString());
                     ecrire.newLine();
                     
                 }
                 ecrire.close();
             }
             catch(IOException ex){
                 
             }
            finally{
                 
             }

         }
//  read an entire text file and display in a JTextField in DemoMenu

         

}
