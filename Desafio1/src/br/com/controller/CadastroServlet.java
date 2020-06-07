package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.bean.CarBean;
import br.com.dao.CarDAO;


/**
 * Servlet implementation class CadastroServlet
 */
@WebServlet("/CadastroServlet")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CadastroServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String f = req.getParameter("fabricante");
		String m = req.getParameter("modelo");
		int a = Integer.parseInt(req.getParameter("ano"));
		
		CarDAO carDAO = new CarDAO(); 
		CarBean car = new CarBean(f, m, a, true);
		
		carDAO.insertCar(car);
		
		req.getRequestDispatcher("Lista.jsp").forward(req, res);
	}
}
