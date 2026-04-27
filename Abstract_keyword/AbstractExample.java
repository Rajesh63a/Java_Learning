abstract class Notification {
    abstract public void sendMessage();
}

class EmailNotification extends Notification{
    public void sendMessage() {
        System.out.println("Message sending through EmailNotification");
    }

    public void confirm(){
        System.out.println("Message sent through EmailNotification");
    }
}

class SMSNotification extends Notification {
    public void sendMessage(){
        System.out.println("Message sent through SMSNotification");
    }
}

class PushNotification extends Notification {
    public void sendMessage(){
        System.out.println("Message sent through PushNotification");
    }
}

public class AbstractExample{
    public static void main(String[] args){

        Notification notify = new EmailNotification();       // Dynamic Method Dispatch -- runtime polymorphism using parent reference.
        notify.sendMessage();
        //notify.confirm();                                    // gives error because with parent reference we can't access child methods.

        notify = new SMSNotification();
        notify.sendMessage();

        notify = new PushNotification();
        notify.sendMessage();

        // Anonymous Inner class

        Notification notifyy = new Notification()
        {
            public void sendMessage() {
                System.out.println("Message sent through DefaultNotification");
            }
        };

        notifyy.sendMessage();


    }
}
