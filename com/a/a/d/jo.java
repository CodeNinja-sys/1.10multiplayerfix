/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.jl;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class jo
extends jl {
    private final transient jl a;

    jo(jl jl2) {
        this.a = jl2;
    }

    private int b(int n2) {
        return this.size() - 1 - n2;
    }

    private int c(int n2) {
        return this.size() - n2;
    }

    @Override
    public jl f() {
        return this.a;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object);
    }

    @Override
    public int indexOf(Object object) {
        int n2 = this.a.lastIndexOf(object);
        return n2 >= 0 ? this.b(n2) : -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int n2 = this.a.indexOf(object);
        return n2 >= 0 ? this.b(n2) : -1;
    }

    @Override
    public jl a(int n2, int n3) {
        cl.a(n2, n3, this.size());
        return this.a.a(this.c(n3), this.c(n2)).f();
    }

    public Object get(int n2) {
        cl.a(n2, this.size());
        return this.a.get(this.b(n2));
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    boolean a() {
        return this.a.a();
    }

    @Override
    public /* synthetic */ List subList(int n2, int n3) {
        return this.a(n2, n3);
    }

    @Override
    public /* synthetic */ ListIterator listIterator(int n2) {
        return super.a(n2);
    }

    @Override
    public /* synthetic */ ListIterator listIterator() {
        return super.e();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return super.aO_();
    }
}

