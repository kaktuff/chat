package ru.mycompany;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static ru.mycompany.utils.PropertyName.PORT;

public abstract class AbstractSettings {
    public Properties getProperties(){

        FileInputStream fis;
        Properties property = new Properties();

        try {
            fis = new FileInputStream("src/main/ru.mycompany/resources/config.properties");
            property.load(fis);

        } catch (FileNotFoundException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        } catch (IOException ioEx){
            System.err.println("ОШИБКА: ошибка чтения файла");
        }

        return property;
    }

    public String getPort(){
        return getProperties().getProperty(PORT);
    }
}
