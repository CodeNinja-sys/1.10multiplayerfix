/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.iz;
import com.a.a.d.ja;
import com.a.a.d.jb;
import com.a.a.d.jl;
import java.util.Iterator;

public final class jn
extends ja {
    public jn() {
        this(4);
    }

    jn(int n2) {
        super(n2);
    }

    public jn c(Object object) {
        super.a(object);
        return this;
    }

    public jn b(Iterable iterable) {
        super.a(iterable);
        return this;
    }

    public jn b(Object ... arrobject) {
        super.a(arrobject);
        return this;
    }

    public jn b(Iterator iterator) {
        super.a(iterator);
        return this;
    }

    public jl b() {
        return jl.b(this.a, this.b);
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

