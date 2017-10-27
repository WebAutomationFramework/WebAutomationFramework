package com.mainacad.user_management;

import java.util.Objects;

public class UserFullInfo {
    private String userID;
    private String userPass;
    private String userEmail;
    private String userFirstName;
    private String userLastName;
    private String userPhoneNumb;
    private String userAddress1;
    private String userCity;
    private String userState;
    private String userZip;
    private String userCountry;

    public UserFullInfo(String userID, String userPass,
                        String userEmail, String userFirstName,
                        String userLastName, String userPhoneNumb,
                        String userAddress1, String userCity,
                        String userState, String userZip, String userCountry) {
        this.userID = userID;
        this.userPass = userPass;
        this.userEmail = userEmail;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userPhoneNumb = userPhoneNumb;
        this.userAddress1 = userAddress1;
        this.userCity = userCity;
        this.userState = userState;
        this.userZip = userZip;
        this.userCountry = userCountry;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserPass() {
        return userPass;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserPhoneNumb() {
        return userPhoneNumb;
    }

    public String getUserAddress1() {
        return userAddress1;
    }

    public String getUserCity() {
        return userCity;
    }

    public String getUserState() {
        return userState;
    }

    public String getUserZip() {
        return userZip;
    }

    public String getUserCountry() {
        return userCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserFullInfo user = (UserFullInfo) o;
        return Objects.equals(getUserID(), user.getUserID());
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserID());
    }
}

