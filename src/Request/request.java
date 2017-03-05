package Request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class request extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		//t1(request);
		
		//t2(request);
		
		
		Enumeration<String> enu=request.getParameterNames();
		while(enu.hasMoreElements())
		{
			String name=enu.nextElement();
			String value=request.getParameter(name);
			System.out.println(name+"="+value);
		}
		
	}




	public void t2(HttpServletRequest request) {
		System.out.println(request.getHeader("Host"));
		
		Enumeration<String> enumeration=request.getHeaderNames();
		
		while(enumeration.hasMoreElements())
		{
			String name=enumeration.nextElement();
			String value=request.getHeader(name);
			System.out.println(name+" "+value);
		}
	}

	
	
	
	public void t1(HttpServletRequest request) {
		String uri=request.getRequestURI();
		String method=request.getMethod();
		
		System.out.println(uri);
		System.out.println(method);
		System.out.println(request.getProtocol());
		System.out.println(request.getRequestURL());
	}

}
