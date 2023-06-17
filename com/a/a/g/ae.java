/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.af;
import com.a.a.g.ag;
import com.a.a.g.ah;
import com.a.a.l.q;
import java.security.MessageDigest;

public abstract class ae {
    private static final char[] a = "0123456789abcdef".toCharArray();

    ae() {
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract long d();

    public abstract byte[] e();

    public int a(byte[] arrby, int n2, int n3) {
        n3 = q.a(new int[]{n3, this.a() / 8});
        cl.a(n2, n2 + n3, arrby.length);
        this.b(arrby, n2, n3);
        return n3;
    }

    abstract void b(byte[] var1, int var2, int var3);

    byte[] f() {
        return this.e();
    }

    public static ae a(int n2) {
        return new ag(n2);
    }

    public static ae a(long l2) {
        return new ah(l2);
    }

    public static ae a(byte[] arrby) {
        cl.a(arrby.length >= 1, (Object)"A HashCode must contain at least 1 byte.");
        return ae.b((byte[])arrby.clone());
    }

    static ae b(byte[] arrby) {
        return new af(arrby);
    }

    public static ae a(String string) {
        cl.a(string.length() >= 2, "input string (%s) must have at least 2 characters", new Object[]{string});
        cl.a(string.length() % 2 == 0, "input string (%s) must have an even number of characters", new Object[]{string});
        byte[] arrby = new byte[string.length() / 2];
        for (int i2 = 0; i2 < string.length(); i2 += 2) {
            int n2 = ae.a(string.charAt(i2)) << 4;
            int n3 = ae.a(string.charAt(i2 + 1));
            arrby[i2 / 2] = (byte)(n2 + n3);
        }
        return ae.b(arrby);
    }

    private static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - 48;
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 97 + 10;
        }
        throw new IllegalArgumentException("Illegal hexadecimal character: " + c2);
    }

    public final boolean equals(Object object) {
        if (object instanceof ae) {
            ae ae2 = (ae)object;
            return MessageDigest.isEqual(this.e(), ae2.e());
        }
        return false;
    }

    public final int hashCode() {
        if (this.a() >= 32) {
            return this.b();
        }
        byte[] arrby = this.e();
        int n2 = arrby[0] & 0xFF;
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            n2 |= (arrby[i2] & 0xFF) << i2 * 8;
        }
        return n2;
    }

    public final String toString() {
        byte[] arrby = this.e();
        StringBuilder stringBuilder = new StringBuilder(2 * arrby.length);
        for (byte by2 : arrby) {
            stringBuilder.append(a[by2 >> 4 & 0xF]).append(a[by2 & 0xF]);
        }
        return stringBuilder.toString();
    }
}

