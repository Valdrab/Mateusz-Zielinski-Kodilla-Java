package com.kodilla.good.patterns.challenges;

public class EmailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Dear " + user.getUsername() + ", your order is confirmed");
    }
}
