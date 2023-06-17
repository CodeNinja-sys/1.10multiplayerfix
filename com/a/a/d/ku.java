/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aad;
import com.a.a.d.agi;
import com.a.a.d.iz;
import com.a.a.d.jt;
import com.a.a.d.ju;
import com.a.a.d.kv;
import com.a.a.d.kw;
import com.a.a.d.kx;
import com.a.a.d.la;
import com.a.a.d.lo;
import com.a.a.d.nj;
import com.a.a.d.oi;
import com.a.a.d.xc;
import com.a.a.d.xd;
import com.a.a.d.xe;
import com.a.a.d.zj;
import com.a.a.l.q;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class ku
extends iz
implements xc {
    private static final ku a = new zj(jt.m(), 0);
    private transient lo b;

    public static ku f() {
        return a;
    }

    public static ku b(Object object) {
        return ku.b(new Object[]{object});
    }

    public static ku a(Object object, Object object2) {
        return ku.b(object, object2);
    }

    public static ku a(Object object, Object object2, Object object3) {
        return ku.b(object, object2, object3);
    }

    public static ku a(Object object, Object object2, Object object3, Object object4) {
        return ku.b(object, object2, object3, object4);
    }

    public static ku a(Object object, Object object2, Object object3, Object object4, Object object5) {
        return ku.b(object, object2, object3, object4, object5);
    }

    public static ku a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object ... arrobject) {
        return new kw().a(object).a(object2).a(object3).a(object4).a(object5).a(object6).b(arrobject).b();
    }

    public static ku a(Object[] arrobject) {
        return ku.a(Arrays.asList(arrobject));
    }

    public static ku a(Iterable iterable) {
        xc xc2;
        if (iterable instanceof ku && !(xc2 = (ku)iterable).a()) {
            return xc2;
        }
        xc2 = iterable instanceof xc ? xe.b(iterable) : oi.a(iterable);
        return ku.a(xc2);
    }

    private static ku b(Object ... arrobject) {
        return ku.a(Arrays.asList(arrobject));
    }

    private static ku a(xc xc2) {
        return ku.a(xc2.aS_());
    }

    static ku a(Collection collection) {
        long l2 = 0L;
        ju ju2 = jt.n();
        for (xd xd2 : collection) {
            int n2 = xd2.b();
            if (n2 <= 0) continue;
            ju2.b(xd2.a(), n2);
            l2 += (long)n2;
        }
        if (l2 == 0L) {
            return ku.f();
        }
        return new zj(ju2.b(), q.b(l2));
    }

    public static ku a(Iterator iterator) {
        oi oi2 = oi.g();
        nj.a(oi2, iterator);
        return ku.a(oi2);
    }

    ku() {
    }

    @Override
    public agi aO_() {
        agi agi2 = this.n().aO_();
        return new kv(this, agi2);
    }

    @Override
    public boolean contains(Object object) {
        return this.a(object) > 0;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return this.d().containsAll(collection);
    }

    @Override
    public final int a(Object object, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int b(Object object, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int c(Object object, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean a(Object object, int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    @Override
    int a(Object[] arrobject, int n2) {
        for (xd xd2 : this.n()) {
            Arrays.fill(arrobject, n2, n2 + xd2.b(), xd2.a());
            n2 += xd2.b();
        }
        return n2;
    }

    @Override
    public boolean equals(Object object) {
        return xe.a((xc)this, object);
    }

    @Override
    public int hashCode() {
        return aad.b(this.n());
    }

    @Override
    public String toString() {
        return this.n().toString();
    }

    public lo n() {
        lo lo2 = this.b;
        return lo2 == null ? (this.b = this.b()) : lo2;
    }

    private final lo b() {
        return this.isEmpty() ? lo.j() : new kx(this, null);
    }

    abstract xd a(int var1);

    @Override
    Object aR_() {
        return new la(this);
    }

    public static kw p() {
        return new kw();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }

    @Override
    public /* synthetic */ Set aS_() {
        return this.n();
    }
}

