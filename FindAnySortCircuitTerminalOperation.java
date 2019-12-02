package sortcircuitingoperations;
import java.util.stream.Stream;
public class FindAnySortCircuitTerminalOperation {

	public static void main(String[] args) {
		//sequential stream
        Stream.of("one", "two", "three", "four")
                .findAny()
                .ifPresent(System.out::println);
         
        //parallel stream
        Stream.of("one", "two", "three", "four")
            .parallel()
            .findAny()
            .ifPresent(System.out::println);

	}

}
