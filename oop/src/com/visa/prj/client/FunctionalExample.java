package com.visa.prj.client;

interface Computation {

	int compute(int x, int y);

}

public class FunctionalExample {

	public static void main(String[] args) {
		Computation c1 = new Computation() {

			public int compute(int x, int y) {
				return x + y;
			};

		};
		doTask(c1, 4, 5);
		Computation c2 = new Computation() {

			public int compute(int x, int y) {
				return x + y;
			};

		};
		doTask(c2, 4, 5);
		
		//Lambda is a short form of Anonymous class
		Computation c3 = (int x, int y) -> {
			return x * y;
		};
		doTask(c3, 4, 5);
		
		Computation c4 = (x, y) -> {
			return x + y;
		};
		doTask(c4, 4, 5);
		Computation c5 = (x, y) -> x * y;
		doTask(c5, 4, 5);

	}
	

	private static void doTask(Computation c1, int i, int j) {
		System.out.println(c1.compute(i, j));
		
	}

}
