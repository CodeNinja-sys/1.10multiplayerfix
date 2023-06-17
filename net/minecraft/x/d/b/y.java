/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.u.d.k;
import net.minecraft.u.i;
import net.minecraft.w.l;
import net.minecraft.x.d.a;
import net.minecraft.x.d.b.cg;
import net.minecraft.x.p;

public class y
implements p {
    public cg a;
    public int b;
    public int c;
    public int d;
    public net.minecraft.u.d.a e;
    private static /* synthetic */ int[] f;

    public y() {
    }

    public y(i i2, cg cg2) {
        this(i2, cg2, true);
    }

    public y(i i2, cg cg2, boolean bl2) {
        this.a = cg2;
        l l2 = i2.c();
        switch (y.a()[cg2.ordinal()]) {
            case 2: {
                this.d = i2.d();
                this.c = l2 == null ? -1 : l2.ca();
                break;
            }
            case 3: {
                this.b = i2.f().ca();
                this.c = l2 == null ? -1 : l2.ca();
                this.e = bl2 ? i2.b() : new k("");
            }
        }
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = (cg)a2.a(cg.class);
        if (this.a == cg.b) {
            this.d = a2.e();
            this.c = a2.K();
        } else if (this.a == cg.c) {
            this.b = a2.e();
            this.c = a2.K();
            this.e = a2.d();
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        if (this.a == cg.b) {
            a2.d(this.d);
            a2.E(this.c);
        } else if (this.a == cg.c) {
            a2.d(this.b);
            a2.E(this.c);
            a2.a(this.e);
        }
    }

    public void a(a a2) {
        a2.a(this);
    }

    static /* synthetic */ int[] a() {
        if (f != null) {
            return f;
        }
        int[] arrn = new int[cg.values().length];
        try {
            arrn[cg.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[cg.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[cg.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        f = arrn;
        return arrn;
    }
}

