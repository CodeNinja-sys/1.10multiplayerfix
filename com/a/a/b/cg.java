/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.a;
import com.a.a.b.bl;
import com.a.a.b.ch;
import com.a.a.b.cl;
import com.a.a.b.de;
import com.a.a.b.dx;
import java.io.Serializable;
import java.util.Set;

public abstract class cg
implements Serializable {
    private static final long a = 0L;

    public static cg f() {
        return com.a.a.b.a.a();
    }

    public static cg b(Object object) {
        return new de(cl.a(object));
    }

    public static cg c(Object object) {
        return object == null ? cg.f() : new de(object);
    }

    cg() {
    }

    public abstract boolean b();

    public abstract Object c();

    public abstract Object a(Object var1);

    public abstract cg a(cg var1);

    public abstract Object a(dx var1);

    public abstract Object d();

    public abstract Set e();

    public abstract cg a(bl var1);

    public abstract boolean equals(Object var1);

    public abstract int hashCode();

    public abstract String toString();

    public static Iterable a(Iterable iterable) {
        cl.a(iterable);
        return new ch(iterable);
    }
}

