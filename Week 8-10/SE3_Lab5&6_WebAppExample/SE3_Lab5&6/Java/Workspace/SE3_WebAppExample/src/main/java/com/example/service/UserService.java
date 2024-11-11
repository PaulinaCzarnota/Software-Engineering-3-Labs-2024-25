package com.example.service;

import com.example.business.User;
import com.example.dao.UserDao;
import com.example.exceptions.DaoException;
import java.util.List;
import java.util.ArrayList;

public class UserService {

    // Initialize the UserDao object for database operations
    UserDao dao = new UserDao();
    
    // Method for logging in a user with provided username and password
    public User login(String username, String password){
        
        User u = null;
        try {
            // Attempt to find the user in the database by username and password
            u = dao.findUserByUsernamePassword(username, password);
        } 
        catch (DaoException e) {
            // Print the stack trace in case of an exception
            e.printStackTrace();
        }
        return u; // Return the user object if found, otherwise null
    }
    
    // Method to retrieve all users from the database
    public List<User> getAllUsers() {
        // Create an empty list to store user data
        List<User> user_list = new ArrayList<>();
        
        try {
            // Attempt to fetch all users from the database
            user_list = dao.getAllUsers();
        } catch (DaoException e) {
            // Print the stack trace in case of an exception
            e.printStackTrace();
        }
        
        return user_list; // Return the list of users (empty if error occurred)
    }
}