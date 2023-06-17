/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import org.apache.a.e.a;
import org.apache.a.f.b.b;
import org.apache.a.f.p;
import org.apache.a.f.u;
import org.apache.a.i.c.ai;
import org.apache.a.i.c.an;
import org.apache.a.m.f;

class ao
implements f {
    private final an a;
    private final p b;

    ao(an an2, p p2) {
        this.a = an2 != null ? an2 : new an();
        this.b = p2 != null ? p2 : ai.a;
    }

    public u a(b b2) {
        a a2 = null;
        if (b2.e() != null) {
            a2 = this.a.b(b2.e());
        }
        if (a2 == null) {
            a2 = this.a.b(b2.a());
        }
        if (a2 == null) {
            a2 = this.a.b();
        }
        if (a2 == null) {
            a2 = org.apache.a.e.a.a;
        }
        return (u)this.b.a(b2, a2);
    }
}

