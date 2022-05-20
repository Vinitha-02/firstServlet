package helloservlets;
import java.io.*;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public  class hello extends GenericServlet{
public void service(ServletRequest req,ServletResponse res)
throws IOException,ServletException{


PrintWriter out=res.getWriter();
out.print("Hello generic servlet");


}
}

