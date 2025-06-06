package com.rays.ctl;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class FrontCtl extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession session = request.getSession();
		
		if (session.getAttribute("user") == null) {
			
			request.setAttribute("error", "Session expired...Plz Login Again...");
			
			RequestDispatcher rd = request.getRequestDispatcher("/Login");
			rd.forward(request, response);
			return false;
			
		}
		
		return true;
	}
}
