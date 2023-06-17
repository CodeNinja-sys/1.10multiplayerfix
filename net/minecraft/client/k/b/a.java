/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import net.minecraft.client.g.bd;
import net.minecraft.client.k.b.l;
import net.minecraft.h.as;
import net.minecraft.h.y;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;

public class a
extends l {
    private static final bp a = new bp("textures/gui/container/brewing_stand.png");
    private static final int[] j;
    private final net.minecraft.w.a.a k;
    private final y l;

    static {
        int[] arrn = new int[7];
        arrn[0] = 29;
        arrn[1] = 24;
        arrn[2] = 20;
        arrn[3] = 16;
        arrn[4] = 11;
        arrn[5] = 6;
        j = arrn;
    }

    public a(net.minecraft.w.a.a a2, y y2) {
        super(new as(a2, y2));
        this.k = a2;
        this.l = y2;
    }

    @Override
    protected void b(int n2, int n3) {
        String string = this.l.aK().c();
        this.u.a(string, this.c / 2 - this.u.a(string) / 2, 6, 0x404040);
        this.u.a(this.k.aK().c(), 8, this.d - 96 + 2, 0x404040);
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        int n4;
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.n.N().a(a);
        int n5 = (this.p - this.c) / 2;
        int n6 = (this.q - this.d) / 2;
        this.a_(n5, n6, 0, 0, this.c, this.d);
        int n7 = this.l.c(1);
        int n8 = net.minecraft.u.b.n.a((18 * n7 + 20 - 1) / 20, 0, 18);
        if (n8 > 0) {
            this.a_(n5 + 60, n6 + 44, 176, 29, n8, 4);
        }
        if ((n4 = this.l.c(0)) > 0) {
            int n9 = (int)(28.0f * (1.0f - (float)n4 / 400.0f));
            if (n9 > 0) {
                this.a_(n5 + 97, n6 + 16, 176, 0, 9, n9);
            }
            if ((n9 = j[n4 / 2 % 7]) > 0) {
                this.a_(n5 + 63, n6 + 14 + 29 - n9, 185, 29 - n9, 12, n9);
            }
        }
    }
}

