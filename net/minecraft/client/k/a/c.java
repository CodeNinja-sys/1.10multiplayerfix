/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.a;

import net.minecraft.client.f.u;
import net.minecraft.client.g.am;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.t;
import net.minecraft.client.k.cv;
import net.minecraft.client.k.de;
import net.minecraft.client.r;
import net.minecraft.r.d;
import net.minecraft.u.bp;

public class c
extends de {
    private static final bp a = new bp("textures/gui/achievement/achievement_background.png");
    private final r b;
    private int c;
    private int d;
    private String e;
    private String f;
    private d g;
    private long h;
    private final t i;
    private boolean j;

    public c(r r2) {
        this.b = r2;
        this.i = r2.ac();
    }

    public void a(d d2) {
        this.e = u.a("achievement.get", new Object[0]);
        this.f = d2.e().c();
        this.h = r.I();
        this.g = d2;
        this.j = false;
    }

    public void b(d d2) {
        this.e = d2.e().c();
        this.f = d2.f();
        this.h = r.I() + 2500L;
        this.g = d2;
        this.j = true;
    }

    private void c() {
        bd.b(0, 0, this.b.e, this.b.f);
        bd.l(5889);
        bd.C();
        bd.l(5888);
        bd.C();
        this.c = this.b.e;
        this.d = this.b.f;
        cv cv2 = new cv(this.b);
        this.c = cv2.a();
        this.d = cv2.b();
        bd.k(256);
        bd.l(5889);
        bd.C();
        bd.a(0.0, this.c, this.d, 0.0, 1000.0, 3000.0);
        bd.l(5888);
        bd.C();
        bd.c(0.0f, 0.0f, -2000.0f);
    }

    public void a() {
        if (this.g != null && this.h != 0L && r.z().j != null) {
            double d2 = (double)(r.I() - this.h) / 3000.0;
            if (this.j) {
                if (d2 > 0.5) {
                    d2 = 0.5;
                }
            } else if (d2 < 0.0 || d2 > 1.0) {
                this.h = 0L;
                return;
            }
            this.c();
            bd.i();
            bd.a(false);
            double d3 = d2 * 2.0;
            if (d3 > 1.0) {
                d3 = 2.0 - d3;
            }
            d3 *= 4.0;
            if ((d3 = 1.0 - d3) < 0.0) {
                d3 = 0.0;
            }
            d3 *= d3;
            d3 *= d3;
            int n2 = this.c - 160;
            int n3 = 0 - (int)(d3 * 36.0);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            bd.v();
            this.b.N().a(a);
            bd.f();
            this.a_(n2, n3, 96, 202, 160, 32);
            if (this.j) {
                this.b.m.a(this.f, n2 + 30, n3 + 7, 120, -1);
            } else {
                this.b.m.a(this.e, n2 + 30, n3 + 7, -256);
                this.b.m.a(this.f, n2 + 30, n3 + 18, -1);
            }
            am.c();
            bd.f();
            bd.A();
            bd.g();
            bd.e();
            this.i.b(this.g.d, n2 + 8, n3 + 8);
            bd.f();
            bd.a(true);
            bd.j();
        }
    }

    public void b() {
        this.g = null;
        this.h = 0L;
    }
}

