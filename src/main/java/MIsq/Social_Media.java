package MIsq;

public class Social_Media {

    String username;
    String password;

    public Social_Media(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) {
        Social_Media social_media = new Social_Media("root", "root");
        System.out.println(social_media);
    }

    @Override
    public String toString() {
        return "MIsq.Social_Media{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
