package DP.DP_In_Class.Prototype;

public class AngryBird implements Cloneable {

    String name;
    String color;

    void setData() {
        this.name = "Red";
        this.color = "Red";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void displayData() {
        System.out.println(this.name);
        System.out.println(this.color);
    }


//  @Override
//  protected Object clone() throws CloneNotSupportedException {
//    return super.clone();
//  }

    @Override
    protected AngryBird clone() throws CloneNotSupportedException {
        return new AngryBird();
    }
}
