package out;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
       Supplier<Double> sup=()->Math.random();
       System.out.println(sup.get());	
	}
}

