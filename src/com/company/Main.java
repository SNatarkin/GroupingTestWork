package com.company;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    private static final DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");


    public static void main(String[] args) {
        try {
            List<Record> items = Arrays.asList(
                    new Record(dateFormat.parse("11-02-1989"), "123", "glaza", "google.com/id1"),
                    new Record(dateFormat.parse("11-02-1990"), "321", "glaza", "google.com/id2"),
                    new Record(dateFormat.parse("11-02-1986"), "3123", "nos", "google.com/id3"),
                    new Record(dateFormat.parse("11-02-1991"), "3123", "nos", "google.com/id4"),
                    new Record(dateFormat.parse("11-02-1986"), "3123", "glaza", "google.com/id5")
            );


            Map<String, List<Record>> values = items.stream().collect(Collectors.groupingBy(Record::getHistory));

            List<HistoryData> collect = values.entrySet().stream().map(value -> {
                HistoryData historyData = new HistoryData();
                historyData.setHistory(value.getKey());
                Record lastRecord = value.getValue().stream().max(Comparator.comparing(Record::getData)).orElse(null);
                if (lastRecord != null) {
                    historyData.setData(lastRecord.getData().toString());
                }
                List<String> url = value.getValue().stream().map(Record::getImageUrl).collect(Collectors.toList());
                historyData.setUrls(url);
                return historyData;
            }).collect(Collectors.toList());
            System.out.println(collect);


        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}



