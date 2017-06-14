package com.bhusk.controller;


import com.bhusk.utils.ExportUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/")
public class ExportController {

    private static Logger logger = LoggerFactory.getLogger(ExportController.class);

    @RequestMapping("index")
    public String index(HttpServletRequest request, HttpServletResponse response) {

        String context = " \n" +
                "\n" +
                "<html>\n" +
                "  <head>\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "  </head>\n" +
                "  <body>\n" +
                "  <table border=\"2\" align=\"center\" height=\"900px\" width=\"600px\" bordercolor=\"black\">\n" +
                "    <tr class=\"table\" style=\"height: 200px;\">\n" +
                "      <td style=\"width: 50%;\" align=\"center\"> \n" +
                "        <h1>分  析  报  告</h1>\n" +
                "        <h5>Failure Analysis Report</h5>\n" +
                "        <h5>名称：黑壳网</h5>\n" +
                "<a href=\"http://www.bhusk.com\">http:\\\\www.bhusk.com</a>" +
                "      </td>\n" +
                "      \n" +
                "    </tr>\n" +
                "    <tr></tr>\n" +
                "  </table>\n" +
                "  </body>\n" +
                "\n" +
                "</html>\n";

        ExportUtil exportUtil = new ExportUtil();

        exportUtil.exportWord(request, response, context);

        return "index";
    }

}
