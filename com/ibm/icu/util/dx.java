/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.dn;
import com.ibm.icu.util.dw;
import java.lang.ref.SoftReference;

final class dx
implements Cloneable {
    private SoftReference a;
    private String b;
    private dn c;
    private int d;

    private dx() {
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        try {
            dx dx2 = (dx)object;
            if (this.d != dx2.d) {
                return false;
            }
            if (!this.b.equals(dx2.b)) {
                return false;
            }
            if (this.c == null ? dx2.c != null : !this.c.equals(dx2.c)) {
                return false;
            }
            if (this.a == null) {
                return dx2.a == null;
            }
            return dx2.a != null && this.a.get() == dx2.a.get();
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    public int hashCode() {
        return this.d;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException();
        }
    }

    private synchronized void a(ClassLoader classLoader, String string, dn dn2) {
        this.b = string;
        this.d = string.hashCode();
        this.c = dn2;
        if (dn2 != null) {
            this.d ^= dn2.hashCode();
        }
        if (classLoader == null) {
            this.a = null;
        } else {
            this.a = new SoftReference<ClassLoader>(classLoader);
            this.d ^= classLoader.hashCode();
        }
    }

    static /* synthetic */ void a(dx dx2, ClassLoader classLoader, String string, dn dn2) {
        dx2.a(classLoader, string, dn2);
    }

    /* synthetic */ dx(dw dw2) {
        this();
    }
}

