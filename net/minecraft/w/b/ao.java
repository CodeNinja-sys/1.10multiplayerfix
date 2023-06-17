/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.b.g;
import net.minecraft.b.h;
import net.minecraft.u.b.b;
import net.minecraft.u.b.s;
import net.minecraft.w.b.af;
import net.minecraft.w.b.bm;
import net.minecraft.w.t;

public class ao
extends bm {
    private final t a;
    private h b;
    private int c = -1;
    private int d = -1;

    public ao(t t2) {
        this.a = t2;
        this.b(1);
    }

    @Override
    public boolean e() {
        b b2 = new b(this.a);
        if ((!this.a.aQ.n() || this.a.aQ.J() && !this.a.aQ.a(b2).g()) && !this.a.aQ.q.n()) {
            if (this.a.bd().nextInt(50) != 0) {
                return false;
            }
            if (this.c != -1 && this.a.h(this.c, this.a.aV, this.d) < 4.0) {
                return false;
            }
            g g2 = this.a.aQ.U().a(b2, 14);
            if (g2 == null) {
                return false;
            }
            this.b = g2.c(b2);
            return this.b != null;
        }
        return false;
    }

    @Override
    public boolean a() {
        return !this.a.N().l();
    }

    @Override
    public void b() {
        this.c = -1;
        b b2 = this.b.e();
        int n2 = b2.cy_();
        int n3 = b2.k();
        int n4 = b2.l();
        if (this.a.c(b2) > 256.0) {
            s s2 = af.a(this.a, 14, 3, new s((double)n2 + 0.5, n3, (double)n4 + 0.5));
            if (s2 != null) {
                this.a.N().a(s2.b, s2.c, s2.d, 1.0);
            }
        } else {
            this.a.N().a((double)n2 + 0.5, n3, (double)n4 + 0.5, 1.0);
        }
    }

    @Override
    public void c() {
        this.c = this.b.e().cy_();
        this.d = this.b.e().l();
        this.b = null;
    }
}

