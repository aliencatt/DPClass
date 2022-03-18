package SocialMedia;

public class User {

    Social_Media social_media;

    public User(Social_Media social_media) {
        System.out.println("Hello user! You are using " + social_media.getClass().getName());
        this.social_media = social_media;
        this.social_media.chat();
        this.social_media.uploadPhoto();
        this.social_media.create_reel();
        this.social_media.sendRequest();
        System.out.println();

    }

    //factory method

    public static Social_Media getSocialMedia(String social_media) {
        if (social_media.toLowerCase() == "facebook") {
            return new Facebook();
        }
        if (social_media.toLowerCase() == "whatsapp") {
            return new Whatsapp();
        }
        if (social_media.toLowerCase() == "instagram") {
            return new Instagram();
        }
        if (social_media.toLowerCase() == "twitter") {
            return new Twitter();
        }
        return null;
    }

    public User() {
    }
}
