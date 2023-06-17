/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.g.ak;
import com.a.a.g.n;
import com.a.a.g.q;
import com.a.a.g.u;

final class o
extends n {
    @Override
    public boolean a(Object object, u u2, int n2, q q2) {
        long l2 = q2.a();
        long l3 = ak.b().a(object, u2).c();
        int n3 = (int)l3;
        int n4 = (int)(l3 >>> 32);
        boolean bl2 = false;
        for (int i2 = 1; i2 <= n2; ++i2) {
            int n5 = n3 + i2 * n4;
            if (n5 < 0) {
                n5 ^= 0xFFFFFFFF;
            }
            bl2 |= q2.a((long)n5 % l2);
        }
        return bl2;
    }

    @Override
    public boolean b(Object object, u u2, int n2, q q2) {
        long l2 = q2.a();
        long l3 = ak.b().a(object, u2).c();
        int n3 = (int)l3;
        int n4 = (int)(l3 >>> 32);
        for (int i2 = 1; i2 <= n2; ++i2) {
            int n5 = n3 + i2 * n4;
            if (n5 < 0) {
                n5 ^= 0xFFFFFFFF;
            }
            if (q2.b((long)n5 % l2)) continue;
            return false;
        }
        return true;
    }
}

