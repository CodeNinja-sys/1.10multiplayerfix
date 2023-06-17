/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.b.d;
import org.apache.a.b.e;
import org.apache.a.b.f;
import org.apache.a.b.h;
import org.apache.a.e.c;
import org.apache.a.l.j;
import org.apache.a.o.a;

public final class g
implements c {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    public void a(String string, e e2) {
        org.apache.a.o.a.a((Object)string, "Name");
        org.apache.a.o.a.a(e2, "Authentication scheme factory");
        this.a.put(string.toLowerCase(Locale.ENGLISH), e2);
    }

    public void a(String string) {
        org.apache.a.o.a.a((Object)string, "Name");
        this.a.remove(string.toLowerCase(Locale.ENGLISH));
    }

    public d a(String string, j j2) {
        org.apache.a.o.a.a((Object)string, "Name");
        e e2 = (e)this.a.get(string.toLowerCase(Locale.ENGLISH));
        if (e2 != null) {
            return e2.a(j2);
        }
        throw new IllegalStateException("Unsupported authentication scheme: " + string);
    }

    public List a() {
        return new ArrayList(this.a.keySet());
    }

    public void a(Map map) {
        if (map == null) {
            return;
        }
        this.a.clear();
        this.a.putAll(map);
    }

    public f b(String string) {
        return new h(this, string);
    }

    public /* synthetic */ Object c(String string) {
        return this.b(string);
    }
}

