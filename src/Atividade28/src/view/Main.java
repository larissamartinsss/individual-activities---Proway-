package view;

import controller.PessoaFisicaController;
import controller.PessoaJuridicaController;
import model.PessoaFisica;
import model.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisicaController pfc = new PessoaFisicaController();
        PessoaJuridicaController pjc = new PessoaJuridicaController();

        PessoaFisica pf = new PessoaFisica();
        pf.id = 1;
        pf.nome = "Larissa";
        pf.sobrenome = "Martins";
        pf.CPF = "044.321.333-04";
        pf.enderecoComercial.cidade = "Manaus";
        pf.enderecoComercial.bairro = "Cidade nova";
        pf.enderecoComercial.Lougradoro = "Rua";
        pf.enderecoComercial.numero = "112A";

        PessoaJuridica pj = new PessoaJuridica();
        pj.id = 2;
        pj.cnpj = "102929102.2212";

        pfc.create(pf);
        pjc.create(pj);




    }
}
