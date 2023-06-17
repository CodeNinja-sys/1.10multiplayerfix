/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.g.c.b;
import net.minecraft.i.g;
import net.minecraft.i.i;
import net.minecraft.i.j;
import net.minecraft.q.ag;
import net.minecraft.q.k;
import net.minecraft.u.b.a;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.w.f;
import net.minecraft.w.n;

public class c
implements ag {
    private final List a = ov.a();

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, b b4, int n2) {
        if (this.a(k2, b2, b3, b4)) {
            int n3 = this.a.size();
            for (int i2 = 0; i2 < n3; ++i2) {
                int n4;
                i i3;
                j j2 = (j)this.a.get(i2);
                if (j2 == null || j2.h() || (i3 = j2.j()) == null || i3.b() || i3.d() == 0) continue;
                g g2 = j2.c.c();
                double d2 = b2.e(((double)g2.a + j2.a.aU) / 2.0, ((double)g2.b + j2.a.aV) / 2.0, ((double)g2.c + j2.a.aW) / 2.0);
                if (!(d2 < (double)(n4 = (i3.d() - i3.e()) * (i3.d() - i3.e())))) continue;
                j2.i();
            }
        }
    }

    protected boolean a(k k2, net.minecraft.u.b.b b2, b b3, b b4) {
        a a2;
        a a3 = b3.d(k2, b2);
        return a3 != (a2 = b4.d(k2, b2)) && (a3 == null || !a3.equals(a2));
    }

    @Override
    public void a(net.minecraft.u.b.b b2) {
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    public void a(net.minecraft.w.a.b b2, bv bv2, bu bu2, double d2, double d3, double d4, float f2, float f3) {
    }

    @Override
    public void a(int n2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
    }

    @Override
    public void a(n n2) {
        if (n2 instanceof f) {
            this.a.add(((f)n2).N());
        }
    }

    @Override
    public void b(n n2) {
        if (n2 instanceof f) {
            this.a.remove(((f)n2).N());
        }
    }

    @Override
    public void a(bv bv2, net.minecraft.u.b.b b2) {
    }

    @Override
    public void a(int n2, net.minecraft.u.b.b b2, int n3) {
    }

    @Override
    public void a(net.minecraft.w.a.b b2, int n2, net.minecraft.u.b.b b3, int n3) {
    }

    @Override
    public void b(int n2, net.minecraft.u.b.b b2, int n3) {
    }
}

