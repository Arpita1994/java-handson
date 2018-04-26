// Planon Enterprise Edition Source file: ObjectComparision.java
// Copyright Planon 1997-2018. All Rights Reserved.
package practise;

/**
 * ObjectComparision
 */
public class ObjectComparision
{
  //~ Instance Variables ---------------------------------------------------------------------------

  String someValue;

  //~ Constructors ---------------------------------------------------------------------------------

  /**
   * Creates a new ObjectComparision object.
   *
   * @param aString DOCUMENT ME!
   */
  public ObjectComparision(String aString)
  {
    this.someValue = aString;
  }

  //~ Methods --------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param args DOCUMENT ME!
   */
  public static void main(String[] args)
  {
    ObjectComparision o1 = new ObjectComparision("A");
    ObjectComparision o2 = new ObjectComparision("A");

   
    o1.hashCode();
    o2.hashCode();
    if (o1.equals(o2))
    {
      System.out.println("Iam equal");
    }
    else
    {
      System.out.println("Iam not equal");
    }
  }
}
