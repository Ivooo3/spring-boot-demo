package com.demo.springboot.service.impl;

import com.demo.springboot.entity.Ticket;
import com.demo.springboot.repository.TicketRepository;
import com.demo.springboot.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Iterable<Ticket> listTickets() {
        return ticketRepository.findAll();
    }
}
