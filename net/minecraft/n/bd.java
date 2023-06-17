/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.b.cm;
import net.minecraft.w.a.g;
import net.minecraft.w.n;

class bd
implements cm {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;

    bd(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public boolean a(n n2) {
        if (!(n2 instanceof g)) {
            return false;
        }
        g g2 = (g)n2;
        return !(this.a > -1 && g2.K < this.a || this.b > -1 && g2.K > this.b);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((n)object);
    }
}

