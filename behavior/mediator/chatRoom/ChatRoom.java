package behavior.mediator.chatRoom;

import behavior.mediator.user.User;

public class ChatRoom {
    public static void showMessage(User user, String information){
        System.out.println("User::"+user.getName()+" sent message:: "+ information);
    }

}
