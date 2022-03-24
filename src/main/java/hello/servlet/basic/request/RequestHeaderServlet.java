package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "requestHeaderServlet", urlPatterns = "/request-header")
public class RequestHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        extracted(request);
    }

    private void extracted(HttpServletRequest request) {
        System.out.println("--------- Request Line Start -------------");

        String method = request.getMethod();
        System.out.println("method = " + method);

        String protocol = request.getProtocol();
        System.out.println("protocol = " + protocol);

        String scheme = request.getScheme();
        System.out.println("scheme = " + scheme);

        StringBuffer requestURL = request.getRequestURL();
        System.out.println("requestURL = " + requestURL);


        String queryString = request.getQueryString();
        System.out.println("queryString = " + queryString);

        boolean secure = request.isSecure();
        System.out.println("secure = " + secure);

        System.out.println("--------- Request Line End -------------");
        System.out.println();
    }
}
