/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.util.HashMap;
import java.util.Map;
import org.apache.a.c.d;
import org.apache.a.f.b.b;
import org.apache.a.i.b.az;
import org.apache.a.i.b.l;
import org.apache.a.m.h;

public class a
implements d {
    private final h a;
    private final l b;
    private final Map c;
    private final Map d;
    private long e = 5000L;
    private double f = 0.5;
    private int g = 2;

    public a(h h2) {
        this(h2, new az());
    }

    a(h h2, l l2) {
        this.b = l2;
        this.a = h2;
        this.c = new HashMap();
        this.d = new HashMap();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(b b2) {
        h h2 = this.a;
        synchronized (h2) {
            int n2 = this.a.b(b2);
            Long l2 = this.a(this.d, b2);
            long l3 = this.b.a();
            if (l3 - l2 < this.e) {
                return;
            }
            this.a.a(b2, this.b(n2));
            this.d.put(b2, l3);
        }
    }

    private int b(int n2) {
        if (n2 <= 1) {
            return 1;
        }
        return (int)Math.floor(this.f * (double)n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(b b2) {
        h h2 = this.a;
        synchronized (h2) {
            int n2 = this.a.b(b2);
            int n3 = n2 >= this.g ? this.g : n2 + 1;
            Long l2 = this.a(this.c, b2);
            Long l3 = this.a(this.d, b2);
            long l4 = this.b.a();
            if (l4 - l2 < this.e || l4 - l3 < this.e) {
                return;
            }
            this.a.a(b2, n3);
            this.c.put(b2, l4);
        }
    }

    private Long a(Map map, b b2) {
        Long l2 = (Long)map.get(b2);
        if (l2 == null) {
            l2 = 0L;
        }
        return l2;
    }

    public void a(double d2) {
        org.apache.a.o.a.a(d2 > 0.0 && d2 < 1.0, "Backoff factor must be 0.0 < f < 1.0");
        this.f = d2;
    }

    public void a(long l2) {
        org.apache.a.o.a.a(this.e, "Cool down");
        this.e = l2;
    }

    public void a(int n2) {
        org.apache.a.o.a.a(n2, "Per host connection cap");
        this.g = n2;
    }
}

