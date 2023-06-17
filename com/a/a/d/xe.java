/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.d.abn;
import com.a.a.d.agk;
import com.a.a.d.cl;
import com.a.a.d.jl;
import com.a.a.d.ku;
import com.a.a.d.nj;
import com.a.a.d.xc;
import com.a.a.d.xd;
import com.a.a.d.xf;
import com.a.a.d.xh;
import com.a.a.d.xj;
import com.a.a.d.xl;
import com.a.a.d.xn;
import com.a.a.d.xs;
import com.a.a.d.xu;
import com.a.a.d.xv;
import com.a.a.d.xw;
import com.a.a.d.yd;
import com.a.a.l.q;
import java.util.Collection;
import java.util.Iterator;

public final class xe {
    private static final yd a = new xn();

    private xe() {
    }

    public static xc a(xc xc2) {
        if (xc2 instanceof xw || xc2 instanceof ku) {
            xc xc3 = xc2;
            return xc3;
        }
        return new xw((xc)com.a.a.b.cl.a(xc2));
    }

    public static xc a(ku ku2) {
        return (xc)com.a.a.b.cl.a(ku2);
    }

    public static abn a(abn abn2) {
        return new agk((abn)com.a.a.b.cl.a(abn2));
    }

    public static xd a(Object object, int n2) {
        return new xu(object, n2);
    }

    public static xc a(xc xc2, cm cm2) {
        if (xc2 instanceof xs) {
            xs xs2 = (xs)xc2;
            cm cm3 = cn.a(xs2.b, cm2);
            return new xs(xs2.a, cm3);
        }
        return new xs(xc2, cm2);
    }

    static int a(Iterable iterable) {
        if (iterable instanceof xc) {
            return ((xc)iterable).d().size();
        }
        return 11;
    }

    public static xc a(xc xc2, xc xc3) {
        com.a.a.b.cl.a(xc2);
        com.a.a.b.cl.a(xc3);
        return new xf(xc2, xc3);
    }

    public static xc b(xc xc2, xc xc3) {
        com.a.a.b.cl.a(xc2);
        com.a.a.b.cl.a(xc3);
        return new xh(xc2, xc3);
    }

    public static xc c(xc xc2, xc xc3) {
        com.a.a.b.cl.a(xc2);
        com.a.a.b.cl.a(xc3);
        return new xj(xc2, xc3);
    }

    public static xc d(xc xc2, xc xc3) {
        com.a.a.b.cl.a(xc2);
        com.a.a.b.cl.a(xc3);
        return new xl(xc2, xc3);
    }

    public static boolean e(xc xc2, xc xc3) {
        com.a.a.b.cl.a(xc2);
        com.a.a.b.cl.a(xc3);
        for (xd xd2 : xc3.aS_()) {
            int n2 = xc2.a(xd2.a());
            if (n2 >= xd2.b()) continue;
            return false;
        }
        return true;
    }

    public static boolean f(xc xc2, xc xc3) {
        return xe.h(xc2, xc3);
    }

    private static boolean h(xc xc2, xc xc3) {
        com.a.a.b.cl.a(xc2);
        com.a.a.b.cl.a(xc3);
        Iterator iterator = xc2.aS_().iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            xd xd2 = (xd)iterator.next();
            int n2 = xc3.a(xd2.a());
            if (n2 == 0) {
                iterator.remove();
                bl2 = true;
                continue;
            }
            if (n2 >= xd2.b()) continue;
            xc2.c(xd2.a(), n2);
            bl2 = true;
        }
        return bl2;
    }

    public static boolean g(xc xc2, xc xc3) {
        return xe.i(xc2, xc3);
    }

    private static boolean i(xc xc2, xc xc3) {
        com.a.a.b.cl.a(xc2);
        com.a.a.b.cl.a(xc3);
        boolean bl2 = false;
        Iterator iterator = xc2.aS_().iterator();
        while (iterator.hasNext()) {
            xd xd2 = (xd)iterator.next();
            int n2 = xc3.a(xd2.a());
            if (n2 >= xd2.b()) {
                iterator.remove();
                bl2 = true;
                continue;
            }
            if (n2 <= 0) continue;
            xc2.b(xd2.a(), n2);
            bl2 = true;
        }
        return bl2;
    }

    static boolean a(xc xc2, Object object) {
        if (object == xc2) {
            return true;
        }
        if (object instanceof xc) {
            xc xc3 = (xc)object;
            if (xc2.size() != xc3.size() || xc2.aS_().size() != xc3.aS_().size()) {
                return false;
            }
            for (xd xd2 : xc3.aS_()) {
                if (xc2.a(xd2.a()) == xd2.b()) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    static boolean a(xc xc2, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        if (collection instanceof xc) {
            xc xc3 = xe.b(collection);
            for (xd xd2 : xc3.aS_()) {
                xc2.a(xd2.a(), xd2.b());
            }
        } else {
            nj.a(xc2, collection.iterator());
        }
        return true;
    }

    static boolean b(xc xc2, Collection collection) {
        Collection collection2 = collection instanceof xc ? ((xc)collection).d() : collection;
        return xc2.d().removeAll(collection2);
    }

    static boolean c(xc xc2, Collection collection) {
        com.a.a.b.cl.a(collection);
        Collection collection2 = collection instanceof xc ? ((xc)collection).d() : collection;
        return xc2.d().retainAll(collection2);
    }

    static int a(xc xc2, Object object, int n2) {
        cl.a(n2, "count");
        int n3 = xc2.a(object);
        int n4 = n2 - n3;
        if (n4 > 0) {
            xc2.a(object, n4);
        } else if (n4 < 0) {
            xc2.b(object, -n4);
        }
        return n3;
    }

    static boolean a(xc xc2, Object object, int n2, int n3) {
        cl.a(n2, "oldCount");
        cl.a(n3, "newCount");
        if (xc2.a(object) == n2) {
            xc2.c(object, n3);
            return true;
        }
        return false;
    }

    static Iterator b(xc xc2) {
        return new xv(xc2, xc2.aS_().iterator());
    }

    static int c(xc xc2) {
        long l2 = 0L;
        for (xd xd2 : xc2.aS_()) {
            l2 += (long)xd2.b();
        }
        return q.b(l2);
    }

    static xc b(Iterable iterable) {
        return (xc)iterable;
    }

    public static ku d(xc xc2) {
        jl jl2 = a.b(xc2.aS_());
        return ku.a(jl2);
    }
}

