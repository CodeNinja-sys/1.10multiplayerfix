/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.go;
import java.util.Iterator;
import java.util.ListIterator;

public abstract class gq
extends go
implements ListIterator {
    protected gq() {
    }

    protected abstract ListIterator b();

    public void add(Object object) {
        this.b().add(object);
    }

    @Override
    public boolean hasPrevious() {
        return this.b().hasPrevious();
    }

    @Override
    public int nextIndex() {
        return this.b().nextIndex();
    }

    public Object previous() {
        return this.b().previous();
    }

    @Override
    public int previousIndex() {
        return this.b().previousIndex();
    }

    public void set(Object object) {
        this.b().set(object);
    }

    @Override
    protected /* synthetic */ Iterator a() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.b();
    }
}

