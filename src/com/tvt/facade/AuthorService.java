package com.tvt.facade;

public class AuthorService {
    public boolean isValid(User user) {
        return user.getName().equals("Tien");
    }
}
