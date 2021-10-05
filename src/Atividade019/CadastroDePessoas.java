public class CadastroDePessoas {
    public static void main(String[] args) {
        
        PessoaFisica[] pfisicas = new PessoaFisica[5];

        // Pessoa 1:
        PessoaFisica p1 = new PessoaFisica();
        p1.setCodigo(1);
        p1.setNome("Larissa");
        p1.setSobrenome("Souza");
        p1.setIdade((byte)21);
        p1.setRg("44432333");
        p1.setCpf("2320383280");

        // Pessoa 2:
        PessoaFisica p2 = new PessoaFisica();
        p2.setCodigo(2);
        p2.setNome("Luan");
        p2.setSobrenome("Martins");
        p2.setIdade((byte)15);
        p2.setRg("321212");
        p2.setCpf("1212332132342");

        // Pessoa 3:
        PessoaFisica p3 = new PessoaFisica();
        p3.setCodigo(3);
        p3.setNome("Thais");
        p3.setSobrenome("Silva");
        p3.setIdade((byte)25);
        p3.setRg("5344344");
        p3.setCpf("97654312121212");

        // Pessoa 4:
        PessoaFisica p4 = new PessoaFisica();
        p4.setCodigo(4);
        p4.setNome("Diana");
        p4.setSobrenome("Alves");
        p4.setIdade((byte)48);
        p4.setRg("653901");
        p4.setCpf("212121212343434");

        // Pessoa 5:
        PessoaFisica p5 = new PessoaFisica();
        p5.setCodigo(5);
        p5.setNome("Luana");
        p5.setSobrenome("Oliveira");
        p5.setIdade((byte)22);
        p5.setRg("3323233323");
        p5.setCpf("555534343435");
        // arrays:
        pfisicas[0]=p1;
        pfisicas[1]=p2;
        pfisicas[2]=p3;
        pfisicas[3]=p4;
        pfisicas[4]=p5;

        // print:

        System.out.println("--------LISTA DE PESSOAS FISICAS ----------"-);
        for (PessoaFisica pessoaFisica : pessoasFisicas) {
           
            System.out.println("\nCodigo: "+pessoaFisica.getCodigo());
            System.out.println("Nome: "+pessoaFisica.getNome());
            System.out.println("Sobrenome: "+pessoaFisica.getSobrenome());
            System.out.println("Idade: "+pessoaFisica.getIdade());
            System.out.println("RG: "+pessoaFisica.getRg());
            System.out.println("\nNome: "+pessoaFisica.getCpf());
                     
        }
        System.out.println("------------------fim------------------");
    }
}