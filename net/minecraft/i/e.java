/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import net.minecraft.i.j;
import net.minecraft.i.l;
import net.minecraft.i.n;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.o;
import net.minecraft.u.b.p;
import net.minecraft.u.b.s;
import net.minecraft.w.f;

public class e
extends j {
    public e(f f2, k k2) {
        super(f2, k2);
    }

    @Override
    protected l a() {
        return new l(new n());
    }

    @Override
    protected boolean b() {
        return this.n();
    }

    @Override
    protected s c() {
        return new s(this.a.aU, this.a.aV + (double)this.a.bm * 0.5, this.a.aW);
    }

    @Override
    protected void bW_() {
        s s2 = this.c();
        float f2 = this.a.bl * this.a.bl;
        int n2 = 6;
        if (s2.g(this.c.a(this.a, this.c.e())) < (double)f2) {
            this.c.a();
        }
        for (int i2 = Math.min(this.c.e() + 6, this.c.d() - 1); i2 > this.c.e(); --i2) {
            s s3 = this.c.a(this.a, i2);
            if (!(s3.g(s2) <= 36.0) || !this.a(s2, s3, 0, 0, 0)) continue;
            this.c.c(i2);
            break;
        }
        this.a(s2);
    }

    @Override
    protected void d() {
        super.d();
    }

    @Override
    protected boolean a(s s2, s s3, int n2, int n3, int n4) {
        o o2 = this.b.a(s2, new s(s3.b, s3.c + (double)this.a.bm * 0.5, s3.d), false, true, false);
        return o2 == null || o2.a == p.a;
    }

    @Override
    public boolean b(b b2) {
        return !this.b.n(b2).e();
    }
}

