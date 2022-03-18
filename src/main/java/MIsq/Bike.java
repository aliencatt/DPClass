package MIsq;

public class Bike {

    int speed;
    String Company_name;

    public Bike(int speed, String Company_name) {
        this.speed = speed;
        this.Company_name = Company_name;
    }

    public Bike(int speed) {
        this.speed = speed;
    }

    public Bike(String company_name) {
        Company_name = company_name;
    }

    public static void main(String[] args) {

        Bike bike1 = new Bike(60, "Honda");

    }
}
