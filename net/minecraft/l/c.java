/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import net.minecraft.a.p;
import net.minecraft.client.l.g;
import net.minecraft.client.r;
import net.minecraft.f.ad;
import net.minecraft.f.ap;
import net.minecraft.g.gt;
import net.minecraft.u.b.n;
import net.minecraft.u.d.k;
import net.minecraft.w.a.b;
import net.minecraft.x.d.a.s;

public class c {
    public int a;
    public int b;
    public int c;
    public String[] d;

    public c(int n2, int n3, int n4, String[] arrstring) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = arrstring;
    }

    public boolean a(net.minecraft.q.k k2, b b2, double d2) {
        if (b2.i(this.a, b2.aV, this.c) > d2) {
            return false;
        }
        this.a(this.d, this.a, this.b, this.c, k2, b2);
        return true;
    }

    private void a(String[] arrstring, int n2, int n3, int n4, net.minecraft.q.k k2, b b2) {
        int n5 = n.c((double)((b2.ba + 180.0f) * 16.0f / 360.0f) + 0.5) & 0xF;
        k2.a(new net.minecraft.u.b.b(b2.aU, b2.aV, b2.aW), p.an.v().a(gt.a, Integer.valueOf(n5)), 11);
        ap ap2 = k2.q(new net.minecraft.u.b.b(b2.aU, b2.aV, b2.aW));
        for (int i2 = 0; i2 < 4; ++i2) {
            ((ad)ap2).a[i2] = new k(arrstring[i2]);
        }
        g g2 = r.z().v();
        if (g2 != null) {
            g2.a(new s(((ad)ap2).D(), ((ad)ap2).a));
        }
        ((ad)ap2).a(true);
    }
}

