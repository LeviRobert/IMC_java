import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        
        float peso;
        float altura;
        float imc;
        int continuar;
            
        do{
            System.out.println("deseja calcular o IMC? sim(1) não(2)");
            continuar = ler.nextInt();
            
            if(continuar == 1){ 
                System.out.printf("Informe o seu peso: ");
                peso = ler.nextFloat();
        
                System.out.printf("Informe sua altura: ");
                altura = ler.nextFloat();
        
                imc = peso / (altura * altura);
                System.out.println("imc: " + imc);
        
                if (imc < 18.5) {
                    System.out.println("Sua Classificação é de Magreza");
                } else if (imc > 18.5 && imc <= 24.9) ;{
                    System.out.println("Sua Classificação Está Dentro do Normal");
                }if (imc >= 25.0 && imc <= 29.9) {
                    System.out.println("Sua Classificação é de Sobrepeso I");
                } else if (imc >= 30.0 && imc <= 39.9) {
                    System.out.println("Sua Classificação é Obesidade II");
                } else if (imc >= 40.0 ) {
                    System.out.println("Sua Classificação é Obesidade Grave III");
                }
                else{
                    
                }
            }
            else{
            }}while(continuar == 1);
            
            System.out.println("Progama Encerrado!");
    }
}
