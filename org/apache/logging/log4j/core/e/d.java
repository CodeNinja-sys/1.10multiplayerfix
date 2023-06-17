/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.e;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.a.ah;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.config.ab;
import org.apache.logging.log4j.core.e.e;
import org.apache.logging.log4j.core.e.k;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.i;
import org.apache.logging.log4j.j;

public class d
implements h {
    private static final long a = -1351367343806656055L;
    private static final String b = "?";
    private final String c;
    private final f d;
    private final b e;
    private final String f;
    private final m g;
    private final long h;
    private final k i;
    private final Map j;
    private final j k;
    private String l = null;
    private StackTraceElement m;
    private boolean n;
    private boolean o = false;

    public d(long l2) {
        this("", null, "", null, null, (k)null, null, null, null, null, l2);
    }

    public d(String string, f f2, String string2, b b2, m m2, Throwable throwable) {
        this(string, f2, string2, b2, m2, null, throwable);
    }

    public d(String string, f f2, String string2, b b2, m m2, List list, Throwable throwable) {
        this(string, f2, string2, b2, m2, throwable, org.apache.logging.log4j.core.e.d.a(list), org.apache.logging.log4j.i.h() == 0 ? null : org.apache.logging.log4j.i.f(), null, null, System.currentTimeMillis());
    }

    public d(String string, f f2, String string2, b b2, m m2, Throwable throwable, Map map, j j2, String string3, StackTraceElement stackTraceElement, long l2) {
        this(string, f2, string2, b2, m2, throwable == null ? null : new k(throwable), map, j2, string3, stackTraceElement, l2);
    }

    public static d a(String string, f f2, String string2, b b2, m m2, k k2, Map map, j j2, String string3, StackTraceElement stackTraceElement, long l2) {
        return new d(string, f2, string2, b2, m2, k2, map, j2, string3, stackTraceElement, l2);
    }

    private d(String string, f f2, String string2, b b2, m m2, k k2, Map map, j j2, String string3, StackTraceElement stackTraceElement, long l2) {
        this.f = string;
        this.d = f2;
        this.c = string2;
        this.e = b2;
        this.g = m2;
        this.i = k2;
        this.j = map;
        this.k = j2;
        this.h = m2 instanceof ah ? ((ah)((Object)m2)).a() : l2;
        this.l = string3;
        this.m = stackTraceElement;
        if (m2 != null && m2 instanceof org.apache.logging.log4j.a.i) {
            ((org.apache.logging.log4j.a.i)((Object)m2)).a(this.f);
        }
    }

    private static Map a(List list) {
        Map map = org.apache.logging.log4j.i.c();
        if (map == null && (list == null || list.size() == 0)) {
            return null;
        }
        if (list == null || list.size() == 0) {
            return map;
        }
        HashMap<String, String> hashMap = new HashMap<String, String>(map);
        for (ab ab2 : list) {
            if (hashMap.containsKey(ab2.a())) continue;
            hashMap.put(ab2.a(), ab2.b());
        }
        return Collections.unmodifiableMap(hashMap);
    }

    @Override
    public b a() {
        return this.e;
    }

    @Override
    public String b() {
        return this.f;
    }

    @Override
    public m d() {
        return this.g;
    }

    @Override
    public String f() {
        if (this.l == null) {
            this.l = Thread.currentThread().getName();
        }
        return this.l;
    }

    @Override
    public long g() {
        return this.h;
    }

    @Override
    public Throwable h() {
        return this.i == null ? null : this.i.a();
    }

    public k n() {
        return this.i;
    }

    @Override
    public f e() {
        return this.d;
    }

    @Override
    public String k() {
        return this.c;
    }

    @Override
    public Map i() {
        return this.j == null ? org.apache.logging.log4j.i.a : this.j;
    }

    @Override
    public j j() {
        return this.k == null ? org.apache.logging.log4j.i.b : this.k;
    }

    @Override
    public StackTraceElement c() {
        if (this.m != null) {
            return this.m;
        }
        if (this.c == null || !this.n) {
            return null;
        }
        this.m = org.apache.logging.log4j.core.e.d.a(this.c);
        return this.m;
    }

    public static StackTraceElement a(String string) {
        if (string == null) {
            return null;
        }
        StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
        boolean bl2 = false;
        for (StackTraceElement stackTraceElement : arrstackTraceElement) {
            String string2 = stackTraceElement.getClassName();
            if (bl2) {
                if (string.equals(string2)) continue;
                return stackTraceElement;
            }
            if (string.equals(string2)) {
                bl2 = true;
                continue;
            }
            if (b.equals(string2)) break;
        }
        return null;
    }

    @Override
    public boolean l() {
        return this.n;
    }

    @Override
    public void a(boolean bl2) {
        this.n = bl2;
    }

    @Override
    public boolean m() {
        return this.o;
    }

    @Override
    public void b(boolean bl2) {
        this.o = bl2;
    }

    protected Object o() {
        return new org.apache.logging.log4j.core.e.f(this, this.n);
    }

    public static Serializable a(d d2, boolean bl2) {
        return new org.apache.logging.log4j.core.e.f(d2, bl2);
    }

    public static d a(Serializable serializable) {
        if (serializable == null) {
            throw new NullPointerException("Event cannot be null");
        }
        if (serializable instanceof org.apache.logging.log4j.core.e.f) {
            org.apache.logging.log4j.core.e.f f2 = (org.apache.logging.log4j.core.e.f)serializable;
            d d2 = new d(org.apache.logging.log4j.core.e.f.a(f2), org.apache.logging.log4j.core.e.f.b(f2), org.apache.logging.log4j.core.e.f.c(f2), org.apache.logging.log4j.core.e.f.d(f2), org.apache.logging.log4j.core.e.f.e(f2), org.apache.logging.log4j.core.e.f.f(f2), org.apache.logging.log4j.core.e.f.g(f2), org.apache.logging.log4j.core.e.f.h(f2), org.apache.logging.log4j.core.e.f.i(f2), org.apache.logging.log4j.core.e.f.j(f2), org.apache.logging.log4j.core.e.f.k(f2));
            d2.b(org.apache.logging.log4j.core.e.f.l(f2));
            d2.a(org.apache.logging.log4j.core.e.f.m(f2));
            return d2;
        }
        throw new IllegalArgumentException("Event is not a serialized LogEvent: " + serializable.toString());
    }

    private void a(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = this.f.isEmpty() ? "root" : this.f;
        stringBuilder.append("Logger=").append(string);
        stringBuilder.append(" Level=").append(this.e.name());
        stringBuilder.append(" Message=").append(this.g.a());
        return stringBuilder.toString();
    }

    static /* synthetic */ String a(d d2) {
        return d2.c;
    }

    static /* synthetic */ f b(d d2) {
        return d2.d;
    }

    static /* synthetic */ b c(d d2) {
        return d2.e;
    }

    static /* synthetic */ String d(d d2) {
        return d2.f;
    }

    static /* synthetic */ m e(d d2) {
        return d2.g;
    }

    static /* synthetic */ long f(d d2) {
        return d2.h;
    }

    static /* synthetic */ k g(d d2) {
        return d2.i;
    }

    static /* synthetic */ Map h(d d2) {
        return d2.j;
    }

    static /* synthetic */ j i(d d2) {
        return d2.k;
    }

    static /* synthetic */ boolean j(d d2) {
        return d2.o;
    }

    /* synthetic */ d(String string, f f2, String string2, b b2, m m2, k k2, Map map, j j2, String string3, StackTraceElement stackTraceElement, long l2, e e2) {
        this(string, f2, string2, b2, m2, k2, map, j2, string3, stackTraceElement, l2);
    }
}

