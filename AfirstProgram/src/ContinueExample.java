
public class ContinueExample {

	public static void main(String[] args) {
		int lim = 5;
	    int sum = 0;
	    for (int i = 1; i <= lim; i++) {
	      if (i % 5 == 0) {
	        continue;
	      }
	      sum += i;
	    }
	    System.out.println(sum);

	}

}
