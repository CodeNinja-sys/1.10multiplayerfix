/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.b.b;
import net.minecraft.g.b.e;
import net.minecraft.g.by;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.dj;
import net.minecraft.g.gr;
import net.minecraft.q.k;
import net.minecraft.u.bi;
import net.minecraft.u.bq;

public class eu
extends dj {
    public static final e a = net.minecraft.g.b.e.a("shape", by.class);

    protected eu() {
        super(false);
        this.z(this.O.b().a(a, (Comparable)((Object)by.a)));
    }

    @Override
    protected void b(net.minecraft.g.c.b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (cn2.v().p() && new gr(this, k2, b3, b2).b() == 3) {
            this.a(k2, b3, b2, false);
        }
    }

    @Override
    public b h() {
        return a;
    }

    @Override
    public net.minecraft.g.c.b a(int n2) {
        return this.v().a(a, (Comparable)((Object)by.a(n2)));
    }

    @Override
    public int b(net.minecraft.g.c.b b2) {
        return ((by)((Object)b2.a(a))).b();
    }

    @Override
    public net.minecraft.g.c.b a(net.minecraft.g.c.b b2, bq bq2) {
        switch (bq2) {
            case c: {
                switch ((by)((Object)b2.a(a))) {
                    case c: {
                        return b2.a(a, (Comparable)((Object)by.d));
                    }
                    case d: {
                        return b2.a(a, (Comparable)((Object)by.c));
                    }
                    case e: {
                        return b2.a(a, (Comparable)((Object)by.f));
                    }
                    case f: {
                        return b2.a(a, (Comparable)((Object)by.e));
                    }
                    case g: {
                        return b2.a(a, (Comparable)((Object)by.i));
                    }
                    case h: {
                        return b2.a(a, (Comparable)((Object)by.j));
                    }
                    case i: {
                        return b2.a(a, (Comparable)((Object)by.g));
                    }
                    case j: {
                        return b2.a(a, (Comparable)((Object)by.h));
                    }
                }
            }
            case d: {
                switch ((by)((Object)b2.a(a))) {
                    case c: {
                        return b2.a(a, (Comparable)((Object)by.e));
                    }
                    case d: {
                        return b2.a(a, (Comparable)((Object)by.f));
                    }
                    case e: {
                        return b2.a(a, (Comparable)((Object)by.d));
                    }
                    case f: {
                        return b2.a(a, (Comparable)((Object)by.c));
                    }
                    case g: {
                        return b2.a(a, (Comparable)((Object)by.j));
                    }
                    case h: {
                        return b2.a(a, (Comparable)((Object)by.g));
                    }
                    case i: {
                        return b2.a(a, (Comparable)((Object)by.h));
                    }
                    case j: {
                        return b2.a(a, (Comparable)((Object)by.i));
                    }
                    case a: {
                        return b2.a(a, (Comparable)((Object)by.b));
                    }
                    case b: {
                        return b2.a(a, (Comparable)((Object)by.a));
                    }
                }
            }
            case b: {
                switch ((by)((Object)b2.a(a))) {
                    case c: {
                        return b2.a(a, (Comparable)((Object)by.f));
                    }
                    case d: {
                        return b2.a(a, (Comparable)((Object)by.e));
                    }
                    case e: {
                        return b2.a(a, (Comparable)((Object)by.c));
                    }
                    case f: {
                        return b2.a(a, (Comparable)((Object)by.d));
                    }
                    case g: {
                        return b2.a(a, (Comparable)((Object)by.h));
                    }
                    case h: {
                        return b2.a(a, (Comparable)((Object)by.i));
                    }
                    case i: {
                        return b2.a(a, (Comparable)((Object)by.j));
                    }
                    case j: {
                        return b2.a(a, (Comparable)((Object)by.g));
                    }
                    case a: {
                        return b2.a(a, (Comparable)((Object)by.b));
                    }
                    case b: {
                        return b2.a(a, (Comparable)((Object)by.a));
                    }
                }
            }
        }
        return b2;
    }

    @Override
    public net.minecraft.g.c.b a(net.minecraft.g.c.b b2, bi bi2) {
        by by2 = (by)((Object)b2.a(a));
        block0 : switch (bi2) {
            case b: {
                switch (by2) {
                    case e: {
                        return b2.a(a, (Comparable)((Object)by.f));
                    }
                    case f: {
                        return b2.a(a, (Comparable)((Object)by.e));
                    }
                    case g: {
                        return b2.a(a, (Comparable)((Object)by.j));
                    }
                    case h: {
                        return b2.a(a, (Comparable)((Object)by.i));
                    }
                    case i: {
                        return b2.a(a, (Comparable)((Object)by.h));
                    }
                    case j: {
                        return b2.a(a, (Comparable)((Object)by.g));
                    }
                }
                return super.a(b2, bi2);
            }
            case c: {
                switch (by2) {
                    case c: {
                        return b2.a(a, (Comparable)((Object)by.d));
                    }
                    case d: {
                        return b2.a(a, (Comparable)((Object)by.c));
                    }
                    default: {
                        break block0;
                    }
                    case g: {
                        return b2.a(a, (Comparable)((Object)by.h));
                    }
                    case h: {
                        return b2.a(a, (Comparable)((Object)by.g));
                    }
                    case i: {
                        return b2.a(a, (Comparable)((Object)by.j));
                    }
                    case j: 
                }
                return b2.a(a, (Comparable)((Object)by.i));
            }
        }
        return super.a(b2, bi2);
    }

    @Override
    protected i a() {
        return new i(this, a);
    }
}

