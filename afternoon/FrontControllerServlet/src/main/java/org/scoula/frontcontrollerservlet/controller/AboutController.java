package org.scoula.frontcontrollerservlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutController implements Controller {
    @Override
    public String getView(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("msg", "컨틀러가 전달한 메시지입니다.");
        request.setAttribute("imgSrc", "https://cdn.digitaltoday.co.kr/news/photo/202406/522406_486882_4133.png");
        return "about";
    }
}
