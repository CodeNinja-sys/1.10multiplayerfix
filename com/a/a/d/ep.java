/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.eq;
import com.a.a.d.er;
import com.a.a.d.es;
import java.util.NoSuchElementException;

public abstract class ep {
    public static ep a() {
        return er.h();
    }

    public static ep b() {
        return es.h();
    }

    public static ep c() {
        return eq.f();
    }

    protected ep() {
    }

    public abstract Comparable a(Comparable var1);

    public abstract Comparable b(Comparable var1);

    public abstract long a(Comparable var1, Comparable var2);

    public Comparable d() {
        throw new NoSuchElementException();
    }

    public Comparable e() {
        throw new NoSuchElementException();
    }
}

