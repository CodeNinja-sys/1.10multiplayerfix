/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.a.f;
import net.minecraft.client.c.e;
import net.minecraft.client.c.h;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.ce;
import net.minecraft.client.k.de;
import net.minecraft.client.r;
import net.minecraft.u.bp;

public class ch
extends de {
    protected static final bp d = new bp("textures/gui/widgets.png");
    protected int e = 200;
    protected int f = 20;
    public int g;
    public int h;
    public String i;
    public int j;
    public boolean k = true;
    public boolean l = true;
    protected boolean m;

    public ch(int n2, int n3, int n4, String string) {
        this(n2, n3, n4, 200, 20, string);
    }

    public ch(int n2, int n3, int n4, int n5, int n6, String string) {
        this.j = n2;
        this.g = n3;
        this.h = n4;
        this.e = n5;
        this.f = n6;
        this.i = string;
    }

    protected int b(boolean bl2) {
        int n2 = 1;
        if (!this.k) {
            n2 = 0;
        } else if (bl2) {
            n2 = 2;
        }
        return n2;
    }

    public void c(r r2, int n2, int n3) {
        if (this.l) {
            ce ce2 = r2.m;
            r2.N().a(d);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.m = n2 >= this.g && n3 >= this.h && n2 < this.g + this.e && n3 < this.h + this.f;
            int n4 = this.b(this.m);
            bd.l();
            bd.a(ad.l, bc.j, ad.e, bc.n);
            bd.a(ad.l, bc.j);
            this.a_(this.g, this.h, 0, 46 + n4 * 20, this.e / 2, this.f);
            this.a_(this.g + this.e / 2, this.h, 200 - this.e / 2, 46 + n4 * 20, this.e / 2, this.f);
            this.b(r2, n2, n3);
            int n5 = 0xE0E0E0;
            if (!this.k) {
                n5 = 0xA0A0A0;
            } else if (this.m) {
                n5 = 0xFFFFA0;
            }
            this.a(ce2, this.i, this.g + this.e / 2, this.h + (this.f - 8) / 2, n5);
        }
    }

    protected void b(r r2, int n2, int n3) {
    }

    public void a(int n2, int n3) {
    }

    public boolean a(r r2, int n2, int n3) {
        return this.k && this.l && n2 >= this.g && n3 >= this.h && n2 < this.g + this.e && n3 < this.h + this.f;
    }

    public boolean g() {
        return this.m;
    }

    public void b(int n2, int n3) {
    }

    public void a(h h2) {
        h2.a(net.minecraft.client.c.e.a(net.minecraft.a.f.gE, 1.0f));
    }

    public int c() {
        return this.e;
    }

    public void a(int n2) {
        this.e = n2;
    }
}

