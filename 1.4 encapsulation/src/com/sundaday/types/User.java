package com.sundaday.types;

public class User {
    private String userFirstname;
    private String userName;
    private CategorieUser status;

    public User(String userFirstname, String userName, CategorieUser status) {
        this.userFirstname = userFirstname;
        this.userName = userName;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User" +
                "userFirstname='" + userFirstname + '\n' +
                "userName='" + userName + '\n' +
                "status='" + status + '\n'
                ;
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

    public CategorieUser getStatus() {
        return status;
    }

    public void setStatus(CategorieUser status) {
        this.status = status;
    }
}
