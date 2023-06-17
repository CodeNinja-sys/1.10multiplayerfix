/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.a.f;
import net.minecraft.client.c.e;
import net.minecraft.client.c.h;
import net.minecraft.client.f.u;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.bg;
import net.minecraft.client.k.ch;
import net.minecraft.client.r;
import net.minecraft.l.k;
import net.minecraft.u.b.n;
import net.minecraft.u.bu;

class t
extends ch {
    private final bu n;
    private final String o;
    public float a;
    public boolean b;
    final /* synthetic */ bg c;

    public t(bg bg2, int n2, int n3, int n4, bu bu2, boolean bl2) {
        this.c = bg2;
        super(n2, n3, n4, bl2 ? 310 : 150, 20, "");
        this.a = 1.0f;
        this.n = bu2;
        this.o = u.a("soundCategory." + bu2.a(), new Object[0]);
        this.i = String.valueOf(this.o) + ": " + bg2.a(bu2);
        this.a = bg.a(bg2).a(bu2);
    }

    @Override
    protected int b(boolean bl2) {
        return 0;
    }

    @Override
    protected void b(r r2, int n2, int n3) {
        if (this.l) {
            if (this.b) {
                this.a = (float)(n2 - (this.g + 4)) / (float)(this.e - 8);
                this.a = net.minecraft.u.b.n.a(this.a, 0.0f, 1.0f);
                if (net.minecraft.l.k.e) {
                    r2.w.a(this.n, 0.0f);
                } else {
                    r2.w.a(this.n, this.a);
                }
                r2.w.b();
                this.i = String.valueOf(this.o) + ": " + this.c.a(this.n);
            }
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.a_(this.g + (int)(this.a * (float)(this.e - 8)), this.h, 0, 66, 4, 20);
            this.a_(this.g + (int)(this.a * (float)(this.e - 8)) + 4, this.h, 196, 66, 4, 20);
        }
    }

    @Override
    public boolean a(r r2, int n2, int n3) {
        if (super.a(r2, n2, n3)) {
            this.a = (float)(n2 - (this.g + 4)) / (float)(this.e - 8);
            this.a = net.minecraft.u.b.n.a(this.a, 0.0f, 1.0f);
            if (net.minecraft.l.k.e) {
                r2.w.a(this.n, 0.0f);
            } else {
                r2.w.a(this.n, this.a);
            }
            r2.w.b();
            this.i = String.valueOf(this.o) + ": " + this.c.a(this.n);
            this.b = true;
            return true;
        }
        return false;
    }

    @Override
    public void a(h h2) {
    }

    @Override
    public void a(int n2, int n3) {
        if (this.b) {
            this.c.n.U().a(net.minecraft.client.c.e.a(net.minecraft.a.f.gE, 1.0f));
        }
        this.b = false;
    }
}

