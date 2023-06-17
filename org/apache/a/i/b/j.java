/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import org.apache.a.an;
import org.apache.a.c.l;
import org.apache.a.c.r;
import org.apache.a.n;
import org.apache.a.o.g;
import org.apache.a.x;

public class j
implements r {
    public String b(x x2) {
        an an2 = x2.a();
        n n2 = x2.b();
        if (an2.b() >= 300) {
            g.b(n2);
            throw new l(an2.b(), an2.c());
        }
        return n2 == null ? null : g.f(n2);
    }

    public /* synthetic */ Object a(x x2) {
        return this.b(x2);
    }
}

