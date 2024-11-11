package com.example.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewUserProfileCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String forwardToJsp = "";

        // Forward to the profile view JSP
        forwardToJsp = "/viewUserProfile.jsp";

        return forwardToJsp;
    }
}