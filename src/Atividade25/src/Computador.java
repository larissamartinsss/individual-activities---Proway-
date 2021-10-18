public class Computador {
    public String marca;
    public String ram;
    public String cpu;
    public String hdd;

    @Override
    public String toString() {
        return "\nMarca: " + marca +
                "\nRam: " + ram +
                "\nCPU: " + cpu +
                "\nHDD: " + hdd;
    }
}
