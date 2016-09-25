package ru.mycompany;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client implements Sendable{
    //TODO: создано доп поле, чтобы потом в message перейти от senderName к ссылке на клиента
    private String name;
    private ClientSettings clientSettings;

    public Client(String name, ClientSettings clientSettings) {
        this.name = name;
        this.clientSettings = clientSettings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientSettings getClientSettings() {
        return clientSettings;
    }

    public void setClientSettings(ClientSettings clientSettings) {
        this.clientSettings = clientSettings;
    }

    @Override
    public void sendMassege(DateMessage dateMessage){
        //TODO: тут неплохо бы логгер подключить
        System.out.println("Дата сообщения - " + dateMessage.getDate());
        System.out.println("Текст сообщения" + dateMessage.getMessage());
        System.out.println("Имя отправителя" + dateMessage.getSenderName());
    }

    public String readMessageConsole(){
        String message = null;
        //TODO: пока для простоты считываем только одну строку
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            message =  br.readLine();
        }catch (IOException ex){
            System.out.println("Ошибка ввода вывода при чтении с консоли");
        }
        return message;
    }

    public DateMessage readMessage(){
        DateMessage dateMessage = new DateMessage(readMessageConsole(), getName());
        return dateMessage;
    }
}
