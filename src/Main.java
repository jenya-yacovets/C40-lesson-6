public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Intel i7", 32, 1024, 10);
        laptop.description();

        System.out.println();

        Pc pc = new Pc("AMD", 16, 512, 2);

    }
}