/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.g.ak;
import com.a.a.g.n;
import com.a.a.g.q;
import com.a.a.g.u;

final class p
extends n {
    @Override
    public boolean a(Object object, u u2, int n2, q q2) {
        long l2 = q2.a();
        byte[] arrby = ak.b().a(object, u2).f();
        long l3 = this.a(arrby);
        long l4 = this.b(arrby);
        boolean bl2 = false;
        long l5 = l3;
        for (int i2 = 0; i2 < n2; ++i2) {
            bl2 |= q2.a((l5 & Long.MAX_VALUE) % l2);
            l5 += l4;
        }
        return bl2;
    }

    @Override
    public boolean b(Object object, u u2, int n2, q q2) {
        long l2 = q2.a();
        byte[] arrby = ak.b().a(object, u2).f();
        long l3 = this.a(arrby);
        long l4 = this.b(arrby);
        long l5 = l3;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!q2.b((l5 & Long.MAX_VALUE) % l2)) {
                return false;
            }
            l5 += l4;
        }
        return true;
    }

    private long a(byte[] arrby) {
        return com.a.a.l.u.a(arrby[7], arrby[6], arrby[5], arrby[4], arrby[3], arrby[2], arrby[1], arrby[0]);
    }

    private long b(byte[] arrby) {
        return com.a.a.l.u.a(arrby[15], arrby[14], arrby[13], arrby[12], arrby[11], arrby[10], arrby[9], arrby[8]);
    }
}

