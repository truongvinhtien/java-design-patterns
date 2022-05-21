package com.tvt.facade;

public class EmailService {
    private AuthenService authenService;
    private AuthorService authorService;

    public EmailService() {
        this.authenService = new AuthenService();
        this.authorService = new AuthorService();
    }

    public void sendEmail(User user, EmailContent content) {
        if (authorService.isValid(user)) {
            System.out.println("send email");
        } else {
            System.out.println("you cannot send email");
        }
    }

    public void loadMails(User user) {
        if (authenService.isValid(user)) {
            System.out.println("Emails have been loaded");
        } else {
            System.out.println("Who are you?");
        }
    }
}
