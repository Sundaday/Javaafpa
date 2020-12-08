package com.sundaday.jeu;

public class User {
    private String userFirstname;
    private String userName;
    private String status;

    public User(String userFirstname, String userName, String status) {
        this.userFirstname = userFirstname;
        this.userName = userName;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "userFirstname='" + userFirstname + '\'' +
                ", userName='" + userName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getUserFirstname() {
        return userFirstname;
    }

    public void setUserFirstname(String userFirstname) {
        this.userFirstname = userFirstname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
