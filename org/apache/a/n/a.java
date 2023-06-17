/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.n.g;

public class a
implements g {
    private final g a;
    private final Map b = new ConcurrentHashMap();

    public a() {
        this(null);
    }

    public a(g g2) {
        this.a = g2;
    }

    public Object a(String string) {
        org.apache.a.o.a.a((Object)string, "Id");
        Object object = this.b.get(string);
        if (object == null && this.a != null) {
            object = this.a.a(string);
        }
        return object;
    }

    public void a(String string, Object object) {
        org.apache.a.o.a.a((Object)string, "Id");
        if (object != null) {
            this.b.put(string, object);
        } else {
            this.b.remove(string);
        }
    }

    public Object b(String string) {
        org.apache.a.o.a.a((Object)string, "Id");
        return this.b.remove(string);
    }

    public void a() {
        this.b.clear();
    }

    public String toString() {
        return this.b.toString();
    }
}

