/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aad;
import com.a.a.d.as;
import com.a.a.d.xc;
import com.a.a.d.xk;
import java.util.Iterator;
import java.util.Set;

final class xj
extends as {
    final /* synthetic */ xc a;
    final /* synthetic */ xc b;

    xj(xc xc2, xc xc3) {
        this.a = xc2;
        this.b = xc3;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object) || this.b.contains(object);
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    @Override
    public int size() {
        return this.a.size() + this.b.size();
    }

    @Override
    public int a(Object object) {
        return this.a.a(object) + this.b.a(object);
    }

    @Override
    Set e() {
        return aad.a(this.a.d(), this.b.d());
    }

    @Override
    Iterator b() {
        Iterator iterator = this.a.aS_().iterator();
        Iterator iterator2 = this.b.aS_().iterator();
        return new xk(this, iterator, iterator2);
    }

    @Override
    int c() {
        return this.d().size();
    }
}

