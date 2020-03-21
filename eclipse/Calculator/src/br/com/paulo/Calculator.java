package br.com.paulo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		writer.write("<html>");
		writer.write("<head>");
			writer.write("<title>Calculadora</title>");
			writer.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">");
			writer.write("<script type=\"text/javascript\" src=\"function.js\"></script>");
			writer.write("<h1 align=\"center\">Calculator</h1>");
			writer.write("</head>");
		writer.write("<body>");
			writer.write("<div align=\"center\">");
				writer.write("<input class=\"textInput\" type=\"number\" id=\"num1\">");
				writer.write("<br><input class=\"textInput\" type=\"number\" id=\"num2\">");
				writer.write("<br><button value=\"+\" onclick=\"calc(this.value)\" class=\"button\">+</button>");
				writer.write("<button value=\"-\" onclick=\"calc(this.value)\" class=\"button\">-</button>");
				writer.write("<button value=\"/\" onclick=\"calc(this.value)\" class=\"button\">/</button>");
				writer.write("<button value=\"*\" onclick=\"calc(this.value)\" class=\"button\">x</button>");
				writer.write("<br><p id=\"result\">Result</p>");
			writer.write("</div>");
		writer.write("</body>");
		writer.write("</html>");
	}
}
