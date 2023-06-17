/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cg;
import com.a.a.b.cl;
import com.a.a.d.cm;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.mr;
import com.a.a.d.ms;
import com.a.a.d.mu;
import com.a.a.d.mv;
import com.a.a.d.mw;
import com.a.a.d.mx;
import com.a.a.d.my;
import com.a.a.d.mz;
import com.a.a.d.na;
import com.a.a.d.nb;
import com.a.a.d.nc;
import com.a.a.d.nd;
import com.a.a.d.ne;
import com.a.a.d.nf;
import com.a.a.d.ng;
import com.a.a.d.ni;
import com.a.a.d.nj;
import com.a.a.d.ov;
import com.a.a.d.xc;
import com.a.a.d.yc;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;

public final class mq {
    private mq() {
    }

    public static Iterable a(Iterable iterable) {
        cl.a(iterable);
        if (iterable instanceof ni || iterable instanceof iz) {
            return iterable;
        }
        return new ni(iterable, null);
    }

    public static Iterable a(iz iz2) {
        return (Iterable)cl.a(iz2);
    }

    public static int b(Iterable iterable) {
        return iterable instanceof Collection ? ((Collection)iterable).size() : nj.b(iterable.iterator());
    }

    public static boolean a(Iterable iterable, Object object) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection)iterable;
            return cm.a(collection, object);
        }
        return nj.a(iterable.iterator(), object);
    }

    public static boolean a(Iterable iterable, Collection collection) {
        return iterable instanceof Collection ? ((Collection)iterable).removeAll((Collection)cl.a(collection)) : nj.a(iterable.iterator(), collection);
    }

    public static boolean b(Iterable iterable, Collection collection) {
        return iterable instanceof Collection ? ((Collection)iterable).retainAll((Collection)cl.a(collection)) : nj.b(iterable.iterator(), collection);
    }

    public static boolean a(Iterable iterable, com.a.a.b.cm cm2) {
        if (iterable instanceof RandomAccess && iterable instanceof List) {
            return mq.a((List)iterable, (com.a.a.b.cm)cl.a(cm2));
        }
        return nj.a(iterable.iterator(), cm2);
    }

    private static boolean a(List list, com.a.a.b.cm cm2) {
        int n2;
        int n3 = 0;
        for (n2 = 0; n2 < list.size(); ++n2) {
            Object e2 = list.get(n2);
            if (cm2.a(e2)) continue;
            if (n2 > n3) {
                try {
                    list.set(n3, e2);
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    mq.a(list, cm2, n3, n2);
                    return true;
                }
            }
            ++n3;
        }
        list.subList(n3, list.size()).clear();
        return n2 != n3;
    }

    private static void a(List list, com.a.a.b.cm cm2, int n2, int n3) {
        int n4;
        for (n4 = list.size() - 1; n4 > n3; --n4) {
            if (!cm2.a(list.get(n4))) continue;
            list.remove(n4);
        }
        for (n4 = n3 - 1; n4 >= n2; --n4) {
            list.remove(n4);
        }
    }

    static Object b(Iterable iterable, com.a.a.b.cm cm2) {
        cl.a(cm2);
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            if (!cm2.a(t2)) continue;
            iterator.remove();
            return t2;
        }
        return null;
    }

    public static boolean a(Iterable iterable, Iterable iterable2) {
        if (iterable instanceof Collection && iterable2 instanceof Collection) {
            Collection collection = (Collection)iterable;
            Collection collection2 = (Collection)iterable2;
            if (collection.size() != collection2.size()) {
                return false;
            }
        }
        return nj.a(iterable.iterator(), iterable2.iterator());
    }

    public static String c(Iterable iterable) {
        return nj.c(iterable.iterator());
    }

    public static Object d(Iterable iterable) {
        return nj.d(iterable.iterator());
    }

    public static Object b(Iterable iterable, Object object) {
        return nj.b(iterable.iterator(), object);
    }

    public static Object[] a(Iterable iterable, Class class_) {
        Collection collection = mq.l(iterable);
        Object[] arrobject = yc.a(class_, collection.size());
        return collection.toArray(arrobject);
    }

    static Object[] e(Iterable iterable) {
        return mq.l(iterable).toArray();
    }

    private static Collection l(Iterable iterable) {
        return iterable instanceof Collection ? (Collection)iterable : ov.a(iterable.iterator());
    }

    public static boolean a(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection2 = cm.a(iterable);
            return collection.addAll(collection2);
        }
        return nj.a(collection, ((Iterable)cl.a(iterable)).iterator());
    }

    public static int c(Iterable iterable, Object object) {
        if (iterable instanceof xc) {
            return ((xc)iterable).a(object);
        }
        if (iterable instanceof Set) {
            return ((Set)iterable).contains(object) ? 1 : 0;
        }
        return nj.c(iterable.iterator(), object);
    }

    public static Iterable f(Iterable iterable) {
        cl.a(iterable);
        return new mr(iterable);
    }

    public static Iterable a(Object ... arrobject) {
        return mq.f(ov.a(arrobject));
    }

    public static Iterable b(Iterable iterable, Iterable iterable2) {
        return mq.g(jl.a(iterable, iterable2));
    }

    public static Iterable a(Iterable iterable, Iterable iterable2, Iterable iterable3) {
        return mq.g(jl.a(iterable, iterable2, iterable3));
    }

    public static Iterable a(Iterable iterable, Iterable iterable2, Iterable iterable3, Iterable iterable4) {
        return mq.g(jl.a(iterable, iterable2, iterable3, iterable4));
    }

    public static Iterable a(Iterable ... arriterable) {
        return mq.g(jl.a(arriterable));
    }

    public static Iterable g(Iterable iterable) {
        cl.a(iterable);
        return new mz(iterable);
    }

    private static Iterator m(Iterable iterable) {
        return new na(iterable.iterator());
    }

    public static Iterable a(Iterable iterable, int n2) {
        cl.a(iterable);
        cl.a(n2 > 0);
        return new nb(iterable, n2);
    }

    public static Iterable b(Iterable iterable, int n2) {
        cl.a(iterable);
        cl.a(n2 > 0);
        return new nc(iterable, n2);
    }

    public static Iterable c(Iterable iterable, com.a.a.b.cm cm2) {
        cl.a(iterable);
        cl.a(cm2);
        return new nd(iterable, cm2);
    }

    public static Iterable b(Iterable iterable, Class class_) {
        cl.a(iterable);
        cl.a(class_);
        return new ne(iterable, class_);
    }

    public static boolean d(Iterable iterable, com.a.a.b.cm cm2) {
        return nj.c(iterable.iterator(), cm2);
    }

    public static boolean e(Iterable iterable, com.a.a.b.cm cm2) {
        return nj.d(iterable.iterator(), cm2);
    }

    public static Object f(Iterable iterable, com.a.a.b.cm cm2) {
        return nj.e(iterable.iterator(), cm2);
    }

    public static Object a(Iterable iterable, com.a.a.b.cm cm2, Object object) {
        return nj.a(iterable.iterator(), cm2, object);
    }

    public static cg g(Iterable iterable, com.a.a.b.cm cm2) {
        return nj.f(iterable.iterator(), cm2);
    }

    public static int h(Iterable iterable, com.a.a.b.cm cm2) {
        return nj.g(iterable.iterator(), cm2);
    }

    public static Iterable a(Iterable iterable, bl bl2) {
        cl.a(iterable);
        cl.a(bl2);
        return new nf(iterable, bl2);
    }

    public static Object c(Iterable iterable, int n2) {
        cl.a(iterable);
        return iterable instanceof List ? ((List)iterable).get(n2) : nj.c(iterable.iterator(), n2);
    }

    public static Object a(Iterable iterable, int n2, Object object) {
        cl.a(iterable);
        nj.a(n2);
        if (iterable instanceof List) {
            List list = ov.d(iterable);
            return n2 < list.size() ? list.get(n2) : object;
        }
        Iterator iterator = iterable.iterator();
        nj.d(iterator, n2);
        return nj.d(iterator, object);
    }

    public static Object d(Iterable iterable, Object object) {
        return nj.d(iterable.iterator(), object);
    }

    public static Object h(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List)iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return mq.a(list);
        }
        return nj.f(iterable.iterator());
    }

    public static Object e(Iterable iterable, Object object) {
        if (iterable instanceof Collection) {
            Collection collection = cm.a(iterable);
            if (collection.isEmpty()) {
                return object;
            }
            if (iterable instanceof List) {
                return mq.a(ov.d(iterable));
            }
        }
        return nj.e(iterable.iterator(), object);
    }

    private static Object a(List list) {
        return list.get(list.size() - 1);
    }

    public static Iterable d(Iterable iterable, int n2) {
        cl.a(iterable);
        cl.a(n2 >= 0, (Object)"number to skip cannot be negative");
        if (iterable instanceof List) {
            List list = (List)iterable;
            return new ng(list, n2);
        }
        return new ms(iterable, n2);
    }

    public static Iterable e(Iterable iterable, int n2) {
        cl.a(iterable);
        cl.a(n2 >= 0, (Object)"limit is negative");
        return new mu(iterable, n2);
    }

    public static Iterable i(Iterable iterable) {
        if (iterable instanceof Queue) {
            return new mv(iterable);
        }
        cl.a(iterable);
        return new mw(iterable);
    }

    public static boolean j(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection)iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    public static Iterable a(Iterable iterable, Comparator comparator) {
        cl.a(iterable, (Object)"iterables");
        cl.a(comparator, (Object)"comparator");
        mx mx2 = new mx(iterable, comparator);
        return new ni(mx2, null);
    }

    private static bl b() {
        return new my();
    }

    static /* synthetic */ Iterator k(Iterable iterable) {
        return mq.m(iterable);
    }

    static /* synthetic */ bl a() {
        return mq.b();
    }
}

