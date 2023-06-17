/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.b;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.a.u;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.b.a;
import org.apache.logging.log4j.core.b.p;
import org.apache.logging.log4j.core.config.ab;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.j;

public class n
implements h {
    private static final long b = 8462119088943934758L;
    public static final p a = new p(null);
    private a c;
    private String d;
    private f e;
    private String f;
    private b g;
    private m h;
    private Throwable i;
    private Map j;
    private j k;
    private String l;
    private StackTraceElement m;
    private long n;
    private boolean o;
    private boolean p;

    public void a(a a2, String string, f f2, String string2, b b2, m m2, Throwable throwable, Map map, j j2, String string3, StackTraceElement stackTraceElement, long l2) {
        this.c = a2;
        this.d = string;
        this.e = f2;
        this.f = string2;
        this.g = b2;
        this.h = m2;
        this.i = throwable;
        this.j = map;
        this.k = j2;
        this.l = string3;
        this.m = stackTraceElement;
        this.n = l2;
    }

    public void c(boolean bl2) {
        this.o = bl2;
        this.c.a(this);
    }

    @Override
    public boolean m() {
        return this.o;
    }

    @Override
    public void b(boolean bl2) {
        this.o = bl2;
    }

    @Override
    public boolean l() {
        return this.p;
    }

    @Override
    public void a(boolean bl2) {
        this.p = bl2;
    }

    @Override
    public String b() {
        return this.d;
    }

    @Override
    public f e() {
        return this.e;
    }

    @Override
    public String k() {
        return this.f;
    }

    @Override
    public b a() {
        return this.g;
    }

    @Override
    public m d() {
        if (this.h == null) {
            this.h = new u("");
        }
        return this.h;
    }

    @Override
    public Throwable h() {
        return this.i;
    }

    @Override
    public Map i() {
        return this.j;
    }

    @Override
    public j j() {
        return this.k;
    }

    @Override
    public String f() {
        return this.l;
    }

    @Override
    public StackTraceElement c() {
        return this.m;
    }

    @Override
    public long g() {
        return this.n;
    }

    public void a(Map map, org.apache.logging.log4j.core.h.n n2) {
        if (map == null) {
            return;
        }
        HashMap<String, String> hashMap = this.j == null ? new HashMap<String, String>() : new HashMap(this.j);
        for (Map.Entry entry : map.entrySet()) {
            ab ab2 = (ab)entry.getKey();
            if (hashMap.containsKey(ab2.a())) continue;
            String string = (Boolean)entry.getValue() != false ? n2.a(ab2.b()) : ab2.b();
            hashMap.put(ab2.a(), string);
        }
        this.j = hashMap;
    }

    public void n() {
        this.a(null, null, null, null, null, null, null, null, null, null, null, 0L);
    }
}

