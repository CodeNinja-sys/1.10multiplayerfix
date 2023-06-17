/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import net.minecraft.client.g.bd;
import net.minecraft.client.k.b.l;
import net.minecraft.f.aa;
import net.minecraft.h.h;
import net.minecraft.h.y;
import net.minecraft.u.bp;
import net.minecraft.w.a.a;

public class b
extends l {
    private static final bp a = new bp("textures/gui/container/furnace.png");
    private final a j;
    private final y k;

    public b(a a2, y y2) {
        super(new h(a2, y2));
        this.j = a2;
        this.k = y2;
    }

    @Override
    protected void b(int n2, int n3) {
        String string = this.k.aK().c();
        this.u.a(string, this.c / 2 - this.u.a(string) / 2, 6, 0x404040);
        this.u.a(this.j.aK().c(), 8, this.d - 96 + 2, 0x404040);
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        int n4;
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.n.N().a(a);
        int n5 = (this.p - this.c) / 2;
        int n6 = (this.q - this.d) / 2;
        this.a_(n5, n6, 0, 0, this.c, this.d);
        if (aa.a(this.k)) {
            n4 = this.i(13);
            this.a_(n5 + 56, n6 + 36 + 12 - n4, 176, 12 - n4, 14, n4 + 1);
        }
        n4 = this.h(24);
        this.a_(n5 + 79, n6 + 34, 176, 14, n4 + 1, 16);
    }

    private int h(int n2) {
        int n3 = this.k.c(2);
        int n4 = this.k.c(3);
        return n4 != 0 && n3 != 0 ? n3 * n2 / n4 : 0;
    }

    private int i(int n2) {
        int n3 = this.k.c(1);
        if (n3 == 0) {
            n3 = 200;
        }
        return this.k.c(0) * n2 / n3;
    }
}

