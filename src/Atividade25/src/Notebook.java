public class Notebook extends Computador{
    public String bateria;
    public String wifi;
    public double bluetooth;

    @Override
    public String toString() {
        return "\nBateria: " + bateria +
                "\nWifi: " + wifi +
                "\nBluetooth: " + bluetooth;
    }
}
