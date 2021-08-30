package behavior.mediator.demo;

import behavior.mediator.chatRoom.ChatRoom;
import behavior.mediator.user.User;

public class MediatorDemo {
    public static void main(String[] args) {
        User yeeTone = new User("YeeTone");
        User wang = new User("WANG");

        yeeTone.sendMessage("YeeTone is very happy today!");
        wang.sendMessage("WANG is also very happy!");
    }
}
