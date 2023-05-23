import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/meth")
public class Country extends HttpServlet {

	public Country() {
		System.out.println("Creating no args constr in Country....");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method in Country....");
		System.out.println(req.getRequestURI());
		System.out.println("Ip addrass:" + req.getRemoteAddr());

		Enumeration<String> enumaration = req.getHeaderNames();
		while (enumaration.hasMoreElements()) {
			String headerName = enumaration.nextElement();
			System.out.println(req.getHeader(headerName));

		}

		String name = req.getParameter("name");
		String code = req.getParameter("code");
		String capital = req.getParameter("capitalCity");
		String population = req.getParameter("population");

		System.out.println(name + ":" + code + ":" + capital + ":" + population);
		resp.setContentType("text/html");

		PrintWriter write = resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		write.print("Information of Country...");
		write.print("</h1>");
		write.print(name);
		write.print("<br>");
		write.print(code);
		write.print("<br>");
		write.print(capital);
		write.print("<br>");
		write.print(population);
		write.print("<br>");
		System.out.println("PM name");
		write.print("<br>");

		write.print("<br>");
		write.print("<form method='get' action='pminfo'>");
		write.print("<br>");
		write.print("PM Name:<input type='text' name='pmname'/>");
		write.print("<br>");
		write.print("<input type='submit' value='PMInfo'/>");
		write.print("</form>");
		write.print("</body>");
		write.print("</html>");

	}

}
