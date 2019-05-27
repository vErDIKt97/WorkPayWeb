package app.servlets;

import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        Model model = Model.getInstance();
        List<String> names = model.list();
        httpServletRequest.setAttribute("userNames", names);

        RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("views/list.jsp");
        requestDispatcher.forward(httpServletRequest,httpServletResponse);
    }
}
