/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.jl;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class jq
extends jl {
    final transient int a;
    final transient int b;
    final /* synthetic */ jl c;

    jq(jl jl2, int n2, int n3) {
        this.c = jl2;
        this.a = n2;
        this.b = n3;
    }

    @Override
    public int size() {
        return this.b;
    }

    public Object get(int n2) {
        cl.a(n2, this.b);
        return this.c.get(n2 + this.a);
    }

    @Override
    public jl a(int n2, int n3) {
        cl.a(n2, n3, this.b);
        return this.c.a(n2 + this.a, n3 + this.a);
    }

    @Override
    boolean a() {
        return true;
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

