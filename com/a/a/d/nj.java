/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cc;
import com.a.a.b.cg;
import com.a.a.b.cl;
import com.a.a.b.cn;
import com.a.a.d.agi;
import com.a.a.d.agj;
import com.a.a.d.cm;
import com.a.a.d.jl;
import com.a.a.d.mq;
import com.a.a.d.nk;
import com.a.a.d.nl;
import com.a.a.d.nm;
import com.a.a.d.nn;
import com.a.a.d.no;
import com.a.a.d.np;
import com.a.a.d.nq;
import com.a.a.d.nr;
import com.a.a.d.ns;
import com.a.a.d.nt;
import com.a.a.d.nu;
import com.a.a.d.nv;
import com.a.a.d.nw;
import com.a.a.d.nx;
import com.a.a.d.ny;
import com.a.a.d.oa;
import com.a.a.d.ov;
import com.a.a.d.yi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public final class nj {
    static final agj a = new nk();
    private static final Iterator b = new nq();

    private nj() {
    }

    public static agi a() {
        return nj.b();
    }

    static agj b() {
        return a;
    }

    static Iterator c() {
        return b;
    }

    public static agi a(Iterator iterator) {
        cl.a(iterator);
        if (iterator instanceof agi) {
            return (agi)iterator;
        }
        return new nr(iterator);
    }

    public static agi a(agi agi2) {
        return (agi)cl.a(agi2);
    }

    public static int b(Iterator iterator) {
        int n2 = 0;
        while (iterator.hasNext()) {
            iterator.next();
            ++n2;
        }
        return n2;
    }

    public static boolean a(Iterator iterator, Object object) {
        return nj.c(iterator, cn.a(object));
    }

    public static boolean a(Iterator iterator, Collection collection) {
        return nj.a(iterator, cn.a(collection));
    }

    public static boolean a(Iterator iterator, com.a.a.b.cm cm2) {
        cl.a(cm2);
        boolean bl2 = false;
        while (iterator.hasNext()) {
            if (!cm2.a(iterator.next())) continue;
            iterator.remove();
            bl2 = true;
        }
        return bl2;
    }

    public static boolean b(Iterator iterator, Collection collection) {
        return nj.a(iterator, cn.a(cn.a(collection)));
    }

    public static boolean a(Iterator iterator, Iterator iterator2) {
        while (iterator.hasNext()) {
            Object e2;
            if (!iterator2.hasNext()) {
                return false;
            }
            Object e3 = iterator.next();
            if (cc.a(e3, e2 = iterator2.next())) continue;
            return false;
        }
        return !iterator2.hasNext();
    }

    public static String c(Iterator iterator) {
        return cm.a.a(new StringBuilder().append('['), iterator).append(']').toString();
    }

    public static Object d(Iterator iterator) {
        Object e2 = iterator.next();
        if (!iterator.hasNext()) {
            return e2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expected one element but was: <" + e2);
        for (int i2 = 0; i2 < 4 && iterator.hasNext(); ++i2) {
            stringBuilder.append(", " + iterator.next());
        }
        if (iterator.hasNext()) {
            stringBuilder.append(", ...");
        }
        stringBuilder.append('>');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static Object b(Iterator iterator, Object object) {
        return iterator.hasNext() ? nj.d(iterator) : object;
    }

    public static Object[] a(Iterator iterator, Class class_) {
        ArrayList arrayList = ov.a(iterator);
        return mq.a((Iterable)arrayList, class_);
    }

    public static boolean a(Collection collection, Iterator iterator) {
        cl.a(collection);
        cl.a(iterator);
        boolean bl2 = false;
        while (iterator.hasNext()) {
            bl2 |= collection.add(iterator.next());
        }
        return bl2;
    }

    public static int c(Iterator iterator, Object object) {
        return nj.b(nj.b(iterator, cn.a(object)));
    }

    public static Iterator a(Iterable iterable) {
        cl.a(iterable);
        return new ns(iterable);
    }

    public static Iterator a(Object ... arrobject) {
        return nj.a(ov.a(arrobject));
    }

    public static Iterator b(Iterator iterator, Iterator iterator2) {
        return nj.e(jl.a(iterator, iterator2).aO_());
    }

    public static Iterator a(Iterator iterator, Iterator iterator2, Iterator iterator3) {
        return nj.e(jl.a(iterator, iterator2, iterator3).aO_());
    }

    public static Iterator a(Iterator iterator, Iterator iterator2, Iterator iterator3, Iterator iterator4) {
        return nj.e(jl.a(iterator, iterator2, iterator3, iterator4).aO_());
    }

    public static Iterator a(Iterator ... arriterator) {
        return nj.e(jl.a(arriterator).aO_());
    }

    public static Iterator e(Iterator iterator) {
        cl.a(iterator);
        return new nt(iterator);
    }

    public static agi a(Iterator iterator, int n2) {
        return nj.a(iterator, n2, false);
    }

    public static agi b(Iterator iterator, int n2) {
        return nj.a(iterator, n2, true);
    }

    private static agi a(Iterator iterator, int n2, boolean bl2) {
        cl.a(iterator);
        cl.a(n2 > 0);
        return new nu(iterator, n2, bl2);
    }

    public static agi b(Iterator iterator, com.a.a.b.cm cm2) {
        cl.a(iterator);
        cl.a(cm2);
        return new nv(iterator, cm2);
    }

    public static agi b(Iterator iterator, Class class_) {
        return nj.b(iterator, cn.a(class_));
    }

    public static boolean c(Iterator iterator, com.a.a.b.cm cm2) {
        return nj.g(iterator, cm2) != -1;
    }

    public static boolean d(Iterator iterator, com.a.a.b.cm cm2) {
        cl.a(cm2);
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            if (cm2.a(e2)) continue;
            return false;
        }
        return true;
    }

    public static Object e(Iterator iterator, com.a.a.b.cm cm2) {
        return nj.b(iterator, cm2).next();
    }

    public static Object a(Iterator iterator, com.a.a.b.cm cm2, Object object) {
        return nj.d((Iterator)nj.b(iterator, cm2), object);
    }

    public static cg f(Iterator iterator, com.a.a.b.cm cm2) {
        agi agi2 = nj.b(iterator, cm2);
        return agi2.hasNext() ? cg.b(agi2.next()) : cg.f();
    }

    public static int g(Iterator iterator, com.a.a.b.cm cm2) {
        cl.a(cm2, (Object)"predicate");
        int n2 = 0;
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            if (cm2.a(e2)) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public static Iterator a(Iterator iterator, bl bl2) {
        cl.a(bl2);
        return new nw(iterator, bl2);
    }

    public static Object c(Iterator iterator, int n2) {
        nj.a(n2);
        int n3 = nj.d(iterator, n2);
        if (!iterator.hasNext()) {
            throw new IndexOutOfBoundsException("position (" + n2 + ") must be less than the number of elements that remained (" + n3 + ")");
        }
        return iterator.next();
    }

    static void a(int n2) {
        if (n2 < 0) {
            throw new IndexOutOfBoundsException("position (" + n2 + ") must not be negative");
        }
    }

    public static Object a(Iterator iterator, int n2, Object object) {
        nj.a(n2);
        nj.d(iterator, n2);
        return nj.d(iterator, object);
    }

    public static Object d(Iterator iterator, Object object) {
        return iterator.hasNext() ? iterator.next() : object;
    }

    public static Object f(Iterator iterator) {
        Object e2;
        do {
            e2 = iterator.next();
        } while (iterator.hasNext());
        return e2;
    }

    public static Object e(Iterator iterator, Object object) {
        return iterator.hasNext() ? nj.f(iterator) : object;
    }

    public static int d(Iterator iterator, int n2) {
        int n3;
        cl.a(iterator);
        cl.a(n2 >= 0, (Object)"numberToAdvance must be nonnegative");
        for (n3 = 0; n3 < n2 && iterator.hasNext(); ++n3) {
            iterator.next();
        }
        return n3;
    }

    public static Iterator e(Iterator iterator, int n2) {
        cl.a(iterator);
        cl.a(n2 >= 0, (Object)"limit is negative");
        return new nx(n2, iterator);
    }

    public static Iterator g(Iterator iterator) {
        cl.a(iterator);
        return new nl(iterator);
    }

    static Object h(Iterator iterator) {
        if (iterator.hasNext()) {
            Object e2 = iterator.next();
            iterator.remove();
            return e2;
        }
        return null;
    }

    static void i(Iterator iterator) {
        cl.a(iterator);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static agi b(Object ... arrobject) {
        return nj.a(arrobject, 0, arrobject.length, 0);
    }

    static agj a(Object[] arrobject, int n2, int n3, int n4) {
        cl.a(n3 >= 0);
        int n5 = n2 + n3;
        cl.a(n2, n5, arrobject.length);
        cl.b(n4, n3);
        if (n3 == 0) {
            return nj.b();
        }
        return new nm(n3, n4, arrobject, n2);
    }

    public static agi a(Object object) {
        return new nn(object);
    }

    public static agi a(Enumeration enumeration) {
        cl.a(enumeration);
        return new no(enumeration);
    }

    public static Enumeration j(Iterator iterator) {
        cl.a(iterator);
        return new np(iterator);
    }

    public static yi k(Iterator iterator) {
        if (iterator instanceof oa) {
            oa oa2 = (oa)iterator;
            return oa2;
        }
        return new oa(iterator);
    }

    public static yi a(yi yi2) {
        return (yi)cl.a(yi2);
    }

    public static agi a(Iterable iterable, Comparator comparator) {
        cl.a(iterable, (Object)"iterators");
        cl.a(comparator, (Object)"comparator");
        return new ny(iterable, comparator);
    }

    static ListIterator l(Iterator iterator) {
        return (ListIterator)iterator;
    }
}

