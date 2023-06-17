/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import com.a.a.b.cm;
import java.util.List;
import java.util.Random;
import net.minecraft.g.b.b;
import net.minecraft.g.b.c;
import net.minecraft.g.b.e;
import net.minecraft.g.by;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.cy;
import net.minecraft.g.dj;
import net.minecraft.g.gr;
import net.minecraft.h.aq;
import net.minecraft.h.y;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.u.r;
import net.minecraft.w.f.f;
import net.minecraft.w.f.w;

public class fg
extends dj {
    public static final e a = net.minecraft.g.b.e.a("shape", by.class, new cy());
    public static final c b = net.minecraft.g.b.c.b("powered");

    public fg() {
        super(true);
        this.z(this.O.b().a(b, Boolean.valueOf(false)).a(a, (Comparable)((Object)by.a)));
        this.b(true);
    }

    @Override
    public int a(k k2) {
        return 20;
    }

    @Override
    public boolean f(net.minecraft.g.c.b b2) {
        return true;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, net.minecraft.w.n n2) {
        if (!k2.C && !((Boolean)b3.a(b)).booleanValue()) {
            this.e(k2, b2, b3);
        }
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, Random random) {
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, Random random) {
        if (!k2.C && ((Boolean)b3.a(b)).booleanValue()) {
            this.e(k2, b2, b3);
        }
    }

    @Override
    public int b(net.minecraft.g.c.b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return (Boolean)b2.a(b) != false ? 15 : 0;
    }

    @Override
    public int c(net.minecraft.g.c.b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return (Boolean)b2.a(b) == false ? 0 : (ad2 == ad.b ? 15 : 0);
    }

    private void e(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        boolean bl2 = (Boolean)b3.a(b);
        boolean bl3 = false;
        List list = this.a(k2, b2, f.class, new cm[0]);
        if (!list.isEmpty()) {
            bl3 = true;
        }
        if (bl3 && !bl2) {
            k2.a(b2, b3.a(b, Boolean.valueOf(true)), 3);
            this.b(k2, b2, b3, true);
            k2.b(b2, this);
            k2.b(b2.c(), this);
            k2.b(b2, b2);
        }
        if (!bl3 && bl2) {
            k2.a(b2, b3.a(b, Boolean.valueOf(false)), 3);
            this.b(k2, b2, b3, false);
            k2.b(b2, this);
            k2.b(b2.c(), this);
            k2.b(b2, b2);
        }
        if (bl3) {
            k2.a(new net.minecraft.u.b.b(b2), (cn)this, this.a(k2));
        }
        k2.f(b2, this);
    }

    protected void b(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, boolean bl2) {
        gr gr2 = new gr(this, k2, b2, b3);
        for (net.minecraft.u.b.b b4 : gr2.a()) {
            net.minecraft.g.c.b b5 = k2.n(b4);
            if (b5 == null) continue;
            b5.a(k2, b4, b5.c());
        }
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        super.b(k2, b2, b3);
        this.e(k2, b2, b3);
    }

    @Override
    public b h() {
        return a;
    }

    @Override
    public boolean c(net.minecraft.g.c.b b2) {
        return true;
    }

    @Override
    public int b(net.minecraft.g.c.b b2, k k2, net.minecraft.u.b.b b3) {
        if (((Boolean)b2.a(b)).booleanValue()) {
            List list = this.a(k2, b3, w.class, new cm[0]);
            if (!list.isEmpty()) {
                return ((w)list.get(0)).g().a();
            }
            List list2 = this.a(k2, b3, f.class, r.c);
            if (!list2.isEmpty()) {
                return aq.b((y)list2.get(0));
            }
        }
        return 0;
    }

    protected List a(k k2, net.minecraft.u.b.b b2, Class class_, cm ... arrcm) {
        a a2 = this.a(b2);
        return arrcm.length != 1 ? k2.a(class_, a2) : k2.a(class_, a2, arrcm[0]);
    }

    private a a(net.minecraft.u.b.b b2) {
        float f2 = 0.2f;
        return new a((float)b2.cy_() + 0.2f, b2.k(), (float)b2.l() + 0.2f, (float)(b2.cy_() + 1) - 0.2f, (float)(b2.k() + 1) - 0.2f, (float)(b2.l() + 1) - 0.2f);
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
        return new i(this, a, b);
    }
}

