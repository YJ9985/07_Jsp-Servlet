package org.scoula.frontcontrollerservlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements Controller {
    @Override
    public String getView(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("imgSrc", "https://i.namu.wiki/i/t0HAYYN8G-1OoPIWV181GxiRpjjSM2kSPiyMLNSA1RUIlar91UzdCvKWbqg8MJ3BnFqoRlL1lpIdgicv-rxkOehqlGeE-gl7XwWkFX25Kwf67GDgt_bRXBP7fAqu_nuMDFBAGc3KWmJCyU0_0znAtw.webp");
        return "index";
    }
}
