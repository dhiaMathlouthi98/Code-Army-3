/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;

/**
 *
 * @author WIKI
 */
public class User {
    private String id;
    private String nom;
    private String prenom;
    private String login;
    private String email;
    private String mdp;
    private String ddn;
    private String role;
    private int iddep;

    public User( String nom, String prenom, String login, String email, String mdp, String ddn, String role, int iddep) {
       
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.email = email;
        this.mdp = mdp;
        this.ddn = ddn;
        this.role = role;
        this.iddep = iddep;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getDdn() {
        return ddn;
    }

    public void setDdn(String ddn) {
        this.ddn = ddn;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getIddep() {
        return iddep;
    }

    public void setIddep(int iddep) {
        this.iddep = iddep;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", email=" + email + ", mdp=" + mdp + ", ddn=" + ddn + ", role=" + role + ", iddep=" + iddep + '}';
    }
    
    
    
    
    
}
