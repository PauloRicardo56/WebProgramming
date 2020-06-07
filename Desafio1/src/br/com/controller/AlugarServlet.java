package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.dao.CarDAO;

@WebServlet("/AlugarServlet")
public class AlugarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public AlugarServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("alugar");
		CarDAO carDAO = new CarDAO();
		
		carDAO.updateCar(id, "0");
		
		req.getRequestDispatcher("Lista.jsp").forward(req, res);
	}
}
