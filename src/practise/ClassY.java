// Planon Enterprise Edition Source file: ClassY.java
// Copyright Planon 1997-2018. All Rights Reserved.
package practise;

/**
 * ClassY
 */
public class ClassY extends ClassX
{
  //~ Static Variables & Initializers --------------------------------------------------------------

  static int i = 12;

  //~ Instance Variables ---------------------------------------------------------------------------

  int j = 10;

  //~ Methods --------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param args DOCUMENT ME!
   */
  public static void main(String[] args)
  {
    ClassY y = new ClassY();
    int i = 20;
    ClassX.someMethod();
    ClassY.shape(10);
    ClassY.shape(20, 30);
  }


  /**
   * DOCUMENT ME!
   *
   * @param  a DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static final int shape(int a)
  {
    a = 30;
    System.out.println(a);
    return a;
  }


  /**
   * DOCUMENT ME!
   *
   * @param  a DOCUMENT ME!
   * @param  b DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  private static final double shape(int a, int b)
  {
    a = 10;
    b = 20;
    System.out.println(b);
    return b;
  }
}
