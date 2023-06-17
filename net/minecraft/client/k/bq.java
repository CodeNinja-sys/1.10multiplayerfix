/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.b.a;
import net.minecraft.client.b.e;
import net.minecraft.client.f.u;
import net.minecraft.client.g.ay;
import net.minecraft.client.k.ca;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cn;
import net.minecraft.client.k.cv;

public class bq
extends cc {
    private final cc b;
    protected String a = "Video Settings";
    private final a c;
    private ca d;
    private static final e[] e = new e[]{net.minecraft.client.b.e.l, net.minecraft.client.b.e.f, net.minecraft.client.b.e.m, net.minecraft.client.b.e.i, net.minecraft.client.b.e.h, net.minecraft.client.b.e.g, net.minecraft.client.b.e.n, net.minecraft.client.b.e.I, net.minecraft.client.b.e.d, net.minecraft.client.b.e.k, net.minecraft.client.b.e.o, net.minecraft.client.b.e.v, net.minecraft.client.b.e.w, net.minecraft.client.b.e.D, net.minecraft.client.b.e.x, net.minecraft.client.b.e.G};

    public bq(cc cc2, a a2) {
        this.b = cc2;
        this.c = a2;
    }

    @Override
    public void ct_() {
        this.a = net.minecraft.client.f.u.a("options.videoTitle", new Object[0]);
        this.r.clear();
        this.r.add(new ch(200, this.p / 2 - 100, this.q - 27, net.minecraft.client.f.u.a("gui.done", new Object[0])));
        if (ay.P) {
            this.d = new cn(this.n, this.p, this.q, 32, this.q - 32, 25, e);
        } else {
            e[] arre = new e[e.length - 1];
            int n2 = 0;
            e[] arre2 = e;
            int n3 = e.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                e e2 = arre2[i2];
                if (e2 == net.minecraft.client.b.e.x) break;
                arre[n2] = e2;
                ++n2;
            }
            this.d = new cn(this.n, this.p, this.q, 32, this.q - 32, 25, arre);
        }
    }

    @Override
    public void cp_() {
        super.cp_();
        this.d.cr_();
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k && ch2.j == 200) {
            this.n.w.b();
            this.n.a(this.b);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        int n5 = this.c.aC;
        super.a(n2, n3, n4);
        this.d.a(n2, n3, n4);
        if (this.c.aC != n5) {
            cv cv2 = new cv(this.n);
            int n6 = cv2.a();
            int n7 = cv2.b();
            this.a(this.n, n6, n7);
        }
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        int n5 = this.c.aC;
        super.b(n2, n3, n4);
        this.d.c(n2, n3, n4);
        if (this.c.aC != n5) {
            cv cv2 = new cv(this.n);
            int n6 = cv2.a();
            int n7 = cv2.b();
            this.a(this.n, n6, n7);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.d.a(n2, n3, f2);
        this.a(this.u, this.a, this.p / 2, 5, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

