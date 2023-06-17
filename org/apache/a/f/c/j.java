/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.f.c.f;
import org.apache.a.o.a;
import org.apache.a.r;

public final class j {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    public final f a(String string) {
        f f2 = this.b(string);
        if (f2 == null) {
            throw new IllegalStateException("Scheme '" + string + "' not registered.");
        }
        return f2;
    }

    public final f a(r r2) {
        org.apache.a.o.a.a(r2, "Host");
        return this.a(r2.c());
    }

    public final f b(String string) {
        org.apache.a.o.a.a((Object)string, "Scheme name");
        f f2 = (f)this.a.get(string);
        return f2;
    }

    public final f a(f f2) {
        org.apache.a.o.a.a(f2, "Scheme");
        f f3 = this.a.put(f2.d(), f2);
        return f3;
    }

    public final f c(String string) {
        org.apache.a.o.a.a((Object)string, "Scheme name");
        f f2 = (f)this.a.remove(string);
        return f2;
    }

    public final List a() {
        return new ArrayList(this.a.keySet());
    }

    public void a(Map map) {
        if (map == null) {
            return;
        }
        this.a.clear();
        this.a.putAll(map);
    }
}

