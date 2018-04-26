// Planon Enterprise Edition Source file: StringOperations.java
// Copyright Planon 1997-2018. All Rights Reserved.
package practise;

/**
 * StringOperations
 */
public class StringOperations
{
  //~ Methods --------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param args DOCUMENT ME!
   */
  public static void main(String[] args)
  {
    Employee e1 = new Employee();
    e1.setCode(1);
    Employee e2 = new Employee();
    e2.setCode(2);
    if (e1.getCode() == e2.getCode())
    {
      System.out.println(true);
    }
    /*String test = "Test";
    String test2 = "Test";
    String test1 = new String("Test");
    //test will be created in a constant pool and test1 will be created in
    System.out.println(test.equals(new String("Test")));
    System.out.println("Test".equals("Test"));*/
  }
}
