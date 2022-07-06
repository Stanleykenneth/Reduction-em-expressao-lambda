package br.com.kenneth.lamdastream;

import java.util.Arrays;
import java.util.List;

// Reduction tem a função de reduzir os valores até tornar um só. Nesse caso estou usando a multiplicação.
public class Main {
	
	public static void main(String[] args) {
		int[] array = List.of(3, 2, 5).stream()
			//.mapToInt(i -> i.intValue()).toArray();	
			.mapToInt(Integer::intValue).toArray();
		System.out.println(mulitply(array));
		System.out.println(max(array));
	}
	// Multplica os elementos
	private static int mulitply(int[] array) {
		return Arrays.stream(array).reduce((x, y) ->  x * y).orElse(0);
	}
	//Encontra o maoir elemento
	private static int max(int[] array) {
		/*return Arrays.stream(array).reduce((x, y) -> {
			if (x > y) {
				return x;
			}
			return y;		
		}).orElse(0);*/
		return Arrays.stream(array).reduce((x, y) -> x > y ? x : y).orElse(0);
	}
}
