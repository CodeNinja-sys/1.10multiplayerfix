/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.b;

import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.c.b.c;
import org.apache.commons.c.b.i;
import org.apache.commons.c.b.q;

public class r {
    private final Map a;
    private final Map b;
    private final Map c;

    private r(Map map, Map map2, Map map3) {
        this.a = map;
        this.b = map2;
        this.c = map3;
    }

    public c a(String string) {
        return this.e(string);
    }

    public Object b(String string) {
        this.e(string);
        return this.b.get(string);
    }

    public boolean c(String string) {
        this.e(string);
        return this.c.containsKey(string);
    }

    public i d(String string) {
        this.e(string);
        return (i)this.c.get(string);
    }

    public Set a() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    public boolean b() {
        return this.c.isEmpty();
    }

    private c e(String string) {
        c c2 = (c)this.a.get(string);
        if (c2 == null) {
            throw new NoSuchElementException("No child initializer with name " + string);
        }
        return c2;
    }

    /* synthetic */ r(Map map, Map map2, Map map3, q q2) {
        this(map, map2, map3);
    }
}

