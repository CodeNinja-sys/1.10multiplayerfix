/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.f;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.ar;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.f.b;
import net.minecraft.client.g.f.c;
import net.minecraft.client.g.g;
import net.minecraft.client.r;
import net.minecraft.i.i;
import net.minecraft.u.b.a;
import net.minecraft.u.b.n;

public class d
implements c {
    private final r a;
    private final Map b = sz.c();
    private final Map c = sz.c();
    private final Map d = sz.c();
    private net.minecraft.w.a.b e;
    private double f;
    private double g;
    private double h;

    public d(r r2) {
        this.a = r2;
    }

    public void a(int n2, i i2, float f2) {
        this.b.put(n2, i2);
        this.d.put(n2, System.currentTimeMillis());
        this.c.put(n2, Float.valueOf(f2));
    }

    @Override
    public void a(float f2, long l2) {
        if (this.b.size() != 0) {
            i i2;
            long l3 = System.currentTimeMillis();
            this.e = this.a.j;
            this.f = this.e.br + (this.e.aU - this.e.br) * (double)f2;
            this.g = this.e.bs + (this.e.aV - this.e.bs) * (double)f2;
            this.h = this.e.bt + (this.e.aW - this.e.bt) * (double)f2;
            bd.D();
            bd.l();
            bd.a(ad.l, bc.j, ad.e, bc.n);
            bd.c(0.0f, 1.0f, 0.0f, 0.75f);
            bd.w();
            bd.d(6.0f);
            for (Integer n2 : this.b.keySet()) {
                i2 = (i)this.b.get(n2);
                float f3 = ((Float)this.c.get(n2)).floatValue();
                this.a(f2, i2);
                net.minecraft.i.g g2 = i2.i();
                if (!(this.a(g2) <= 40.0f)) continue;
                ar.b(new a((float)g2.a + 0.25f, (float)g2.b + 0.25f, (double)g2.c + 0.25, (float)g2.a + 0.75f, (float)g2.b + 0.75f, (float)g2.c + 0.75f).c(-this.f, -this.g, -this.h), 0.0f, 1.0f, 0.0f, 0.5f);
                for (int i3 = 0; i3 < i2.d(); ++i3) {
                    net.minecraft.i.g object = i2.a(i3);
                    if (!(this.a(object) <= 40.0f)) continue;
                    float f4 = i3 == i2.e() ? 1.0f : 0.0f;
                    float f5 = i3 == i2.e() ? 0.0f : 1.0f;
                    ar.b(new a((float)object.a + 0.5f - f3, (float)object.b + 0.01f * (float)i3, (float)object.c + 0.5f - f3, (float)object.a + 0.5f + f3, (float)object.b + 0.25f + 0.01f * (float)i3, (float)object.c + 0.5f + f3).c(-this.f, -this.g, -this.h), f4, 0.0f, f5, 0.5f);
                }
            }
            for (Integer n2 : this.b.keySet()) {
                i2 = (i)this.b.get(n2);
                for (net.minecraft.i.g g3 : i2.h()) {
                    if (!(this.a(g3) <= 40.0f)) continue;
                    net.minecraft.client.g.f.b.a(String.format("%s", new Object[]{g3.m}), (double)g3.a + 0.5, (double)g3.b + 0.75, (double)g3.c + 0.5, f2, -65536);
                    net.minecraft.client.g.f.b.a(String.format("%.2f", Float.valueOf(g3.l)), (double)g3.a + 0.5, (double)g3.b + 0.25, (double)g3.c + 0.5, f2, -65536);
                }
                for (net.minecraft.i.g g4 : i2.g()) {
                    if (!(this.a(g4) <= 40.0f)) continue;
                    net.minecraft.client.g.f.b.a(String.format("%s", new Object[]{g4.m}), (double)g4.a + 0.5, (double)g4.b + 0.75, (double)g4.c + 0.5, f2, -16776961);
                    net.minecraft.client.g.f.b.a(String.format("%.2f", Float.valueOf(g4.l)), (double)g4.a + 0.5, (double)g4.b + 0.25, (double)g4.c + 0.5, f2, -16776961);
                }
                for (int i4 = 0; i4 < i2.d(); ++i4) {
                    net.minecraft.i.g g5 = i2.a(i4);
                    if (!(this.a(g5) <= 40.0f)) continue;
                    net.minecraft.client.g.f.b.a(String.format("%s", new Object[]{g5.m}), (double)g5.a + 0.5, (double)g5.b + 0.75, (double)g5.c + 0.5, f2, -1);
                    net.minecraft.client.g.f.b.a(String.format("%.2f", Float.valueOf(g5.l)), (double)g5.a + 0.5, (double)g5.b + 0.25, (double)g5.c + 0.5, f2, -1);
                }
            }
            for (Integer n2 : this.d.keySet().toArray(new Integer[0])) {
                if (l3 - (Long)this.d.get(n2) <= 20000L) continue;
                this.b.remove(n2);
                this.d.remove(n2);
            }
            bd.v();
            bd.k();
            bd.E();
        }
    }

    public void a(float f2, i i2) {
        ci ci2 = ci.a();
        g g2 = ci2.c();
        g2.a(3, net.minecraft.client.g.d.b.f);
        for (int i3 = 0; i3 < i2.d(); ++i3) {
            net.minecraft.i.g g3 = i2.a(i3);
            if (!(this.a(g3) <= 40.0f)) continue;
            float f3 = (float)i3 / (float)i2.d() * 0.33f;
            int n2 = i3 == 0 ? 0 : n.c(f3, 0.9f, 0.9f);
            int n3 = n2 >> 16 & 0xFF;
            int n4 = n2 >> 8 & 0xFF;
            int n5 = n2 & 0xFF;
            g2.b((double)g3.a - this.f + 0.5, (double)g3.b - this.g + 0.5, (double)g3.c - this.h + 0.5).b(n3, n4, n5, 255).d();
        }
        ci2.b();
    }

    private float a(net.minecraft.i.g g2) {
        return (float)(Math.abs((double)g2.a - this.e.aU) + Math.abs((double)g2.b - this.e.aV) + Math.abs((double)g2.c - this.e.aW));
    }
}

