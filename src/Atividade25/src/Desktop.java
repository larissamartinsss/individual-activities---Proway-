public class Desktop extends Computador{
    public double tamGabinete;
    public String monitor;
    public String bluetooth;
    public String fonte;

    @Override
    public String toString() {
        return "Desktop{" +
                "tamGabinete=" + tamGabinete +
                ", monitor='" + monitor + '\'' +
                ", bluetooth='" + bluetooth + '\'' +
                ", fonte='" + fonte + '\'' +
                '}';
    }
}
