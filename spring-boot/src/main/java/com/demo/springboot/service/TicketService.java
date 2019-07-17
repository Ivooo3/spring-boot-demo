package com.demo.springboot.service;

import com.demo.springboot.entity.Ticket;

public interface TicketService {

    Iterable<Ticket> listTickets();
}
