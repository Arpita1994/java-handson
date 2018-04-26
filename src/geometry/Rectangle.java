// Planon Enterprise Edition Source file: Rectangle.java
// Copyright Planon 1997-2018. All Rights Reserved.
package geometry;

import practise.*;

/**
 * Circle
 */
public class Rectangle extends Shape
{
  //~ Constructors ---------------------------------------------------------------------------------

  /**
   * Creates a new Circle object.
   */
  public Rectangle()
  {
    super(10, 10);
  }

  //~ Methods --------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param args DOCUMENT ME!
   */
  public static void main(String[] args)
  {
    Rectangle rectangle = new Rectangle();

    rectangle.area();
  }


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  @Override public double area()
  {
    return getLength() * getBreadth();
  }


  /**
   * DOCUMENT ME!
   */
  @Override public void someMethod()
  {
    // TODO Auto-generated method stub
  }
}
