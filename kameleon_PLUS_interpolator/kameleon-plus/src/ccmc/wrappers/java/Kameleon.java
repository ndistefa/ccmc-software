/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ccmc.wrappers;

public class Kameleon {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Kameleon(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Kameleon obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CCMCJNI.delete_Kameleon(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Kameleon() {
    this(CCMCJNI.new_Kameleon(), true);
  }

  public int open(String filename) {
    return CCMCJNI.Kameleon_open(swigCPtr, this, filename);
  }

  public String getModelName() {
    return CCMCJNI.Kameleon_getModelName(swigCPtr, this);
  }

  public void setMissingValue(float missingValue) {
    CCMCJNI.Kameleon_setMissingValue(swigCPtr, this, missingValue);
  }

  public float getMissingValue() {
    return CCMCJNI.Kameleon_getMissingValue(swigCPtr, this);
  }

  public Interpolator createNewInterpolator() {
    long cPtr = CCMCJNI.Kameleon_createNewInterpolator(swigCPtr, this);
    return (cPtr == 0) ? null : new Interpolator(cPtr, false);
  }

  public boolean loadVariable(String variable) {
    return CCMCJNI.Kameleon_loadVariable(swigCPtr, this, variable);
  }

  public boolean unloadVariable(String variable) {
    return CCMCJNI.Kameleon_unloadVariable(swigCPtr, this, variable);
  }

  public boolean loadVectorVariable(String variable) {
    return CCMCJNI.Kameleon_loadVectorVariable(swigCPtr, this, variable);
  }

  public boolean unloadVectorVariable(String variable) {
    return CCMCJNI.Kameleon_unloadVectorVariable(swigCPtr, this, variable);
  }

  public String getNativeUnit(String variable) {
    return CCMCJNI.Kameleon_getNativeUnit(swigCPtr, this, variable);
  }

  public String getSIUnit(String variable) {
    return CCMCJNI.Kameleon_getSIUnit(swigCPtr, this, variable);
  }

  public String getVisUnit(String variable) {
    return CCMCJNI.Kameleon_getVisUnit(swigCPtr, this, variable);
  }

  public float getConversionFactorToSI(String variable) {
    return CCMCJNI.Kameleon_getConversionFactorToSI(swigCPtr, this, variable);
  }

  public vector_float getVariable(String variable) {
    long cPtr = CCMCJNI.Kameleon_getVariable(swigCPtr, this, variable);
    return (cPtr == 0) ? null : new vector_float(cPtr, false);
  }

  public vector_int getVariableInt(String variable) {
    long cPtr = CCMCJNI.Kameleon_getVariableInt(swigCPtr, this, variable);
    return (cPtr == 0) ? null : new vector_int(cPtr, false);
  }

  public int getNumberOfGlobalAttributes() {
    return CCMCJNI.Kameleon_getNumberOfGlobalAttributes(swigCPtr, this);
  }

  public int getNumberOfVariableAttributes() {
    return CCMCJNI.Kameleon_getNumberOfVariableAttributes(swigCPtr, this);
  }

  public int getVariableID(String variable) {
    return CCMCJNI.Kameleon_getVariableID(swigCPtr, this, variable);
  }

  public String getVariableName(int variable_id) {
    return CCMCJNI.Kameleon_getVariableName(swigCPtr, this, variable_id);
  }

  public Attribute getGlobalAttribute(int i) {
    return new Attribute(CCMCJNI.Kameleon_getGlobalAttribute__SWIG_0(swigCPtr, this, i), true);
  }

  public String getGlobalAttributeName(int attribute_id) {
    return CCMCJNI.Kameleon_getGlobalAttributeName(swigCPtr, this, attribute_id);
  }

  public Attribute getGlobalAttribute(String attribute) {
    return new Attribute(CCMCJNI.Kameleon_getGlobalAttribute__SWIG_1(swigCPtr, this, attribute), true);
  }

  public Attribute getVariableAttribute(String variable, String attribute) {
    return new Attribute(CCMCJNI.Kameleon_getVariableAttribute(swigCPtr, this, variable, attribute), true);
  }

  public String getVariableAttributeName(int attribute_id) {
    return CCMCJNI.Kameleon_getVariableAttributeName(swigCPtr, this, attribute_id);
  }

  public vector_string getLoadedVariables() {
    return new vector_string(CCMCJNI.Kameleon_getLoadedVariables(swigCPtr, this), true);
  }

  public int getNumberOfVariables() {
    return CCMCJNI.Kameleon_getNumberOfVariables(swigCPtr, this);
  }

  public boolean doesAttributeExist(String attribute) {
    return CCMCJNI.Kameleon_doesAttributeExist(swigCPtr, this, attribute);
  }

  public boolean doesVariableExist(String variable) {
    return CCMCJNI.Kameleon_doesVariableExist(swigCPtr, this, variable);
  }

  public SWIGTYPE_p_void getCurrentFileID() {
    long cPtr = CCMCJNI.Kameleon_getCurrentFileID(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public String getCurrentFilename() {
    return CCMCJNI.Kameleon_getCurrentFilename(swigCPtr, this);
  }

  public static float getDefaultMissingValue() {
    return CCMCJNI.Kameleon_defaultMissingValue_get();
  }

  public static int _cxform(String from, String to, double et, Position v_in, Position v_out) {
    return CCMCJNI.Kameleon__cxform(from, to, et, Position.getCPtr(v_in), v_in, Position.getCPtr(v_out), v_out);
  }

  public static double _gregorian_calendar_to_jd(int y, int m, int d, int h, int mi, int s) {
    return CCMCJNI.Kameleon__gregorian_calendar_to_jd(y, m, d, h, mi, s);
  }

  public static int _cxRound(double doub) {
    return CCMCJNI.Kameleon__cxRound(doub);
  }

  public static int _date2es(int yyyy, int mm, int dd, int hh, int mm2, int ss) {
    return CCMCJNI.Kameleon__date2es(yyyy, mm, dd, hh, mm2, ss);
  }

  public int close() {
    return CCMCJNI.Kameleon_close(swigCPtr, this);
  }

  public Time getCurrentTime() {
    return new Time(CCMCJNI.Kameleon_getCurrentTime(swigCPtr, this), true);
  }

}
