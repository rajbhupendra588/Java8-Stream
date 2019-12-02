package streamintermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctOperation {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(2, 5, 3, 2, 4, 3);
	    List<Integer> distinctIntList = intList.stream().distinct().collect(Collectors.toList());
	    System.out.println(distinctIntList);
	}

}
