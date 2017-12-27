package com.designpatterns.behavioral.chain.runner;

import com.designpatterns.behavioral.chain.notifire.EmailNotifier;
import com.designpatterns.behavioral.chain.notifire.Notifier;
import com.designpatterns.behavioral.chain.notifire.SMSNotifier;
import com.designpatterns.behavioral.chain.notifire.SimpleRoportNtifier;
import com.designpatterns.behavioral.chain.prioryty.Priority;

public class BugTracker {
    public static void main(String[] args){
        Notifier reportNotifier = new SimpleRoportNtifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is OK", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong!", Priority.IMPORTANT);
        reportNotifier.notifyManager("Houston, we've had a problem here!!!", Priority.ASAP);
    }
}
