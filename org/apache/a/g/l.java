/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.g;

import org.apache.a.g.h;
import org.apache.a.g.j;
import org.apache.a.g.k;
import org.apache.a.n.g;
import org.apache.a.u;

class l
implements j {
    final /* synthetic */ String a;
    final /* synthetic */ k b;

    l(k k2, String string) {
        this.b = k2;
        this.a = string;
    }

    public h a(g g2) {
        u u2 = (u)g2.a("http.request");
        return this.b.a(this.a, u2.f());
    }
}

