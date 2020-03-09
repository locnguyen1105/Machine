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
public class Display implements DatabaseInfo {

    private String content;
    private String img;
    private String title;
    private int count;

    public Display() {
    }

    public Display(String content, String img, String title, int count) {
        this.content = content;
        this.img = img;
        this.title = title;
        this.count = count;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static Display getDisplay() {
        Display display = new Display();
        Connection con = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(HOSTNAME, USERNAME, PASSWORD);
            PreparedStatement stmt = con.prepareStatement("Select content, img, title, count from display");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String cont = rs.getString(1);
                String img = rs.getString(2);
                String title = rs.getString(3);
                int hitcount = rs.getInt(4);
                display = new Display(cont, img, title, hitcount);
            }
        } catch (Exception ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return display;
    }

    public static boolean updateCount(int count) {
        Connection con = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(HOSTNAME, USERNAME, PASSWORD);
            PreparedStatement stmt = con.prepareStatement("Update display set count=?");
            stmt.setInt(1, count);
            int rc = stmt.executeUpdate();
            return rc == 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public static int[] toArray(int n) {
        int[] array = {0, 0, 0, 0, 0, 0, 0};
        for (int i = 6; n > 0; i--) {
            array[i] = n % 10;
            n /= 10;
        }
        return array;
    }
}
