package SocialMedia;

public class User_Test {

    public static void main(String[] args) {

        User user = new User(User.getSocialMedia("facebook"));
        User user1 = new User(User.getSocialMedia("instagram"));
        User user2 = new User(User.getSocialMedia("twitter"));
        User user3 = new User(user.getSocialMedia("whatsapp"));


    }
}
