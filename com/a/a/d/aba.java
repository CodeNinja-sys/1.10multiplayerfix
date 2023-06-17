/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.abc;
import com.a.a.d.abg;
import com.a.a.d.ov;
import com.a.a.d.yd;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

final class aba {
    private aba() {
    }

    public static int a(List list, Comparable comparable, abg abg2, abc abc2) {
        cl.a(comparable);
        return aba.a(list, cl.a(comparable), yd.d(), abg2, abc2);
    }

    public static int a(List list, bl bl2, Comparable comparable, abg abg2, abc abc2) {
        return aba.a(list, bl2, comparable, yd.d(), abg2, abc2);
    }

    public static int a(List list, bl bl2, Object object, Comparator comparator, abg abg2, abc abc2) {
        return aba.a(ov.a(list, bl2), object, comparator, abg2, abc2);
    }

    public static int a(List list, Object object, Comparator comparator, abg abg2, abc abc2) {
        cl.a(comparator);
        cl.a(list);
        cl.a((Object)abg2);
        cl.a((Object)abc2);
        if (!(list instanceof RandomAccess)) {
            list = ov.a((Iterable)list);
        }
        int n2 = 0;
        int n3 = list.size() - 1;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            int n5 = comparator.compare(object, list.get(n4));
            if (n5 < 0) {
                n3 = n4 - 1;
                continue;
            }
            if (n5 > 0) {
                n2 = n4 + 1;
                continue;
            }
            return n2 + abg2.a(comparator, object, list.subList(n2, n3 + 1), n4 - n2);
        }
        return abc2.a(n2);
    }
}

