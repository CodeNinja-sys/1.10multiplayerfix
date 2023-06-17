/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.q.c.d;
import net.minecraft.x.d.a;
import net.minecraft.x.d.b.bz;
import net.minecraft.x.p;

public class q
implements p {
    private bz a;
    private int b;
    private double c;
    private double d;
    private double e;
    private double f;
    private long g;
    private int h;
    private int i;
    private static /* synthetic */ int[] j;

    public q() {
    }

    public q(d d2, bz bz2) {
        this.a = bz2;
        this.c = d2.a();
        this.d = d2.b();
        this.f = d2.h();
        this.e = d2.j();
        this.g = d2.i();
        this.b = d2.l();
        this.i = d2.q();
        this.h = d2.p();
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = (bz)a2.a(bz.class);
        switch (q.a()[this.a.ordinal()]) {
            case 1: {
                this.e = a2.P();
                break;
            }
            case 2: {
                this.f = a2.P();
                this.e = a2.P();
                this.g = a2.f();
                break;
            }
            case 3: {
                this.c = a2.P();
                this.d = a2.P();
                break;
            }
            case 6: {
                this.i = a2.e();
                break;
            }
            case 5: {
                this.h = a2.e();
                break;
            }
            case 4: {
                this.c = a2.P();
                this.d = a2.P();
                this.f = a2.P();
                this.e = a2.P();
                this.g = a2.f();
                this.b = a2.e();
                this.i = a2.e();
                this.h = a2.e();
            }
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        switch (q.a()[this.a.ordinal()]) {
            case 1: {
                a2.a(this.e);
                break;
            }
            case 2: {
                a2.a(this.f);
                a2.a(this.e);
                a2.a(this.g);
                break;
            }
            case 3: {
                a2.a(this.c);
                a2.a(this.d);
                break;
            }
            case 6: {
                a2.d(this.i);
                break;
            }
            case 5: {
                a2.d(this.h);
                break;
            }
            case 4: {
                a2.a(this.c);
                a2.a(this.d);
                a2.a(this.f);
                a2.a(this.e);
                a2.a(this.g);
                a2.d(this.b);
                a2.d(this.i);
                a2.d(this.h);
            }
        }
    }

    public void a(a a2) {
        a2.a(this);
    }

    public void a(d d2) {
        switch (q.a()[this.a.ordinal()]) {
            case 1: {
                d2.a(this.e);
                break;
            }
            case 2: {
                d2.a(this.f, this.e, this.g);
                break;
            }
            case 3: {
                d2.b(this.c, this.d);
                break;
            }
            case 6: {
                d2.c(this.i);
                break;
            }
            case 5: {
                d2.b(this.h);
                break;
            }
            case 4: {
                d2.b(this.c, this.d);
                if (this.g > 0L) {
                    d2.a(this.f, this.e, this.g);
                } else {
                    d2.a(this.e);
                }
                d2.a(this.b);
                d2.c(this.i);
                d2.b(this.h);
            }
        }
    }

    static /* synthetic */ int[] a() {
        if (j != null) {
            return j;
        }
        int[] arrn = new int[bz.values().length];
        try {
            arrn[bz.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bz.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bz.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bz.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bz.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bz.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        j = arrn;
        return arrn;
    }
}

