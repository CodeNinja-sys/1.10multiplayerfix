/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.i.cj;
import com.a.a.i.s;
import java.io.InputStream;

final class w
extends s {
    private final Iterable a;

    w(Iterable iterable) {
        this.a = (Iterable)cl.a(iterable);
    }

    @Override
    public InputStream a() {
        return new cj(this.a.iterator());
    }

    @Override
    public boolean d() {
        for (s s2 : this.a) {
            if (s2.d()) continue;
            return false;
        }
        return true;
    }

    @Override
    public long e() {
        long l2 = 0L;
        for (s s2 : this.a) {
            l2 += s2.e();
        }
        return l2;
    }

    public String toString() {
        return "ByteSource.concat(" + this.a + ")";
    }

    @Override
    public /* synthetic */ Object h() {
        return super.b();
    }
}

