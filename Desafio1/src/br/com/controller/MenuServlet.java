package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MenuServlet")
public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MenuServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String pressed = req.getParameter("listButton");
		
		if (pressed.equals("Cadastrar Veículo")) {
			req.getRequestDispatcher("Cadastro.jsp").forward(req, res);
		} else if (pressed.equals("Listar Veículos")) {
			req.getRequestDispatcher("Lista.jsp").forward(req, res);
		} else if (pressed.equals("Alugar Veículo")) {
			req.getRequestDispatcher("Alugar.jsp").forward(req, res);
		} else {
			req.getRequestDispatcher("Retorno.jsp").forward(req, res);
		}
	}
}
