package com.company;

import java.util.List;

public class HistoryData {
    private String history;

    private String data;
    private List<String> urls;


    public HistoryData() {


    }


    public void setData(String data) {
        this.data = data;
    }


    public void setHistory(String history) {
        this.history = history;
    }


    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        return "HistoryData{" +
                "history='" + history + '\'' +
                ", \ndata='" + data + '\'' +
                ", \nurls=" + urls +
                '}';
    }
}
