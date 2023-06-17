/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public class an
implements Comparable {
    private static final AtomicInteger a = new AtomicInteger();
    private final int b;
    private final String c;

    public an(ConcurrentMap concurrentMap, String string, Object ... arrobject) {
        if (concurrentMap == null) {
            throw new NullPointerException("map");
        }
        if (string == null) {
            throw new NullPointerException("name");
        }
        if (arrobject != null && arrobject.length > 0) {
            this.a(arrobject);
        }
        if (concurrentMap.putIfAbsent(string, Boolean.TRUE) != null) {
            throw new IllegalArgumentException(String.format("'%s' is already in use", string));
        }
        this.b = a.incrementAndGet();
        this.c = string;
    }

    protected void a(Object ... arrobject) {
    }

    public final String a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object object) {
        return super.equals(object);
    }

    public int a(an an2) {
        if (this == an2) {
            return 0;
        }
        int n2 = this.c.compareTo(an2.c);
        if (n2 != 0) {
            return n2;
        }
        return Integer.valueOf(this.b).compareTo(an2.b);
    }

    public String toString() {
        return this.a();
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((an)object);
    }
}

