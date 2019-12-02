package streamterminaloperations;

import java.util.Arrays;
import java.util.List;

public class ForEachTerminalOperation {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10); 
		 
		list.stream().forEach( System.out::println );

	}

}
