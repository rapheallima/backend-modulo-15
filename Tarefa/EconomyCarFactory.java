package Tarefa;

public class EconomyCarFactory implements CarFactory {
	@Override
	public Car createSUV() {
		return new EconomySUV();
	}

	@Override
	public Car createSedan() {
		return new EconomySedan();
	}
}
