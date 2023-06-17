/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.d.aad;
import com.a.a.d.agi;
import com.a.a.d.as;
import com.a.a.d.cl;
import com.a.a.d.nj;
import com.a.a.d.xc;
import com.a.a.d.xt;
import java.util.Iterator;
import java.util.Set;

final class xs
extends as {
    final xc a;
    final cm b;

    xs(xc xc2, cm cm2) {
        this.a = (xc)com.a.a.b.cl.a(xc2);
        this.b = (cm)com.a.a.b.cl.a(cm2);
    }

    public agi g() {
        return nj.b(this.a.iterator(), this.b);
    }

    @Override
    Set e() {
        return aad.a(this.a.d(), this.b);
    }

    @Override
    Set f() {
        return aad.a(this.a.aS_(), (cm)new xt(this));
    }

    @Override
    Iterator b() {
        throw new AssertionError((Object)"should never be called");
    }

    @Override
    int c() {
        return this.d().size();
    }

    @Override
    public int a(Object object) {
        int n2 = this.a.a(object);
        if (n2 > 0) {
            Object object2 = object;
            return this.b.a(object2) ? n2 : 0;
        }
        return 0;
    }

    @Override
    public int a(Object object, int n2) {
        com.a.a.b.cl.a(this.b.a(object), "Element %s does not match predicate %s", new Object[]{object, this.b});
        return this.a.a(object, n2);
    }

    @Override
    public int b(Object object, int n2) {
        cl.a(n2, "occurrences");
        if (n2 == 0) {
            return this.a(object);
        }
        return this.contains(object) ? this.a.b(object, n2) : 0;
    }

    @Override
    public void clear() {
        this.d().clear();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.g();
    }
}

