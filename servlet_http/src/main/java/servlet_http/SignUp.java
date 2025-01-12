package servlet_http;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/home")
public class SignUp extends GenericServlet{

	
	  
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	  
		BluePrint bluePrint=new BluePrint();
		
		int id=Integer.parseInt(req.getParameter("id"));
		bluePrint.setId(id);
		
		String name=req.getParameter("name");
		bluePrint.setName(name);
		
		long phn=Long.parseLong(req.getParameter("phone"));
		bluePrint.setPhone(phn);
		
		String email=req.getParameter("email");
		bluePrint.setEmail(email);
		
		String pass=req.getParameter("pass");
		bluePrint.setPassword(pass);
		
		
		CustomerCrud crud=new CustomerCrud();
		
		try {
			int result=crud.signUpCustomer(bluePrint);
			
			if (result!=0) {
				
				res.getWriter().print("SignUp Success!!");
				
			}
			else
			{
				res.getWriter().print("Something went wrong!!");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
