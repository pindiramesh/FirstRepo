package com.java8;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<String> supplier=()->"Hi supplier";
		System.out.println(supplier.get());
	}

}
