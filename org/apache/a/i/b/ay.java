/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.i.b.t;
import org.apache.a.u;

public class ay
extends t {
    private final Map b = new ConcurrentHashMap();

    public ay(int n2, boolean bl2) {
        super(n2, bl2);
        this.b.put("GET", Boolean.TRUE);
        this.b.put("HEAD", Boolean.TRUE);
        this.b.put("PUT", Boolean.TRUE);
        this.b.put("DELETE", Boolean.TRUE);
        this.b.put("OPTIONS", Boolean.TRUE);
        this.b.put("TRACE", Boolean.TRUE);
    }

    public ay() {
        this(3, false);
    }

    protected boolean a(u u2) {
        String string = u2.g().a().toUpperCase(Locale.US);
        Boolean bl2 = (Boolean)this.b.get(string);
        return bl2 != null && bl2 != false;
    }
}

