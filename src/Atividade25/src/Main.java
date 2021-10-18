public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador();
        Notebook not = new Notebook();
        Desktop desk = new Desktop();

        Object objPC = pc;
        Object objNot = not;
        Object objdesk =desk;

        Computador obj1 = (Computador)objPC;
        Notebook obj2 = (Notebook)objNot;
        Desktop obj3 = (Desktop)objdesk;



    }
}
