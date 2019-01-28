
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@WebServlet(urlPatterns = {"/addData"})
public class addData extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String[] params = new String[6];
        params[0] = request.getParameter("eid"); //emp id
        params[1] = request.getParameter("ename"); //emp name
        params[2] = request.getParameter("edept"); //emp department
        params[3] = request.getParameter("edesg"); //emp designation
        params[4] = request.getParameter("esal"); // emp salary
        params[5] = request.getParameter("jdate"); //joining date
        int eid = Integer.parseInt(params[0]);
        float salary = Float.parseFloat(params[4]);
        
        Date date1 = null;
        try { 
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(params[5]);
        } catch (ParseException ex) {
            Logger.getLogger(addData.class.getName()).log(Level.SEVERE, null, ex);
        }
        SessionFactory sessionFactory;
        Transaction transaction;
        Session session;
        
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        transaction = session.getTransaction();
        transaction.begin();
        com.aditya.Employee emp = new com.aditya.Employee(eid, params[1], params[2], params[3], salary, date1);
        session.save(emp);
        transaction.commit();
        session.close();
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/successful.jsp");
        requestDispatcher.forward(request, response);
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet addData</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet addData at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
