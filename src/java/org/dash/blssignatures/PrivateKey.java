/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.dash.blssignatures;

public class PrivateKey {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PrivateKey(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PrivateKey obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        blssignaturesJNI.delete_PrivateKey(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static PrivateKey FromSeed(SWIGTYPE_p_uint8_t seed, long seedLen) {
    return new PrivateKey(blssignaturesJNI.PrivateKey_FromSeed(SWIGTYPE_p_uint8_t.getCPtr(seed), seedLen), true);
  }

  public static PrivateKey FromBytes(SWIGTYPE_p_uint8_t bytes, boolean modOrder) {
    return new PrivateKey(blssignaturesJNI.PrivateKey_FromBytes__SWIG_0(SWIGTYPE_p_uint8_t.getCPtr(bytes), modOrder), true);
  }

  public static PrivateKey FromBytes(SWIGTYPE_p_uint8_t bytes) {
    return new PrivateKey(blssignaturesJNI.PrivateKey_FromBytes__SWIG_1(SWIGTYPE_p_uint8_t.getCPtr(bytes)), true);
  }

  public PrivateKey(PrivateKey k) {
    this(blssignaturesJNI.new_PrivateKey__SWIG_0(PrivateKey.getCPtr(k), k), true);
  }

  public SWIGTYPE_p_PublicKey GetPublicKey() {
    return new SWIGTYPE_p_PublicKey(blssignaturesJNI.PrivateKey_GetPublicKey(swigCPtr, this), true);
  }

  public static PrivateKey AggregateInsecure(SWIGTYPE_p_std__vectorT_bls__PrivateKey_t privateKeys) {
    return new PrivateKey(blssignaturesJNI.PrivateKey_AggregateInsecure(SWIGTYPE_p_std__vectorT_bls__PrivateKey_t.getCPtr(privateKeys)), true);
  }

  public static PrivateKey Aggregate(SWIGTYPE_p_std__vectorT_bls__PrivateKey_t privateKeys, SWIGTYPE_p_std__vectorT_PublicKey_t pubKeys) {
    return new PrivateKey(blssignaturesJNI.PrivateKey_Aggregate(SWIGTYPE_p_std__vectorT_bls__PrivateKey_t.getCPtr(privateKeys), SWIGTYPE_p_std__vectorT_PublicKey_t.getCPtr(pubKeys)), true);
  }

  public void Serialize(SWIGTYPE_p_uint8_t buffer) {
    blssignaturesJNI.PrivateKey_Serialize__SWIG_0(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(buffer));
  }

  public SWIGTYPE_p_std__vectorT_uint8_t_t Serialize() {
    return new SWIGTYPE_p_std__vectorT_uint8_t_t(blssignaturesJNI.PrivateKey_Serialize__SWIG_1(swigCPtr, this), true);
  }

  public SWIGTYPE_p_InsecureSignature SignInsecure(SWIGTYPE_p_uint8_t msg, long len) {
    return new SWIGTYPE_p_InsecureSignature(blssignaturesJNI.PrivateKey_SignInsecure(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(msg), len), true);
  }

  public SWIGTYPE_p_InsecureSignature SignInsecurePrehashed(SWIGTYPE_p_uint8_t hash) {
    return new SWIGTYPE_p_InsecureSignature(blssignaturesJNI.PrivateKey_SignInsecurePrehashed(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(hash)), true);
  }

  public SWIGTYPE_p_Signature Sign(SWIGTYPE_p_uint8_t msg, long len) {
    return new SWIGTYPE_p_Signature(blssignaturesJNI.PrivateKey_Sign(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(msg), len), true);
  }

  public SWIGTYPE_p_Signature SignPrehashed(SWIGTYPE_p_uint8_t hash) {
    return new SWIGTYPE_p_Signature(blssignaturesJNI.PrivateKey_SignPrehashed(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(hash)), true);
  }

  public final static long PRIVATE_KEY_SIZE = blssignaturesJNI.PrivateKey_PRIVATE_KEY_SIZE_get();
}
