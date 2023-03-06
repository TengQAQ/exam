package com.ming.web.servlet;

import com.alibaba.fastjson2.JSONObject;
import com.ming.service.impl.OrganizationService;
import com.ming.service.impl.OrganizationServiceImpl;
import com.ming.vo.Result;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/api/org")
public class OrganizationServlet extends HttpServlet {
	private final OrganizationService service = new OrganizationServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Result result = service.selectAll();
		String jsonString = JSONObject.toJSONString(result);
		try (PrintWriter writer = resp.getWriter()) {
			writer.write(jsonString);
			writer.flush();
		}
	}
}
