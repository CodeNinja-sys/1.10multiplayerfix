/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import java.io.Serializable;
import org.apache.a.ai;
import org.apache.a.e;
import org.apache.a.k.g;
import org.apache.a.k.x;
import org.apache.a.o.a;
import org.apache.a.o.d;

public class r
implements Serializable,
Cloneable,
e {
    private static final long a = -2768352615787625448L;
    private final String b;
    private final d c;
    private final int d;

    public r(d d2) {
        org.apache.a.o.a.a(d2, "Char array buffer");
        int n2 = d2.d(58);
        if (n2 == -1) {
            throw new ai("Invalid header: " + d2.toString());
        }
        String string = d2.b(0, n2);
        if (string.length() == 0) {
            throw new ai("Invalid header: " + d2.toString());
        }
        this.c = d2;
        this.b = string;
        this.d = n2 + 1;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c.b(this.d, this.c.e());
    }

    public org.apache.a.g[] e() {
        x x2 = new x(0, this.c.e());
        x2.a(this.d);
        return g.b.a(this.c, x2);
    }

    public int b() {
        return this.d;
    }

    public d a() {
        return this.c;
    }

    public String toString() {
        return this.c.toString();
    }

    public Object clone() {
        return super.clone();
    }
}

