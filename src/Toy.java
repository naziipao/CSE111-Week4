public class Toy {
    public String name;
    public int price;

    public Toy(String n, int p) {
        name = n;
        price = p;
        System.out.println("A new toy has been made!");
    }

    public void updatePrice(int p) {
        price = p;
    }

    public void updateName(String s) {
        System.out.println("Changing old name: " + name);
        name = s;
        System.out.println("new name: " + name);
    }

    public void showPrice() {
        System.out.println("Price: " + price + " Taka");
    }
}
