/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package gov.nasa.gsfc.ccmc;

public class vector_point3f {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public vector_point3f(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(vector_point3f obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CCMCJNI.delete_vector_point3f(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public vector_point3f() {
    this(CCMCJNI.new_vector_point3f__SWIG_0(), true);
  }

  public vector_point3f(long n) {
    this(CCMCJNI.new_vector_point3f__SWIG_1(n), true);
  }

  public long size() {
    return CCMCJNI.vector_point3f_size(swigCPtr, this);
  }

  public long capacity() {
    return CCMCJNI.vector_point3f_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    CCMCJNI.vector_point3f_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return CCMCJNI.vector_point3f_isEmpty(swigCPtr, this);
  }

  public void clear() {
    CCMCJNI.vector_point3f_clear(swigCPtr, this);
  }

  public void add(Point3f x) {
    CCMCJNI.vector_point3f_add(swigCPtr, this, Point3f.getCPtr(x), x);
  }

  public Point3f get(int i) {
    return new Point3f(CCMCJNI.vector_point3f_get(swigCPtr, this, i), false);
  }

  public void set(int i, Point3f val) {
    CCMCJNI.vector_point3f_set(swigCPtr, this, i, Point3f.getCPtr(val), val);
  }

}
