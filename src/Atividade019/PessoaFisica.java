public class PessoaFisica {
  
    private int codigo;
    private String nome;
    private String sobrenome;
    private Byte idade;
    private String rg;
    private String cpf;

    //codigo
    public int getCodigo() {
        return codigo;
    }
  
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    //ome
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    // sobrenome
    public String getSobrenome() {
        return sobrenome;
    }
 
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    //idade
    public Byte getIdade() {
        return idade;
    }
  
    public void setIdade(Byte idade) {
        this.idade = idade;
    }
    //rg
    public String getRg() {
        return rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    //cpf
    public String getCpf() {
        return cpf;
    }
   
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}