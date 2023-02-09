package com.example.bustickets.model;

public class ParentTicket {

    // задание полей сущности
    private String departurePoint; // место отправления
    private String arrivalPoint; // место прибытия
    private String departureDate; // время отправления
    private String travelTime; // время пути
    private float ticketPrice; // стоимость взрослого билета
    private int numberOfTickets; // количество билетов

    // создание пустого конструктора
    public ParentTicket() {
    }

    // создание конструктора исходных данных (стоимость билета, количество билетов)
    public ParentTicket(float ticketPrice, int numberOfTickets) {
        this.ticketPrice = ticketPrice; // стоимость взрослого билета
        this.numberOfTickets = numberOfTickets; // количество билетов
    }

    // метод подсчёта стоимости взрослых билетов
    public float ticketPriceAll() {
        return ticketPrice * numberOfTickets; // нужно умножить количество билетов на стоимость одного билета
    }

    // создание геттеров и сеттеров
    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
