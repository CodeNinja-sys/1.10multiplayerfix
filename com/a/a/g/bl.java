/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.aj;
import com.a.a.g.bm;
import com.a.a.g.h;
import java.io.Serializable;

final class bl
extends h
implements Serializable {
    private final int a;
    private final int b;
    private final long c;
    private final long d;
    private static final long e = 0L;

    bl(int n2, int n3, long l2, long l3) {
        cl.a(n2 > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", new Object[]{n2});
        cl.a(n3 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", new Object[]{n3});
        this.a = n2;
        this.b = n3;
        this.c = l2;
        this.d = l3;
    }

    @Override
    public int b() {
        return 64;
    }

    @Override
    public aj a() {
        return new bm(this.a, this.b, this.c, this.d);
    }

    public String toString() {
        return "Hashing.sipHash" + this.a + "" + this.b + "(" + this.c + ", " + this.d + ")";
    }

    public boolean equals(Object object) {
        if (object instanceof bl) {
            bl bl2 = (bl)object;
            return this.a == bl2.a && this.b == bl2.b && this.c == bl2.c && this.d == bl2.d;
        }
        return false;
    }

    public int hashCode() {
        return (int)((long)(this.getClass().hashCode() ^ this.a ^ this.b) ^ this.c ^ this.d);
    }
}

