package com.company;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Record implements  Comparable<Record>{

    private String clinic;
    private Date date;
    private String history;
    private String imageUrl;

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

    public void setData(Date data) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return clinic.equals(record.clinic) &&
                date.equals(record.date) &&
                history.equals(record.history) &&
                imageUrl.equals(record.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clinic, date, history, imageUrl);
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public  String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    @Override
    public int compareTo(Record o) {
        if (getData() == null || o.getData() == null) {
            return 0;
        }
        return getData().compareTo(o.getData());
    }
}


