package es.shaddow.headfirst.designpatterns.adapter;

public class DuckTestDrive {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe duck says...");
		testDuck(duck);

		System.out.println("\nThe turkeyAdapter says...");
		testDuck(turkeyAdapter);
	}

	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
