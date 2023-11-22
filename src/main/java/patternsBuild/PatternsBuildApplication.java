package patternsBuild;

import modelo.Casa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import patternsBuilder.Casa2Quartos;
import patternsBuilder.Casa2Quartos2BanheiroChurrasqueira;
import patternsBuilder.IBuilderCasa;

@SpringBootApplication
public class PatternsBuildApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsBuildApplication.class, args);
		IBuilderCasa builderCasa1 = new Casa2Quartos();
		builderCasa1.buildQuartos();//mostra a mensagem do método
		builderCasa1.buildBanheiros();//mostra a mensagem do método
		builderCasa1.buildChurrasqueira();//mostra a mensagem do método
		Casa casa1 = builderCasa1.getCasa();//mostra a quantidade

		System.out.println("Casa 1:");//mostra as quantidades
		System.out.println("Quartos: " + casa1.getQuartos());
		System.out.println("Banheiros: " + casa1.getBanheiros());
		System.out.println("Churrasqueira: " + casa1.isChurrasqueira());

		System.out.println("----------------------------");

		// Construindo uma casa com 2 quartos, 2 banheiros e churrasqueira
		IBuilderCasa builderCasa2 = new Casa2Quartos2BanheiroChurrasqueira();
		builderCasa2.buildQuartos();
		builderCasa2.buildBanheiros();
		builderCasa2.buildChurrasqueira();
		Casa casa2 = builderCasa2.getCasa();

		System.out.println("Casa 2:");
		System.out.println("Quartos: " + casa2.getQuartos());
		System.out.println("Banheiros: " + casa2.getBanheiros());
		System.out.println("Churrasqueira: " + casa2.isChurrasqueira());
	}
}