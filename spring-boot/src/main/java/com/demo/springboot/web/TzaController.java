package com.demo.springboot.web;

import com.demo.springboot.service.ApplicationService;
import com.demo.springboot.service.ReleaseService;
import com.demo.springboot.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TzaController {
    @Autowired private ApplicationService applicationService;
    @Autowired private ReleaseService releaseService;
    @Autowired private TicketService ticketService;

    @GetMapping("/applications")
    public String retrieveApplications(Model model){
        model.addAttribute("applications", applicationService.listApplications());
        return "applications";
    }

    @GetMapping("/releases")
    public String retrieveReleases(Model model){
        model.addAttribute("releases", releaseService.listReleases());
        return "releases";
    }

    @GetMapping("/tickets")
    public String retrieveTickets(Model model){
        model.addAttribute("tickets", ticketService.listTickets());
        return "tickets";
    }
}
