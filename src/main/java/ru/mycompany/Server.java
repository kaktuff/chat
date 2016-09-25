package ru.mycompany;

import java.util.concurrent.TimeUnit;

public class Server implements Sendable{

    public DateMessage receiveMessage(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TODO: сделать формирование рандомного сообщения
        // TODO: откуда у сервера имя отправителя?
        // TODO: наверное тут нужно подставлять IP-сервера. Пока непонятный момент
        DateMessage dateMessage = new DateMessage("reandom message", null);
        return dateMessage;
    }

    @Override
    public void sendMassege(DateMessage dateMessage){
        //TODO: тут неплохо бы логгер подключить
        System.out.println("Дата сообщения - " + dateMessage.getDate());
        System.out.println("Текст сообщения" + dateMessage.getMessage());
        System.out.println("Имя отправителя" + dateMessage.getSenderName());
    }
}
