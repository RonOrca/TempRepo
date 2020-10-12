/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.wiredtiger.db;

public class Modify {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Modify(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Modify obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        wiredtigerJNI.delete_Modify(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setOffset(long value) throws com.wiredtiger.db.WiredTigerException {
    wiredtigerJNI.Modify_offset_set(swigCPtr, this, value);
  }

  public long getOffset() throws com.wiredtiger.db.WiredTigerException {
    return wiredtigerJNI.Modify_offset_get(swigCPtr, this);
  }

  public Modify() {
    this(wiredtigerJNI.new_Modify__SWIG_0(), true);
  }

  public Modify(byte[] itemdata, long offset, long size) {
    this(wiredtigerJNI.new_Modify__SWIG_1(itemdata, offset, size), true);
  }

}