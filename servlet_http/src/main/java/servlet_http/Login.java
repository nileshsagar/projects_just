package servlet_http;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/log")
public class Login extends GenericServlet {

	BluePrint bluePrint=new BluePrint();
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		CustomerCrud crud=new CustomerCrud();
		
		String email=req.getParameter("email");
		bluePrint.getEmail();
		String pass=req.getParameter("pass");
		bluePrint.getPassword();
		
		
		
		
		
		if (Customer.email==email && bluePrint.password==pass) {
			
			res.getWriter().print("Login Success");
			
		}	
		else {
			
			res.getWriter().print("Login Failed");
		}
		
		
		
		
		
	}

	
	
}
