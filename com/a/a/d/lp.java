/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.iz;
import com.a.a.d.ja;
import com.a.a.d.jb;
import com.a.a.d.lo;
import java.util.Iterator;

public class lp
extends ja {
    public lp() {
        this(4);
    }

    lp(int n2) {
        super(n2);
    }

    public lp c(Object object) {
        super.a(object);
        return this;
    }

    public lp b(Object ... arrobject) {
        super.a(arrobject);
        return this;
    }

    public lp b(Iterable iterable) {
        super.a(iterable);
        return this;
    }

    public lp b(Iterator iterator) {
        super.a(iterator);
        return this;
    }

    public lo b() {
        lo lo2 = lo.a(this.b, this.a);
        this.b = lo2.size();
        return lo2;
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
    public /* synthetic */ ja a(Object object) {
        return this.c(object);
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
    public /* synthetic */ jb b(Object object) {
        return this.c(object);
    }
}

