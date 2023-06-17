/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.b.cm;
import net.minecraft.q.am;
import net.minecraft.w.a.g;
import net.minecraft.w.n;

class c
implements cm {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ am b;

    c(boolean bl2, am am2) {
        this.a = bl2;
        this.b = am2;
    }

    public boolean a(n n2) {
        if (!(n2 instanceof g)) {
            return false;
        }
        g g2 = (g)n2;
        am am2 = g2.c.a();
        return this.a ? am2 != this.b : am2 == this.b;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((n)object);
    }
}

