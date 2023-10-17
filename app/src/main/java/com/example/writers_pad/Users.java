package com.example.writers_pad;

public class Users {
    String buyerMark;
    String lotQuantity;
    String lotMark;
    String packing;
    String numberOfPacks;

    public Users(String buyerMark, String lotQuantity, String lotMark, String packing,String  numberOfPacks) {
        this.buyerMark = buyerMark;
        this.lotQuantity = lotQuantity;
        this.lotMark = lotMark;
        this.packing = packing;
        this.numberOfPacks = numberOfPacks;
    }

    public String getBuyerMark() {
        return buyerMark;
    }

    public void setBuyerMark(String buyerMark) {
        this.buyerMark = buyerMark;
    }

    public String getLotQuantity() {
        return lotQuantity;
    }

    public void setLotQuantity(String lotQuantity) {
        this.lotQuantity = lotQuantity;
    }

    public String getLotMark() {
        return lotMark;
    }

    public void setLotMark(String lotMark) {
        this.lotMark = lotMark;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public String getNumberOfPacks() {
        return numberOfPacks;
    }

    public void setNumberOfPacks(String numberOfPacks) {
        this.numberOfPacks = numberOfPacks;
    }
}
