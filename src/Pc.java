public class Pc extends Comp{
    private int length;

    public Pc(String proc, int ram, int hdd, int length) {
        super(proc, ram, hdd);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
