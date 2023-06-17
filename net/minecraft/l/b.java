/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import java.util.Random;
import net.minecraft.client.r;
import net.minecraft.l.i;
import net.minecraft.l.k;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;

public class b {
    private net.minecraft.q.k a;
    private net.minecraft.l.b.b b;
    private net.minecraft.w.a.b c;
    private int d = 0;

    public b(net.minecraft.l.b.b b2, net.minecraft.q.k k2) {
        this.b = b2;
        this.c = r.I.l;
        this.a = k2;
        k.g = true;
        i.a(0);
    }

    public void a(net.minecraft.w.a.b b2) {
        float f2 = 1.0f;
        Random random = new Random();
        s s2 = this.b.aD();
        s s3 = new s(random.nextDouble() * (double)f2 - (double)(f2 / 2.0f) + s2.b, random.nextDouble() * (double)f2 - (double)(f2 / 2.0f) + s2.c + 1.5, random.nextDouble() * (double)f2 - (double)(f2 / 2.0f) + s2.d);
        this.a(s3, b2);
        this.a.a((long)random.nextInt(24000));
        if (this.d > 100) {
            r.I.a(1);
            r.I.i();
        }
        ++this.d;
    }

    private void a(s s2, net.minecraft.w.a.b b2) {
        double d2 = s2.b - b2.aU;
        double d3 = s2.c - (b2.aV + (double)b2.ce_());
        double d4 = s2.d - b2.aW;
        double d5 = n.a(d2 * d2 + d4 * d4);
        float f2 = (float)(n.b(d4, d2) * 57.29577951308232) - 90.0f;
        float f3 = (float)(-(n.b(d3, d5) * 57.29577951308232));
        b2.bb = this.a(b2.bb, f3, 40.0f);
        b2.ba = this.a(b2.am, f2, 40.0f);
    }

    private float a(float f2, float f3, float f4) {
        float f5 = n.g(f3 - f2);
        if (f5 > f4) {
            f5 = f4;
        }
        if (f5 < -f4) {
            f5 = -f4;
        }
        return f2 + f5;
    }
}

