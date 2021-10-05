public class Coordenador extends Funcionario{
    private String CursoCoordenado;
    private double bonus;

    public String getCursoCoordenado() {
        return this.CursoCoordenado;
    }

    public void setCursoCoordenado(String cursoCoordenado) {
        this.CursoCoordenado = cursoCoordenado;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
