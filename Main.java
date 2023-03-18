package PolymorphismPractice;

public class Main {

	public static void main(String[] args) {
		Y[] arrays = new Y[2];
		arrays[0] = new A();
		arrays[1] = new B();

		for (int i = 0; i < arrays.length; i++) {
			arrays[i].b();
		}

	}

}
