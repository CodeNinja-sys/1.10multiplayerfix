/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aj;
import com.a.a.d.al;
import com.a.a.d.as;
import com.a.a.d.cl;
import com.a.a.d.dv;
import com.a.a.d.sz;
import com.a.a.l.q;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class ai
extends as
implements Serializable {
    private transient Map a;
    private transient long b;
    private static final long c = -2250766705698539974L;

    protected ai(Map map) {
        this.a = (Map)com.a.a.b.cl.a(map);
        this.b = super.size();
    }

    void a(Map map) {
        this.a = map;
    }

    @Override
    public Set aS_() {
        return super.aS_();
    }

    @Override
    Iterator b() {
        Iterator iterator = this.a.entrySet().iterator();
        return new aj(this, iterator);
    }

    @Override
    public void clear() {
        for (dv dv2 : this.a.values()) {
            dv2.c(0);
        }
        this.a.clear();
        this.b = 0L;
    }

    @Override
    int c() {
        return this.a.size();
    }

    @Override
    public int size() {
        return q.b(this.b);
    }

    @Override
    public Iterator iterator() {
        return new al(this);
    }

    @Override
    public int a(Object object) {
        dv dv2 = (dv)sz.a(this.a, object);
        return dv2 == null ? 0 : dv2.a();
    }

    @Override
    public int a(Object object, int n2) {
        int n3;
        if (n2 == 0) {
            return this.a(object);
        }
        com.a.a.b.cl.a(n2 > 0, "occurrences cannot be negative: %s", new Object[]{n2});
        dv dv2 = (dv)this.a.get(object);
        if (dv2 == null) {
            n3 = 0;
            this.a.put(object, new dv(n2));
        } else {
            n3 = dv2.a();
            long l2 = (long)n3 + (long)n2;
            com.a.a.b.cl.a(l2 <= Integer.MAX_VALUE, "too many occurrences: %s", new Object[]{l2});
            dv2.a(n2);
        }
        this.b += (long)n2;
        return n3;
    }

    @Override
    public int b(Object object, int n2) {
        int n3;
        if (n2 == 0) {
            return this.a(object);
        }
        com.a.a.b.cl.a(n2 > 0, "occurrences cannot be negative: %s", new Object[]{n2});
        dv dv2 = (dv)this.a.get(object);
        if (dv2 == null) {
            return 0;
        }
        int n4 = dv2.a();
        if (n4 > n2) {
            n3 = n2;
        } else {
            n3 = n4;
            this.a.remove(object);
        }
        dv2.b(-n3);
        this.b -= (long)n3;
        return n4;
    }

    @Override
    public int c(Object object, int n2) {
        int n3;
        cl.a(n2, "count");
        if (n2 == 0) {
            dv dv2 = (dv)this.a.remove(object);
            n3 = ai.a(dv2, n2);
        } else {
            dv dv3 = (dv)this.a.get(object);
            n3 = ai.a(dv3, n2);
            if (dv3 == null) {
                this.a.put(object, new dv(n2));
            }
        }
        this.b += (long)(n2 - n3);
        return n3;
    }

    private static int a(dv dv2, int n2) {
        if (dv2 == null) {
            return 0;
        }
        return dv2.d(n2);
    }

    private void g() {
        throw new InvalidObjectException("Stream data required");
    }

    static /* synthetic */ Map a(ai ai2) {
        return ai2.a;
    }

    static /* synthetic */ long a(ai ai2, long l2) {
        return ai2.b -= l2;
    }

    static /* synthetic */ long b(ai ai2) {
        return ai2.b--;
    }
}

