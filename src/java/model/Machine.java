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
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author taro.noo
 */
public class Machine implements DatabaseInfo {

    private int mid;
    private String name;
    private String img;
    private Date date;
    private String shortdescription;
    private String description;

    public Machine() {
    }

    public Machine(int mid, String name, String img, Date date, String shortdescription, String description) {
        this.mid = mid;
        this.name = name;
        this.img = img;
        this.date = date;
        this.shortdescription = shortdescription;
        this.description = description;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getShortdescription() {
        return shortdescription;
    }

    public void setShortdescription(String shortdescription) {
        this.shortdescription = shortdescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<Machine> getMachine() {
        ArrayList<Machine> machineList = new ArrayList<>();
        Connection con = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(HOSTNAME, USERNAME, PASSWORD);
            PreparedStatement stmt = con.prepareStatement("select mid, name, img, date, shortdescription, description from machine order by date desc");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String img = rs.getString(3);
                Date date = rs.getDate(4);
                String shortdes = rs.getString(5);
                String des = rs.getString(6);
                machineList.add(new Machine(id, name, img, date, shortdes, des));
            }

        } catch (Exception ex) {
            Logger.getLogger(Machine.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Machine.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return machineList;
    }
}
