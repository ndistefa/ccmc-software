/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package gov.nasa.gsfc.ccmc;

public class Attribute {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Attribute(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Attribute obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CCMCJNI.delete_Attribute(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String getAttributeName() {
    return CCMCJNI.Attribute_getAttributeName(swigCPtr, this);
  }

  public void setAttributeName(String attributeName) {
    CCMCJNI.Attribute_setAttributeName(swigCPtr, this, attributeName);
  }

  public void setAttributeValue(SWIGTYPE_p_std__string value) {
    CCMCJNI.Attribute_setAttributeValue__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public void setAttributeValue(SWIGTYPE_p_int value) {
    CCMCJNI.Attribute_setAttributeValue__SWIG_1(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public void setAttributeValue(SWIGTYPE_p_float value) {
    CCMCJNI.Attribute_setAttributeValue__SWIG_2(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public Attribute.AttributeType getAttributeType() {
    return Attribute.AttributeType.swigToEnum(CCMCJNI.Attribute_getAttributeType(swigCPtr, this));
  }

  public float getAttributeFloat() {
    return CCMCJNI.Attribute_getAttributeFloat(swigCPtr, this);
  }

  public String getAttributeString() {
    return CCMCJNI.Attribute_getAttributeString(swigCPtr, this);
  }

  public int getAttributeInt() {
    return CCMCJNI.Attribute_getAttributeInt(swigCPtr, this);
  }

  public Attribute() {
    this(CCMCJNI.new_Attribute(), true);
  }

  public String toString() {
    return CCMCJNI.Attribute_toString(swigCPtr, this);
  }

  public final static class AttributeType {
    public final static Attribute.AttributeType FLOAT = new Attribute.AttributeType("FLOAT");
    public final static Attribute.AttributeType INT = new Attribute.AttributeType("INT");
    public final static Attribute.AttributeType STRING = new Attribute.AttributeType("STRING");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static AttributeType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + AttributeType.class + " with value " + swigValue);
    }

    private AttributeType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private AttributeType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private AttributeType(String swigName, AttributeType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static AttributeType[] swigValues = { FLOAT, INT, STRING };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
