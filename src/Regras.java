public class Regras {
    private String name;
    private double salario;
    private double bonus;
    private double salarioliquido;
    private double desconto = 0;

    public void calculobonus( double salario) {
        if (salario <= 1000) {
            this.bonus = salario * 0.2;
        }else if (salario <= 2000){
            this.bonus = salario * 0.1;
        }else if (salario > 2000){
            this.desconto = salario * 0.1;
        }
        this.salarioliquido = (salario - desconto) + bonus;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalario() {
        return salario;
    }
    public double getDesconto() {
        return desconto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        calculobonus(salario);
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalarioliquido() {
        return salarioliquido;
    }
}
