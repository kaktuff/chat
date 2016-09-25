package ru.mycompany;

import static ru.mycompany.utils.PropertyName.IPSERVER;
import static ru.mycompany.utils.PropertyName.SENDER_NAME;

public class ClientSettings extends AbstractSettings{

    public String getPropertySenderName(){
        return getProperties().getProperty(SENDER_NAME);
    }

    public String getPropertyIpServer(){
        return getProperties().getProperty(IPSERVER);
    }

}
