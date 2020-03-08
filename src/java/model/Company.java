/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author taro.noo
 */
public class Company implements DatabaseInfo {

    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String country;
    private String img;
    private String description;

    public Company() {
    }

    public Company(String name, String email, String phone, String address, String city, String country, String img, String description) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.country = country;
        this.img = img;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Company{" + "name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address + ", city=" + city + ", country=" + country + ", img=" + img + ", description=" + description + '}';
    }
    

    public static Company getInfo() {
        Company company = new Company();
        Connection con = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(HOSTNAME, USERNAME, PASSWORD);
            PreparedStatement stmt = con.prepareStatement("Select name, email, phone, address, city, country, img, description from company");
            ResultSet rs = stmt.executeQuery();
            rs.next();
            String name = rs.getString(1);
            String email = rs.getString(2);
            String phone = rs.getString(3);
            String address = rs.getString(4);
            String city = rs.getString(5);
            String country = rs.getString(6);
            String img = rs.getString(7);
            String description = rs.getString(8);
            company = new Company(name, email, phone, address, city, country, img, description);
        } catch (Exception ex) {
            Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return company;
    }
    
    public static void main(String[] args) {
        Company c = new Company();
        System.out.println(c.getInfo());
    }
}
