package com.example.javaeecdi;

import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.SessionScoped;

@SessionScoped
public class SessionBean implements Serializable {

    private Date date;
    
    public SessionBean() {
        date = new Date();
    }
    
    public String getText() {
        return date.toString();
    }
    
}
