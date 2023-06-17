/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d.a.a;

import net.minecraft.q.g.a.am;
import net.minecraft.u.aj;
import net.minecraft.u.b.b;
import net.minecraft.u.b.s;
import net.minecraft.w.d.a;
import net.minecraft.w.d.a.a.j;
import net.minecraft.w.d.a.a.k;

public class n
extends k {
    private s b;
    private int c;

    public n(a a2) {
        super(a2);
    }

    @Override
    public void a() {
        if (this.c++ % 10 == 0) {
            float f2 = (this.a.bd().nextFloat() - 0.5f) * 8.0f;
            float f3 = (this.a.bd().nextFloat() - 0.5f) * 4.0f;
            float f4 = (this.a.bd().nextFloat() - 0.5f) * 8.0f;
            this.a.aQ.a(aj.c, this.a.aU + (double)f2, this.a.aV + 2.0 + (double)f3, this.a.aW + (double)f4, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public void b() {
        double d2;
        ++this.c;
        if (this.b == null) {
            b b2 = this.a.aQ.k(am.a);
            this.b = new s(b2.cy_(), b2.k(), b2.l());
        }
        if ((d2 = this.b.c(this.a.aU, this.a.aV, this.a.aW)) >= 100.0 && d2 <= 22500.0 && !this.a.bf && !this.a.bg) {
            this.a.h(1.0f);
        } else {
            this.a.h(0.0f);
        }
    }

    @Override
    public void e() {
        this.b = null;
        this.c = 0;
    }

    @Override
    public float c() {
        return 3.0f;
    }

    @Override
    public s f() {
        return this.b;
    }

    @Override
    public j g() {
        return j.j;
    }
}

