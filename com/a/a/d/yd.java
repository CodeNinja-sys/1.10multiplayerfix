/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.d.agl;
import com.a.a.d.bj;
import com.a.a.d.ch;
import com.a.a.d.cl;
import com.a.a.d.cu;
import com.a.a.d.cy;
import com.a.a.d.fh;
import com.a.a.d.jl;
import com.a.a.d.mq;
import com.a.a.d.ob;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.d.xz;
import com.a.a.d.ya;
import com.a.a.d.yb;
import com.a.a.d.yc;
import com.a.a.d.yg;
import com.a.a.d.zx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public abstract class yd
implements Comparator {
    static final int c = 1;
    static final int d = -1;

    public static yd d() {
        return xz.a;
    }

    public static yd a(Comparator comparator) {
        return comparator instanceof yd ? (yd)comparator : new cu(comparator);
    }

    public static yd a(yd yd2) {
        return (yd)com.a.a.b.cl.a(yd2);
    }

    public static yd a(List list) {
        return new fh(list);
    }

    public static yd a(Object object, Object ... arrobject) {
        return yd.a(ov.a(object, arrobject));
    }

    public static yd e() {
        return bj.a;
    }

    public static yd f() {
        return agl.a;
    }

    public static yd g() {
        return yg.a;
    }

    protected yd() {
    }

    public yd a() {
        return new zx(this);
    }

    public yd b() {
        return new ya(this);
    }

    public yd c() {
        return new yb(this);
    }

    public yd a(bl bl2) {
        return new ch(bl2, this);
    }

    yd h() {
        return this.a(sz.a());
    }

    public yd b(Comparator comparator) {
        return new cy(this, (Comparator)com.a.a.b.cl.a(comparator));
    }

    public static yd c(Iterable iterable) {
        return new cy(iterable);
    }

    public yd i() {
        return new ob(this);
    }

    public abstract int compare(Object var1, Object var2);

    public Object a(Iterator iterator) {
        Object object = iterator.next();
        while (iterator.hasNext()) {
            object = this.a(object, iterator.next());
        }
        return object;
    }

    public Object d(Iterable iterable) {
        return this.a(iterable.iterator());
    }

    public Object a(Object object, Object object2) {
        return this.compare(object, object2) <= 0 ? object : object2;
    }

    public Object a(Object object, Object object2, Object object3, Object ... arrobject) {
        Object object4 = this.a(this.a(object, object2), object3);
        for (Object object5 : arrobject) {
            object4 = this.a(object4, object5);
        }
        return object4;
    }

    public Object b(Iterator iterator) {
        Object object = iterator.next();
        while (iterator.hasNext()) {
            object = this.b(object, iterator.next());
        }
        return object;
    }

    public Object e(Iterable iterable) {
        return this.b(iterable.iterator());
    }

    public Object b(Object object, Object object2) {
        return this.compare(object, object2) >= 0 ? object : object2;
    }

    public Object b(Object object, Object object2, Object object3, Object ... arrobject) {
        Object object4 = this.b(this.b(object, object2), object3);
        for (Object object5 : arrobject) {
            object4 = this.b(object4, object5);
        }
        return object4;
    }

    public List a(Iterable iterable, int n2) {
        Collection collection;
        if (iterable instanceof Collection && (long)(collection = (Collection)iterable).size() <= 2L * (long)n2) {
            Object[] arrobject = collection.toArray();
            Arrays.sort(arrobject, this);
            if (arrobject.length > n2) {
                arrobject = yc.b(arrobject, n2);
            }
            return Collections.unmodifiableList(Arrays.asList(arrobject));
        }
        return this.a(iterable.iterator(), n2);
    }

    public List a(Iterator iterator, int n2) {
        Object e2;
        com.a.a.b.cl.a(iterator);
        cl.a(n2, "k");
        if (n2 == 0 || !iterator.hasNext()) {
            return jl.d();
        }
        if (n2 >= 0x3FFFFFFF) {
            ArrayList arrayList = ov.a(iterator);
            Collections.sort(arrayList, this);
            if (arrayList.size() > n2) {
                arrayList.subList(n2, arrayList.size()).clear();
            }
            arrayList.trimToSize();
            return Collections.unmodifiableList(arrayList);
        }
        int n3 = n2 * 2;
        Object[] arrobject = new Object[n3];
        Object object = iterator.next();
        arrobject[0] = object;
        int n4 = 1;
        while (n4 < n2 && iterator.hasNext()) {
            e2 = iterator.next();
            arrobject[n4++] = e2;
            object = this.b(object, e2);
        }
        while (iterator.hasNext()) {
            int n5;
            e2 = iterator.next();
            if (this.compare(e2, object) >= 0) continue;
            arrobject[n4++] = e2;
            if (n4 != n3) continue;
            int n6 = 0;
            int n7 = n3 - 1;
            int n8 = 0;
            while (n6 < n7) {
                n5 = n6 + n7 + 1 >>> 1;
                int n9 = this.a(arrobject, n6, n7, n5);
                if (n9 > n2) {
                    n7 = n9 - 1;
                    continue;
                }
                if (n9 >= n2) break;
                n6 = Math.max(n9, n6 + 1);
                n8 = n9;
            }
            n4 = n2;
            object = arrobject[n8];
            for (n5 = n8 + 1; n5 < n4; ++n5) {
                object = this.b(object, arrobject[n5]);
            }
        }
        Arrays.sort(arrobject, 0, n4, this);
        n4 = Math.min(n4, n2);
        return Collections.unmodifiableList(Arrays.asList(yc.b(arrobject, n4)));
    }

    private int a(Object[] arrobject, int n2, int n3, int n4) {
        Object object = arrobject[n4];
        arrobject[n4] = arrobject[n3];
        arrobject[n3] = object;
        int n5 = n2;
        for (int i2 = n2; i2 < n3; ++i2) {
            if (this.compare(arrobject[i2], object) >= 0) continue;
            yc.b(arrobject, n5, i2);
            ++n5;
        }
        yc.b(arrobject, n3, n5);
        return n5;
    }

    public List b(Iterable iterable, int n2) {
        return this.a().a(iterable, n2);
    }

    public List b(Iterator iterator, int n2) {
        return this.a().a(iterator, n2);
    }

    public List a(Iterable iterable) {
        Object[] arrobject = mq.e(iterable);
        Arrays.sort(arrobject, this);
        return ov.a(Arrays.asList(arrobject));
    }

    public jl b(Iterable iterable) {
        Object[] arrobject;
        for (Object object : arrobject = mq.e(iterable)) {
            com.a.a.b.cl.a(object);
        }
        Arrays.sort(arrobject, this);
        return jl.b(arrobject);
    }

    public boolean f(Iterable iterable) {
        Iterator iterator = iterable.iterator();
        if (iterator.hasNext()) {
            Object t2 = iterator.next();
            while (iterator.hasNext()) {
                Object t3 = iterator.next();
                if (this.compare(t2, t3) > 0) {
                    return false;
                }
                t2 = t3;
            }
        }
        return true;
    }

    public boolean g(Iterable iterable) {
        Iterator iterator = iterable.iterator();
        if (iterator.hasNext()) {
            Object t2 = iterator.next();
            while (iterator.hasNext()) {
                Object t3 = iterator.next();
                if (this.compare(t2, t3) >= 0) {
                    return false;
                }
                t2 = t3;
            }
        }
        return true;
    }

    public int a(List list, Object object) {
        return Collections.binarySearch(list, object, this);
    }
}

