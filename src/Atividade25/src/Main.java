public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador();
        pc.marca = "DELL";
        pc.ram = "32GB";
        pc.cpu = "Intel I9 10Gº";
        pc.hdd = "1tb - SSD";


        Notebook not = new Notebook();
        not.marca = "Dell";
        not.ram = "16GB";
        not.cpu = "Intel I7 10Gº";
        not.hdd = "250GB - SSD";
        not.bateria = "Íon de lítio Dell de 3 células e 42 Wh";
        not.wifi ="Placa de rede 802.11ac, WiFi 1x1";
        not.bluetooth = 3.0;

        Desktop desk = new Desktop();
        desk.marca = "Acer";
        desk.ram = "32GB";
        desk.cpu = "Intel I5 9Gº";
        desk.hdd = "500tb - SSD";
        desk.tamGabinete = " 20,1 x 43,3 x 49,2 cm";
        desk.monitor = "Monitor fullHd 27\"";
        desk.bluetooth = 3.0;
        desk.fonte = "1600 W\"";



        Object objPC = pc;
        Object objNot = not;
        Object objdesk =desk;

        Computador obj1 = (Computador)objPC;
        Notebook obj2 = (Notebook)objNot;
        Desktop obj3 = (Desktop)objdesk;

        System.out.println("-----COMPUTADOR------\n"+obj1);
        System.out.println("\n-----NOTBOOK------\n"+obj2);
        System.out.println("\n-----DESKTOP------\n"+obj3);



    }
}
