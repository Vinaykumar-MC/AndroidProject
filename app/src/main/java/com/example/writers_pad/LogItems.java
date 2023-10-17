package com.example.writers_pad;

public class LogItems {
    private String time;
    private String mark;
    private String weight;
    private String status;

    public LogItems(String time, String mark, String weight, String status) {
        this.time = time;
        this.mark = mark;
        this.weight = weight;
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
