public class Computador {
    public String marca;
    public String ram;
    public String cpu;
    public String hdd;

    @Override
    public String toString() {
        return "Computador{" +
                "marca='" + marca + '\'' +
                ", ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", hdd='" + hdd + '\'' +
                '}';
    }
}
