package com.unix9.ticket;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unix9.ticket.ticket.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    
}
