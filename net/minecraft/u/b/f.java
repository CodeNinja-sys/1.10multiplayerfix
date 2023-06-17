/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

import com.a.a.d.j;
import net.minecraft.u.b.b;
import net.minecraft.u.b.e;
import net.minecraft.u.b.g;

class f
extends j {
    private g b;
    final /* synthetic */ e a;
    private final /* synthetic */ b c;
    private final /* synthetic */ b d;

    f(e e2, b b2, b b3) {
        this.a = e2;
        this.c = b2;
        this.d = b3;
    }

    protected g d() {
        if (this.b == null) {
            this.b = new g(this.c.cy_(), this.c.k(), this.c.l());
            return this.b;
        }
        if (this.b.equals(this.d)) {
            return (g)this.b();
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
        this.b.a = n2;
        this.b.b = n3;
        this.b.d = n4;
        return this.b;
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

