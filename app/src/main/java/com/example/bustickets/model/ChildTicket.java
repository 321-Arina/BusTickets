package com.example.bustickets.model;

public class ChildTicket extends ParentTicket {

    // задание полей
    private float ticketDiscount; // скидка на детский билет

    // создание пустого конструктора
    public ChildTicket() {
    }
    // создание конструктора исходных данных детского билета (стоимость билета, количество билетов, скидка)
    public ChildTicket(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    // переопределение метода подсчёта стоимости детских билетов
    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount))/100; // нужно умножить количество билетов на стоимость одного билета и на скидку и всё разделить на 100
    }

}
