/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.g.d;
import net.minecraft.client.g.i.ax;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ac;
import net.minecraft.u.b.a;
import net.minecraft.u.b.b;
import net.minecraft.u.b.s;
import net.minecraft.u.bp;
import net.minecraft.w.e.as;
import net.minecraft.w.l;

public class ao
extends n {
    private static final bp a = new bp("textures/entity/shulker/endergolem.png");
    private int b;

    public ao(f f2, ac ac2) {
        super(f2, ac2, 0.0f);
        this.a(new ax(this, null));
        this.b = ac2.a();
        this.d = 0.0f;
    }

    public void a(as as2, double d2, double d3, double d4, float f2, float f3) {
        int n2;
        if (this.b != ((ac)this.g).a()) {
            this.g = new ac();
            this.b = ((ac)this.g).a();
        }
        if ((n2 = as2.s()) > 0 && as2.v()) {
            b b2 = as2.q();
            b b3 = as2.t();
            double d5 = (double)((float)n2 - f3) / 6.0;
            d5 *= d5;
            double d6 = (double)(b2.cy_() - b3.cy_()) * d5;
            double d7 = (double)(b2.k() - b3.k()) * d5;
            double d8 = (double)(b2.l() - b3.l()) * d5;
            super.a(as2, d2 - d6, d3 - d7, d4 - d8, f2, f3);
        } else {
            super.a(as2, d2, d3, d4, f2, f3);
        }
    }

    public boolean a(as as2, d d2, double d3, double d4, double d5) {
        if (super.a(as2, d2, d3, d4, d5)) {
            return true;
        }
        if (as2.s() > 0 && as2.v()) {
            b b2 = as2.t();
            b b3 = as2.q();
            s s2 = new s(b3.cy_(), b3.k(), b3.l());
            s s3 = new s(b2.cy_(), b2.k(), b2.l());
            if (d2.a(new a(s3.b, s3.c, s3.d, s2.b, s2.c, s2.d))) {
                return true;
            }
        }
        return false;
    }

    protected bp a(as as2) {
        return a;
    }

    protected void a(as as2, float f2, float f3, float f4) {
        super.a((l)as2, f2, f3, f4);
        switch (as2.p()) {
            default: {
                break;
            }
            case f: {
                bd.c(0.5f, 0.5f, 0.0f);
                bd.b(90.0f, 1.0f, 0.0f, 0.0f);
                bd.b(90.0f, 0.0f, 0.0f, 1.0f);
                break;
            }
            case e: {
                bd.c(-0.5f, 0.5f, 0.0f);
                bd.b(90.0f, 1.0f, 0.0f, 0.0f);
                bd.b(-90.0f, 0.0f, 0.0f, 1.0f);
                break;
            }
            case c: {
                bd.c(0.0f, 0.5f, -0.5f);
                bd.b(90.0f, 1.0f, 0.0f, 0.0f);
                break;
            }
            case d: {
                bd.c(0.0f, 0.5f, 0.5f);
                bd.b(90.0f, 1.0f, 0.0f, 0.0f);
                bd.b(180.0f, 0.0f, 0.0f, 1.0f);
                break;
            }
            case b: {
                bd.c(0.0f, 1.0f, 0.0f);
                bd.b(180.0f, 1.0f, 0.0f, 0.0f);
            }
        }
    }

    protected void a(as as2, float f2) {
        float f3 = 0.999f;
        bd.b(0.999f, 0.999f, 0.999f);
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((as)n2);
    }

    static /* synthetic */ bp e() {
        return a;
    }
}

