package lab;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class FormHandle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1>Servlet Form</h1>");
		pw.print("<form>");
		
		pw.print("<div style='margin-bottom: 5px;'><input type='text' placeholder='enter your name' /></div>");
		pw.print("<div style='margin-bottom: 5px;'><input type='number' placeholder='what is your age' /></div>");
		pw.print("<div style='margin-bottom: 5px;'><input type='email' placeholder='your email here' /></div>");
		
		pw.print("</form>");
		pw.print("</body></html>");
		
		pw.close();
	}
}
