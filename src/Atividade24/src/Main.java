public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Carro carro = new Carro();
        // veiculo:
        veiculo.marca = "BMW";
        veiculo.modelo = "118i Sport GP";
        veiculo.placa = "BRA2000";
        // carro:
        carro.marca = "Mercedes-benz";
        carro.modelo = "Glb 200 2021";
        carro.porta_malas = 3.80;
        carro.portas = 4;

        Object obj1 = veiculo;
        Object obj2= carro;

        Veiculo veicObj =(Veiculo) obj1;
        System.out.println("-----------------------------------------");
        System.out.printf("Marca: %s \nModelo: %s\nPlaca: %s\n ", veicObj.marca, veicObj.modelo, veicObj.placa);

        Carro carObj =(Carro) obj2;
        System.out.println("-----------------------------------------");
        System.out.printf("Marca: %s \nModelo: %s\nPlaca: %s\nNº de portas: %d\nCapacidade porta-malas: %d\n"
                , carObj.marca, carObj.modelo, carObj.placa, carObj.portas, carObj.porta_malas);








    }



}
