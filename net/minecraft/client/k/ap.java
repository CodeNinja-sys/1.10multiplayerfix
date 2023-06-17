/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.b.a;
import net.minecraft.client.b.d;
import net.minecraft.client.f.u;
import net.minecraft.client.k.bo;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.j;
import net.minecraft.u.d.o;

public class ap
implements bo {
    private final d b;
    private final String c;
    private final ch d;
    private final ch e;
    final /* synthetic */ j a;

    private ap(j j2, d d2) {
        this.a = j2;
        this.b = d2;
        this.c = u.a(d2.h(), new Object[0]);
        this.d = new ch(0, 0, 0, 75, 20, u.a(d2.h(), new Object[0]));
        this.e = new ch(0, 0, 0, 50, 20, u.a("controls.reset", new Object[0]));
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        boolean bl3 = j.b((j)this.a).b == this.b;
        j.a((j)this.a).m.a(this.c, n3 + 90 - j.c(this.a), n4 + n6 / 2 - j.a((j)this.a).m.a / 2, 0xFFFFFF);
        this.e.g = n3 + 190;
        this.e.h = n4;
        this.e.k = this.b.j() != this.b.i();
        this.e.c(j.a(this.a), n7, n8);
        this.d.g = n3 + 105;
        this.d.h = n4;
        this.d.i = net.minecraft.client.b.a.a(this.b.j());
        boolean bl4 = false;
        if (this.b.j() != 0) {
            d[] arrd = j.a((j)this.a).w.ao;
            int n9 = j.a((j)this.a).w.ao.length;
            for (int i2 = 0; i2 < n9; ++i2) {
                d d2 = arrd[i2];
                if (d2 == this.b || d2.j() != this.b.j()) continue;
                bl4 = true;
                break;
            }
        }
        if (bl3) {
            this.d.i = (Object)((Object)o.p) + "> " + (Object)((Object)o.o) + this.d.i + (Object)((Object)o.p) + " <";
        } else if (bl4) {
            this.d.i = (Object)((Object)o.m) + this.d.i;
        }
        this.d.c(j.a(this.a), n7, n8);
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.d.a(j.a(this.a), n3, n4)) {
            j.b((j)this.a).b = this.b;
            return true;
        }
        if (this.e.a(j.a(this.a), n3, n4)) {
            j.a((j)this.a).w.a(this.b, this.b.i());
            net.minecraft.client.b.d.c();
            return true;
        }
        return false;
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.d.a(n3, n4);
        this.e.a(n3, n4);
    }

    @Override
    public void a(int n2, int n3, int n4) {
    }

    /* synthetic */ ap(j j2, d d2, ap ap2) {
        this(j2, d2);
    }
}

