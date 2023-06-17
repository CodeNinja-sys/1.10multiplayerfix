/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.q.g.c.aj;
import net.minecraft.q.g.c.ci;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.q;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class br
extends q {
    private static /* synthetic */ int[] d;

    public br() {
    }

    public br(int n2, Random random, dc dc2, ad ad2, aj aj2) {
        super(n2, aj2);
        this.a(ad2);
        this.b = dc2;
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
    }

    public static dc a(List list, Random random, int n2, int n3, int n4, ad ad2) {
        dc dc2 = new dc(n2, n3 - 5, n4, n2, n3 + 2, n4);
        switch (br.a()[ad2.ordinal()]) {
            default: {
                dc2.d = n2 + 2;
                dc2.c = n4 - 8;
                break;
            }
            case 4: {
                dc2.d = n2 + 2;
                dc2.f = n4 + 8;
                break;
            }
            case 5: {
                dc2.a = n2 - 8;
                dc2.f = n4 + 2;
                break;
            }
            case 6: {
                dc2.d = n2 + 8;
                dc2.f = n4 + 2;
            }
        }
        return r.a(list, dc2) != null ? null : dc2;
    }

    @Override
    public void a(r r2, List list, Random random) {
        int n2 = this.g();
        ad ad2 = this.i();
        if (ad2 != null) {
            switch (br.a()[ad2.ordinal()]) {
                default: {
                    ci.a(r2, list, random, this.b.a, this.b.b, this.b.c - 1, ad.c, n2);
                    break;
                }
                case 4: {
                    ci.a(r2, list, random, this.b.a, this.b.b, this.b.f + 1, ad.d, n2);
                    break;
                }
                case 5: {
                    ci.a(r2, list, random, this.b.a - 1, this.b.b, this.b.c, ad.e, n2);
                    break;
                }
                case 6: {
                    ci.a(r2, list, random, this.b.d + 1, this.b.b, this.b.c, ad.f, n2);
                }
            }
        }
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.a(k2, dc2)) {
            return false;
        }
        this.a(k2, dc2, 0, 5, 0, 2, 7, 1, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 0, 0, 7, 2, 2, 8, p.a.v(), p.a.v(), false);
        for (int i2 = 0; i2 < 5; ++i2) {
            this.a(k2, dc2, 0, 5 - i2 - (i2 < 4 ? 1 : 0), 2 + i2, 2, 7 - i2, 2 + i2, p.a.v(), p.a.v(), false);
        }
        return true;
    }

    static /* synthetic */ int[] a() {
        if (d != null) {
            return d;
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
        d = arrn;
        return arrn;
    }
}

