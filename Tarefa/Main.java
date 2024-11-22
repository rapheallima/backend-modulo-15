package Tarefa;

public class Main {
	public static void main(String[] args) {
		// Fábrica de carros de luxo
		CarFactory luxuryFactory = new LuxuryCarFactory();
		Car luxurySUV = luxuryFactory.createSUV();
		Car luxurySedan = luxuryFactory.createSedan();

		luxurySUV.assemble(); // Saída: Montando um SUV de luxo.
		luxurySedan.assemble(); // Saída: Montando um Sedan de luxo.

		// Fábrica de carros econômicos
		CarFactory economyFactory = new EconomyCarFactory();
		Car economySUV = economyFactory.createSUV();
		Car economySedan = economyFactory.createSedan();

		economySUV.assemble(); // Saída: Montando um SUV econômico.
		economySedan.assemble(); // Saída: Montando um Sedan econômico.
	}
}
