/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.iz;
import com.a.a.d.jb;
import com.a.a.d.ku;
import com.a.a.d.oi;
import com.a.a.d.xc;
import com.a.a.d.xd;
import com.a.a.d.xe;
import java.util.Iterator;

public class kw
extends jb {
    final xc a;

    public kw() {
        this(oi.g());
    }

    kw(xc xc2) {
        this.a = xc2;
    }

    public kw a(Object object) {
        this.a.add(cl.a(object));
        return this;
    }

    public kw a(Object object, int n2) {
        this.a.a(cl.a(object), n2);
        return this;
    }

    public kw b(Object object, int n2) {
        this.a.c(cl.a(object), n2);
        return this;
    }

    public kw b(Object ... arrobject) {
        super.a(arrobject);
        return this;
    }

    public kw b(Iterable iterable) {
        if (iterable instanceof xc) {
            xc xc2 = xe.b(iterable);
            for (xd xd2 : xc2.aS_()) {
                this.a(xd2.a(), xd2.b());
            }
        } else {
            super.a(iterable);
        }
        return this;
    }

    public kw b(Iterator iterator) {
        super.a(iterator);
        return this;
    }

    public ku b() {
        return ku.a((Iterable)this.a);
    }

    @Override
    public /* synthetic */ iz a() {
        return this.b();
    }

    @Override
    public /* synthetic */ jb a(Iterator iterator) {
        return this.b(iterator);
    }

    @Override
    public /* synthetic */ jb a(Iterable iterable) {
        return this.b(iterable);
    }

    @Override
    public /* synthetic */ jb a(Object[] arrobject) {
        return this.b(arrobject);
    }

    @Override
    public /* synthetic */ jb b(Object object) {
        return this.a(object);
    }
}

