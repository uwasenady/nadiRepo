/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.sql.*;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Elysee
 */
@Entity
@Table(name = "admissionform")
public class AdmissionForm {

    @Column(name = "email")
    private String mail;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String fname;
    private String lname;
    private String sex;

    private int number;
    private String fatherName;
    private String MotherName;
    private String location;
    @Column(name = "dob")
    private Date date;
    @Column(name = "document")
    @Lob
    private byte[] file;
    @Lob
    @Column(name = "photo")
    private byte[] image;

    public AdmissionForm() {
    }

    public AdmissionForm(String mail, String fname, String lname, String sex, int number, String fatherName, String MotherName, String location, Date date, byte[] file, byte[] image) {
        this.mail = mail;
        this.fname = fname;
        this.lname = lname;
        this.sex = sex;
        this.number = number;
        this.fatherName = fatherName;
        this.MotherName = MotherName;
        this.location = location;
        this.date = date;
        this.file = file;
        this.image = image;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return MotherName;
    }

    public void setMotherName(String MotherName) {
        this.MotherName = MotherName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

   
   
}
