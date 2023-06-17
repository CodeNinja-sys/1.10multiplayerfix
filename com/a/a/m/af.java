/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.m.ae;
import com.a.a.m.m;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

class af
extends m {
    final /* synthetic */ ae b;

    af(ae ae2, Method method) {
        this.b = ae2;
        super(method);
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
        return this.a() + "." + super.toString();
    }
}

