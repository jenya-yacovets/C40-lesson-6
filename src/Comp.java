public class Comp {
    private String proc;
    private int ram;
    private int hdd;

    public Comp(String proc, int ram, int hdd) {
        this.proc = proc;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void on() {
        System.out.println("Комп включен");
    }

    public void off() {
        System.out.println("Комп выключен");
    }

    public void description() {
        System.out.println(proc);
        System.out.println(ram);
        System.out.println(hdd);
    }
}
