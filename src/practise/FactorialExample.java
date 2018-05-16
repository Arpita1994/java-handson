package practise;

public class FactorialExample {

	public static void main(String[] args) {
		int fact = 1;
	    int number = 4; 
	    fact = fact(number);
	    System.out.println(fact);
	}
	 /**
	   * DOCUMENT ME!
	   *
	   * @param  n DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   */
	  private static int fact(int n)
	  {
	    if (n == 0)
	    {
	      return 1;
	    }
	    else
	    {
	      return n * fact(n - 1);
	    }
	  }
}
