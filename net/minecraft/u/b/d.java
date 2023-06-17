/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

import com.a.a.d.j;
import net.minecraft.u.b.b;
import net.minecraft.u.b.c;

class d
extends j {
    private b b;
    final /* synthetic */ c a;
    private final /* synthetic */ b c;
    private final /* synthetic */ b d;

    d(c c2, b b2, b b3) {
        this.a = c2;
        this.c = b2;
        this.d = b3;
    }

    protected b d() {
        if (this.b == null) {
            this.b = this.c;
            return this.b;
        }
        if (this.b.equals(this.d)) {
            return (b)this.b();
        }
        int n2 = this.b.cy_();
        int n3 = this.b.k();
        int n4 = this.b.l();
        if (n2 < this.d.cy_()) {
            ++n2;
        } else if (n3 < this.d.k()) {
            n2 = this.c.cy_();
            ++n3;
        } else if (n4 < this.d.l()) {
            n2 = this.c.cy_();
            n3 = this.c.k();
            ++n4;
        }
        this.b = new b(n2, n3, n4);
        return this.b;
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

