/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.b.cm;
import net.minecraft.u.b.s;
import net.minecraft.w.n;

class d
implements cm {
    private final /* synthetic */ s a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ double c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ double e;

    d(s s2, boolean bl2, double d2, boolean bl3, double d3) {
        this.a = s2;
        this.b = bl2;
        this.c = d2;
        this.d = bl3;
        this.e = d3;
    }

    public boolean a(n n2) {
        if (n2 == null) {
            return false;
        }
        double d2 = this.a.c(n2.aU, n2.aV, n2.aW);
        return (this.b || d2 >= this.c) && (this.d || d2 <= this.e);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((n)object);
    }
}

