/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.a;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.f.a.g;
import org.apache.a.f.b.b;
import org.apache.a.o.a;

public final class h
implements g {
    public static final int a = 2;
    private final ConcurrentHashMap b = new ConcurrentHashMap();
    private volatile int c;

    public h(int n2) {
        this.a(n2);
    }

    public h() {
        this(2);
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.c;
    }

    public void a(int n2) {
        org.apache.a.o.a.a(n2, "Defautl max per route");
        this.c = n2;
    }

    public void a(b b2, int n2) {
        org.apache.a.o.a.a(b2, "HTTP route");
        org.apache.a.o.a.a(n2, "Max per route");
        this.b.put(b2, n2);
    }

    public int a(b b2) {
        org.apache.a.o.a.a(b2, "HTTP route");
        Integer n2 = (Integer)this.b.get(b2);
        if (n2 != null) {
            return n2;
        }
        return this.c;
    }

    public void a(Map map) {
        if (map == null) {
            return;
        }
        this.b.clear();
        this.b.putAll(map);
    }

    public String toString() {
        return this.b.toString();
    }
}

