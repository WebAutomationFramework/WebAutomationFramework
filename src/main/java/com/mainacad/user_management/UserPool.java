package com.mainacad.user_management;

public class UserPool {
    private static UserPool instance;

    private UserPool(){};
    public static UserPool getInstance() {
        if (instance == null) {
            if (instance == null) {
                instance = new UserPool();
            }
        }
        return instance;
    }

    public UserCredentials getValidUser () {
        return new UserCredentials("j2ee", "j2ee");
    }

    public UserCredentials getInvalidUser () {
        return new UserCredentials("fake_user", "fake_pass");
    }
}
