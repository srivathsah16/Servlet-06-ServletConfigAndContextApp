package in.srivath.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//getting config object
		ServletConfig config = getServletConfig();
		String msg = config.getInitParameter("msg1");
		
		//getting context object
		ServletContext context = getServletContext();
		String website = context.getInitParameter("website");

		PrintWriter pw = resp.getWriter();
		pw.append(msg + "----" + website);
	}
}
