/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a.a;

import com.a.a.b.cg;
import com.a.a.b.cm;
import net.minecraft.client.g.b.a.a.n;
import net.minecraft.g.b.b;

class a
implements cm {
    final /* synthetic */ n a;
    private final /* synthetic */ b b;
    private final /* synthetic */ cg c;

    a(n n2, b b2, cg cg2) {
        this.a = n2;
        this.b = b2;
        this.c = cg2;
    }

    public boolean a(net.minecraft.g.c.b b2) {
        return b2 != null && b2.a(this.b).equals(this.c.c());
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((net.minecraft.g.c.b)object);
    }
}

