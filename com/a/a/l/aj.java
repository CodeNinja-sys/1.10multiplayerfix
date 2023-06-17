/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.l.ag;
import com.a.a.l.ak;
import com.a.a.l.ap;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Comparator;
import sun.misc.Unsafe;

enum aj implements Comparator
{
    a;

    static final boolean b;
    static final Unsafe c;
    static final int d;

    private static Unsafe a() {
        try {
            return Unsafe.getUnsafe();
        }
        catch (SecurityException securityException) {
            try {
                return (Unsafe)AccessController.doPrivileged(new ak());
            }
            catch (PrivilegedActionException privilegedActionException) {
                throw new RuntimeException("Could not initialize intrinsics", privilegedActionException.getCause());
            }
        }
    }

    public int a(byte[] arrby, byte[] arrby2) {
        int n2;
        int n3 = Math.min(arrby.length, arrby2.length);
        int n4 = n3 / 8;
        for (n2 = 0; n2 < n4 * 8; n2 += 8) {
            long l2;
            long l3 = c.getLong(arrby, (long)d + (long)n2);
            if (l3 == (l2 = c.getLong(arrby2, (long)d + (long)n2))) continue;
            if (b) {
                return ap.a(l3, l2);
            }
            int n5 = Long.numberOfTrailingZeros(l3 ^ l2) & 0xFFFFFFF8;
            return (int)((l3 >>> n5 & 0xFFL) - (l2 >>> n5 & 0xFFL));
        }
        for (n2 = n4 * 8; n2 < n3; ++n2) {
            int n6 = ag.a(arrby[n2], arrby2[n2]);
            if (n6 == 0) continue;
            return n6;
        }
        return arrby.length - arrby2.length;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((byte[])object, (byte[])object2);
    }

    static {
        b = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
        c = aj.a();
        d = c.arrayBaseOffset(byte[].class);
        if (c.arrayIndexScale(byte[].class) != 1) {
            throw new AssertionError();
        }
    }
}

