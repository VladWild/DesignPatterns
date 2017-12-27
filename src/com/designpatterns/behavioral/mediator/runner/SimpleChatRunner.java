package com.designpatterns.behavioral.mediator.runner;

import com.designpatterns.behavioral.mediator.users.Admin;
import com.designpatterns.behavioral.mediator.chat.SimpleTextChat;
import com.designpatterns.behavioral.mediator.users.SipmleUser;
import com.designpatterns.behavioral.mediator.users.User;

public class SimpleChatRunner {
    public static void main(String[] args){
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SipmleUser(chat, "User 1");
        User user2 = new SipmleUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, I am User 1!!!");
        admin.sendMessage("Roger that. I am admin!!!");
    }
}
