package com.ming.web.servlet;

import com.ming.service.EmployeeService;
import com.ming.service.impl.EmployeeServiceImpl;
import com.ming.vo.Result;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

@WebServlet("/api/delete")
public class deleteServlet extends HttpServlet {
	private EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try (
				ServletInputStream inputStream = req.getInputStream();
				InputStreamReader reader = new InputStreamReader(inputStream, "utf-8");
				BufferedReader bufferedReader = new BufferedReader(reader);
				PrintWriter printWriter = resp.getWriter()
		) {
			String line;
			StringBuilder builder = new StringBuilder();
			while ((line = bufferedReader.readLine()) != null) {
				builder.append(line);
			}
			String json = builder.toString();
			System.out.println("==========输出json：（" + json);
			char[] ids=json.toCharArray();
			for (char str1:ids) {
				service.deleteByPrimaryKey(Integer.valueOf(str1));
			}
				Result result;
//				result = service.insertSelective();

//				String toJSONString = JSONObject.toJSONString(result);
//				printWriter.write(toJSONString);
				printWriter.close();
		}
	}
}
