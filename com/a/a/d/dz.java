/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.ce;
import com.a.a.d.dw;
import com.a.a.d.ep;
import com.a.a.d.yl;

final class dz
extends dw {
    private static final long b = 0L;

    dz(Comparable comparable) {
        super((Comparable)cl.a(comparable));
    }

    @Override
    boolean a(Comparable comparable) {
        return yl.e(this.a, comparable) < 0;
    }

    @Override
    ce a() {
        return ce.a;
    }

    @Override
    ce b() {
        return ce.b;
    }

    @Override
    dw a(ce ce2, ep ep2) {
        switch (ce2) {
            case a: {
                return this;
            }
            case b: {
                Comparable comparable = ep2.a(this.a);
                return comparable == null ? dw.d() : dz.b(comparable);
            }
        }
        throw new AssertionError();
    }

    @Override
    dw b(ce ce2, ep ep2) {
        switch (ce2) {
            case a: {
                Comparable comparable = ep2.a(this.a);
                return comparable == null ? dw.e() : dz.b(comparable);
            }
            case b: {
                return this;
            }
        }
        throw new AssertionError();
    }

    @Override
    void a(StringBuilder stringBuilder) {
        stringBuilder.append('(').append(this.a);
    }

    @Override
    void b(StringBuilder stringBuilder) {
        stringBuilder.append(this.a).append(']');
    }

    @Override
    Comparable a(ep ep2) {
        return ep2.a(this.a);
    }

    @Override
    Comparable b(ep ep2) {
        return this.a;
    }

    @Override
    dw c(ep ep2) {
        Comparable comparable = this.a(ep2);
        return comparable != null ? dz.b(comparable) : dw.e();
    }

    public int hashCode() {
        return ~this.a.hashCode();
    }

    public String toString() {
        return "/" + this.a + "\\";
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return super.a((dw)object);
    }
}

