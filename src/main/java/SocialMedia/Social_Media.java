package SocialMedia;

public interface Social_Media {

     //to be implemented by subclasses

     public void chat();

     //default methods

     default void uploadPhoto() {
          System.out.println("Photo can be uploaded @ " + getClass().getName());
     }

     default void create_reel() {
          System.out.println("Reel can be created and uploaded @ " + getClass().getName());
     }

     public default void sendRequest() {
          System.out.println("A friend request can be send @ " + getClass().getName());
     }


}
