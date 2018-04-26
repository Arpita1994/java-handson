// Planon Enterprise Edition Source file: PassByValue.java
// Copyright Planon 1997-2018. All Rights Reserved.
package practise;

/**
 * PassByValue
 */
public class PassByValue
{
  //~ Methods --------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param args DOCUMENT ME!
   */
  public static void main(String[] args)
  {
    int i = 10;
    someMethod(i);
    System.out.println("i(2) " + i);
  }


  /**
   * DOCUMENT ME!
   *
   * @param aI DOCUMENT ME!
   */
  private static void someMethod(int aI)
  {
    aI = 20;
    System.out.println("i(1) " + aI);
  }
}
