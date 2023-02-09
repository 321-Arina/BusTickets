package com.example.bustickets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.bustickets.model.ChildTicket;
import com.example.bustickets.model.OldTicket;
import com.example.bustickets.model.ParentTicket;

public class MainActivity extends AppCompatActivity {

    // создание объекта сущности взрослых билетов (стоимость билета, количество билетов)
    ParentTicket busTicket = new ParentTicket(70, 9);
    // создание объекта сущности детских билетов (стоимость билета, количество билетов, скидка)
    ParentTicket busTicketChild = new ChildTicket(70, 11, 50);
    // создание объекта сущности пенсионных билетов (стоимость билета, количество билетов, скидка)
    ParentTicket busTicketOld = new OldTicket(70, 5, 30);

    // создание полей для вывода на экран нужных значений
    private TextView busTicketOut; // поле вывода общей стоимости взрослых билетов
    private TextView busTicketChildOut; // поле вывода общей стоимости детских билетов
    private TextView busTicketOldOut; // поле вывода общей стоимости пенсионных билетов
    private TextView busTicketTotalOut; // поле вывода общей стоимости всех билетов

    // вывод на экран полученных значений
    @Override
    protected void onCreate(Bundle savedInstanceState) { // создание жизненного цикла активности
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // присваивание жизненному циклу активити представления activity_main

        // присваивание переменным активити элементов представления activity_main
        busTicketOut = findViewById(R.id.busTicketOut); // вывод информации стоимости всех взрослых билетов
        busTicketChildOut = findViewById(R.id.busTicketChildOut); // вывод информации стоимости всех детских билетов
        busTicketOldOut = findViewById(R.id.busTicketOldOut); // вывод информации стоимости всех пенсионных билетов
        busTicketTotalOut = findViewById(R.id.busTicketTotalOut); // вывод информации стоимости всех билетов

        // запонение экрана
        // 1) заполнение первого поля воспоьзовавшись методом подсчёта стоимости взрослых билетов ticketPriceAll()
        // С помощью метода Float.toString() мы конвертировали данные из типа float в String
        busTicketOut.setText(Float.toString(busTicket.ticketPriceAll()) + " монет");
        // 2) заполнение второго поля воспользовавшись переопределённым методом подсчёта стоимости детских билетов ticketPriceAll()
        busTicketChildOut.setText(Float.toString(busTicketChild.ticketPriceAll()) + " монет");
        // 3) заполнение третьего поля воспользовавшись переопределённым методом подсчёта стоимости пенсионных билетов ticketPriceAll()
        busTicketOldOut.setText(Float.toString(busTicketOld.ticketPriceAll()) + " монет");
        // 4) заполнение четвёртого поля стоимостью всех билетов
        busTicketTotalOut.setText(Float.toString(busTicket.ticketPriceAll() + busTicketChild.ticketPriceAll() + busTicketOld.ticketPriceAll()) + " монет");

    }
}