/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.ay;
import com.sun.jna.bd;
import com.sun.jna.bj;
import com.sun.jna.bp;
import com.sun.jna.bu;
import java.util.Iterator;

public abstract class bv
extends bd {
    private bp G;
    bp a;
    static Class b;
    static Class c;
    static Class F;

    protected bv() {
    }

    protected bv(ay ay2) {
        super(ay2);
    }

    protected bv(ay ay2, int n2) {
        super(ay2, n2);
    }

    protected bv(bu bu2) {
        super(bu2);
    }

    protected bv(ay ay2, int n2, bu bu2) {
        super(ay2, n2, bu2);
    }

    public void b(Class class_) {
        this.c();
        Iterator iterator = this.a().values().iterator();
        while (iterator.hasNext()) {
            bp bp2 = (bp)iterator.next();
            if (bp2.b != class_) continue;
            this.G = bp2;
            return;
        }
        throw new IllegalArgumentException("No field of type " + class_ + " in " + this);
    }

    public void e(String string) {
        this.c();
        bp bp2 = (bp)this.a().get(string);
        if (bp2 == null) {
            throw new IllegalArgumentException("No field named " + string + " in " + this);
        }
        this.G = bp2;
    }

    public Object b(String string) {
        this.c();
        this.e(string);
        return super.b(string);
    }

    public void c(String string) {
        this.c();
        this.e(string);
        super.c(string);
    }

    public void a(String string, Object object) {
        this.c();
        this.e(string);
        super.a(string, object);
    }

    public Object c(Class class_) {
        this.c();
        Iterator iterator = this.a().values().iterator();
        while (iterator.hasNext()) {
            bp bp2 = (bp)iterator.next();
            if (bp2.b != class_) continue;
            this.G = bp2;
            this.j();
            return this.a(this.G);
        }
        throw new IllegalArgumentException("No field of type " + class_ + " in " + this);
    }

    public Object b(Object object) {
        bp bp2 = this.d(object.getClass());
        if (bp2 != null) {
            this.G = bp2;
            this.a(bp2, object);
            return this;
        }
        throw new IllegalArgumentException("No field of type " + object.getClass() + " in " + this);
    }

    private bp d(Class class_) {
        this.c();
        Iterator iterator = this.a().values().iterator();
        while (iterator.hasNext()) {
            bp bp2 = (bp)iterator.next();
            if (!bp2.b.isAssignableFrom(class_)) continue;
            return bp2;
        }
        return null;
    }

    void c(bp bp2) {
        if (bp2 == this.G) {
            super.c(bp2);
        }
    }

    Object b(bp bp2) {
        if (bp2 == this.G || !(b == null ? (b = bv.f("com.sun.jna.bd")) : b).isAssignableFrom(bp2.b) && !(c == null ? (c = bv.f("java.lang.String")) : c).isAssignableFrom(bp2.b) && !(F == null ? (F = bv.f("com.sun.jna.bw")) : F).isAssignableFrom(bp2.b)) {
            return super.b(bp2);
        }
        return null;
    }

    int a(boolean bl2, boolean bl3) {
        int n2 = super.a(bl2, bl3);
        if (n2 != -1) {
            int n3 = 0;
            Iterator iterator = this.a().values().iterator();
            while (iterator.hasNext()) {
                bp bp2 = (bp)iterator.next();
                bp2.e = 0;
                if (bp2.d <= n3 && (bp2.d != n3 || !(b == null ? bv.f("com.sun.jna.bd") : b).isAssignableFrom(bp2.b))) continue;
                n3 = bp2.d;
                this.a = bp2;
            }
            n2 = this.d(n3);
            if (n2 > 0 && this instanceof bj && !bl3) {
                this.n();
            }
        }
        return n2;
    }

    protected int a(Class class_, Object object, boolean bl2) {
        return super.a(class_, object, true);
    }

    ay n() {
        if (this.a == null) {
            return null;
        }
        return super.n();
    }

    static Class f(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }
}

