package com.qa.auto.user_pool;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class UserPool {
    private static UserPool instance = null;

    private Set<User> free = new HashSet<User>();
    private Set<User> used = new HashSet<User>();

    private UserPool() {
        // TODO read users from config file
        free.add(new User("1891a", "111111",
                "test1@mail.com", "test1",
                "user", "789121",
                "Best street, 1", "Lviv",
                "Lviv", "21", "Ukraine"));

        free.add(new User("1891b", "111111",
                "test2@mail.com", "test2",
                "user", "789121",
                "Best street, 1", "Lviv",
                "Lviv", "21", "Ukraine"));

    }

    public static UserPool getInstance() {
        if (instance == null) {
            synchronized (UserPool.class) {
                if (instance == null) {
                    instance = new UserPool();
                }
            }
        }
        return instance;
    }

    public String toString(){
        return "free: " + free.toString() + "\nused: " + used.toString();
    }

    public synchronized User getUser() {
        while (free.isEmpty()) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        User user = free.iterator().next();
        free.remove(user);
        used.add(user);

        return user;
    }

    public synchronized void releaseUser(User user){
        free.add(user);
        used.remove(user);
    }
}
