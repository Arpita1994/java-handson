// Planon Enterprise Edition Source file: Shape.java
// Copyright Planon 1997-2018. All Rights Reserved.
package practise;

/**
 * Shape
 */
public abstract class Shape implements IShape
{
  //~ Instance Variables ---------------------------------------------------------------------------

  private final int breadth;

  private final int length;

  //~ Constructors ---------------------------------------------------------------------------------

  /**
   * Creates a new Shape object.
   *
   * @param aBreadth DOCUMENT ME!
   * @param aLenght  DOCUMENT ME!
   */
  public Shape(int aBreadth, int aLenght)
  {
    this.breadth = aBreadth;
    this.length = aLenght;
  }

  //~ Methods --------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public abstract double area();


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public static int someMethof()
  {
    int a = 0;
    return a;
  }


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public int getBreadth()
  {
    return this.breadth;
  }


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public final int getLength()
  {
    return this.length;
  }
}
