/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.Serializable;

public final class ba
implements Serializable,
Cloneable {
    private static final long a = 1L;
    private static final int b = 65280;
    private static final int c = 8;
    private final int d;

    public ba(int n2) {
        this.d = n2;
    }

    public ba(byte[] arrby) {
        this(arrby, 0);
    }

    public ba(byte[] arrby, int n2) {
        this.d = ba.a(arrby, n2);
    }

    public byte[] a() {
        byte[] arrby = new byte[]{(byte)(this.d & 0xFF), (byte)((this.d & 0xFF00) >> 8)};
        return arrby;
    }

    public int b() {
        return this.d;
    }

    public static byte[] a(int n2) {
        byte[] arrby = new byte[]{(byte)(n2 & 0xFF), (byte)((n2 & 0xFF00) >> 8)};
        return arrby;
    }

    public static int a(byte[] arrby, int n2) {
        int n3 = arrby[n2 + 1] << 8 & 0xFF00;
        return n3 += arrby[n2] & 0xFF;
    }

    public static int a(byte[] arrby) {
        return ba.a(arrby, 0);
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof ba)) {
            return false;
        }
        return this.d == ((ba)object).b();
    }

    public int hashCode() {
        return this.d;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public String toString() {
        return "ZipShort value: " + this.d;
    }
}

