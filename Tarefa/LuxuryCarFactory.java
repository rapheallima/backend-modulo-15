package Tarefa;

public class LuxuryCarFactory implements CarFactory {
	@Override
	public Car createSUV() {
		return new LuxurySUV();
	}

	@Override
	public Car createSedan() {
		return new LuxurySedan();
	}
}
