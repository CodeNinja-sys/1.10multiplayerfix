/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.b.b;
import net.minecraft.g.b.c;
import net.minecraft.g.b.e;
import net.minecraft.g.by;
import net.minecraft.g.bz;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.dj;
import net.minecraft.q.k;
import net.minecraft.u.bi;
import net.minecraft.u.bq;

public class di
extends dj {
    public static final e a = net.minecraft.g.b.e.a("shape", by.class, new bz());
    public static final c b = net.minecraft.g.b.c.b("powered");

    protected di() {
        super(true);
        this.z(this.O.b().a(a, (Comparable)((Object)by.a)).a(b, Boolean.valueOf(false)));
    }

    protected boolean a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, boolean bl2, int n2) {
        if (n2 >= 8) {
            return false;
        }
        int n3 = b2.cy_();
        int n4 = b2.k();
        int n5 = b2.l();
        boolean bl3 = true;
        by by2 = (by)((Object)b3.a(a));
        switch (by2) {
            case a: {
                if (bl2) {
                    ++n5;
                    break;
                }
                --n5;
                break;
            }
            case b: {
                if (bl2) {
                    --n3;
                    break;
                }
                ++n3;
                break;
            }
            case c: {
                if (bl2) {
                    --n3;
                } else {
                    ++n3;
                    ++n4;
                    bl3 = false;
                }
                by2 = by.b;
                break;
            }
            case d: {
                if (bl2) {
                    --n3;
                    ++n4;
                    bl3 = false;
                } else {
                    ++n3;
                }
                by2 = by.b;
                break;
            }
            case e: {
                if (bl2) {
                    ++n5;
                } else {
                    --n5;
                    ++n4;
                    bl3 = false;
                }
                by2 = by.a;
                break;
            }
            case f: {
                if (bl2) {
                    ++n5;
                    ++n4;
                    bl3 = false;
                } else {
                    --n5;
                }
                by2 = by.a;
            }
        }
        return this.a(k2, new net.minecraft.u.b.b(n3, n4, n5), bl2, n2, by2) ? true : bl3 && this.a(k2, new net.minecraft.u.b.b(n3, n4 - 1, n5), bl2, n2, by2);
    }

    protected boolean a(k k2, net.minecraft.u.b.b b2, boolean bl2, int n2, by by2) {
        net.minecraft.g.c.b b3 = k2.n(b2);
        if (b3.c() != this) {
            return false;
        }
        by by3 = (by)((Object)b3.a(a));
        return by2 != by.b || by3 != by.a && by3 != by.e && by3 != by.f ? (by2 != by.a || by3 != by.b && by3 != by.c && by3 != by.d ? (((Boolean)b3.a(b)).booleanValue() ? (k2.x(b2) ? true : this.a(k2, b2, b3, bl2, n2 + 1)) : false) : false) : false;
    }

    @Override
    protected void b(net.minecraft.g.c.b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        boolean bl2;
        boolean bl3 = (Boolean)b2.a(b);
        boolean bl4 = bl2 = k2.x(b3) || this.a(k2, b3, b2, true, 0) || this.a(k2, b3, b2, false, 0);
        if (bl2 != bl3) {
            k2.a(b3, b2.a(b, Boolean.valueOf(bl2)), 3);
            k2.b(b3.c(), this);
            if (((by)((Object)b2.a(a))).c()) {
                k2.b(b3.b(), this);
            }
        }
    }

    @Override
    public b h() {
        return a;
    }

    @Override
    public net.minecraft.g.c.b a(int n2) {
        return this.v().a(a, (Comparable)((Object)by.a(n2 & 7))).a(b, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int b(net.minecraft.g.c.b b2) {
        int n2 = 0;
        n2 |= ((by)((Object)b2.a(a))).b();
        if (((Boolean)b2.a(b)).booleanValue()) {
            n2 |= 8;
        }
        return n2;
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
                    case a: {
                        return b2.a(a, (Comparable)((Object)by.b));
                    }
                    case b: {
                        return b2.a(a, (Comparable)((Object)by.a));
                    }
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
                }
            }
            case b: {
                switch ((by)((Object)b2.a(a))) {
                    case a: {
                        return b2.a(a, (Comparable)((Object)by.b));
                    }
                    case b: {
                        return b2.a(a, (Comparable)((Object)by.a));
                    }
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
        return new i(this, a, b);
    }
}

