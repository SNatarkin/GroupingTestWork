package com.company;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Record {

    private final String clinic;
    private final Date date;
    private final String history;
    private final String imageUrl;

    public Record(Date data, String clinic, String history, String imageUrl) {
        super();
        this.date = data;
        this.clinic = clinic;
        this.history = history;
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        StringBuilder str = null;
        str = new StringBuilder();
        str.append("Clinic:- ").append(getClinic()).append(" History:- ").append(getHistory()).append(" ImageUrl:- ").append(getImageUrl()).append(" Date:- ").append(dateFormat.format(getData()));
        return str.toString();

    }

    public Date getData() {
        return date;
    }


    public String getClinic() {
        return clinic;
    }


    public String getHistory() {
        return history;
    }


    public String getImageUrl() {
        return imageUrl;
    }


}


