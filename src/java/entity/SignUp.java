/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.*;

/**
 *
 * @author Elysee
 */
@Entity
@Table (name="signuptable")
public class SignUp {
    
    @Id
    private String mail;
    private String userName;
    private String passWord;

    public SignUp() {
    }

    public SignUp(String mail, String userName, String passWord) {
        this.mail = mail;
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    
    
}
