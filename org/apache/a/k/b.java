/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import java.io.Serializable;
import org.apache.a.f;
import org.apache.a.k.g;
import org.apache.a.k.k;
import org.apache.a.o.a;

public class b
implements Serializable,
Cloneable,
f {
    private static final long a = -5427236326487562174L;
    private final String b;
    private final String c;

    public b(String string, String string2) {
        this.b = (String)org.apache.a.o.a.a((Object)string, "Name");
        this.c = string2;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public String toString() {
        return k.b.a(null, this).toString();
    }

    public org.apache.a.g[] e() {
        if (this.c != null) {
            return g.a(this.c, null);
        }
        return new org.apache.a.g[0];
    }

    public Object clone() {
        return super.clone();
    }
}

