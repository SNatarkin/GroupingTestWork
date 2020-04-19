package com.company;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Record> items = Arrays.asList(
                new Record(1, "17", "sec", "glaza2"),
                new Record(2, "18", "one", "glaza"),
                new Record(3, "172", "sec", "nos"),
                new Record(4, "172", "sec", "nos"),
                new Record(5, "18", "one", "glaza")
        );


        Map<String, List<Record>> values = items.stream().collect(
                Collectors.groupingBy(Record::getValues));


        for (Map.Entry<String, List<Record>> item : values.entrySet()) {
            for (Record record : item.getValue()) {
                int data = record.getData();
                String value = record.getValues();
                String history = record.getHistory();
                HistoryData historyData = new HistoryData(history, value, data);
                List<String> urls = Arrays.asList(new String(value));


            }


        }
    }
    }
