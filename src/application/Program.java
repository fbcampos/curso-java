package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Paulo");
		
		for(String x : list){
			System.out.println(x);
		}
		
		System.out.println(list.size());
		
		//list.remove("Anna"); list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M'); // Remove todos os nomes que começarem com M
		
		for(String x : list){
			System.out.println(x);
		}
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		System.out.println(result);
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(name);
		

	}

}
