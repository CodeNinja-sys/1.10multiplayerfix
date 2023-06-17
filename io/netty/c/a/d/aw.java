/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.c.a.d.ar;
import io.netty.util.e;
import java.util.HashMap;
import java.util.Map;

public class aw
implements Comparable {
    public static final aw a = new aw("OPTIONS", true);
    public static final aw b = new aw("GET", true);
    public static final aw c = new aw("HEAD", true);
    public static final aw d = new aw("POST", true);
    public static final aw e = new aw("PUT", true);
    public static final aw f = new aw("PATCH", true);
    public static final aw g = new aw("DELETE", true);
    public static final aw h = new aw("TRACE", true);
    public static final aw i = new aw("CONNECT", true);
    private static final Map j = new HashMap();
    private final String k;
    private final byte[] l;

    public static aw a(String string) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        if ((string = string.trim()).isEmpty()) {
            throw new IllegalArgumentException("empty name");
        }
        aw aw2 = (aw)j.get(string);
        if (aw2 != null) {
            return aw2;
        }
        return new aw(string);
    }

    public aw(String string) {
        this(string, false);
    }

    private aw(String string, boolean bl2) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        if ((string = string.trim()).isEmpty()) {
            throw new IllegalArgumentException("empty name");
        }
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (!Character.isISOControl(string.charAt(i2)) && !Character.isWhitespace(string.charAt(i2))) continue;
            throw new IllegalArgumentException("invalid character in name");
        }
        this.k = string;
        this.l = (byte[])(bl2 ? string.getBytes(io.netty.util.e.f) : null);
    }

    public String a() {
        return this.k;
    }

    public int hashCode() {
        return this.a().hashCode();
    }

    public boolean equals(Object object) {
        if (!(object instanceof aw)) {
            return false;
        }
        aw aw2 = (aw)object;
        return this.a().equals(aw2.a());
    }

    public String toString() {
        return this.a();
    }

    public int a(aw aw2) {
        return this.a().compareTo(aw2.a());
    }

    void a(g g2) {
        if (this.l == null) {
            ar.b(this.k, g2);
        } else {
            g2.c(this.l);
        }
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((aw)object);
    }

    static {
        j.put(a.toString(), a);
        j.put(b.toString(), b);
        j.put(c.toString(), c);
        j.put(d.toString(), d);
        j.put(e.toString(), e);
        j.put(f.toString(), f);
        j.put(g.toString(), g);
        j.put(h.toString(), h);
        j.put(i.toString(), i);
    }
}

