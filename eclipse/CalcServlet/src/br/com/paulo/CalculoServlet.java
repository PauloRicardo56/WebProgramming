package br.com.paulo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculoServlet")
public class CalculoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		String operator = req.getParameter("operator");
		int result = 0;
		
		switch (operator) {
		case "+":
			result = num1 + num2; break;
		case "-":
			result = num1 - num2; break;
		case "*":
			result = num1 * num2; break;
		case "/":
			result = num1 / num2; break;
		}
		
		PrintWriter p = resp.getWriter();
		p.write("<html>");
		p.write("<head>");
		p.write("</head>");
		p.write("<body>");
		p.write("Result: " + result);
		p.write("</body>");
		p.write("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
