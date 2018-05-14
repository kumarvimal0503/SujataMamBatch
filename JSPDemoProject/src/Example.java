import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
	public static void main(String...args) {
		B b = new B();
		
		
		
		List<List<String>> numbers = Arrays.asList(Arrays.asList("1","2"),Arrays.asList("3","4"));
		
		
		List<Integer> evenNumbers = numbers.stream()
			   .flatMap(Collection::stream)
			   .map(Integer::valueOf)
			   .filter(num -> (num%2 == 0))
			   .collect(Collectors.toList());
		
		evenNumbers.stream().forEach(System.out::print);
	}
}

class A {
	A() {
		System.out.println("A");
		display();
	}
	public void display() {
		System.out.println("IN Class A display");
	}
}
class B extends A {
	B() {
		System.out.println("B");
	}
	public void display() {
		System.out.println("IN Class B Display");
	}
}
