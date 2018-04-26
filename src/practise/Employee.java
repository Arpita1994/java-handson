// Planon Enterprise Edition Source file: Employee.java
// Copyright Planon 1997-2018. All Rights Reserved.
package practise;

/**
 * Employee
 */
public class Employee
{
  //~ Instance Variables ---------------------------------------------------------------------------

  private int code;

  private String email;
  private String name;

  //~ Methods --------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  aObj DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  @Override public boolean equals(Object aObj)
  {
    if ((this.getClass()) == aObj.getClass())
    {
      return true;
    }
    else
    {
      return false;
    }
  }


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public int getCode()
  {
    return this.code;
  }


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getEmail()
  {
    return this.email;
  }


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getName()
  {
    return this.name;
  }


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  @Override public int hashCode()
  {
    return 17;
  }


  /**
   * DOCUMENT ME!
   *
   * @param aCode DOCUMENT ME!
   */
  public void setCode(int aCode)
  {
    this.code = aCode;
  }


  /**
   * DOCUMENT ME!
   *
   * @param aEmail DOCUMENT ME!
   */
  public void setEmail(String aEmail)
  {
    this.email = aEmail;
  }


  /**
   * DOCUMENT ME!
   *
   * @param aName DOCUMENT ME!
   */
  public void setName(String aName)
  {
    this.name = aName;
  }
}
