package com.example.bustickets.model;

public class OldTicket extends ParentTicket {

    // задание полей
    private float ticketDiscount; // скидка на пенсионный билет

    // создание пустого конструктора
    public OldTicket() {
    }
    // создание конструктора исходных данных пенсионного билета (стоимость билета, количество билетов, скидка)
    public OldTicket(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    // переопределение метода подсчёта стоимости пенсионных билетов
    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount))/100; // нужно умножить количество билетов на стоимость одного билета и на скидку и всё разделить на 100
    }

}

