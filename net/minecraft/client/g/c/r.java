/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import java.util.Calendar;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.c.o;
import net.minecraft.client.j.aa;
import net.minecraft.client.j.aj;
import net.minecraft.f.u;
import net.minecraft.g.aq;
import net.minecraft.g.ib;
import net.minecraft.u.bp;

public class r
extends o {
    private static final bp a = new bp("textures/entity/chest/trapped_double.png");
    private static final bp d = new bp("textures/entity/chest/christmas_double.png");
    private static final bp e = new bp("textures/entity/chest/normal_double.png");
    private static final bp f = new bp("textures/entity/chest/trapped.png");
    private static final bp g = new bp("textures/entity/chest/christmas.png");
    private static final bp h = new bp("textures/entity/chest/normal.png");
    private final aa i = new aa();
    private final aa j = new aj();
    private boolean k;

    public r() {
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
            this.k = true;
        }
    }

    public void a(u u2, double d2, double d3, double d4, float f2, int n2) {
        int n3;
        Object object;
        bd.j();
        bd.c(515);
        bd.a(true);
        if (u2.B()) {
            object = u2.E();
            n3 = u2.bL_();
            if (object instanceof ib && n3 == 0) {
                ((ib)object).e(u2.cD_(), u2.D(), u2.cD_().n(u2.D()));
                n3 = u2.bL_();
            }
            u2.k();
        } else {
            n3 = 0;
        }
        if (u2.d == null && u2.f == null) {
            float f3;
            if (u2.e == null && u2.g == null) {
                object = this.i;
                if (n2 >= 0) {
                    this.a(b[n2]);
                    bd.l(5890);
                    bd.D();
                    bd.b(4.0f, 4.0f, 1.0f);
                    bd.c(0.0625f, 0.0625f, 0.0625f);
                    bd.l(5888);
                } else if (this.k) {
                    this.a(g);
                } else if (u2.n() == aq.b) {
                    this.a(f);
                } else {
                    this.a(h);
                }
            } else {
                object = this.j;
                if (n2 >= 0) {
                    this.a(b[n2]);
                    bd.l(5890);
                    bd.D();
                    bd.b(8.0f, 4.0f, 1.0f);
                    bd.c(0.0625f, 0.0625f, 0.0625f);
                    bd.l(5888);
                } else if (this.k) {
                    this.a(d);
                } else if (u2.n() == aq.b) {
                    this.a(a);
                } else {
                    this.a(e);
                }
            }
            bd.D();
            bd.A();
            if (n2 < 0) {
                bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            }
            bd.c((float)d2, (float)d3 + 1.0f, (float)d4 + 1.0f);
            bd.b(1.0f, -1.0f, -1.0f);
            bd.c(0.5f, 0.5f, 0.5f);
            int n4 = 0;
            if (n3 == 2) {
                n4 = 180;
            }
            if (n3 == 3) {
                n4 = 0;
            }
            if (n3 == 4) {
                n4 = 90;
            }
            if (n3 == 5) {
                n4 = -90;
            }
            if (n3 == 2 && u2.e != null) {
                bd.c(1.0f, 0.0f, 0.0f);
            }
            if (n3 == 5 && u2.g != null) {
                bd.c(0.0f, 0.0f, -1.0f);
            }
            bd.b((float)n4, 0.0f, 1.0f, 0.0f);
            bd.c(-0.5f, -0.5f, -0.5f);
            float f4 = u2.i + (u2.h - u2.i) * f2;
            if (u2.d != null && (f3 = u2.d.i + (u2.d.h - u2.d.i) * f2) > f4) {
                f4 = f3;
            }
            if (u2.f != null && (f3 = u2.f.i + (u2.f.h - u2.f.i) * f2) > f4) {
                f4 = f3;
            }
            f4 = 1.0f - f4;
            f4 = 1.0f - f4 * f4 * f4;
            object.a.f = -(f4 * 1.5707964f);
            ((aa)object).a();
            bd.B();
            bd.E();
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            if (n2 >= 0) {
                bd.l(5890);
                bd.E();
                bd.l(5888);
            }
        }
    }
}

