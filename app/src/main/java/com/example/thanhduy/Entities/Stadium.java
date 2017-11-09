package com.example.thanhduy.Entities;

/**
 * Created by DuyDT2 on 11/3/2017.
 */
import com.example.thanhduy.Entities.Account;

public class Stadium {

    private String stadiumID;

    private String stadiumName;

    private Account ownerName;

    private String address;

    private String district;

    private String ward;

    private String note;

    private String status;

    private int totalground;

    private int sevenGround;

    private double priceSevenGround;

    private int fiveGround;

    private double priceFiveGround;

    private int elevenGround;

    private double priceElevenGround;

    private boolean haveClothShop;

    private boolean haveCanteen;

    private boolean isFull;

    private int pointReview;

    public String getStadiumID() {
        return stadiumID;
    }

    public void setStadiumID(String stadiumID) {
        this.stadiumID = stadiumID;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public Account getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(Account ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalground() {
        return totalground;
    }

    public void setTotalground(int totalground) {
        this.totalground = totalground;
    }

    public int getSevenGround() {
        return sevenGround;
    }

    public void setSevenGround(int sevenGround) {
        this.sevenGround = sevenGround;
    }

    public double getPriceSevenGround() {
        return priceSevenGround;
    }

    public void setPriceSevenGround(double priceSevenGround) {
        this.priceSevenGround = priceSevenGround;
    }

    public int getFiveGround() {
        return fiveGround;
    }

    public void setFiveGround(int fiveGround) {
        this.fiveGround = fiveGround;
    }

    public double getPriceFiveGround() {
        return priceFiveGround;
    }

    public void setPriceFiveGround(double priceFiveGround) {
        this.priceFiveGround = priceFiveGround;
    }

    public int getElevenGround() {
        return elevenGround;
    }

    public void setElevenGround(int elevenGround) {
        this.elevenGround = elevenGround;
    }

    public double getPriceElevenGround() {
        return priceElevenGround;
    }

    public void setPriceElevenGround(double priceElevenGround) {
        this.priceElevenGround = priceElevenGround;
    }

    public boolean isHaveClothShop() {
        return haveClothShop;
    }

    public void setHaveClothShop(boolean haveClothShop) {
        this.haveClothShop = haveClothShop;
    }

    public boolean isHaveCanteen() {
        return haveCanteen;
    }

    public void setHaveCanteen(boolean haveCanteen) {
        this.haveCanteen = haveCanteen;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public int getPointReview() {
        return pointReview;
    }

    public void setPointReview(int pointReview) {
        this.pointReview = pointReview;
    }

    public Stadium(String stadiumID, String stadiumName, Account ownerName, String address, String district, String ward, String note, String status, int totalground, int sevenGround, double priceSevenGround, int fiveGround, double priceFiveGround, int elevenGround, double priceElevenGround, boolean haveClothShop, boolean haveCanteen, boolean isFull, int pointReview) {
        this.stadiumID = stadiumID;
        this.stadiumName = stadiumName;
        this.ownerName = ownerName;
        this.address = address;
        this.district = district;
        this.ward = ward;
        this.note = note;
        this.status = status;
        this.totalground = totalground;
        this.sevenGround = sevenGround;
        this.priceSevenGround = priceSevenGround;
        this.fiveGround = fiveGround;
        this.priceFiveGround = priceFiveGround;
        this.elevenGround = elevenGround;
        this.priceElevenGround = priceElevenGround;
        this.haveClothShop = haveClothShop;
        this.haveCanteen = haveCanteen;
        this.isFull = isFull;
        this.pointReview = pointReview;
    }

    public Stadium(Account ownerName, String address, String status) {
        this.ownerName = ownerName;
        this.address = address;
        this.status = status;
    }

    @Override
    public String toString() {
        return ownerName.getUsername() +"  "+ address +"  "+ status;
    }
}
