package sortcircuitingoperations;
import java.util.stream.Stream;

//Java example of Stream.noneMatch() method to check if no stream element contain any numeric/digit character.

public class NoneMatchSortCircuitTerminalOperation {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("one", "two", "three", "four");
        
        boolean match = stream.noneMatch( s -> s.contains("\\d+") );
         
        System.out.println(match); 

	}

}
