/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.bx;
import com.a.a.d.cl;
import com.a.a.d.cn;
import com.a.a.d.co;
import com.a.a.d.cp;
import com.a.a.d.cr;
import com.a.a.d.ct;
import com.a.a.d.ip;
import com.a.a.d.jl;
import com.a.a.d.mq;
import com.a.a.d.yd;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public final class cm {
    static final bx a = bx.a(", ").b("null");

    private cm() {
    }

    public static Collection a(Collection collection, com.a.a.b.cm cm2) {
        if (collection instanceof co) {
            return ((co)collection).a(cm2);
        }
        return new co((Collection)com.a.a.b.cl.a(collection), (com.a.a.b.cm)com.a.a.b.cl.a(cm2));
    }

    static boolean a(Collection collection, Object object) {
        com.a.a.b.cl.a(collection);
        try {
            return collection.contains(object);
        }
        catch (ClassCastException classCastException) {
            return false;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
    }

    static boolean b(Collection collection, Object object) {
        com.a.a.b.cl.a(collection);
        try {
            return collection.remove(object);
        }
        catch (ClassCastException classCastException) {
            return false;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
    }

    public static Collection a(Collection collection, bl bl2) {
        return new ct(collection, bl2);
    }

    static boolean a(Collection collection, Collection collection2) {
        return mq.e((Iterable)collection2, com.a.a.b.cn.a(collection));
    }

    static String a(Collection collection) {
        StringBuilder stringBuilder = cm.a(collection.size()).append('[');
        a.a(stringBuilder, mq.a((Iterable)collection, new cn(collection)));
        return stringBuilder.append(']').toString();
    }

    static StringBuilder a(int n2) {
        cl.a(n2, "size");
        return new StringBuilder((int)Math.min((long)n2 * 8L, 0x40000000L));
    }

    static Collection a(Iterable iterable) {
        return (Collection)iterable;
    }

    public static Collection b(Iterable iterable) {
        return cm.a(iterable, yd.d());
    }

    public static Collection a(Iterable iterable, Comparator comparator) {
        return new cp(iterable, comparator);
    }

    public static Collection b(Collection collection) {
        return new cr(jl.a(collection));
    }

    private static boolean b(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        ip ip2 = ip.a(list);
        ip ip3 = ip.a(list2);
        return ip2.equals(ip3);
    }

    private static boolean b(long l2) {
        return l2 >= 0L && l2 <= Integer.MAX_VALUE;
    }

    static /* synthetic */ boolean a(long l2) {
        return cm.b(l2);
    }

    static /* synthetic */ boolean a(List list, List list2) {
        return cm.b(list, list2);
    }
}

