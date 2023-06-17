/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i;

import java.util.HashMap;
import java.util.Map;
import org.apache.a.j.g;
import org.apache.a.m;

public class o
implements m {
    public static final String a = "http.request-count";
    public static final String b = "http.response-count";
    public static final String c = "http.sent-bytes-count";
    public static final String d = "http.received-bytes-count";
    private final g e;
    private final g f;
    private long g = 0L;
    private long h = 0L;
    private Map i;

    public o(g g2, g g3) {
        this.e = g2;
        this.f = g3;
    }

    public long d() {
        if (this.e != null) {
            return this.e.a();
        }
        return -1L;
    }

    public long c() {
        if (this.f != null) {
            return this.f.a();
        }
        return -1L;
    }

    public long a() {
        return this.g;
    }

    public void f() {
        ++this.g;
    }

    public long b() {
        return this.h;
    }

    public void g() {
        ++this.h;
    }

    public Object a(String string) {
        Long l2 = null;
        if (this.i != null) {
            l2 = (Long)this.i.get(string);
        }
        if (l2 == null) {
            if (a.equals(string)) {
                l2 = this.g;
            } else if (b.equals(string)) {
                l2 = this.h;
            } else {
                if (d.equals(string)) {
                    if (this.e != null) {
                        return this.e.a();
                    }
                    return null;
                }
                if (c.equals(string)) {
                    if (this.f != null) {
                        return this.f.a();
                    }
                    return null;
                }
            }
        }
        return l2;
    }

    public void a(String string, Object object) {
        if (this.i == null) {
            this.i = new HashMap();
        }
        this.i.put(string, object);
    }

    public void e() {
        if (this.f != null) {
            this.f.b();
        }
        if (this.e != null) {
            this.e.b();
        }
        this.g = 0L;
        this.h = 0L;
        this.i = null;
    }
}

