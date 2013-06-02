/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package whyq.chilkatsoft;

public class CkDateTime {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CkDateTime(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CkDateTime obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkDateTime(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkDateTime() {
    this(chilkatJNI.new_CkDateTime(), true);
  }

  public int get_IsDst() {
    return chilkatJNI.CkDateTime_get_IsDst(swigCPtr, this);
  }

  public int get_UtcOffset() {
    return chilkatJNI.CkDateTime_get_UtcOffset(swigCPtr, this);
  }

  public void SetFromCurrentSystemTime() {
    chilkatJNI.CkDateTime_SetFromCurrentSystemTime(swigCPtr, this);
  }

  public boolean SetFromRfc822(String rfc822Str) {
    return chilkatJNI.CkDateTime_SetFromRfc822(swigCPtr, this, rfc822Str);
  }

  public int GetAsUnixTime(boolean bLocal) {
    return chilkatJNI.CkDateTime_GetAsUnixTime(swigCPtr, this, bLocal);
  }

  public SWIGTYPE_p___int64 GetAsUnixTime64(boolean bLocal) {
    return new SWIGTYPE_p___int64(chilkatJNI.CkDateTime_GetAsUnixTime64(swigCPtr, this, bLocal), true);
  }

  public double GetAsOleDate(boolean bLocal) {
    return chilkatJNI.CkDateTime_GetAsOleDate(swigCPtr, this, bLocal);
  }

  public int GetAsDosDate(boolean bLocal) {
    return chilkatJNI.CkDateTime_GetAsDosDate(swigCPtr, this, bLocal);
  }

  public SWIGTYPE_p___int64 GetAsDateTimeTicks(boolean bLocal) {
    return new SWIGTYPE_p___int64(chilkatJNI.CkDateTime_GetAsDateTimeTicks(swigCPtr, this, bLocal), true);
  }

  public void SetFromUnixTime(boolean bLocal, int t) {
    chilkatJNI.CkDateTime_SetFromUnixTime(swigCPtr, this, bLocal, t);
  }

  public void SetFromUnixTime64(boolean bLocal, SWIGTYPE_p___int64 t) {
    chilkatJNI.CkDateTime_SetFromUnixTime64(swigCPtr, this, bLocal, SWIGTYPE_p___int64.getCPtr(t));
  }

  public void SetFromOleDate(boolean bLocal, double dt) {
    chilkatJNI.CkDateTime_SetFromOleDate(swigCPtr, this, bLocal, dt);
  }

  public void SetFromDosDate(boolean bLocal, int t) {
    chilkatJNI.CkDateTime_SetFromDosDate(swigCPtr, this, bLocal, t);
  }

  public void SetFromDateTimeTicks(boolean bLocal, SWIGTYPE_p___int64 n) {
    chilkatJNI.CkDateTime_SetFromDateTimeTicks(swigCPtr, this, bLocal, SWIGTYPE_p___int64.getCPtr(n));
  }

  public boolean Serialize(CkString outStr) {
    return chilkatJNI.CkDateTime_Serialize(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String serialize() {
    return chilkatJNI.CkDateTime_serialize(swigCPtr, this);
  }

  public void DeSerialize(String serializedDateTime) {
    chilkatJNI.CkDateTime_DeSerialize(swigCPtr, this, serializedDateTime);
  }

  public boolean AddDays(int numDays) {
    return chilkatJNI.CkDateTime_AddDays(swigCPtr, this, numDays);
  }

}
