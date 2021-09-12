package mintic.edu.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mintic.edu.modelo.Usuario;
import mintic.edu.modelo.UsuarioDAO;

public class ControladorLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //Entrada. Recuperar los datos del formulario
        if(request.getParameter("btnAcceder")!=null){
                Usuario usu = new Usuario();
                String user = request.getParameter("txtUsuario");
                String pass = request.getParameter("txtPassword");
                usu.setNombreUsuario(user);
                usu.setClave(pass);
                UsuarioDAO login = new UsuarioDAO();
                String estado;
                //Proceso
                try {
                estado = login.login(usu);
                if("true".equals(estado)){
                    HttpSession objSesion = request.getSession();
                    if(usu.getTipoUsuario().equals("Administrador")){
                        objSesion.setAttribute("usuario", user);
                        objSesion.setAttribute("objUsuario", user);
                        objSesion.setAttribute("nivel", "Administrador");
                        //salida
                        response.sendRedirect("jsp/vistaAdministrador.jsp");
                    }else if(usu.getTipoUsuario().equals("Cliente")){
                        objSesion.setAttribute("usuario", user);
                        objSesion.setAttribute("objUsuario", user);
                        objSesion.setAttribute("nivel", "Cliente");
                        //salida
                        response.sendRedirect("jsp/vistaCliente.jsp");
                    }
                }
            } catch (Exception e) {
                //salida
                response.sendRedirect("./jsp/error.html");
            }
            }
        //Proceso
        //Salida
        
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
