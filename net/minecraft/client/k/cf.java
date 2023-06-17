/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.f.u;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.ce;
import net.minecraft.client.k.de;
import net.minecraft.client.r;

public class cf
extends de {
    protected int a = 200;
    protected int b = 20;
    public int c;
    public int d;
    private final List g;
    public int e;
    private boolean h;
    public boolean f = true;
    private boolean i;
    private final int j;
    private int k;
    private int l;
    private int m;
    private final ce n;
    private int o;

    public cf(ce ce2, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.n = ce2;
        this.e = n2;
        this.c = n3;
        this.d = n4;
        this.a = n5;
        this.b = n6;
        this.g = ov.a();
        this.h = false;
        this.i = false;
        this.j = n7;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.o = 0;
    }

    public void a(String string) {
        this.g.add(u.a(string, new Object[0]));
    }

    public cf a() {
        this.h = true;
        return this;
    }

    public void a(r r2, int n2, int n3) {
        if (this.f) {
            bd.l();
            bd.a(ad.l, bc.j, ad.e, bc.n);
            this.b(r2, n2, n3);
            int n4 = this.d + this.b / 2 + this.o / 2;
            int n5 = n4 - this.g.size() * 10 / 2;
            for (int i2 = 0; i2 < this.g.size(); ++i2) {
                if (this.h) {
                    this.a(this.n, (String)this.g.get(i2), this.c + this.a / 2, n5 + i2 * 10, this.j);
                    continue;
                }
                this.b(this.n, (String)this.g.get(i2), this.c, n5 + i2 * 10, this.j);
            }
        }
    }

    protected void b(r r2, int n2, int n3) {
        if (this.i) {
            int n4 = this.a + this.o * 2;
            int n5 = this.b + this.o * 2;
            int n6 = this.c - this.o;
            int n7 = this.d - this.o;
            cf.a(n6, n7, n6 + n4, n7 + n5, this.k);
            this.a(n6, n6 + n4, n7, this.l);
            this.a(n6, n6 + n4, n7 + n5, this.m);
            this.b(n6, n7, n7 + n5, this.l);
            this.b(n6 + n4, n7, n7 + n5, this.m);
        }
    }
}

