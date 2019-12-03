package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user1 = new User("JK", "Jan Kowalski", true);
        Product gamepad = new GameController("Playstation DS4 Controller", 159.99, true);
        LocalDateTime orderDate = LocalDateTime.of(2019,12,1,13,33);

        return new OrderRequest(user1, gamepad, orderDate);
    }
}
