/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.az;
import io.netty.c.a.k.bc;
import java.io.Serializable;
import java.util.Comparator;

final class bb
implements Serializable,
Comparator {
    private static final long b = 1161471649740544848L;
    final /* synthetic */ az a;

    bb(az az2) {
        this.a = az2;
    }

    public int a(Integer n2, Integer n3) {
        bc bc2 = (bc)az.a(this.a).get(n2);
        bc bc3 = (bc)az.a(this.a).get(n3);
        int n4 = bc2.a() - bc3.a();
        if (n4 != 0) {
            return n4;
        }
        return n2 - n3;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }
}

