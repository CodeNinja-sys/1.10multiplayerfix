/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.b.dx;
import com.a.a.d.aac;
import com.a.a.d.abs;
import com.a.a.d.acu;
import com.a.a.d.fi;
import com.a.a.d.fs;
import com.a.a.d.ft;
import com.a.a.d.fu;
import com.a.a.d.fy;
import com.a.a.d.ga;
import com.a.a.d.gc;
import com.a.a.d.jr;
import com.a.a.d.js;
import com.a.a.d.kk;
import com.a.a.d.lr;
import com.a.a.d.ou;
import com.a.a.d.sz;
import com.a.a.d.tv;
import com.a.a.d.uw;
import com.a.a.d.vi;
import com.a.a.d.wi;
import com.a.a.d.wj;
import com.a.a.d.wk;
import com.a.a.d.wl;
import com.a.a.d.wr;
import com.a.a.d.wu;
import com.a.a.d.wv;
import com.a.a.d.wx;
import com.a.a.d.wy;
import com.a.a.d.xa;
import com.a.a.d.xb;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

public final class we {
    private we() {
    }

    public static vi a(Map map, dx dx2) {
        return new wj(map, dx2);
    }

    public static ou b(Map map, dx dx2) {
        return new wi(map, dx2);
    }

    public static aac c(Map map, dx dx2) {
        return new wk(map, dx2);
    }

    public static abs d(Map map, dx dx2) {
        return new wl(map, dx2);
    }

    public static vi a(vi vi2, vi vi3) {
        cl.a(vi3);
        for (Map.Entry entry : vi2.l()) {
            vi3.a(entry.getValue(), entry.getKey());
        }
        return vi3;
    }

    public static vi a(vi vi2) {
        return acu.a(vi2, null);
    }

    public static vi b(vi vi2) {
        if (vi2 instanceof wy || vi2 instanceof kk) {
            return vi2;
        }
        return new wy(vi2);
    }

    public static vi a(kk kk2) {
        return (vi)cl.a(kk2);
    }

    public static aac a(aac aac2) {
        return acu.a(aac2, null);
    }

    public static aac b(aac aac2) {
        if (aac2 instanceof xa || aac2 instanceof lr) {
            return aac2;
        }
        return new xa(aac2);
    }

    public static aac a(lr lr2) {
        return (aac)cl.a(lr2);
    }

    public static abs a(abs abs2) {
        return acu.a(abs2, null);
    }

    public static abs b(abs abs2) {
        if (abs2 instanceof xb) {
            return abs2;
        }
        return new xb(abs2);
    }

    public static ou a(ou ou2) {
        return acu.a(ou2, null);
    }

    public static ou b(ou ou2) {
        if (ou2 instanceof wx || ou2 instanceof jr) {
            return ou2;
        }
        return new wx(ou2);
    }

    public static ou a(jr jr2) {
        return (ou)cl.a(jr2);
    }

    private static Collection c(Collection collection) {
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet)collection);
        }
        if (collection instanceof Set) {
            return Collections.unmodifiableSet((Set)collection);
        }
        if (collection instanceof List) {
            return Collections.unmodifiableList((List)collection);
        }
        return Collections.unmodifiableCollection(collection);
    }

    private static Collection d(Collection collection) {
        if (collection instanceof Set) {
            return sz.a((Set)collection);
        }
        return new uw(Collections.unmodifiableCollection(collection));
    }

    public static Map c(ou ou2) {
        return ou2.c();
    }

    public static Map c(aac aac2) {
        return aac2.c();
    }

    public static Map c(abs abs2) {
        return abs2.c();
    }

    public static Map c(vi vi2) {
        return vi2.c();
    }

    public static aac a(Map map) {
        return new wr(map);
    }

    public static vi a(vi vi2, bl bl2) {
        cl.a(bl2);
        tv tv2 = sz.a(bl2);
        return we.a(vi2, tv2);
    }

    public static vi a(vi vi2, tv tv2) {
        return new wv(vi2, tv2);
    }

    public static ou a(ou ou2, bl bl2) {
        cl.a(bl2);
        tv tv2 = sz.a(bl2);
        return we.a(ou2, tv2);
    }

    public static ou a(ou ou2, tv tv2) {
        return new wu(ou2, tv2);
    }

    public static jr a(Iterable iterable, bl bl2) {
        return we.a(iterable.iterator(), bl2);
    }

    public static jr a(Iterator iterator, bl bl2) {
        cl.a(bl2);
        js js2 = jr.b();
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            cl.a(e2, (Object)iterator);
            js2.a(bl2.a(e2), e2);
        }
        return js2.a();
    }

    public static vi a(vi vi2, cm cm2) {
        if (vi2 instanceof aac) {
            return we.a((aac)vi2, cm2);
        }
        if (vi2 instanceof ou) {
            return we.a((ou)vi2, cm2);
        }
        if (vi2 instanceof fu) {
            fu fu2 = (fu)vi2;
            return new fu(fu2.a, cn.a(fu2.b, cm2));
        }
        if (vi2 instanceof ga) {
            ga ga2 = (ga)vi2;
            return we.a(ga2, sz.a(cm2));
        }
        return new fu(vi2, cm2);
    }

    public static aac a(aac aac2, cm cm2) {
        if (aac2 instanceof fy) {
            fy fy2 = (fy)aac2;
            return new fy(fy2.e(), cn.a(fy2.b, cm2));
        }
        if (aac2 instanceof gc) {
            gc gc2 = (gc)aac2;
            return we.a(gc2, sz.a(cm2));
        }
        return new fy(aac2, cm2);
    }

    public static ou a(ou ou2, cm cm2) {
        if (ou2 instanceof ft) {
            ft ft2 = (ft)ou2;
            return new ft(ft2.d(), cn.a(ft2.b, cm2));
        }
        return new ft(ou2, cm2);
    }

    public static vi b(vi vi2, cm cm2) {
        return we.c(vi2, sz.b(cm2));
    }

    public static aac b(aac aac2, cm cm2) {
        return we.c(aac2, sz.b(cm2));
    }

    public static vi c(vi vi2, cm cm2) {
        cl.a(cm2);
        if (vi2 instanceof aac) {
            return we.c((aac)vi2, cm2);
        }
        return vi2 instanceof ga ? we.a((ga)vi2, cm2) : new fi((vi)cl.a(vi2), cm2);
    }

    public static aac c(aac aac2, cm cm2) {
        cl.a(cm2);
        return aac2 instanceof gc ? we.a((gc)aac2, cm2) : new fs((aac)cl.a(aac2), cm2);
    }

    private static vi a(ga ga2, cm cm2) {
        cm cm3 = cn.a(ga2.b(), cm2);
        return new fi(ga2.a(), cm3);
    }

    private static aac a(gc gc2, cm cm2) {
        cm cm3 = cn.a(gc2.b(), cm2);
        return new fs(gc2.e(), cm3);
    }

    static boolean a(vi vi2, Object object) {
        if (object == vi2) {
            return true;
        }
        if (object instanceof vi) {
            vi vi3 = (vi)object;
            return vi2.c().equals(vi3.c());
        }
        return false;
    }

    static /* synthetic */ Collection a(Collection collection) {
        return we.c(collection);
    }

    static /* synthetic */ Collection b(Collection collection) {
        return we.d(collection);
    }
}

