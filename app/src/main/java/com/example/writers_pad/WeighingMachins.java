package com.example.writers_pad;

public class WeighingMachins {

    private String matchinName;
    private String status;

    public WeighingMachins(String matchinName, String status) {
        this.matchinName = matchinName;
        this.status = status;
    }

    public String getMatchinName() {
        return matchinName;
    }

    public void setMatchinName(String matchinName) {
        this.matchinName = matchinName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
