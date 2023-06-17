/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.b;

import org.apache.commons.c.aa;
import org.apache.commons.c.b.j;

public class n
implements j {
    private static final String a = "ConstantInitializer@%d [ object = %s ]";
    private final Object b;

    public n(Object object) {
        this.b = object;
    }

    public final Object b() {
        return this.b;
    }

    @Override
    public Object a() {
        return this.b();
    }

    public int hashCode() {
        return this.b() != null ? this.b().hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof n)) {
            return false;
        }
        n n2 = (n)object;
        return aa.b(this.b(), n2.b());
    }

    public String toString() {
        return String.format(a, System.identityHashCode(this), String.valueOf(this.b()));
    }
}

