import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colaboradores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Regras> colaborador = new ArrayList<>();


        System.out.println("Digite a quantidade de colaboradores:");
        int qtdcolaboradores = scan.nextInt();

        for (int i = 0; i < qtdcolaboradores; i++) {
            Regras regras = new Regras();
            System.out.println("Por favor, digite o nome do colaborador:");
            regras.setName(scan.next());
            System.out.println("Por favor, digite o salário do colaborador:");
            regras.setSalario(scan.nextDouble());

            colaborador.add(regras);
        }
            for (int i = 0; i < colaborador.size(); i++) {
                System.out.println("Colaborador: " + colaborador.get(i).getName());
                System.out.println("Salário: " + colaborador.get(i).getSalario());

                if(colaborador.get(i).getSalario()> 2000) {
                    System.out.println("Desconto: " + colaborador.get(i).getDesconto());

                }else{
                    System.out.println("Bonus: " + colaborador.get(i).getBonus());


                }
                System.out.println("Salário líquido: " + colaborador.get(i).getSalarioliquido());
                System.out.println("");
            }


        }
    }

