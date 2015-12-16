package com.awsdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = -3150282017356255476L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
        out.println("HELLO AWS");
        out.close();
	}
}
