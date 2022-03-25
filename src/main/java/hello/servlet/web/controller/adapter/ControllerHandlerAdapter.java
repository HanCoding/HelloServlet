package hello.servlet.web.controller.adapter;

import hello.servlet.web.ModelView;
import hello.servlet.web.controller.MyHandlerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ControllerHandlerAdapter implements MyHandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return false;
    }

    @Override
    public ModelView handle(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException {
        return null;
    }
}
