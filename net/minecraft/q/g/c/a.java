/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.q.g.c.aj;
import net.minecraft.q.g.c.ci;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.q;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class a
extends q {
    private ad d;
    private boolean e;
    private static /* synthetic */ int[] f;

    public a() {
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("tf", this.e);
        e2.a("D", this.d.c());
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.e = e2.p("tf");
        this.d = ad.b(e2.h("D"));
    }

    public a(int n2, Random random, dc dc2, ad ad2, aj aj2) {
        super(n2, aj2);
        this.d = ad2;
        this.b = dc2;
        this.e = dc2.d() > 3;
    }

    public static dc a(List list, Random random, int n2, int n3, int n4, ad ad2) {
        dc dc2 = new dc(n2, n3, n4, n2, n3 + 2, n4);
        if (random.nextInt(4) == 0) {
            dc2.e += 4;
        }
        switch (net.minecraft.q.g.c.a.a()[ad2.ordinal()]) {
            default: {
                dc2.a = n2 - 1;
                dc2.d = n2 + 3;
                dc2.c = n4 - 4;
                break;
            }
            case 4: {
                dc2.a = n2 - 1;
                dc2.d = n2 + 3;
                dc2.f = n4 + 3 + 1;
                break;
            }
            case 5: {
                dc2.a = n2 - 4;
                dc2.c = n4 - 1;
                dc2.f = n4 + 3;
                break;
            }
            case 6: {
                dc2.d = n2 + 3 + 1;
                dc2.c = n4 - 1;
                dc2.f = n4 + 3;
            }
        }
        return r.a(list, dc2) != null ? null : dc2;
    }

    @Override
    public void a(r r2, List list, Random random) {
        int n2 = this.g();
        switch (net.minecraft.q.g.c.a.a()[this.d.ordinal()]) {
            default: {
                ci.a(r2, list, random, this.b.a + 1, this.b.b, this.b.c - 1, ad.c, n2);
                ci.a(r2, list, random, this.b.a - 1, this.b.b, this.b.c + 1, ad.e, n2);
                ci.a(r2, list, random, this.b.d + 1, this.b.b, this.b.c + 1, ad.f, n2);
                break;
            }
            case 4: {
                ci.a(r2, list, random, this.b.a + 1, this.b.b, this.b.f + 1, ad.d, n2);
                ci.a(r2, list, random, this.b.a - 1, this.b.b, this.b.c + 1, ad.e, n2);
                ci.a(r2, list, random, this.b.d + 1, this.b.b, this.b.c + 1, ad.f, n2);
                break;
            }
            case 5: {
                ci.a(r2, list, random, this.b.a + 1, this.b.b, this.b.c - 1, ad.c, n2);
                ci.a(r2, list, random, this.b.a + 1, this.b.b, this.b.f + 1, ad.d, n2);
                ci.a(r2, list, random, this.b.a - 1, this.b.b, this.b.c + 1, ad.e, n2);
                break;
            }
            case 6: {
                ci.a(r2, list, random, this.b.a + 1, this.b.b, this.b.c - 1, ad.c, n2);
                ci.a(r2, list, random, this.b.a + 1, this.b.b, this.b.f + 1, ad.d, n2);
                ci.a(r2, list, random, this.b.d + 1, this.b.b, this.b.c + 1, ad.f, n2);
            }
        }
        if (this.e) {
            if (random.nextBoolean()) {
                ci.a(r2, list, random, this.b.a + 1, this.b.b + 3 + 1, this.b.c - 1, ad.c, n2);
            }
            if (random.nextBoolean()) {
                ci.a(r2, list, random, this.b.a - 1, this.b.b + 3 + 1, this.b.c + 1, ad.e, n2);
            }
            if (random.nextBoolean()) {
                ci.a(r2, list, random, this.b.d + 1, this.b.b + 3 + 1, this.b.c + 1, ad.f, n2);
            }
            if (random.nextBoolean()) {
                ci.a(r2, list, random, this.b.a + 1, this.b.b + 3 + 1, this.b.f + 1, ad.d, n2);
            }
        }
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.a(k2, dc2)) {
            return false;
        }
        b b2 = this.b();
        if (this.e) {
            this.a(k2, dc2, this.b.a + 1, this.b.b, this.b.c, this.b.d - 1, this.b.b + 3 - 1, this.b.f, p.a.v(), p.a.v(), false);
            this.a(k2, dc2, this.b.a, this.b.b, this.b.c + 1, this.b.d, this.b.b + 3 - 1, this.b.f - 1, p.a.v(), p.a.v(), false);
            this.a(k2, dc2, this.b.a + 1, this.b.e - 2, this.b.c, this.b.d - 1, this.b.e, this.b.f, p.a.v(), p.a.v(), false);
            this.a(k2, dc2, this.b.a, this.b.e - 2, this.b.c + 1, this.b.d, this.b.e, this.b.f - 1, p.a.v(), p.a.v(), false);
            this.a(k2, dc2, this.b.a + 1, this.b.b + 3, this.b.c + 1, this.b.d - 1, this.b.b + 3, this.b.f - 1, p.a.v(), p.a.v(), false);
        } else {
            this.a(k2, dc2, this.b.a + 1, this.b.b, this.b.c, this.b.d - 1, this.b.e, this.b.f, p.a.v(), p.a.v(), false);
            this.a(k2, dc2, this.b.a, this.b.b, this.b.c + 1, this.b.d, this.b.e, this.b.f - 1, p.a.v(), p.a.v(), false);
        }
        this.b(k2, dc2, this.b.a + 1, this.b.b, this.b.c + 1, this.b.e);
        this.b(k2, dc2, this.b.a + 1, this.b.b, this.b.f - 1, this.b.e);
        this.b(k2, dc2, this.b.d - 1, this.b.b, this.b.c + 1, this.b.e);
        this.b(k2, dc2, this.b.d - 1, this.b.b, this.b.f - 1, this.b.e);
        for (int i2 = this.b.a; i2 <= this.b.d; ++i2) {
            for (int i3 = this.b.c; i3 <= this.b.f; ++i3) {
                if (this.a(k2, i2, this.b.b - 1, i3, dc2).d() != h.a || this.b(k2, i2, this.b.b - 1, i3, dc2) >= 8) continue;
                this.a(k2, b2, i2, this.b.b - 1, i3, dc2);
            }
        }
        return true;
    }

    private void b(k k2, dc dc2, int n2, int n3, int n4, int n5) {
        if (this.a(k2, n2, n5 + 1, n4, dc2).d() != h.a) {
            this.a(k2, dc2, n2, n3, n4, n2, n5, n4, this.b(), p.a.v(), false);
        }
    }

    static /* synthetic */ int[] a() {
        if (f != null) {
            return f;
        }
        int[] arrn = new int[ad.values().length];
        try {
            arrn[ad.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        f = arrn;
        return arrn;
    }
}

