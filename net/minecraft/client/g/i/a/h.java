/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.al;
import net.minecraft.client.j.ap;
import net.minecraft.h.k;
import net.minecraft.m.br;
import net.minecraft.m.cu;
import net.minecraft.m.dn;
import net.minecraft.u.bp;
import net.minecraft.w.l;

public abstract class h
implements s {
    protected static final bp b = new bp("textures/misc/enchanted_item_glint.png");
    protected ap c;
    protected ap d;
    private final al a;
    private float e = 1.0f;
    private float f = 1.0f;
    private float g = 1.0f;
    private float h = 1.0f;
    private boolean i;
    private static final Map j = sz.c();
    private static /* synthetic */ int[] k;

    public h(al al2) {
        this.a = al2;
        this.a();
    }

    @Override
    public void a(l l2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a(l2, f2, f3, f4, f5, f6, f7, f8, net.minecraft.h.k.e);
        this.a(l2, f2, f3, f4, f5, f6, f7, f8, net.minecraft.h.k.d);
        this.a(l2, f2, f3, f4, f5, f6, f7, f8, net.minecraft.h.k.c);
        this.a(l2, f2, f3, f4, f5, f6, f7, f8, net.minecraft.h.k.f);
    }

    @Override
    public boolean bZ_() {
        return false;
    }

    private void a(l l2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, k k2) {
        dn dn2;
        cu cu2 = this.a(l2, k2);
        if (cu2 != null && cu2.a() instanceof dn && (dn2 = (dn)cu2.a()).e() == k2) {
            ap ap2 = this.a(k2);
            ap2.a(this.a.f());
            ap2.a(l2, f2, f3, f4);
            this.a(ap2, k2);
            boolean bl2 = this.b(k2);
            this.a.a(this.a(dn2, bl2));
            switch (net.minecraft.client.g.i.a.h.b()[dn2.g().ordinal()]) {
                case 1: {
                    int n2 = dn2.i(cu2);
                    float f9 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                    float f10 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                    float f11 = (float)(n2 & 0xFF) / 255.0f;
                    bd.c(this.f * f9, this.g * f10, this.h * f11, this.e);
                    ap2.a(l2, f2, f3, f5, f6, f7, f8);
                    this.a.a(this.a(dn2, bl2, "overlay"));
                }
                case 2: 
                case 3: 
                case 4: 
                case 5: {
                    bd.c(this.f, this.g, this.h, this.e);
                    ap2.a(l2, f2, f3, f5, f6, f7, f8);
                }
            }
            if (!this.i && cu2.w()) {
                net.minecraft.client.g.i.a.h.a(this.a, l2, ap2, f2, f3, f4, f5, f6, f7, f8);
            }
        }
    }

    public cu a(l l2, k k2) {
        return l2.a(k2);
    }

    public ap a(k k2) {
        return this.b(k2) ? this.c : this.d;
    }

    private boolean b(k k2) {
        return k2 == net.minecraft.h.k.d;
    }

    public static void a(al al2, l l2, ap ap2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = (float)l2.by + f4;
        al2.a(b);
        bd.l();
        bd.c(514);
        bd.a(false);
        float f10 = 0.5f;
        bd.c(0.5f, 0.5f, 0.5f, 1.0f);
        for (int i2 = 0; i2 < 2; ++i2) {
            bd.f();
            bd.a(ad.n, bc.e);
            float f11 = 0.76f;
            bd.c(0.38f, 0.19f, 0.608f, 1.0f);
            bd.l(5890);
            bd.C();
            float f12 = 0.33333334f;
            bd.b(0.33333334f, 0.33333334f, 0.33333334f);
            bd.b(30.0f - (float)i2 * 60.0f, 0.0f, 0.0f, 1.0f);
            bd.c(0.0f, f9 * (0.001f + (float)i2 * 0.003f) * 20.0f, 0.0f);
            bd.l(5888);
            ap2.a(l2, f2, f3, f5, f6, f7, f8);
        }
        bd.l(5890);
        bd.C();
        bd.l(5888);
        bd.e();
        bd.a(true);
        bd.c(515);
        bd.k();
    }

    private bp a(dn dn2, boolean bl2) {
        return this.a(dn2, bl2, null);
    }

    private bp a(dn dn2, boolean bl2, String string) {
        Object[] arrobject = new Object[3];
        arrobject[0] = dn2.g().d();
        arrobject[1] = bl2 ? 2 : 1;
        arrobject[2] = string == null ? "" : String.format("_%s", string);
        String string2 = String.format("textures/models/armor/%s_layer_%d%s.png", arrobject);
        bp bp2 = (bp)j.get(string2);
        if (bp2 == null) {
            bp2 = new bp(string2);
            j.put(string2, bp2);
        }
        return bp2;
    }

    protected abstract void a();

    protected abstract void a(ap var1, k var2);

    static /* synthetic */ int[] b() {
        if (k != null) {
            return k;
        }
        int[] arrn = new int[br.values().length];
        try {
            arrn[br.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[br.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[br.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[br.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[br.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        k = arrn;
        return arrn;
    }
}

