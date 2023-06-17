/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.c.o;
import net.minecraft.client.j.aa;
import net.minecraft.f.ak;
import net.minecraft.u.bp;

public class k
extends o {
    private static final bp a = new bp("textures/entity/chest/ender.png");
    private final aa d = new aa();

    public void a(ak ak2, double d2, double d3, double d4, float f2, int n2) {
        int n3 = 0;
        if (ak2.B()) {
            n3 = ak2.bL_();
        }
        if (n2 >= 0) {
            this.a(b[n2]);
            bd.l(5890);
            bd.D();
            bd.b(4.0f, 4.0f, 1.0f);
            bd.c(0.0625f, 0.0625f, 0.0625f);
            bd.l(5888);
        } else {
            this.a(a);
        }
        bd.D();
        bd.A();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
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
        bd.b((float)n4, 0.0f, 1.0f, 0.0f);
        bd.c(-0.5f, -0.5f, -0.5f);
        float f3 = ak2.b + (ak2.a - ak2.b) * f2;
        f3 = 1.0f - f3;
        f3 = 1.0f - f3 * f3 * f3;
        this.d.a.f = -(f3 * 1.5707964f);
        this.d.a();
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

