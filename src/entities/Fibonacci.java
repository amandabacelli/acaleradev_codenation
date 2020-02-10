package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Fibonacci {
	
	public static List<Integer> fibonacci() {
		Integer[] fibonacci = new Integer[15];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		calculoFibonacci(14, fibonacci);
		return new ArrayList<Integer>(Arrays.asList(fibonacci));
	}
	
	public static Integer calculoFibonacci(Integer index, Integer[] lista) {
		if(lista[index] == null) {
			lista[index] = calculoFibonacci(index-1, lista) + calculoFibonacci(index - 2, lista);
		}
		return lista[index];
	}
	
	public static Boolean isFibonacci(Integer num) {
		return fibonacci().contains(num);
	}

}
