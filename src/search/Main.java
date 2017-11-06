package search;

import java.util.ArrayList;
import java.util.Random;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    final int ARRAY_SIZE = 10000;
    Random random = new Random();
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    for (int i=0; i<ARRAY_SIZE; ++i) {
      numbers.add(random.nextInt(ARRAY_SIZE));
    }
    System.out.println(searchArray(numbers.get(1), numbers));
    System.out.println(searchArray(numbers.get(5), numbers));
    System.out.println(searchArray(numbers.get(900), numbers));
    System.out.println(searchArray(numbers.get(3200), numbers));
    System.out.println(searchArray(numbers.get(7400), numbers));
    System.out.println(searchArray(numbers.get(9876), numbers));
    System.out.println(searchArray(2000000, numbers));
    System.out.println(searchArray(-45, numbers));
  }

  private static boolean searchArray(int target, ArrayList<Integer> list) throws InterruptedException {
    // You can replace ThreadedSearch with LinearSearch to see this work with
    // the given linear search code.
    
    // This specifies 4 threads for the tests. It would be a good idea to play
    // with this and see how that changes things. Keep in mind that your number
    // of threads *may* need to evenly divide the length of the list being
    // searched (ARRAY_SIZE in this case).
	  
	//Threaded search option:  
	ThreadedSearch<Integer> searcher=new ThreadedSearch<Integer>();
    return searcher.parSearch(4, target, list);
    
    //Linear search option:
//    LinearSearch<Integer> searcher=new LinearSearch<Integer>();
//    return searcher.search(target, list);
  }

}
