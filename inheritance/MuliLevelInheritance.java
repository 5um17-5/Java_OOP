package inheritance;

public class MuliLevelInheritance {
	public static void main(String[] args) {
		SampleC c1 = new SampleC();
		c1.f1();
		c1.f2();
		c1.f3();
		c1 = null;
	}
}


// SampleA is super class and parent class
class SampleA {
	void f1() {
		System.out.println("class A f1()");
	}
}

// sampleB is subclass or child class of SampleA
class SampleB extends SampleA {
	void f2() {
		System.out.println("class B f2()");
	}
}

// SampleC is subclass or child class of SampleB
class SampleC extends SampleB {
	void f3() {
		System.out.println("class C f3()");
	}
}