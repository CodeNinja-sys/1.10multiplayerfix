/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.e;

import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.d.l;
import net.minecraft.w.a.b;
import net.minecraft.x.d.b.ce;

public class a
extends net.minecraft.c.b.k {
    private boolean c;
    private boolean d;
    private int e;
    private int f;

    public a(k k2) {
        super(k2);
    }

    @Override
    public void d() {
        super.d();
        ++this.f;
        long l2 = this.a.B();
        long l3 = l2 / 24000L + 1L;
        if (!this.c && this.f > 20) {
            this.c = true;
            this.b.a.a(new ce(5, 0.0f));
        }
        boolean bl2 = this.d = l2 > 120500L;
        if (this.d) {
            ++this.e;
        }
        if (l2 % 24000L == 500L) {
            if (l3 <= 6L) {
                this.b.a(new l("demo.day." + l3, new Object[0]));
            }
        } else if (l3 == 1L) {
            if (l2 == 100L) {
                this.b.a.a(new ce(5, 101.0f));
            } else if (l2 == 175L) {
                this.b.a.a(new ce(5, 102.0f));
            } else if (l2 == 250L) {
                this.b.a.a(new ce(5, 103.0f));
            }
        } else if (l3 == 5L && l2 % 24000L == 22000L) {
            this.b.a(new l("demo.day.warning", new Object[0]));
        }
    }

    private void f() {
        if (this.e > 100) {
            this.b.a(new l("demo.reminder", new Object[0]));
            this.e = 0;
        }
    }

    @Override
    public void a(net.minecraft.u.b.b b2, ad ad2) {
        if (this.d) {
            this.f();
        } else {
            super.a(b2, ad2);
        }
    }

    @Override
    public void a(net.minecraft.u.b.b b2) {
        if (!this.d) {
            super.a(b2);
        }
    }

    @Override
    public boolean b(net.minecraft.u.b.b b2) {
        return this.d ? false : super.b(b2);
    }

    @Override
    public ab a(b b2, k k2, cu cu2, ah ah2) {
        if (this.d) {
            this.f();
            return ab.b;
        }
        return super.a(b2, k2, cu2, ah2);
    }

    @Override
    public ab a(b b2, k k2, cu cu2, ah ah2, net.minecraft.u.b.b b3, ad ad2, float f2, float f3, float f4) {
        if (this.d) {
            this.f();
            return ab.b;
        }
        return super.a(b2, k2, cu2, ah2, b3, ad2, f2, f3, f4);
    }
}

