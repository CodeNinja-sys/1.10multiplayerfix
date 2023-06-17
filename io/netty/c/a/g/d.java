/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.g;

import io.netty.c.a.d.aw;
import java.util.HashMap;
import java.util.Map;

public final class d {
    public static final aw a = aw.a;
    public static final aw b = new aw("DESCRIBE");
    public static final aw c = new aw("ANNOUNCE");
    public static final aw d = new aw("SETUP");
    public static final aw e = new aw("PLAY");
    public static final aw f = new aw("PAUSE");
    public static final aw g = new aw("TEARDOWN");
    public static final aw h = new aw("GET_PARAMETER");
    public static final aw i = new aw("SET_PARAMETER");
    public static final aw j = new aw("REDIRECT");
    public static final aw k = new aw("RECORD");
    private static final Map l = new HashMap();

    public static aw a(String string) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        if ((string = string.trim().toUpperCase()).isEmpty()) {
            throw new IllegalArgumentException("empty name");
        }
        aw aw2 = (aw)l.get(string);
        if (aw2 != null) {
            return aw2;
        }
        return new aw(string);
    }

    private d() {
    }

    static {
        l.put(b.toString(), b);
        l.put(c.toString(), c);
        l.put(h.toString(), h);
        l.put(a.toString(), a);
        l.put(f.toString(), f);
        l.put(e.toString(), e);
        l.put(k.toString(), k);
        l.put(j.toString(), j);
        l.put(d.toString(), d);
        l.put(i.toString(), i);
        l.put(g.toString(), g);
    }
}

