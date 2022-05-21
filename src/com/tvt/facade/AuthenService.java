package com.tvt.facade;

public class AuthenService {
    public boolean isValid(User user) {
        return user.getName().equals("Tien");
    }
}
