/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.d.ov;
import com.a.a.d.ql;
import com.a.a.d.sz;
import com.a.a.n.a.be;
import com.a.a.n.a.bf;
import com.a.a.n.a.bg;
import com.a.a.n.a.bi;
import com.a.a.n.a.bl;
import com.a.a.n.a.bm;
import com.a.a.n.a.bq;
import com.a.a.n.a.bs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Logger;

public class bd {
    private static final ConcurrentMap b = new ql().j().e();
    private static final Logger c = Logger.getLogger(bd.class.getName());
    final bq a;
    private static final ThreadLocal d = new be();

    public static bd a(bq bq2) {
        return new bd(bq2);
    }

    public ReentrantLock a(String string) {
        return this.a(string, false);
    }

    public ReentrantLock a(String string, boolean bl2) {
        return this.a == bm.c ? new ReentrantLock(bl2) : new bg(this, new bl(string), bl2, null);
    }

    public ReentrantReadWriteLock b(String string) {
        return this.b(string, false);
    }

    public ReentrantReadWriteLock b(String string, boolean bl2) {
        return this.a == bm.c ? new ReentrantReadWriteLock(bl2) : new bi(this, new bl(string), bl2, null);
    }

    public static bs a(Class class_, bq bq2) {
        cl.a(class_);
        cl.a(bq2);
        Map map = bd.b(class_);
        return new bs(bq2, map);
    }

    private static Map b(Class class_) {
        Map map = (Map)b.get(class_);
        if (map != null) {
            return map;
        }
        Map map2 = bd.a(class_);
        map = b.putIfAbsent(class_, map2);
        return (Map)cc.b(map, map2);
    }

    static Map a(Class class_) {
        int n2;
        EnumMap enumMap = sz.a(class_);
        Enum[] arrenum = (Enum[])class_.getEnumConstants();
        int n3 = arrenum.length;
        ArrayList arrayList = ov.b(n3);
        for (Enum enum_ : arrenum) {
            bl bl2 = new bl(bd.a(enum_));
            arrayList.add(bl2);
            enumMap.put(enum_, bl2);
        }
        for (n2 = 1; n2 < n3; ++n2) {
            ((bl)arrayList.get(n2)).a((bq)bm.a, arrayList.subList(0, n2));
        }
        for (n2 = 0; n2 < n3 - 1; ++n2) {
            ((bl)arrayList.get(n2)).a((bq)bm.c, arrayList.subList(n2 + 1, n3));
        }
        return Collections.unmodifiableMap(enumMap);
    }

    private static String a(Enum enum_) {
        return enum_.getDeclaringClass().getSimpleName() + "." + enum_.name();
    }

    private bd(bq bq2) {
        this.a = (bq)cl.a(bq2);
    }

    private void a(bf bf2) {
        if (!bf2.b()) {
            ArrayList arrayList = (ArrayList)d.get();
            bl bl2 = bf2.a();
            bl2.a(this.a, arrayList);
            arrayList.add(bl2);
        }
    }

    private void b(bf bf2) {
        if (!bf2.b()) {
            ArrayList arrayList = (ArrayList)d.get();
            bl bl2 = bf2.a();
            for (int i2 = arrayList.size() - 1; i2 >= 0; --i2) {
                if (arrayList.get(i2) != bl2) continue;
                arrayList.remove(i2);
                break;
            }
        }
    }

    static /* synthetic */ Logger a() {
        return c;
    }

    /* synthetic */ bd(bq bq2, be be2) {
        this(bq2);
    }

    static /* synthetic */ void a(bd bd2, bf bf2) {
        bd2.a(bf2);
    }

    static /* synthetic */ void b(bd bd2, bf bf2) {
        bd2.b(bf2);
    }
}

