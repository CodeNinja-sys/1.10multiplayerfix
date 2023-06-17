/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.is;
import com.a.a.d.iz;
import com.a.a.d.jl;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

abstract class ir
extends jl {
    ir() {
    }

    abstract iz b();

    @Override
    public boolean contains(Object object) {
        return this.b().contains(object);
    }

    @Override
    public int size() {
        return this.b().size();
    }

    @Override
    public boolean isEmpty() {
        return this.b().isEmpty();
    }

    @Override
    boolean a() {
        return this.b().a();
    }

    private void a(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    Object aR_() {
        return new is(this.b());
    }
}

