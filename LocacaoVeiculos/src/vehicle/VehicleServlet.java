package vehicle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VehicleServlet")
public class VehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		VehicleDAO vehicleDAO = new VehicleDAO();
		String model = req.getParameter("model");
		String color = req.getParameter("color");
		int year = Integer.parseInt(req.getParameter("year"));
		vehicleDAO.setVehicle(new VehicleBeans(model, year, color));
		
		req.getRequestDispatcher("Vehicle.jsp").forward(req, response);
	}
}
