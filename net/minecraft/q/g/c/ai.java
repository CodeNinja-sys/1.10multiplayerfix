/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Map;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.q.g.c.a.h;
import net.minecraft.q.g.c.a.i;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.b.b;
import net.minecraft.u.bq;

public abstract class ai
extends r {
    private static final i f = new i();
    protected h a;
    protected i d = f.a(true).a(p.a);
    protected b e;
    private static /* synthetic */ int[] g;

    public ai() {
    }

    public ai(int n2) {
        super(n2);
    }

    protected void a(h h2, b b2, i i2) {
        this.a = h2;
        this.a(ad.c);
        this.e = b2;
        this.d = i2;
        this.b();
    }

    @Override
    protected void a(e e2) {
        e2.a("TPX", this.e.cy_());
        e2.a("TPY", this.e.k());
        e2.a("TPZ", this.e.l());
    }

    @Override
    protected void b(e e2) {
        this.e = new b(e2.h("TPX"), e2.h("TPY"), e2.h("TPZ"));
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        this.d.a(dc2);
        this.a.b(k2, this.e, this.d);
        Map map = this.a.a(this.e, this.d);
        for (b b2 : map.keySet()) {
            String string = (String)map.get(b2);
            this.a(string, b2, k2, random, dc2);
        }
        return true;
    }

    protected abstract void a(String var1, b var2, k var3, Random var4, dc var5);

    private void b() {
        bq bq2 = this.d.c();
        b b2 = this.a.a(bq2);
        this.b = new dc(0, 0, 0, b2.cy_(), b2.k() - 1, b2.l());
        switch (ai.a()[bq2.ordinal()]) {
            default: {
                break;
            }
            case 2: {
                this.b.a(-b2.cy_(), 0, 0);
                break;
            }
            case 4: {
                this.b.a(0, 0, -b2.l());
                break;
            }
            case 3: {
                this.b.a(-b2.cy_(), 0, -b2.l());
            }
        }
        this.b.a(this.e.cy_(), this.e.k(), this.e.l());
    }

    @Override
    public void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.e = this.e.a(n2, n3, n4);
    }

    static /* synthetic */ int[] a() {
        if (g != null) {
            return g;
        }
        int[] arrn = new int[bq.values().length];
        try {
            arrn[bq.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bq.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bq.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bq.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        g = arrn;
        return arrn;
    }
}

