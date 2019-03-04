package serv.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import flipkart.com.dao.UserDao;
import flipkart.com.pojo.Signup;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		int password=Integer.parseInt(request.getParameter("password"));
		int repassword=Integer.parseInt(request.getParameter("repassword"));
		PrintWriter p=response.getWriter();
		UserDao user=new UserDao();
		int i=0;
		try
		{
		if(i==0) {
		i=user.insert(new Signup(emailid,password,repassword));
	
			
			response.sendRedirect("Flipkart.jsp");
		}
		}
		catch(Exception e)
		{
			if(i!=0)
			{
				response.sendRedirect("login.jsp");
			}
		}
		}
		
}
