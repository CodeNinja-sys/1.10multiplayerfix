/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cc;
import com.a.a.d.ci;
import com.a.a.d.cl;
import com.a.a.d.cm;
import com.a.a.d.jl;
import com.a.a.d.mq;
import com.a.a.d.nj;
import com.a.a.d.ow;
import com.a.a.d.ox;
import com.a.a.d.oy;
import com.a.a.d.oz;
import com.a.a.d.pa;
import com.a.a.d.pb;
import com.a.a.d.pd;
import com.a.a.d.pe;
import com.a.a.d.pf;
import com.a.a.d.ph;
import com.a.a.d.pi;
import com.a.a.d.pk;
import com.a.a.d.pm;
import com.a.a.l.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ov {
    private ov() {
    }

    public static ArrayList a() {
        return new ArrayList();
    }

    public static ArrayList a(Object ... arrobject) {
        com.a.a.b.cl.a(arrobject);
        int n2 = ov.a(arrobject.length);
        ArrayList arrayList = new ArrayList(n2);
        Collections.addAll(arrayList, arrobject);
        return arrayList;
    }

    static int a(int n2) {
        cl.a(n2, "arraySize");
        return q.b(5L + (long)n2 + (long)(n2 / 10));
    }

    public static ArrayList a(Iterable iterable) {
        com.a.a.b.cl.a(iterable);
        return iterable instanceof Collection ? new ArrayList(cm.a(iterable)) : ov.a(iterable.iterator());
    }

    public static ArrayList a(Iterator iterator) {
        ArrayList arrayList = ov.a();
        nj.a(arrayList, iterator);
        return arrayList;
    }

    public static ArrayList b(int n2) {
        cl.a(n2, "initialArraySize");
        return new ArrayList(n2);
    }

    public static ArrayList c(int n2) {
        return new ArrayList(ov.a(n2));
    }

    public static LinkedList b() {
        return new LinkedList();
    }

    public static LinkedList b(Iterable iterable) {
        LinkedList linkedList = ov.b();
        mq.a((Collection)linkedList, iterable);
        return linkedList;
    }

    public static CopyOnWriteArrayList c() {
        return new CopyOnWriteArrayList();
    }

    public static CopyOnWriteArrayList c(Iterable iterable) {
        Collection collection = iterable instanceof Collection ? cm.a(iterable) : ov.a(iterable);
        return new CopyOnWriteArrayList(collection);
    }

    public static List a(Object object, Object[] arrobject) {
        return new pa(object, arrobject);
    }

    public static List a(Object object, Object object2, Object[] arrobject) {
        return new pm(object, object2, arrobject);
    }

    static List a(List list) {
        return ci.a(list);
    }

    static List a(List ... arrlist) {
        return ov.a(Arrays.asList(arrlist));
    }

    public static List a(List list, bl bl2) {
        return list instanceof RandomAccess ? new pi(list, bl2) : new pk(list, bl2);
    }

    public static List a(List list, int n2) {
        com.a.a.b.cl.a(list);
        com.a.a.b.cl.a(n2 > 0);
        return list instanceof RandomAccess ? new pd(list, n2) : new pb(list, n2);
    }

    public static jl a(String string) {
        return new ph((String)com.a.a.b.cl.a(string));
    }

    public static List a(CharSequence charSequence) {
        return new oz((CharSequence)com.a.a.b.cl.a(charSequence));
    }

    public static List b(List list) {
        if (list instanceof jl) {
            return ((jl)list).f();
        }
        if (list instanceof pf) {
            return ((pf)list).a();
        }
        if (list instanceof RandomAccess) {
            return new pe(list);
        }
        return new pf(list);
    }

    static int c(List list) {
        int n2 = 1;
        for (Object e2 : list) {
            n2 = 31 * n2 + (e2 == null ? 0 : e2.hashCode());
            n2 = ~(~n2);
        }
        return n2;
    }

    static boolean a(List list, Object object) {
        if (object == com.a.a.b.cl.a(list)) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        List list2 = (List)object;
        return list.size() == list2.size() && nj.a(list.iterator(), list2.iterator());
    }

    static boolean a(List list, int n2, Iterable iterable) {
        boolean bl2 = false;
        ListIterator listIterator = list.listIterator(n2);
        for (Object t2 : iterable) {
            listIterator.add(t2);
            bl2 = true;
        }
        return bl2;
    }

    static int b(List list, Object object) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (!cc.a(object, listIterator.next())) continue;
            return listIterator.previousIndex();
        }
        return -1;
    }

    static int c(List list, Object object) {
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!cc.a(object, listIterator.previous())) continue;
            return listIterator.nextIndex();
        }
        return -1;
    }

    static ListIterator b(List list, int n2) {
        return new oy(list).listIterator(n2);
    }

    static List a(List list, int n2, int n3) {
        oy oy2 = list instanceof RandomAccess ? new ow(list) : new ox(list);
        return oy2.subList(n2, n3);
    }

    static List d(Iterable iterable) {
        return (List)iterable;
    }
}

