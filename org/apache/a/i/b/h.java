/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.apache.a.g.b;
import org.apache.a.g.d;

public class h
implements Serializable,
org.apache.a.c.h {
    private static final long a = -7581093305228232025L;
    private final TreeSet b = new TreeSet(new d());

    public synchronized void a(b b2) {
        if (b2 != null) {
            this.b.remove(b2);
            if (!b2.a(new Date())) {
                this.b.add(b2);
            }
        }
    }

    public synchronized void a(b[] arrb) {
        if (arrb != null) {
            for (b b2 : arrb) {
                this.a(b2);
            }
        }
    }

    public synchronized List a() {
        return new ArrayList(this.b);
    }

    public synchronized boolean a(Date date) {
        if (date == null) {
            return false;
        }
        boolean bl2 = false;
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            if (!((b)iterator.next()).a(date)) continue;
            iterator.remove();
            bl2 = true;
        }
        return bl2;
    }

    public synchronized void b() {
        this.b.clear();
    }

    public synchronized String toString() {
        return this.b.toString();
    }
}

