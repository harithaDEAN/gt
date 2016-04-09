package com.training.gradle;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/stopLight")
public class StoplightServlet extends HttpServlet {

  SwitchStoplight service = new SwitchStoplight();

  @Override
  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
    throws ServletException, IOException {

    String color = request.getParameter("color");
    String message = service.returnAction(color);
    request.setAttribute("message", message);

    RequestDispatcher dispatcher = getServletContext()
      .getRequestDispatcher("/WEB-INF/results.jsp");

    dispatcher.forward(request, response);
  }

}
