package streamterminaloperations;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CountTerminalOperation {
	public static void main(String[] args) {
		long count = Stream.of("how","to","do","in","java").count();
	    System.out.printf("There are %d elements in the stream %n", count);
	     
	    count = IntStream.of(1,2,3,4,5,6,7,8,9).count();
	    System.out.printf("There are %d elements in the stream %n", count);
	     
	    count = LongStream.of(1,2,3,4,5,6,7,8,9).filter(i -> i%2 == 0).count();
	    System.out.printf("There are %d elements in the stream %n", count);
}
}
