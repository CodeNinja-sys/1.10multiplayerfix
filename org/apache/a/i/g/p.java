/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import org.apache.a.i.g.o;
import org.apache.a.j.e;
import org.apache.a.j.f;
import org.apache.a.j.i;
import org.apache.a.k.k;
import org.apache.a.k.v;

public class p
implements f {
    public static final p a = new p();
    private final v b;

    public p(v v2) {
        this.b = v2 != null ? v2 : k.b;
    }

    public p() {
        this(null);
    }

    public e a(i i2) {
        return new o(i2, this.b);
    }
}

