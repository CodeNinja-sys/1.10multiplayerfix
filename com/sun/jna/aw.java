/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Native;
import com.sun.jna.ac;
import com.sun.jna.ay;
import java.nio.CharBuffer;

class aw
implements CharSequence,
Comparable {
    private ay a;
    private boolean b;

    public aw(String string) {
        this(string, false);
    }

    public aw(String string, boolean bl2) {
        if (string == null) {
            throw new NullPointerException("String must not be null");
        }
        this.b = bl2;
        if (bl2) {
            int n2 = (string.length() + 1) * Native.c;
            this.a = new ac(n2);
            this.a.a(0L, string, true);
        } else {
            byte[] arrby = Native.a(string);
            this.a = new ac(arrby.length + 1);
            this.a.b(0L, arrby, 0, arrby.length);
            this.a.a((long)arrby.length, (byte)0);
        }
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean equals(Object object) {
        if (object instanceof CharSequence) {
            return this.compareTo(object) == 0;
        }
        return false;
    }

    public String toString() {
        String string = this.b ? "const wchar_t*" : "const char*";
        string = string + "(" + this.a.a(0L, this.b) + ")";
        return string;
    }

    public ay a() {
        return this.a;
    }

    public char charAt(int n2) {
        return this.toString().charAt(n2);
    }

    public int length() {
        return this.toString().length();
    }

    public CharSequence subSequence(int n2, int n3) {
        return CharBuffer.wrap(this.toString()).subSequence(n2, n3);
    }

    public int compareTo(Object object) {
        if (object == null) {
            return 1;
        }
        return this.toString().compareTo(object.toString());
    }
}

