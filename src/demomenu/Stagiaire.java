/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demomenu;

/**
 *
 * @author simo
 */
public class Stagiaire {
    private String Nom ;
    private String Prenom ;
    private String sexe ;
    private String filiere;
    private String niveau;


    
    //Getter & Setter

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

 


    //toString

    @Override
    public String toString() {
        return  Nom +" "+  Prenom +" " + sexe +" "+ filiere +" "+ niveau  ;
    }
// Constructre

    public Stagiaire(String Nom, String Prenom, String sexe, String filiere, String niveau) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.sexe = sexe;
        this.filiere = filiere;
        this.niveau = niveau;
    }

    public Stagiaire(String Nom, String Prenom) {
        this.Nom = Nom;
        this.Prenom = Prenom;
    }

    
    public Stagiaire(){
        
    }
    
    
    
}
