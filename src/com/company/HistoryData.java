package com.company;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class HistoryData {
    private String history;

    private String data;
    private List<String> urls;


    public HistoryData(String history,String data) {
        this.history = history;
        this.data = data;
     //   this.urls = urls;
    }

    public HistoryData() {


    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        return "HistoryDate{" +
                "history='" + history + '\'' +
                ", data=" + data +
                '}';
    }


}
