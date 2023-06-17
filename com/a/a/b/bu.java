/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bl;
import com.a.a.b.bo;
import com.a.a.b.cl;
import com.a.a.b.cm;
import java.io.Serializable;

class bu
implements bl,
Serializable {
    private final cm a;
    private static final long b = 0L;

    private bu(cm cm2) {
        this.a = (cm)cl.a(cm2);
    }

    public Boolean b(Object object) {
        return this.a.a(object);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof bu) {
            bu bu2 = (bu)object;
            return this.a.equals(bu2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "forPredicate(" + this.a + ")";
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.b(object);
    }

    /* synthetic */ bu(cm cm2, bo bo2) {
        this(cm2);
    }
}

