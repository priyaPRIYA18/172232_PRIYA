package serv1.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import flipkart.com.dao.UserDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
			String emailid=request.getParameter("email");
			String password=request.getParameter("psw");
			//int password=Integer.parseInt(request.getParameter("password"));
			
			
			UserDao user=new UserDao();
			boolean status=false;
			try
			{
				
				
				
				
				status=user.login(emailid,password);
				System.out.println(status);
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			if(status==true) {
				response.sendRedirect("Flipkart.jsp");
				
			}
		else
	{
			response.sendRedirect("login.jsp");
	}
	}}	