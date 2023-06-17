/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.e;
import net.minecraft.g.b.f;
import net.minecraft.g.c.b;
import net.minecraft.g.ca;
import net.minecraft.g.cn;
import net.minecraft.g.de;
import net.minecraft.g.i;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.q.t;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.u.b.o;
import net.minecraft.u.b.s;
import net.minecraft.u.bq;
import net.minecraft.u.c;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class bi
extends cn {
    public static final f a = de.j;
    public static final net.minecraft.g.b.e b = net.minecraft.g.b.e.a("half", ca.class);
    public static final net.minecraft.g.b.e c = net.minecraft.g.b.e.a("shape", i.class);
    protected static final a d = new a(0.0, 0.5, 0.0, 1.0, 1.0, 1.0);
    protected static final a e = new a(0.0, 0.5, 0.0, 0.5, 1.0, 1.0);
    protected static final a f = new a(0.5, 0.5, 0.0, 1.0, 1.0, 1.0);
    protected static final a g = new a(0.0, 0.5, 0.0, 1.0, 1.0, 0.5);
    protected static final a h = new a(0.0, 0.5, 0.5, 1.0, 1.0, 1.0);
    protected static final a i = new a(0.0, 0.5, 0.0, 0.5, 1.0, 0.5);
    protected static final a j = new a(0.5, 0.5, 0.0, 1.0, 1.0, 0.5);
    protected static final a k = new a(0.0, 0.5, 0.5, 0.5, 1.0, 1.0);
    protected static final a l = new a(0.5, 0.5, 0.5, 1.0, 1.0, 1.0);
    protected static final a m = new a(0.0, 0.0, 0.0, 1.0, 0.5, 1.0);
    protected static final a n = new a(0.0, 0.0, 0.0, 0.5, 0.5, 1.0);
    protected static final a o = new a(0.5, 0.0, 0.0, 1.0, 0.5, 1.0);
    protected static final a p = new a(0.0, 0.0, 0.0, 1.0, 0.5, 0.5);
    protected static final a q = new a(0.0, 0.0, 0.5, 1.0, 0.5, 1.0);
    protected static final a r = new a(0.0, 0.0, 0.0, 0.5, 0.5, 0.5);
    protected static final a s = new a(0.5, 0.0, 0.0, 1.0, 0.5, 0.5);
    protected static final a t = new a(0.0, 0.0, 0.5, 0.5, 0.5, 1.0);
    protected static final a u = new a(0.5, 0.0, 0.5, 1.0, 0.5, 1.0);
    private final cn P;
    private final b Q;
    private static /* synthetic */ int[] R;
    private static /* synthetic */ int[] S;

    protected bi(b b2) {
        super(b2.c().L);
        this.z(this.O.b().a(a, (Comparable)((Object)ad.c)).a(b, (Comparable)((Object)ca.b)).a(c, (Comparable)((Object)net.minecraft.g.i.a)));
        this.P = b2.c();
        this.Q = b2;
        this.c(this.P.E);
        this.b(this.P.F / 3.0f);
        this.a(this.P.J);
        this.f(255);
        this.a(net.minecraft.v.d.b);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, a a2, List list, net.minecraft.w.n n2) {
        b2 = this.b(b2, (n)k2, b3);
        for (a a3 : bi.m(b2)) {
            bi.a(b3, a2, list, a3);
        }
    }

    private static List m(b b2) {
        ArrayList arrayList = ov.a();
        boolean bl2 = b2.a(b) == ca.a;
        arrayList.add(bl2 ? d : m);
        i i2 = (i)((Object)b2.a(c));
        if (i2 == net.minecraft.g.i.a || i2 == net.minecraft.g.i.b || i2 == net.minecraft.g.i.c) {
            arrayList.add(bi.n(b2));
        }
        if (i2 != net.minecraft.g.i.a) {
            arrayList.add(bi.o(b2));
        }
        return arrayList;
    }

    private static a n(b b2) {
        boolean bl2 = b2.a(b) == ca.a;
        switch (bi.g()[((ad)((Object)b2.a(a))).ordinal()]) {
            default: {
                return bl2 ? p : g;
            }
            case 4: {
                return bl2 ? q : h;
            }
            case 5: {
                return bl2 ? n : e;
            }
            case 6: 
        }
        return bl2 ? o : f;
    }

    private static a o(b b2) {
        ad ad2;
        ad ad3 = (ad)((Object)b2.a(a));
        switch (bi.h()[((i)((Object)b2.a(c))).ordinal()]) {
            default: {
                ad2 = ad3;
                break;
            }
            case 5: {
                ad2 = ad3.f();
                break;
            }
            case 3: {
                ad2 = ad3.e();
                break;
            }
            case 2: {
                ad2 = ad3.g();
            }
        }
        boolean bl2 = b2.a(b) == ca.a;
        switch (bi.g()[ad2.ordinal()]) {
            default: {
                return bl2 ? r : i;
            }
            case 4: {
                return bl2 ? u : l;
            }
            case 5: {
                return bl2 ? t : k;
            }
            case 6: 
        }
        return bl2 ? s : j;
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        this.P.a(b2, k2, b3, random);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.w.a.b b3) {
        this.P.a(k2, b2, b3);
    }

    @Override
    public void a_(k k2, net.minecraft.u.b.b b2, b b3) {
        this.P.a_(k2, b2, b3);
    }

    @Override
    public int c(b b2, n n2, net.minecraft.u.b.b b3) {
        return this.Q.a(n2, b3);
    }

    @Override
    public float a(net.minecraft.w.n n2) {
        return this.P.a(n2);
    }

    @Override
    public c bR_() {
        return this.P.bR_();
    }

    @Override
    public int a(k k2) {
        return this.P.a(k2);
    }

    @Override
    public a c(b b2, k k2, net.minecraft.u.b.b b3) {
        return this.Q.c(k2, b3);
    }

    @Override
    public s a(k k2, net.minecraft.u.b.b b2, net.minecraft.w.n n2, s s2) {
        return this.P.a(k2, b2, n2, s2);
    }

    @Override
    public boolean bU_() {
        return this.P.bU_();
    }

    @Override
    public boolean a(b b2, boolean bl2) {
        return this.P.a(b2, bl2);
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return this.P.a_(k2, b2);
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        this.Q.a(k2, b2, net.minecraft.a.p.a);
        this.P.b(k2, b2, this.Q);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        this.P.a(k2, b2, this.Q);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.w.n n2) {
        this.P.a(k2, b2, n2);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        this.P.a(k2, b2, b3, random);
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        return this.P.a(k2, b2, this.Q, b4, ah2, cu2, ad.a, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, t t2) {
        this.P.a(k2, b2, t2);
    }

    @Override
    public boolean h(b b2) {
        return b2.a(b) == ca.a;
    }

    @Override
    public e g(b b2) {
        return this.P.g(this.Q);
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        b b3 = super.a(k2, b2, ad2, f2, f3, f4, n2, l2);
        b3 = b3.a(a, (Comparable)((Object)l2.cl_())).a(c, (Comparable)((Object)net.minecraft.g.i.a));
        return ad2 != ad.a && (ad2 == ad.b || (double)f3 <= 0.5) ? b3.a(b, (Comparable)((Object)ca.b)) : b3.a(b, (Comparable)((Object)ca.a));
    }

    @Override
    public o a(b b2, k k2, net.minecraft.u.b.b b3, s s2, s s3) {
        Object object2;
        ArrayList arrayList = ov.a();
        for (Object object2 : bi.m(this.b(b2, (n)k2, b3))) {
            arrayList.add(this.a(b3, s2, s3, (a)object2));
        }
        object2 = null;
        double d2 = 0.0;
        for (o o2 : arrayList) {
            double d3;
            if (o2 == null || !((d3 = o2.c.g(s3)) > d2)) continue;
            object2 = o2;
            d2 = d3;
        }
        return object2;
    }

    @Override
    public b a(int n2) {
        b b2 = this.v().a(b, (Comparable)((Object)((n2 & 4) > 0 ? ca.a : ca.b)));
        b2 = b2.a(a, (Comparable)((Object)ad.a(5 - (n2 & 3))));
        return b2;
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        if (b2.a(b) == ca.a) {
            n2 |= 4;
        }
        return n2 |= 5 - ((ad)((Object)b2.a(a))).b();
    }

    @Override
    public b b(b b2, n n2, net.minecraft.u.b.b b3) {
        return b2.a(c, (Comparable)((Object)bi.d(b2, n2, b3)));
    }

    private static i d(b b2, n n2, net.minecraft.u.b.b b3) {
        ad ad2;
        Object object;
        ad ad3 = (ad)((Object)b2.a(a));
        b b4 = n2.n(b3.a(ad3));
        if (bi.l(b4) && b2.a(b) == b4.a(b) && ((ad)(object = (ad)((Object)b4.a(a)))).l() != ((ad)((Object)b2.a(a))).l() && bi.d(b2, n2, b3, ((ad)object).e())) {
            if (object == ad3.g()) {
                return net.minecraft.g.i.d;
            }
            return net.minecraft.g.i.e;
        }
        object = n2.n(b3.a(ad3.e()));
        if (bi.l((b)object) && b2.a(b) == object.a(b) && (ad2 = (ad)((Object)object.a(a))).l() != ((ad)((Object)b2.a(a))).l() && bi.d(b2, n2, b3, ad2)) {
            if (ad2 == ad3.g()) {
                return net.minecraft.g.i.b;
            }
            return net.minecraft.g.i.c;
        }
        return net.minecraft.g.i.a;
    }

    private static boolean d(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        b b4 = n2.n(b3.a(ad2));
        return !bi.l(b4) || b4.a(a) != b2.a(a) || b4.a(b) != b2.a(b);
    }

    public static boolean l(b b2) {
        return b2.c() instanceof bi;
    }

    @Override
    public b a(b b2, bq bq2) {
        return b2.a(a, (Comparable)((Object)bq2.a((ad)((Object)b2.a(a)))));
    }

    @Override
    public b a(b b2, net.minecraft.u.bi bi2) {
        ad ad2 = (ad)((Object)b2.a(a));
        i i2 = (i)((Object)b2.a(c));
        switch (bi2) {
            case b: {
                if (ad2.l() != ae.c) break;
                switch (bi.h()[i2.ordinal()]) {
                    case 4: {
                        return b2.a(bq.c).a(c, (Comparable)((Object)net.minecraft.g.i.e));
                    }
                    case 5: {
                        return b2.a(bq.c).a(c, (Comparable)((Object)net.minecraft.g.i.d));
                    }
                    case 3: {
                        return b2.a(bq.c).a(c, (Comparable)((Object)net.minecraft.g.i.b));
                    }
                    case 2: {
                        return b2.a(bq.c).a(c, (Comparable)((Object)net.minecraft.g.i.c));
                    }
                }
                return b2.a(bq.c);
            }
            case c: {
                if (ad2.l() != ae.a) break;
                switch (bi.h()[i2.ordinal()]) {
                    case 4: {
                        return b2.a(bq.c).a(c, (Comparable)((Object)net.minecraft.g.i.e));
                    }
                    case 5: {
                        return b2.a(bq.c).a(c, (Comparable)((Object)net.minecraft.g.i.d));
                    }
                    case 3: {
                        return b2.a(bq.c).a(c, (Comparable)((Object)net.minecraft.g.i.c));
                    }
                    case 2: {
                        return b2.a(bq.c).a(c, (Comparable)((Object)net.minecraft.g.i.b));
                    }
                    case 1: {
                        return b2.a(bq.c);
                    }
                }
            }
        }
        return super.a(b2, bi2);
    }

    @Override
    protected net.minecraft.g.c.i a() {
        return new net.minecraft.g.c.i(this, a, b, c);
    }

    static /* synthetic */ int[] g() {
        if (R != null) {
            return R;
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
        R = arrn;
        return arrn;
    }

    static /* synthetic */ int[] h() {
        if (S != null) {
            return S;
        }
        int[] arrn = new int[net.minecraft.g.i.values().length];
        try {
            arrn[net.minecraft.g.i.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.g.i.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.g.i.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.g.i.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.g.i.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        S = arrn;
        return arrn;
    }
}

