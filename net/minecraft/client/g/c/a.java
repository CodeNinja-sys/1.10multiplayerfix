/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.c.o;
import net.minecraft.client.j.p;
import net.minecraft.f.aj;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;

public class a
extends o {
    private static final bp a = new bp("textures/entity/enchanting_table_book.png");
    private final p d = new p();

    public void a(aj aj2, double d2, double d3, double d4, float f2, int n2) {
        float f3;
        bd.D();
        bd.c((float)d2 + 0.5f, (float)d3 + 0.75f, (float)d4 + 0.5f);
        float f4 = (float)aj2.a + f2;
        bd.c(0.0f, 0.1f + n.a(f4 * 0.1f) * 0.01f, 0.0f);
        for (f3 = aj2.h - aj2.i; f3 >= (float)Math.PI; f3 -= (float)Math.PI * 2) {
        }
        while (f3 < (float)(-Math.PI)) {
            f3 += (float)Math.PI * 2;
        }
        float f5 = aj2.i + f3 * f2;
        bd.b(-f5 * 57.295776f, 0.0f, 1.0f, 0.0f);
        bd.b(80.0f, 0.0f, 0.0f, 1.0f);
        this.a(a);
        float f6 = aj2.c + (aj2.b - aj2.c) * f2 + 0.25f;
        float f7 = aj2.c + (aj2.b - aj2.c) * f2 + 0.75f;
        f6 = (f6 - (float)n.b((double)f6)) * 1.6f - 0.3f;
        f7 = (f7 - (float)n.b((double)f7)) * 1.6f - 0.3f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        float f8 = aj2.g + (aj2.f - aj2.g) * f2;
        bd.p();
        this.d.a(null, f4, f6, f7, f8, 0.0f, 0.0625f);
        bd.E();
    }
}

