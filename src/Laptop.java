public class Laptop extends Comp {
    private int time;

    public Laptop(String proc, int ram, int hdd, int time) {
        super(proc, ram, hdd);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public void on() {
        System.out.println("Ноутбук включен");
    }

    @Override
    public void description() {
        super.description();
        System.out.println(time);
    }
}