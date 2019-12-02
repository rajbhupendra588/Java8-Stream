package sortcircuitingoperations;
import java.util.stream.Stream;

//Java example of Stream.allMatch() method to check if all stream elements does not contain any numeric/digit character.

public class AllMatchSortCircuitTerminalOperation {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("one", "two", "three", "four");
        
        boolean match = stream.allMatch(s -> s.contains("\\d+") == false );
         
        System.out.println(match);   

	}

}
