/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.a.g.c;
import org.apache.a.g.h;
import org.apache.a.o.a;

public abstract class b
implements h {
    private final Map a = new HashMap(10);

    public void a(String string, c c2) {
        org.apache.a.o.a.a((Object)string, "Attribute name");
        org.apache.a.o.a.a(c2, "Attribute handler");
        this.a.put(string, c2);
    }

    protected c a(String string) {
        return (c)this.a.get(string);
    }

    protected c b(String string) {
        c c2 = this.a(string);
        if (c2 == null) {
            throw new IllegalStateException("Handler not registered for " + string + " attribute.");
        }
        return c2;
    }

    protected Collection c() {
        return this.a.values();
    }
}

