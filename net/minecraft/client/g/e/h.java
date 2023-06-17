/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.e;

import com.a.a.l.i;
import com.a.a.n.a.dm;
import net.minecraft.client.g.e.r;

class h
implements Comparable {
    private final dm b;
    private final double c;
    final /* synthetic */ r a;

    public h(r r2, dm dm2, double d2) {
        this.a = r2;
        this.b = dm2;
        this.c = d2;
    }

    public int a(h h2) {
        return i.a(this.c, h2.c);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((h)object);
    }

    static /* synthetic */ dm b(h h2) {
        return h2.b;
    }
}

