public class Notebook extends Computador{
    public String bateria;
    public double wifi;
    public double bluetooth;

    @Override
    public String toString() {
        return "Notebook{" +
                "bateria='" + bateria + '\'' +
                ", wifi=" + wifi +
                ", bluetooth=" + bluetooth +
                '}';
    }
}
