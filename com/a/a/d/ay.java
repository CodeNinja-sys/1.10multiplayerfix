/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.yl;
import com.a.a.d.yr;

abstract class ay
implements yr {
    ay() {
    }

    @Override
    public boolean a(Comparable comparable) {
        return this.b(comparable) != null;
    }

    @Override
    public abstract yl b(Comparable var1);

    @Override
    public boolean a() {
        return this.l().isEmpty();
    }

    @Override
    public void a(yl yl2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(yl yl2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b() {
        this.b(yl.c());
    }

    @Override
    public boolean a(yr yr2) {
        for (yl yl2 : yr2.l()) {
            if (this.c(yl2)) continue;
            return false;
        }
        return true;
    }

    @Override
    public void b(yr yr2) {
        for (yl yl2 : yr2.l()) {
            this.a(yl2);
        }
    }

    @Override
    public void c(yr yr2) {
        for (yl yl2 : yr2.l()) {
            this.b(yl2);
        }
    }

    @Override
    public abstract boolean c(yl var1);

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof yr) {
            yr yr2 = (yr)object;
            return this.l().equals(yr2.l());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.l().hashCode();
    }

    @Override
    public final String toString() {
        return this.l().toString();
    }
}

