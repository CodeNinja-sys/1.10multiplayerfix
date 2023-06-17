/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.client.r;
import net.minecraft.u.b.s;
import net.minecraft.w.e.g;
import net.minecraft.w.n;

public class bc
extends ap {
    private final w a;
    private final w b;
    private final w[] c;
    private final w[] d;

    public bc() {
        this.t = 64;
        this.u = 64;
        this.c = new w[12];
        this.a = new w(this);
        this.a.a(0, 0).a(-6.0f, 10.0f, -8.0f, 12, 12, 16);
        this.a.a(0, 28).a(-8.0f, 10.0f, -6.0f, 2, 12, 12);
        this.a.a(0, 28).a(6.0f, 10.0f, -6.0f, 2, 12, 12, true);
        this.a.a(16, 40).a(-6.0f, 8.0f, -6.0f, 12, 2, 12);
        this.a.a(16, 40).a(-6.0f, 22.0f, -6.0f, 12, 2, 12);
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            this.c[i2] = new w(this, 0, 0);
            this.c[i2].a(-1.0f, -4.5f, -1.0f, 2, 9, 2);
            this.a.a(this.c[i2]);
        }
        this.b = new w(this, 8, 0);
        this.b.a(-1.0f, 15.0f, 0.0f, 2, 2, 1);
        this.a.a(this.b);
        this.d = new w[3];
        this.d[0] = new w(this, 40, 0);
        this.d[0].a(-2.0f, 14.0f, 7.0f, 4, 4, 8);
        this.d[1] = new w(this, 0, 54);
        this.d[1].a(0.0f, 14.0f, 0.0f, 3, 3, 7);
        this.d[2] = new w(this);
        this.d[2].a(41, 32).a(0.0f, 14.0f, 0.0f, 2, 2, 6);
        this.d[2].a(25, 19).a(1.0f, 10.5f, 3.0f, 1, 9, 9);
        this.a.a(this.d[0]);
        this.d[0].a(this.d[1]);
        this.d[1].a(this.d[2]);
    }

    public int a() {
        return 54;
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, n2);
        this.a.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        g g2 = (g)n2;
        float f8 = f4 - (float)g2.by;
        this.a.g = f5 * ((float)Math.PI / 180);
        this.a.f = f6 * ((float)Math.PI / 180);
        float[] arrf = new float[]{1.75f, 0.25f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f, 0.5f, 1.25f, 0.75f, 0.0f, 0.0f};
        float[] arrf2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 1.75f, 1.25f, 0.75f, 0.0f, 0.0f, 0.0f, 0.0f};
        float[] arrf3 = new float[]{0.0f, 0.0f, 0.25f, 1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, 1.25f};
        float[] arrf4 = new float[]{0.0f, 0.0f, 8.0f, -8.0f, -8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f, 8.0f, -8.0f};
        float[] arrf5 = new float[]{-8.0f, -8.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 8.0f, 8.0f, 8.0f};
        float[] arrf6 = new float[]{8.0f, -8.0f, 0.0f, 0.0f, -8.0f, -8.0f, 8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f};
        float f9 = (1.0f - g2.r(f8)) * 0.55f;
        for (int i2 = 0; i2 < 12; ++i2) {
            this.c[i2].f = (float)Math.PI * arrf[i2];
            this.c[i2].g = (float)Math.PI * arrf2[i2];
            this.c[i2].h = (float)Math.PI * arrf3[i2];
            this.c[i2].c = arrf4[i2] * (1.0f + net.minecraft.u.b.n.b(f4 * 1.5f + (float)i2) * 0.01f - f9);
            this.c[i2].d = 16.0f + arrf5[i2] * (1.0f + net.minecraft.u.b.n.b(f4 * 1.5f + (float)i2) * 0.01f - f9);
            this.c[i2].e = arrf6[i2] * (1.0f + net.minecraft.u.b.n.b(f4 * 1.5f + (float)i2) * 0.01f - f9);
        }
        this.b.e = -8.25f;
        n n3 = net.minecraft.client.r.z().Z();
        if (g2.s()) {
            n3 = g2.t();
        }
        if (n3 != null) {
            s s2 = n3.o(0.0f);
            s s3 = n2.o(0.0f);
            double d2 = s2.c - s3.c;
            this.b.d = d2 > 0.0 ? 0.0f : 1.0f;
            s s4 = n2.i(0.0f);
            s4 = new s(s4.b, 0.0, s4.d);
            s s5 = new s(s3.b - s2.b, 0.0, s3.d - s2.d).a().b(1.5707964f);
            double d3 = s4.b(s5);
            this.b.c = net.minecraft.u.b.n.c((float)Math.abs(d3)) * 2.0f * (float)Math.signum(d3);
        }
        this.b.j = true;
        float f10 = g2.q(f8);
        this.d[0].g = net.minecraft.u.b.n.a(f10) * (float)Math.PI * 0.05f;
        this.d[1].g = net.minecraft.u.b.n.a(f10) * (float)Math.PI * 0.1f;
        this.d[1].c = -1.5f;
        this.d[1].d = 0.5f;
        this.d[1].e = 14.0f;
        this.d[2].g = net.minecraft.u.b.n.a(f10) * (float)Math.PI * 0.15f;
        this.d[2].c = 0.5f;
        this.d[2].d = 0.5f;
        this.d[2].e = 6.0f;
    }
}

