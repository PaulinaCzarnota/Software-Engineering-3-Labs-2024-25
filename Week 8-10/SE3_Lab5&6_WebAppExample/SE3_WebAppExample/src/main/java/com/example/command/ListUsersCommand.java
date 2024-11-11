package com.example.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.example.business.User;
import com.example.service.UserService;
import java.util.List;

public class ListUsersCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        // Create instance of UserService to interact with DAO
        UserService userService = new UserService();
        String forwardToJsp = "";

        // Call to the service to retrieve all users
        List<User> allUsers = userService.getAllUsers();

        // Store the list of users in the session
        HttpSession session = request.getSession();
        session.setAttribute("allUsers", allUsers);

        // Forward to the JSP page to display users
        forwardToJsp = "/listUsers.jsp";

        return forwardToJsp;
    }
}