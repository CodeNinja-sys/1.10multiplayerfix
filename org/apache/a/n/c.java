/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

final class c {
    private final LinkedList a = new LinkedList();
    private final Map b = new HashMap();

    private void c(Object object) {
        Object v2 = this.b.remove(object.getClass());
        if (v2 != null) {
            this.a.remove(v2);
        }
        this.b.put(object.getClass(), object);
    }

    public c a(Object object) {
        if (object == null) {
            return this;
        }
        this.c(object);
        this.a.addFirst(object);
        return this;
    }

    public c b(Object object) {
        if (object == null) {
            return this;
        }
        this.c(object);
        this.a.addLast(object);
        return this;
    }

    public c a(Collection collection) {
        if (collection == null) {
            return this;
        }
        for (Object e2 : collection) {
            this.a(e2);
        }
        return this;
    }

    public c a(Object ... arrobject) {
        if (arrobject == null) {
            return this;
        }
        for (Object object : arrobject) {
            this.a(object);
        }
        return this;
    }

    public c b(Collection collection) {
        if (collection == null) {
            return this;
        }
        for (Object e2 : collection) {
            this.b(e2);
        }
        return this;
    }

    public c b(Object ... arrobject) {
        if (arrobject == null) {
            return this;
        }
        for (Object object : arrobject) {
            this.b(object);
        }
        return this;
    }

    public LinkedList a() {
        return new LinkedList(this.a);
    }
}

