/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.bk;
import com.a.a.g.u;
import java.io.Serializable;

class z
implements u,
Serializable {
    private final u a;

    z(u u2) {
        this.a = (u)cl.a(u2);
    }

    public void a(Iterable iterable, bk bk2) {
        for (Object t2 : iterable) {
            this.a.a(t2, bk2);
        }
    }

    public String toString() {
        return "Funnels.sequentialFunnel(" + this.a + ")";
    }

    public boolean equals(Object object) {
        if (object instanceof z) {
            z z2 = (z)object;
            return this.a.equals(z2.a);
        }
        return false;
    }

    public int hashCode() {
        return z.class.hashCode() ^ this.a.hashCode();
    }
}

