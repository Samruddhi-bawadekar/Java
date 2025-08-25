enum Laptop{
    Macebook(2000), XPS(2200), Surface(1500), ThinkPad(1800);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}


public class enumclass {
    public static void main(String[] args) {
        Laptop lap=Laptop.Macebook;
        System.out.println(lap + " : " + lap.getPrice());

        for (Laptop lap1: Laptop.values())
        {
             System.out.println(lap1 + " : " +lap1.getPrice());
        }
    }
}
