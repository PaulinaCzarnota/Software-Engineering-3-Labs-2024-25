package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.example.business.User;
import com.example.exceptions.DaoException;
import java.util.List;
import java.util.ArrayList;

public class UserDao extends Dao {

    // Find user by username and password
    public User findUserByUsernamePassword(String uname, String pword) throws DaoException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;
        try {
            con = this.getConnection();
            
            String query = "SELECT * FROM USER WHERE USERNAME = ? AND PASSWORD = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, uname);
            ps.setString(2, pword);
            
            rs = ps.executeQuery();
            if (rs.next()) {
                int userId = rs.getInt("ID");
                String username = rs.getString("USERNAME");
                String password = rs.getString("PASSWORD");
                String lastname = rs.getString("LAST_NAME");
                String firstname = rs.getString("FIRST_NAME");
                u = new User(userId, firstname, lastname, username, password);
            }
        } catch (SQLException e) {
            throw new DaoException("findUserByUsernamePassword " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("findUserByUsernamePassword" + e.getMessage());
            }
        }
        return u;     // u may be null 
    }
    
    // Retrieve all users from the database
    public List<User> getAllUsers() throws DaoException {
        List<User> user_list = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            con = this.getConnection();
            
            String query = "SELECT * FROM USER";
            ps = con.prepareStatement(query);
            
            rs = ps.executeQuery();
            while (rs.next()) {
                int userId = rs.getInt("ID");
                String username = rs.getString("USERNAME");
                String password = rs.getString("PASSWORD");
                String lastname = rs.getString("LAST_NAME");
                String firstname = rs.getString("FIRST_NAME");
                User user = new User(userId, firstname, lastname, username, password);
                user_list.add(user);
            }
        } catch (SQLException e) {
            throw new DaoException("getAllUsers " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("getAllUsers" + e.getMessage());
            }
        }
        return user_list;  // may be empty
    }
}