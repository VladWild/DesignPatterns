package com.designpatterns.behavioral.mediator.chat;

import com.designpatterns.behavioral.mediator.users.User;

public interface Chat {
    public void sendMessage(String message, User user);
}
