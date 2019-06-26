package com.jdklueber.madlibs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MadlibsController {
    @GetMapping("/")
    public String getIndex(Model model) {
        return "index";
    }

    @PostMapping("/")
    public String postToIndex(HttpServletRequest request, Model model) {
        model.addAttribute("storyTitle", "A Pixie's Day Out");
        model.addAttribute("noun1", request.getParameter("noun1"));
        model.addAttribute("name", StringUtils.capitalize(request.getParameter("name")));
        model.addAttribute("adj1", request.getParameter("adj1"));
        model.addAttribute("activity", request.getParameter("activity"));
        model.addAttribute("food", request.getParameter("food"));
        model.addAttribute("place", request.getParameter("place"));
        model.addAttribute("animal", StringUtils.capitalize(request.getParameter("animal")));
        model.addAttribute("describeAPrank", request.getParameter("describeAPrank"));
        model.addAttribute("adj2", request.getParameter("adj2"));
        model.addAttribute("verb1", request.getParameter("verb1"));
        model.addAttribute("verb2", request.getParameter("verb2"));
        model.addAttribute("size", request.getParameter("size"));
        return "madlib_pixie";
    }


}
