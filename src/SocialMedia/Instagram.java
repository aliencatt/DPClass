package SocialMedia;

public class Instagram implements Social_Media {

  @Override
  public void chat() {
    System.out.println("You are chatting on Instagram");

  }

  @Override
  public void uploadPhoto() {
    Social_Media.super.uploadPhoto();
  }

  @Override
  public void create_reel() {
    Social_Media.super.create_reel();
  }

  @Override
  public void sendRequest() {
    Social_Media.super.sendRequest();
  }
}
