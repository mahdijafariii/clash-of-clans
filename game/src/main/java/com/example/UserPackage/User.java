package com.example.UserPackage;

public class User {
    private String userName ;
    private String password ;
    private int level ;
    private int map;
    private int win ;
    private int lose ;

    public int getLevel() {
        return level;
    }

    public int getLose() {
        return lose;
    }

    public int getMap() {
        return map;
    }

    public int getWin() {
        return win;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public void setMap(int map) {
        this.map = map;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setWin(int win) {
        this.win = win;
    }
}
