/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.j.as;

public class s {
    public as[] a;
    public int b;
    private boolean c;

    public s(as[] arras) {
        this.a = arras;
        this.b = arras.length;
    }

    public s(as[] arras, int n2, int n3, int n4, int n5, float f2, float f3) {
        this(arras);
        float f4 = 0.0f / f2;
        float f5 = 0.0f / f3;
        arras[0] = arras[0].a((float)n4 / f2 - f4, (float)n3 / f3 + f5);
        arras[1] = arras[1].a((float)n2 / f2 + f4, (float)n3 / f3 + f5);
        arras[2] = arras[2].a((float)n2 / f2 + f4, (float)n5 / f3 - f5);
        arras[3] = arras[3].a((float)n4 / f2 - f4, (float)n5 / f3 - f5);
    }

    public void a() {
        as[] arras = new as[this.a.length];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            arras[i2] = this.a[this.a.length - i2 - 1];
        }
        this.a = arras;
    }

    public void a(g g2, float f2) {
        net.minecraft.u.b.s s2 = this.a[1].a.a(this.a[0].a);
        net.minecraft.u.b.s s3 = this.a[1].a.a(this.a[2].a);
        net.minecraft.u.b.s s4 = s3.c(s2).a();
        float f3 = (float)s4.b;
        float f4 = (float)s4.c;
        float f5 = (float)s4.d;
        if (this.c) {
            f3 = -f3;
            f4 = -f4;
            f5 = -f5;
        }
        g2.a(7, net.minecraft.client.g.d.b.c);
        for (int i2 = 0; i2 < 4; ++i2) {
            as as2 = this.a[i2];
            g2.b(as2.a.b * (double)f2, as2.a.c * (double)f2, as2.a.d * (double)f2).a(as2.b, as2.c).c(f3, f4, f5).d();
        }
        ci.a().b();
    }
}

