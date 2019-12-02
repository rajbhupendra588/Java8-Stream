package sortcircuitingoperations;
import java.util.stream.Stream;
public class FindFirstSortCircuitTerminalOperation {

	public static void main(String[] args) {
		//sequential stream
        Stream.of("one", "two", "three", "four")
                .findFirst()
                .ifPresent(System.out::println);
         
        //parallel stream
        Stream.of("one", "two", "three", "four")
            .parallel()
            .findFirst()
            .ifPresent(System.out::println);

	}

}
