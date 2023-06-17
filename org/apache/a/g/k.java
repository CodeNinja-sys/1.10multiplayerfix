/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.g;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.e.c;
import org.apache.a.g.h;
import org.apache.a.g.i;
import org.apache.a.g.j;
import org.apache.a.g.l;
import org.apache.a.o.a;

public final class k
implements c {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    public void a(String string, i i2) {
        org.apache.a.o.a.a((Object)string, "Name");
        org.apache.a.o.a.a(i2, "Cookie spec factory");
        this.a.put(string.toLowerCase(Locale.ENGLISH), i2);
    }

    public void a(String string) {
        org.apache.a.o.a.a((Object)string, "Id");
        this.a.remove(string.toLowerCase(Locale.ENGLISH));
    }

    public h a(String string, org.apache.a.l.j j2) {
        org.apache.a.o.a.a((Object)string, "Name");
        i i2 = (i)this.a.get(string.toLowerCase(Locale.ENGLISH));
        if (i2 != null) {
            return i2.a(j2);
        }
        throw new IllegalStateException("Unsupported cookie spec: " + string);
    }

    public h b(String string) {
        return this.a(string, (org.apache.a.l.j)null);
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

    public j d(String string) {
        return new l(this, string);
    }

    public /* synthetic */ Object c(String string) {
        return this.d(string);
    }
}

