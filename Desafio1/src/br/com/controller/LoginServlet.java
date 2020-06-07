package br.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, String> usrs = new HashMap<String, String>();

    public LoginServlet() {
        super();
        usrs.put("admin", "admin");
    }
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String usr = req.getParameter("user");
		String pwd = req.getParameter("password");
		
		if (usr.equals("admin")) {
			req.getRequestDispatcher("Lista.jsp").forward(req, res);
		} else {
			req.getSession().setAttribute("user", 1);
			req.getRequestDispatcher("Login.jsp").forward(req, res);
		}
	}
}
