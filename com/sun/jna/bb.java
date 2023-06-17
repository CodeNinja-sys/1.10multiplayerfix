/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.au;
import com.sun.jna.ay;
import com.sun.jna.m;

public abstract class bb
implements au {
    private ay b;
    static Class a;

    protected bb() {
        this.b = ay.I;
    }

    protected bb(ay ay2) {
        this.b = ay2;
    }

    public Class b() {
        return a == null ? (a = bb.a("com.sun.jna.ay")) : a;
    }

    public Object a() {
        return this.c();
    }

    public ay c() {
        return this.b;
    }

    public void a(ay ay2) {
        this.b = ay2;
    }

    public Object a(Object object, m m2) {
        if (object == null) {
            return null;
        }
        try {
            bb bb2 = (bb)this.getClass().newInstance();
            bb2.b = (ay)object;
            return bb2;
        }
        catch (InstantiationException instantiationException) {
            throw new IllegalArgumentException("Can't instantiate " + this.getClass());
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new IllegalArgumentException("Not allowed to instantiate " + this.getClass());
        }
    }

    public int hashCode() {
        return this.b != null ? this.b.hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof bb) {
            ay ay2 = ((bb)object).c();
            if (this.b == null) {
                return ay2 == null;
            }
            return this.b.equals(ay2);
        }
        return false;
    }

    public String toString() {
        return this.b == null ? "NULL" : this.b.toString();
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }
}

