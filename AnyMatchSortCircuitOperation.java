package sortcircuitingoperations;
import java.util.stream.Stream;
public class AnyMatchSortCircuitOperation {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("one", "two", "three", "four");
        
        boolean match = stream.anyMatch(s -> s.contains("four"));
         
        System.out.println(match);   
        
	}

}
