/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.util.HashMap;
import org.apache.a.b.d;
import org.apache.a.c.a;
import org.apache.a.f.x;
import org.apache.a.f.y;
import org.apache.a.i.c.u;
import org.apache.a.r;

public class g
implements a {
    private final HashMap a = new HashMap();
    private final x b;

    public g(x x2) {
        this.b = x2 != null ? x2 : u.a;
    }

    public g() {
        this(null);
    }

    protected r c(r r2) {
        if (r2.b() <= 0) {
            int n2;
            try {
                n2 = this.b.a(r2);
            }
            catch (y y2) {
                return r2;
            }
            return new r(r2.a(), n2, r2.c());
        }
        return r2;
    }

    public void a(r r2, d d2) {
        org.apache.a.o.a.a(r2, "HTTP host");
        this.a.put(this.c(r2), d2);
    }

    public d a(r r2) {
        org.apache.a.o.a.a(r2, "HTTP host");
        return (d)this.a.get(this.c(r2));
    }

    public void b(r r2) {
        org.apache.a.o.a.a(r2, "HTTP host");
        this.a.remove(this.c(r2));
    }

    public void a() {
        this.a.clear();
    }

    public String toString() {
        return this.a.toString();
    }
}

