/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d.a.a;

import net.minecraft.u.b.s;
import net.minecraft.w.a.b;
import net.minecraft.w.d.a;
import net.minecraft.w.d.a.a.j;
import net.minecraft.w.d.a.a.o;
import net.minecraft.w.d.a.a.q;
import net.minecraft.w.n;

public class c
extends q {
    private int b;

    public c(a a2) {
        super(a2);
    }

    @Override
    public void b() {
        ++this.b;
        b b2 = this.a.aQ.a((n)this.a, 20.0, 10.0);
        if (b2 != null) {
            if (this.b > 25) {
                this.a.p().a(j.h);
            } else {
                s s2 = new s(b2.aU - this.a.aU, 0.0, b2.aW - this.a.aW).a();
                s s3 = new s(net.minecraft.u.b.n.a(this.a.ba * ((float)Math.PI / 180)), 0.0, -net.minecraft.u.b.n.b(this.a.ba * ((float)Math.PI / 180))).a();
                float f2 = (float)s3.b(s2);
                float f3 = (float)(Math.acos(f2) * 57.29577951308232) + 0.5f;
                if (f3 < 0.0f || f3 > 10.0f) {
                    float f4;
                    double d2 = b2.aU - this.a.e.aU;
                    double d3 = b2.aW - this.a.e.aW;
                    double d4 = net.minecraft.u.b.n.a(net.minecraft.u.b.n.g(180.0 - net.minecraft.u.b.n.b(d2, d3) * 57.29577951308232 - (double)this.a.ba), -100.0, 100.0);
                    this.a.aD *= 0.8f;
                    float f5 = f4 = net.minecraft.u.b.n.a(d2 * d2 + d3 * d3) + 1.0f;
                    if (f4 > 40.0f) {
                        f4 = 40.0f;
                    }
                    this.a.aD = (float)((double)this.a.aD + d4 * (double)(0.7f / f4 / f5));
                    this.a.ba += this.a.aD;
                }
            }
        } else if (this.b >= 100) {
            b2 = this.a.aQ.a((n)this.a, 150.0, 150.0);
            this.a.p().a(j.e);
            if (b2 != null) {
                this.a.p().a(j.i);
                ((o)this.a.p().b(j.i)).a(new s(b2.aU, b2.aV, b2.aW));
            }
        }
    }

    @Override
    public void e() {
        this.b = 0;
    }

    @Override
    public j g() {
        return j.g;
    }
}

