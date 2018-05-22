// Planon Enterprise Edition Source file: PassingValues.java
// Copyright Planon 1997-2018. All Rights Reserved.
package practise;

import java.util.HashMap;
import java.util.Map;

/**
 * PassingValues
 */
public class PassByReference
{
  //~ Instance Variables ---------------------------------------------------------------------------

  private int x;
  private final int y;

  //~ Constructors ---------------------------------------------------------------------------------

  /**
   * Creates a new PassingValues object.
   *
   * @param x aI DOCUMENT ME!
   * @param y DOCUMENT ME!
   */
  public PassByReference(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  //~ Methods --------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param args DOCUMENT ME!
   */
  public static void main(String[] args)
  {
    PassByReference pv = new PassByReference(10, 20);

    someMethod(pv);
    System.out.println("print x value" + pv.x + +pv.y);
    
    Map<String, String> map = new HashMap<>();
    
   map.put("1","Arpitha");
   System.out.println(map);
   map.remove("1");
   System.out.println(map);
    
  }


  /**
   * DOCUMENT ME!
   *
   * @param aPv DOCUMENT ME!
   */
  private static void someMethod(PassByReference aPv)
  {
    aPv.x = 30;
  }
}
