/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.q.b.q;
import net.minecraft.q.g.c.at;
import net.minecraft.q.g.c.cv;
import net.minecraft.q.g.c.ds;
import net.minecraft.q.g.c.j;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.g;
import net.minecraft.u.b.m;
import net.minecraft.u.b.n;

public class s
extends at {
    private final List a;
    private boolean b;
    private m[] d = new m[128];
    private double h = 32.0;
    private int i = 3;

    public s() {
        this.a = ov.a();
        for (q q2 : q.t) {
            if (q2 == null || !(q2.j() > 0.0f)) continue;
            this.a.add(q2);
        }
    }

    public s(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (((String)entry.getKey()).equals("distance")) {
                this.h = n.a((String)entry.getValue(), this.h, 1.0);
                continue;
            }
            if (((String)entry.getKey()).equals("count")) {
                this.d = new m[n.a((String)entry.getValue(), this.d.length, 1)];
                continue;
            }
            if (!((String)entry.getKey()).equals("spread")) continue;
            this.i = n.a((String)entry.getValue(), this.i, 1);
        }
    }

    @Override
    public String a() {
        return "Stronghold";
    }

    @Override
    public b a(k k2, b b2) {
        if (!this.b) {
            this.c();
            this.b = true;
        }
        b b3 = null;
        g g2 = new g(0, 0, 0);
        double d2 = Double.MAX_VALUE;
        m[] arrm = this.d;
        int n2 = this.d.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            m m2 = arrm[i2];
            g2.b((m2.a << 4) + 8, 32, (m2.b << 4) + 8);
            double d3 = g2.i(b2);
            if (b3 == null) {
                b3 = new b(g2);
                d2 = d3;
                continue;
            }
            if (!(d3 < d2)) continue;
            b3 = new b(g2);
            d2 = d3;
        }
        return b3;
    }

    @Override
    protected boolean a(int n2, int n3) {
        if (!this.b) {
            this.c();
            this.b = true;
        }
        m[] arrm = this.d;
        int n4 = this.d.length;
        for (int i2 = 0; i2 < n4; ++i2) {
            m m2 = arrm[i2];
            if (n2 != m2.a || n3 != m2.b) continue;
            return true;
        }
        return false;
    }

    private void c() {
        Object object2;
        this.a(this.g);
        int n2 = 0;
        for (Object object2 : this.c.c()) {
            if (n2 >= this.d.length) continue;
            this.d[n2++] = new m(((j)object2).e(), ((j)object2).f());
        }
        object2 = new Random();
        ((Random)object2).setSeed(this.g.A());
        double d2 = ((Random)object2).nextDouble() * Math.PI * 2.0;
        int n3 = 0;
        int n4 = 0;
        int n5 = this.c.size();
        if (n5 < this.d.length) {
            for (int i2 = 0; i2 < this.d.length; ++i2) {
                double d3 = 4.0 * this.h + this.h * (double)n3 * 6.0 + (((Random)object2).nextDouble() - 0.5) * this.h * 2.5;
                int n6 = (int)Math.round(Math.cos(d2) * d3);
                int n7 = (int)Math.round(Math.sin(d2) * d3);
                b b2 = this.g.k().a((n6 << 4) + 8, (n7 << 4) + 8, 112, this.a, (Random)object2);
                if (b2 != null) {
                    n6 = b2.cy_() >> 4;
                    n7 = b2.l() >> 4;
                }
                if (i2 >= n5) {
                    this.d[i2] = new m(n6, n7);
                }
                d2 += Math.PI * 2 / (double)this.i;
                if (++n4 != this.i) continue;
                n4 = 0;
                this.i += 2 * this.i / (++n3 + 1);
                this.i = Math.min(this.i, this.d.length - i2);
                d2 += ((Random)object2).nextDouble() * Math.PI * 2.0;
            }
        }
    }

    @Override
    protected List b() {
        ArrayList arrayList = ov.a();
        m[] arrm = this.d;
        int n2 = this.d.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            m m2 = arrm[i2];
            if (m2 == null) continue;
            arrayList.add(m2.a(64));
        }
        return arrayList;
    }

    @Override
    protected j b(int n2, int n3) {
        cv cv2 = new cv(this.g, this.f, n2, n3);
        while (cv2.b().isEmpty() || ((ds)cv2.b().get((int)0)).e == null) {
            cv2 = new cv(this.g, this.f, n2, n3);
        }
        return cv2;
    }
}

