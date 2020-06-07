package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dao.CarDAO;


@WebServlet("/EditarServlet")
public class EditarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public EditarServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		CarDAO carDAO = new CarDAO();
		String id = req.getParameter("id");
		String fabricante = req.getParameter("fabricante");
		String modelo = req.getParameter("modelo");
		String ano = req.getParameter("ano");
		
		carDAO.updateCar(id, fabricante, modelo, ano);
		req.getRequestDispatcher("Lista.jsp").forward(req, res);
	}
}