package com.example.thanhduy.Entities;

/**
 * Created by DuyDT2 on 11/3/2017.
 */
import java.sql.Date;

public class Account {

    private String username;

    private	String password;

    private	String fullname;

    private String phoneNumber;

    private Date birthday;

    private String address;

    private boolean isOwner;

    private boolean isPlayer;

    private boolean isManager;

    private int countLogin;

    private int pointAward;

    private String userType;

    private String description;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public void setOwner(boolean owner) {
        isOwner = owner;
    }

    public boolean isPlayer() {
        return isPlayer;
    }

    public void setPlayer(boolean player) {
        isPlayer = player;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public int getCountLogin() {
        return countLogin;
    }

    public void setCountLogin(int countLogin) {
        this.countLogin = countLogin;
    }

    public int getPointAward() {
        return pointAward;
    }

    public void setPointAward(int pointAward) {
        this.pointAward = pointAward;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Account(String username, String password, String fullname, String phoneNumber, Date birthday, String address, boolean isOwner, boolean isPlayer, boolean isManager, int countLogin, int pointAward, String userType, String description) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.address = address;
        this.isOwner = isOwner;
        this.isPlayer = isPlayer;
        this.isManager = isManager;
        this.countLogin = countLogin;
        this.pointAward = pointAward;
        this.userType = userType;
        this.description = description;
    }

    public Account(String username, String password, String userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }
}
