/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import java.io.Serializable;

public class a
implements Serializable {
    private static final long f = 1L;
    public static final a a = new a("UTF-8", 239, 187, 191);
    public static final a b = new a("UTF-16BE", 254, 255);
    public static final a c = new a("UTF-16LE", 255, 254);
    public static final a d = new a("UTF-32BE", 0, 0, 254, 255);
    public static final a e = new a("UTF-32LE", 255, 254, 0, 0);
    private final String g;
    private final int[] h;

    public a(String string, int ... arrn) {
        if (string == null || string.length() == 0) {
            throw new IllegalArgumentException("No charsetName specified");
        }
        if (arrn == null || arrn.length == 0) {
            throw new IllegalArgumentException("No bytes specified");
        }
        this.g = string;
        this.h = new int[arrn.length];
        System.arraycopy(arrn, 0, this.h, 0, arrn.length);
    }

    public String a() {
        return this.g;
    }

    public int b() {
        return this.h.length;
    }

    public int a(int n2) {
        return this.h[n2];
    }

    public byte[] c() {
        byte[] arrby = new byte[this.h.length];
        for (int i2 = 0; i2 < this.h.length; ++i2) {
            arrby[i2] = (byte)this.h[i2];
        }
        return arrby;
    }

    public boolean equals(Object object) {
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        if (this.h.length != a2.b()) {
            return false;
        }
        for (int i2 = 0; i2 < this.h.length; ++i2) {
            if (this.h[i2] == a2.a(i2)) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        int n2 = this.getClass().hashCode();
        for (int n3 : this.h) {
            n2 += n3;
        }
        return n2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append('[');
        stringBuilder.append(this.g);
        stringBuilder.append(": ");
        for (int i2 = 0; i2 < this.h.length; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append("0x");
            stringBuilder.append(Integer.toHexString(0xFF & this.h[i2]).toUpperCase());
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

