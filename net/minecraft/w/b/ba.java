/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.u.b.a;
import net.minecraft.w.b.s;
import net.minecraft.w.h.ai;
import net.minecraft.w.l;
import net.minecraft.w.t;

public class ba
extends s {
    private final boolean a;
    private int b;
    private final Class[] g;

    public ba(t t2, boolean bl2, Class ... arrclass) {
        super(t2, true);
        this.a = bl2;
        this.g = arrclass;
        this.b(1);
    }

    @Override
    public boolean e() {
        int n2 = this.c.bf();
        l l2 = this.c.be();
        return n2 != this.b && l2 != null && this.a(l2, false);
    }

    @Override
    public void b() {
        this.c.c(this.c.be());
        this.e = this.c.W();
        this.b = this.c.bf();
        this.f = 300;
        if (this.a) {
            this.g();
        }
        super.b();
    }

    protected void g() {
        double d2 = this.f();
        for (t t2 : this.c.aQ.a(this.c.getClass(), new a(this.c.aU, this.c.aV, this.c.aW, this.c.aU + 1.0, this.c.aV + 1.0, this.c.aW + 1.0).b(d2, 10.0, d2))) {
            if (this.c == t2 || t2.W() != null || this.c instanceof ai && ((ai)this.c).do() != ((ai)t2).do() || t2.w(this.c.be())) continue;
            boolean bl2 = false;
            Class[] arrclass = this.g;
            int n2 = this.g.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                Class class_ = arrclass[i2];
                if (t2.getClass() != class_) continue;
                bl2 = true;
                break;
            }
            if (bl2) continue;
            this.a(t2, this.c.be());
        }
    }

    protected void a(t t2, l l2) {
        t2.c(l2);
    }
}

