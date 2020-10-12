/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.wiredtiger.db;

/**
  * @copydoc WT_CURSOR
  * @ingroup wt_java
  */
public class Cursor {
 private long swigCPtr;
 protected boolean swigCMemOwn;
 protected String keyFormat;
 protected String valueFormat;
 protected PackOutputStream keyPacker;
 protected PackOutputStream valuePacker;
 protected PackInputStream keyUnpacker;
 protected PackInputStream valueUnpacker;

 protected Cursor(long cPtr, boolean cMemoryOwn) {
   swigCMemOwn = cMemoryOwn;
   swigCPtr = cPtr;
   keyFormat = getKey_format();
   valueFormat = getValue_format();
   keyPacker = new PackOutputStream(keyFormat, _java_raw());
   valuePacker = new PackOutputStream(valueFormat, _java_raw());
   wiredtigerJNI.Cursor__java_init(swigCPtr, this, this);
 }

 protected static long getCPtr(Cursor obj) {
   return (obj == null) ? 0 : obj.swigCPtr;
 }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }


	/**
	 * Retrieve the format string for this cursor's key.
	 */
	public String getKeyFormat() {
		return keyFormat;
	}

	/**
	 * Retrieve the format string for this cursor's value.
	 */
	public String getValueFormat() {
		return valueFormat;
	}

	/**
	 * Append a byte to the cursor's key.
	 *
	 * \param value The value to append.
	 * \return This cursor object, so put calls can be chained.
	 */
	public Cursor putKeyByte(byte value)
	throws WiredTigerPackingException {
		keyPacker.addByte(value);
		return this;
	}

	/**
	 * Append a byte array to the cursor's key.
	 *
	 * \param value The value to append.
	 * \return This cursor object, so put calls can be chained.
	 */
	public Cursor putKeyByteArray(byte[] value)
	throws WiredTigerPackingException {
		this.putKeyByteArray(value, 0, value.length);
		return this;
	}

	/**
	 * Append a byte array to the cursor's key.
	 *
	 * \param value The value to append.
	 * \param off The offset into value at which to start.
	 * \param len The length of the byte array.
	 * \return This cursor object, so put calls can be chained.
	 */
	public Cursor putKeyByteArray(byte[] value, int off, int len)
	throws WiredTigerPackingException {
		keyPacker.addByteArray(value, off, len);
		return this;
	}

	/**
	 * Append an integer to the cursor's key.
	 *
	 * \param value The value to append
	 * \return This cursor object, so put calls can be chained.
	 */
	public Cursor putKeyInt(int value)
	throws WiredTigerPackingException {
		keyPacker.addInt(value);
		return this;
	}

	/**
	 * Append a long to the cursor's key.
	 *
	 * \param value The value to append
	 * \return This cursor object, so put calls can be chained.
	 */
	public Cursor putKeyLong(long value)
	throws WiredTigerPackingException {
		keyPacker.addLong(value);
		return this;
	}

	/**
	 * Append a record number to the cursor's key.
	 *
	 * \param value The value to append
	 * \return This cursor object, so put calls can be chained.
	 */
	public Cursor putKeyRecord(long value)
	throws WiredTigerPackingException {
		keyPacker.addRecord(value);
		return this;
	}

	/**
	 * Append a short integer to the cursor's key.
	 *
	 * \param value The value to append
	 * \return This cursor object, so put calls can be chained.
	 */
	public Cursor putKeyShort(short value)
	throws WiredTigerPackingException {
		keyPacker.addShort(value);
		return this;
	}

	/**
	 * Append a string to the cursor's key.
	 *
	 * \param value The value to append
	 * \return This cursor object, so put calls can be chained.
	 */
	public Cursor putKeyString(String value)
	throws WiredTigerPackingException {
		keyPacker.addString(value);
		return this;
	}

	/**
	 * Append a byte to the cursor's value.
	 *
	 * \param value The value to append
	 * \return This cursor object, so put calls can be chained.
	 */
	public Cursor putValueByte(byte value)
	throws WiredTigerPackingException {
		valuePacker.addByte(value);
		return this;
	}

	/**
	 * Append a byte array to the cursor's value.
	 *
	 * \param value The value to append
	 * \return This cursor object, so put calls can be chained.
	 */
	public Cursor putValueByteArray(byte[] value)
	throws WiredTigerPackingException {
		this.putValueByteArray(value, 0, value.length);
		return this;
	}

	/**
	 * Append a byte array to the cursor's value.
	 *
	 * \param value The value to append
	 * \param off The offset into value at which to start.
	 * \param len The length of the byte array.
	 * \return This cursor object, so put calls can be chained.
	 */
	public Cursor putValueByteArray(byte[] value, int off, int len)
	throws WiredTigerPackingException {
		valuePacker.addByteArray(value, off, len);
		return this;
	}

	/**
	 * Append an integer to the cursor's value.
	 *
	 * \param value The value to append
	 * \return This cursor object, so put calls can be chained.
	 */
	public Cursor putValueInt(int value)
	throws WiredTigerPackingException {
		valuePacker.addInt(value);
		return this;
	}

	/**
	 * Append a long to the cursor's value.
	 *
	 * \param value The value to append
	 * \return This cursor object, so put calls can be chained.
	 */
	public Cursor putValueLong(long value)
	throws WiredTigerPackingException {
		valuePacker.addLong(value);
		return this;
	}

	/**
	 * Append a record number to the cursor's value.
	 *
	 * \param value The value to append
	 * \return This cursor object, so put calls can be chained.
	 */
	public Cursor putValueRecord(long value)
	throws WiredTigerPackingException {
		valuePacker.addRecord(value);
		return this;
	}

	/**
	 * Append a short integer to the cursor's value.
	 *
	 * \param value The value to append
	 * \return This cursor object, so put calls can be chained.
	 */
	public Cursor putValueShort(short value)
	throws WiredTigerPackingException {
		valuePacker.addShort(value);
		return this;
	}

	/**
	 * Append a string to the cursor's value.
	 *
	 * \param value The value to append
	 * \return This cursor object, so put calls can be chained.
	 */
	public Cursor putValueString(String value)
	throws WiredTigerPackingException {
		valuePacker.addString(value);
		return this;
	}

	/**
	 * Retrieve a byte from the cursor's key.
	 *
	 * \return The requested value.
	 */
	public byte getKeyByte()
	throws WiredTigerPackingException {
		return keyUnpacker.getByte();
	}

	/**
	 * Retrieve a byte array from the cursor's key.
	 *
	 * \param output The byte array where the returned value will be stored.
	 *	       The array should be large enough to store the entire
	 *	       data item, if not a truncated value will be returned.
	 */
	public void getKeyByteArray(byte[] output)
	throws WiredTigerPackingException {
		this.getKeyByteArray(output, 0, output.length);
	}

	/**
	 * Retrieve a byte array from the cursor's key.
	 *
	 * \param output The byte array where the returned value will be stored.
	 * \param off Offset into the destination buffer to start copying into.
	 * \param len The length should be large enough to store the entire
	 *	      data item, if not a truncated value will be returned.
	 */
	public void getKeyByteArray(byte[] output, int off, int len)
	throws WiredTigerPackingException {
		keyUnpacker.getByteArray(output, off, len);
	}

	/**
	 * Retrieve a byte array from the cursor's key.
	 *
	 * \return The requested value.
	 */
	public byte[] getKeyByteArray()
	throws WiredTigerPackingException {
		return keyUnpacker.getByteArray();
	}

	/**
	 * Retrieve an integer from the cursor's key.
	 *
	 * \return The requested value.
	 */
	public int getKeyInt()
	throws WiredTigerPackingException {
		return keyUnpacker.getInt();
	}

	/**
	 * Retrieve a long from the cursor's key.
	 *
	 * \return The requested value.
	 */
	public long getKeyLong()
	throws WiredTigerPackingException {
		return keyUnpacker.getLong();
	}

	/**
	 * Retrieve a record number from the cursor's key.
	 *
	 * \return The requested value.
	 */
	public long getKeyRecord()
	throws WiredTigerPackingException {
		return keyUnpacker.getRecord();
	}

	/**
	 * Retrieve a short integer from the cursor's key.
	 *
	 * \return The requested value.
	 */
	public short getKeyShort()
	throws WiredTigerPackingException {
		return keyUnpacker.getShort();
	}

	/**
	 * Retrieve a string from the cursor's key.
	 *
	 * \return The requested value.
	 */
	public String getKeyString()
	throws WiredTigerPackingException {
		return keyUnpacker.getString();
	}

	/**
	 * Retrieve a byte from the cursor's value.
	 *
	 * \return The requested value.
	 */
	public byte getValueByte()
	throws WiredTigerPackingException {
		return valueUnpacker.getByte();
	}

	/**
	 * Retrieve a byte array from the cursor's value.
	 *
	 * \param output The byte array where the returned value will be stored.
	 *	       The array should be large enough to store the entire
	 *	       data item, if not a truncated value will be returned.
	 */
	public void getValueByteArray(byte[] output)
	throws WiredTigerPackingException {
		this.getValueByteArray(output, 0, output.length);
	}

	/**
	 * Retrieve a byte array from the cursor's value.
	 *
	 * \param output The byte array where the returned value will be stored.
	 * \param off Offset into the destination buffer to start copying into.
	 * \param len The length should be large enough to store the entire
	 *	      data item, if not a truncated value will be returned.
	 */
	public void getValueByteArray(byte[] output, int off, int len)
	throws WiredTigerPackingException {
		valueUnpacker.getByteArray(output, off, len);
	}

	/**
	 * Retrieve a byte array from the cursor's value.
	 *
	 * \return The requested value.
	 */
	public byte[] getValueByteArray()
	throws WiredTigerPackingException {
		return valueUnpacker.getByteArray();
	}

	/**
	 * Retrieve an integer from the cursor's value.
	 *
	 * \return The requested value.
	 */
	public int getValueInt()
	throws WiredTigerPackingException {
		return valueUnpacker.getInt();
	}

	/**
	 * Retrieve a long from the cursor's value.
	 *
	 * \return The requested value.
	 */
	public long getValueLong()
	throws WiredTigerPackingException {
		return valueUnpacker.getLong();
	}

	/**
	 * Retrieve a record number from the cursor's value.
	 *
	 * \return The requested value.
	 */
	public long getValueRecord()
	throws WiredTigerPackingException {
		return valueUnpacker.getRecord();
	}

	/**
	 * Retrieve a short integer from the cursor's value.
	 *
	 * \return The requested value.
	 */
	public short getValueShort()
	throws WiredTigerPackingException {
		return valueUnpacker.getShort();
	}

	/**
	 * Retrieve a string from the cursor's value.
	 *
	 * \return The requested value.
	 */
	public String getValueString()
	throws WiredTigerPackingException {
		return valueUnpacker.getString();
	}

	/**
	 * Insert the cursor's current key/value into the table.
	 *
	 * \return The status of the operation.
	 */
	public int insert()
	throws WiredTigerException {
		byte[] key = keyPacker.getValue();
		byte[] value = valuePacker.getValue();
		keyPacker.reset();
		valuePacker.reset();
		return insert_wrap(key, value);
	}

	/**
	 * Update the cursor's current key/value into the table.
	 *
	 * \return The status of the operation.
	 */
	public int update()
	throws WiredTigerException {
		byte[] key = keyPacker.getValue();
		byte[] value = valuePacker.getValue();
		keyPacker.reset();
		valuePacker.reset();
		return update_wrap(key, value);
	}

	/**
	 * Remove the cursor's current key/value into the table.
	 *
	 * \return The status of the operation.
	 */
	public int remove()
	throws WiredTigerException {
		byte[] key = keyPacker.getValue();
		keyPacker.reset();
		return remove_wrap(key);
	}

	/**
	 * Compare this cursor's position to another Cursor.
	 *
	 * \return The result of the comparison.
	 */
	public int compare(Cursor other)
	throws WiredTigerException {
		return compare_wrap(other);
	}

	/**
	 * Compare this cursor's position to another Cursor.
	 *
	 * \return The result of the comparison.
	 */
	public int equals(Cursor other)
	throws WiredTigerException {
		return equals_wrap(other);
	}

	/**
	 * Retrieve the next item in the table.
	 *
	 * \return The result of the comparison.
	 */
	public int next()
	throws WiredTigerException {
		int ret = next_wrap();
		keyPacker.reset();
		valuePacker.reset();
		keyUnpacker = initKeyUnpacker(ret == 0);
		valueUnpacker = initValueUnpacker(ret == 0);
		return ret;
	}

	/**
	 * Retrieve the previous item in the table.
	 *
	 * \return The result of the comparison.
	 */
	public int prev()
	throws WiredTigerException {
		int ret = prev_wrap();
		keyPacker.reset();
		valuePacker.reset();
		keyUnpacker = initKeyUnpacker(ret == 0);
		valueUnpacker = initValueUnpacker(ret == 0);
		return ret;
	}

	/**
	 * Reset a cursor.
	 *
	 * \return The status of the operation.
	 */
	public int reset()
	throws WiredTigerException {
		int ret = reset_wrap();
		keyPacker.reset();
		valuePacker.reset();
		keyUnpacker = null;
		valueUnpacker = null;
		return ret;
	}

	/**
	 * Search for an item in the table.
	 *
	 * \return The result of the comparison.
	 */
	public int search()
	throws WiredTigerException {
		int ret = search_wrap(keyPacker.getValue());
		keyPacker.reset();
		valuePacker.reset();
		keyUnpacker = initKeyUnpacker(ret == 0);
		valueUnpacker = initValueUnpacker(ret == 0);
		return ret;
	}

	/**
	 * Search for an item in the table.
	 *
	 * \return The result of the comparison.
	 */
	public SearchStatus search_near()
	throws WiredTigerException {
		SearchStatus ret = search_near_wrap(keyPacker.getValue());
		keyPacker.reset();
		valuePacker.reset();
		keyUnpacker = initKeyUnpacker(ret != SearchStatus.NOTFOUND);
		valueUnpacker = initValueUnpacker(ret != SearchStatus.NOTFOUND);
		return ret;
	}

	/**
	 * Initialize a key unpacker after an operation that changes
	 * the cursor position.
	 *
	 * \param success Whether the associated operation succeeded.
	 * \return The key unpacker.
	 */
	private PackInputStream initKeyUnpacker(boolean success)
	throws WiredTigerException {
		if (!success || keyFormat.equals(""))
			return null;
		else
			return new PackInputStream(keyFormat,
			    get_key_wrap(), _java_raw());
	}

	/**
	 * Initialize a value unpacker after an operation that changes
	 * the cursor position.
	 *
	 * \param success Whether the associated operation succeeded.
	 * \return The value unpacker.
	 */
	private PackInputStream initValueUnpacker(boolean success)
	throws WiredTigerException {
		if (!success || valueFormat.equals(""))
			return null;
		else
			return new PackInputStream(valueFormat,
			    get_value_wrap(), _java_raw());
	}

	/**
	 * Modify an existing record.
	 *
	 * The cursor must already be positioned, and the key's value will be
	 * updated.
	 *
	 * \param mods an array of modifications.
	 * \return 0 on success, errno on error.
	 */
	public int modify(Modify mods[])
	throws WiredTigerException {
		byte[] key = keyPacker.getValue();
		keyPacker.reset();

		WT_MODIFY_LIST l = new WT_MODIFY_LIST(mods.length);
		if (!_new_check_modify_list(l))
			return (0);   // exception is already thrown
		int pos = 0;

		for (Modify m : mods) {
			if (!_new_check_modify(m))
				return (0);   // exception is already thrown
			l.set(pos, m);
			pos++;
		}
		return modify_wrap(l, key);
	}

  public Session getSession() {
    long cPtr = wiredtigerJNI.Cursor_session_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Session(cPtr, false);
  }

  public String getUri() {
    return wiredtigerJNI.Cursor_uri_get(swigCPtr, this);
  }

  protected String getKey_format() {
    return wiredtigerJNI.Cursor_key_format_get(swigCPtr, this);
  }

  protected String getValue_format() {
    return wiredtigerJNI.Cursor_value_format_get(swigCPtr, this);
  }

  protected int next_wrap() throws com.wiredtiger.db.WiredTigerException {
    return wiredtigerJNI.Cursor_next_wrap(swigCPtr, this);
  }

  protected int prev_wrap() throws com.wiredtiger.db.WiredTigerException {
    return wiredtigerJNI.Cursor_prev_wrap(swigCPtr, this);
  }

  
  /**
   * @copydoc WT_CURSOR::reserve
   */
  public  int reserve() throws com.wiredtiger.db.WiredTigerException {
    return wiredtigerJNI.Cursor_reserve(swigCPtr, this);
  }

  
  /**
   * @copydoc WT_CURSOR::close
   */
  public  int close() throws com.wiredtiger.db.WiredTigerException {
    return wiredtigerJNI.Cursor_close(swigCPtr, this);
  }

  
  /**
   * @copydoc WT_CURSOR::reconfigure
   */
  public  int reconfigure(String config) throws com.wiredtiger.db.WiredTigerException {
    return wiredtigerJNI.Cursor_reconfigure(swigCPtr, this, config);
  }

  protected byte[] get_key_wrap() {
	return (wiredtigerJNI.Cursor_get_key_wrap(swigCPtr, this));
}

  protected byte[] get_value_wrap() {
	return (wiredtigerJNI.Cursor_get_value_wrap(swigCPtr, this));
}

  protected int insert_wrap(byte[] k, byte[] v) {
    return wiredtigerJNI.Cursor_insert_wrap(swigCPtr, this, k, v);
  }

  protected int remove_wrap(byte[] k) {
    return wiredtigerJNI.Cursor_remove_wrap(swigCPtr, this, k);
  }

  protected int reset_wrap() {
    return wiredtigerJNI.Cursor_reset_wrap(swigCPtr, this);
  }

  protected int search_wrap(byte[] k) {
    return wiredtigerJNI.Cursor_search_wrap(swigCPtr, this, k);
  }

  protected SearchStatus search_near_wrap(byte[] k) {
    return SearchStatus.swigToEnum(wiredtigerJNI.Cursor_search_near_wrap(swigCPtr, this, k));
  }

  protected int update_wrap(byte[] k, byte[] v) {
    return wiredtigerJNI.Cursor_update_wrap(swigCPtr, this, k, v);
  }

  protected int compare_wrap(Cursor other) {
    return wiredtigerJNI.Cursor_compare_wrap(swigCPtr, this, Cursor.getCPtr(other), other);
  }

  protected int equals_wrap(Cursor other) {
    return wiredtigerJNI.Cursor_equals_wrap(swigCPtr, this, Cursor.getCPtr(other), other);
  }

  protected boolean _java_raw() {
    return wiredtigerJNI.Cursor__java_raw(swigCPtr, this);
  }

  protected int _java_init(Object jcursor) {
    return wiredtigerJNI.Cursor__java_init(swigCPtr, this, jcursor);
  }

  public int modify_wrap(WT_MODIFY_LIST list, byte[] k) {
    return wiredtigerJNI.Cursor_modify_wrap(swigCPtr, this, WT_MODIFY_LIST.getCPtr(list), list, k);
  }

  public boolean _new_check_modify_list(WT_MODIFY_LIST list) {
    return wiredtigerJNI.Cursor__new_check_modify_list(swigCPtr, this, WT_MODIFY_LIST.getCPtr(list), list);
  }

  public boolean _new_check_modify(Modify mod) {
    return wiredtigerJNI.Cursor__new_check_modify(swigCPtr, this, Modify.getCPtr(mod), mod);
  }

}
