/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.f;

import java.io.Serializable;
import org.apache.commons.c.f.a;

public class h
implements Serializable,
a {
    private static final long a = 86241875189L;
    private Object b;

    public h() {
    }

    public h(Object object) {
        this.b = object;
    }

    @Override
    public Object a() {
        return this.b;
    }

    @Override
    public void a(Object object) {
        this.b = object;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (this.getClass() == object.getClass()) {
            h h2 = (h)object;
            return this.b.equals(h2.b);
        }
        return false;
    }

    public int hashCode() {
        return this.b == null ? 0 : this.b.hashCode();
    }

    public String toString() {
        return this.b == null ? "null" : this.b.toString();
    }
}

