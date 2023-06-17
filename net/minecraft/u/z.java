/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.b.cm;
import net.minecraft.j.i;
import net.minecraft.w.a.b;
import net.minecraft.w.n;

class z
implements cm {
    private final /* synthetic */ n a;
    private final /* synthetic */ i b;
    private final /* synthetic */ net.minecraft.j.b c;

    z(n n2, i i2, net.minecraft.j.b b2) {
        this.a = n2;
        this.b = i2;
        this.c = b2;
    }

    public boolean a(n n2) {
        if (!n2.bM()) {
            return false;
        }
        if (!this.a.aQ.C || n2 instanceof b && ((b)n2).u()) {
            boolean bl2;
            net.minecraft.j.b b2;
            i i2 = n2.aA();
            net.minecraft.j.b b3 = b2 = i2 == null ? net.minecraft.j.b.a : i2.j();
            if (b2 == net.minecraft.j.b.b) {
                return false;
            }
            boolean bl3 = bl2 = this.b != null && this.b.a(i2);
            return (this.c == net.minecraft.j.b.d || b2 == net.minecraft.j.b.d) && bl2 ? false : this.c != net.minecraft.j.b.c && b2 != net.minecraft.j.b.c || bl2;
        }
        return false;
    }
}

