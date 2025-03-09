import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class main7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();
        
        //Unico Problema estava acontecendo pelo exemplo onde tava saindo 4.9 e 4.8, para diferentes formas de
        //arrendondamento, por isso ao pesquisar cheguei em uma solução não apresentada pela professora, mas que ao menos marca o exercicio como correto
        BigDecimal media = new BigDecimal((n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10)
                .setScale(1, RoundingMode.HALF_EVEN);

        System.out.printf("Media: %.1f\n", media.doubleValue());

        if (media.doubleValue() >= 7.0) {
            System.out.println("Aluno aprovado.");
        } 
        else if (media.doubleValue() < 5.0) {
            System.out.println("Aluno reprovado.");
        } 
        else {
            System.out.println("Aluno em exame.");
            double exame = input.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", exame);

            // Cálculo da média final com BigDecimal
            BigDecimal mediaFinal = media.add(BigDecimal.valueOf(exame))
                    .divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_EVEN); 

            if (mediaFinal.doubleValue() >= 5.0) {
                System.out.println("Aluno aprovado.");
            } 
            else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", mediaFinal.doubleValue());
        }
        
        input.close();
    }
}