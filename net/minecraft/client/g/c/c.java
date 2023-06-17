/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import com.c.a.c.g;
import com.c.a.c.h;
import com.c.a.e;
import java.util.Map;
import java.util.UUID;
import net.minecraft.client.f.z;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.bq;
import net.minecraft.client.g.c.d;
import net.minecraft.client.g.c.o;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.ar;
import net.minecraft.client.j.ba;
import net.minecraft.client.j.u;
import net.minecraft.client.r;
import net.minecraft.f.f;
import net.minecraft.u.ad;
import net.minecraft.u.bp;
import net.minecraft.w.a.b;

public class c
extends o {
    private static final bp d = new bp("textures/entity/skeleton/skeleton.png");
    private static final bp e = new bp("textures/entity/skeleton/wither_skeleton.png");
    private static final bp f = new bp("textures/entity/zombie/zombie.png");
    private static final bp g = new bp("textures/entity/creeper/creeper.png");
    private static final bp h = new bp("textures/entity/enderdragon/dragon.png");
    private final u i = new u(0.0f);
    public static c a;
    private final ar j = new ar(0, 0, 64, 32);
    private final ar k = new ba();
    private static /* synthetic */ int[] l;

    public void a(f f2, double d2, double d3, double d4, float f3, int n2) {
        ad ad2 = ad.a(f2.bL_() & 7);
        float f4 = f2.a(f3);
        this.a((float)d2, (float)d3, (float)d4, ad2, (float)(f2.f() * 360) / 16.0f, f2.e(), f2.b(), n2, f4);
    }

    @Override
    public void a(d d2) {
        super.a(d2);
        a = this;
    }

    public void a(float f2, float f3, float f4, ad ad2, float f5, int n2, e e2, int n3, float f6) {
        ap ap2 = this.j;
        if (n3 >= 0) {
            this.a(b[n3]);
            bd.l(5890);
            bd.D();
            bd.b(4.0f, 2.0f, 1.0f);
            bd.c(0.0625f, 0.0625f, 0.0625f);
            bd.l(5888);
        } else {
            switch (n2) {
                default: {
                    this.a(d);
                    break;
                }
                case 1: {
                    this.a(e);
                    break;
                }
                case 2: {
                    this.a(f);
                    ap2 = this.k;
                    break;
                }
                case 3: {
                    ap2 = this.k;
                    bp bp2 = z.a();
                    if (e2 != null) {
                        r r2 = r.z();
                        Map map = r2.Y().a(e2);
                        if (map.containsKey((Object)com.c.a.c.h.a)) {
                            bp2 = r2.Y().a((g)map.get((Object)com.c.a.c.h.a), com.c.a.c.h.a);
                        } else {
                            UUID uUID = net.minecraft.w.a.b.a(e2);
                            bp2 = z.a(uUID);
                        }
                    }
                    this.a(bp2);
                    break;
                }
                case 4: {
                    this.a(g);
                    break;
                }
                case 5: {
                    this.a(h);
                    ap2 = this.i;
                }
            }
        }
        bd.D();
        bd.q();
        if (ad2 == ad.b) {
            bd.c(f2 + 0.5f, f3, f4 + 0.5f);
        } else {
            switch (net.minecraft.client.g.c.c.a()[ad2.ordinal()]) {
                case 3: {
                    bd.c(f2 + 0.5f, f3 + 0.25f, f4 + 0.74f);
                    break;
                }
                case 4: {
                    bd.c(f2 + 0.5f, f3 + 0.25f, f4 + 0.26f);
                    f5 = 180.0f;
                    break;
                }
                case 5: {
                    bd.c(f2 + 0.74f, f3 + 0.25f, f4 + 0.5f);
                    f5 = 270.0f;
                    break;
                }
                default: {
                    bd.c(f2 + 0.26f, f3 + 0.25f, f4 + 0.5f);
                    f5 = 90.0f;
                }
            }
        }
        float f7 = 0.0625f;
        bd.A();
        bd.b(-1.0f, -1.0f, 1.0f);
        bd.d();
        if (n2 == 3) {
            bd.a(bq.b);
        }
        ap2.a(null, f6, 0.0f, 0.0f, f5, 0.0f, 0.0625f);
        bd.E();
        if (n3 >= 0) {
            bd.l(5890);
            bd.E();
            bd.l(5888);
        }
    }

    static /* synthetic */ int[] a() {
        if (l != null) {
            return l;
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
        l = arrn;
        return arrn;
    }
}

