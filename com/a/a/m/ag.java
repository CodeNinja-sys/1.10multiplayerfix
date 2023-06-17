/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.bx;
import com.a.a.m.ae;
import com.a.a.m.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

class ag
extends l {
    final /* synthetic */ ae b;

    ag(ae ae2, Constructor constructor) {
        this.b = ae2;
        super(constructor);
    }

    @Override
    Type u() {
        return this.b.b(super.u()).c();
    }

    @Override
    Type[] r() {
        return ae.a(this.b, super.r());
    }

    @Override
    Type[] s() {
        return ae.a(this.b, super.s());
    }

    @Override
    public ae a() {
        return this.b;
    }

    @Override
    public String toString() {
        return this.a() + "(" + bx.a(", ").a(this.r()) + ")";
    }
}

