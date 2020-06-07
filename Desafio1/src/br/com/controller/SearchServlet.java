package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dao.CarDAO;


@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public SearchServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id; 
		
		if ((id = req.getParameter("remover")) != null) {
			CarDAO carDAO = new CarDAO();
			carDAO.removeCar(id);
			req.getRequestDispatcher("Lista.jsp").forward(req, res);
		} else {
			id = req.getParameter("editar");
			req.setAttribute("id", id);
			req.getRequestDispatcher("Editar.jsp").forward(req, res);
		}
	}
}
