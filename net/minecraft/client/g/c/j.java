/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import java.util.List;
import net.minecraft.a.p;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.c.o;
import net.minecraft.client.j.ae;
import net.minecraft.client.k.ce;
import net.minecraft.client.k.y;
import net.minecraft.f.ad;
import net.minecraft.g.cn;
import net.minecraft.u.bp;
import net.minecraft.u.d.a;

public class j
extends o {
    private static final bp a = new bp("textures/entity/sign.png");
    private final ae d = new ae();

    public void a(ad ad2, double d2, double d3, double d4, float f2, int n2) {
        float f3;
        cn cn2 = ad2.E();
        bd.D();
        float f4 = 0.6666667f;
        if (cn2 == p.an) {
            bd.c((float)d2 + 0.5f, (float)d3 + 0.5f, (float)d4 + 0.5f);
            float f5 = (float)(ad2.bL_() * 360) / 16.0f;
            bd.b(-f5, 0.0f, 1.0f, 0.0f);
            this.d.b.j = true;
        } else {
            int n3 = ad2.bL_();
            f3 = 0.0f;
            if (n3 == 2) {
                f3 = 180.0f;
            }
            if (n3 == 4) {
                f3 = 90.0f;
            }
            if (n3 == 5) {
                f3 = -90.0f;
            }
            bd.c((float)d2 + 0.5f, (float)d3 + 0.5f, (float)d4 + 0.5f);
            bd.b(-f3, 0.0f, 1.0f, 0.0f);
            bd.c(0.0f, -0.3125f, -0.4375f);
            this.d.b.j = false;
        }
        if (n2 >= 0) {
            this.a(b[n2]);
            bd.l(5890);
            bd.D();
            bd.b(4.0f, 2.0f, 1.0f);
            bd.c(0.0625f, 0.0625f, 0.0625f);
            bd.l(5888);
        } else {
            this.a(a);
        }
        bd.A();
        bd.D();
        bd.b(0.6666667f, -0.6666667f, -0.6666667f);
        this.d.a();
        bd.E();
        ce ce2 = this.d();
        f3 = 0.010416667f;
        bd.c(0.0f, 0.33333334f, 0.046666667f);
        bd.b(0.010416667f, -0.010416667f, 0.010416667f);
        bd.a(0.0f, 0.0f, -0.010416667f);
        bd.a(false);
        boolean bl2 = false;
        if (n2 < 0) {
            for (int i2 = 0; i2 < ad2.a.length; ++i2) {
                String string;
                if (ad2.a[i2] == null) continue;
                a a2 = ad2.a[i2];
                List list = y.a(a2, 90, ce2, false, true);
                String string2 = string = list != null && !list.isEmpty() ? ((a)list.get(0)).d() : "";
                if (i2 == ad2.c) {
                    string = "> " + string + " <";
                    ce2.a(string, -ce2.a(string) / 2, i2 * 10 - ad2.a.length * 5, 0);
                    continue;
                }
                ce2.a(string, -ce2.a(string) / 2, i2 * 10 - ad2.a.length * 5, 0);
            }
        }
        bd.a(true);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.E();
        if (n2 >= 0) {
            bd.l(5890);
            bd.E();
            bd.l(5888);
        }
    }
}

