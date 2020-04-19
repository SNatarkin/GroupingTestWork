package com.company;

import java.util.List;

public class HistoryData {
    private String history;
    private String value;
    private int date;

    public String getHistory() {
        return history;
    }

    public String getValue() {
        return value;
    }


    public List<String> getUrls() {
        return urls;
    }

    private List<String> urls;


    public HistoryData(String history, String value, int date) {
        this.history = history;
        this.value = value;
        this.date = date;
    }

    @Override
    public String toString() {
        return "HistoryDate{" +
                "history='" + history + '\'' +
                ", value='" + value + '\'' +
                ", date=" + date +
                '}';
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }
}
