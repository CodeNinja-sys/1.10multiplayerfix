/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gh;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Queue;

public abstract class hh
extends gh
implements Queue {
    protected hh() {
    }

    protected abstract Queue c();

    public boolean offer(Object object) {
        return this.c().offer(object);
    }

    public Object poll() {
        return this.c().poll();
    }

    public Object remove() {
        return this.c().remove();
    }

    public Object peek() {
        return this.c().peek();
    }

    public Object element() {
        return this.c().element();
    }

    protected boolean a(Object object) {
        try {
            return this.add(object);
        }
        catch (IllegalStateException illegalStateException) {
            return false;
        }
    }

    protected Object e() {
        try {
            return this.element();
        }
        catch (NoSuchElementException noSuchElementException) {
            return null;
        }
    }

    protected Object f() {
        try {
            return this.remove();
        }
        catch (NoSuchElementException noSuchElementException) {
            return null;
        }
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.c();
    }
}

