public class Desktop extends Computador{
    public String tamGabinete;
    public String monitor;
    public double bluetooth;
    public String fonte;

    @Override
    public String toString() {
        return "\ntamanho: Gabinete: " + tamGabinete +
                "\nMonitor: " + monitor +
                "\nBluetooth: " + bluetooth +
                "\nFonte: " + fonte;
    }
}
