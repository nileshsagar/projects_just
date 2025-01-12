package servlet_http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lifecycle")
public class Conroller  extends HttpServlet{

	public Conroller() {
		System.out.println("Instation ids done!!!");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("init is invoke");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service invoked");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy is invoke");
	}

	
}
