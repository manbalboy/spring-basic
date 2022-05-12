package com.fastcampus.ch2;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        //서블릿이 초기화 될때 자동 호출되는 메서드
        // 1. 서블릿의 초기화 작업 담당
        System.out.println("[HelloServlet] init() is called.");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("[HelloServlet] service() is called.");
    }

    @Override
    public void destroy() {
        // 3. 뒷처리 - 서블릿이 메모리에서 제거될때 서블릿 컨테이너에 의해서 호출
        System.out.println("[HelloServlet] destroy() is called.");
    }

}
