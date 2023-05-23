import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/pminfo")
public class CountryInfo extends HttpServlet {
	public CountryInfo() {
		System.out.println("creating no args constr in CountryInfo");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method in CountryInfo..");
		Enumeration<String> enumaration = req.getHeaderNames();
		while (enumaration.hasMoreElements()) {
			String headerName = (String) enumaration.nextElement();
			System.out.println(headerName + ":" + req.getHeader(headerName));
		}
		String pm = req.getParameter("pmname");

		resp.setContentType("text/html");
		PrintWriter write = resp.getWriter();
		write.print("<html><body bgcolor='pink' ><a href='CountryInfo.html'> click me</a></body></html>");
		write.print(pm);
	}
}
