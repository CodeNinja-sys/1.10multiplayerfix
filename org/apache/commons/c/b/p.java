/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.b;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.apache.commons.c.b.c;
import org.apache.commons.c.b.i;
import org.apache.commons.c.b.r;

public class p
extends c {
    private final Map a = new HashMap();

    public p() {
    }

    public p(ExecutorService executorService) {
        super(executorService);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string, c c2) {
        if (string == null) {
            throw new IllegalArgumentException("Name of child initializer must not be null!");
        }
        if (c2 == null) {
            throw new IllegalArgumentException("Child initializer must not be null!");
        }
        p p2 = this;
        synchronized (p2) {
            if (this.c()) {
                throw new IllegalStateException("addInitializer() must not be called after start()!");
            }
            this.a.put(string, c2);
        }
    }

    @Override
    protected int g() {
        int n2 = 1;
        for (c c2 : this.a.values()) {
            n2 += c2.g();
        }
        return n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected r i() {
        Object object3;
        HashMap hashMap;
        Object object2 = this;
        synchronized (object2) {
            hashMap = new HashMap(this.a);
        }
        object2 = this.f();
        for (Object object3 : hashMap.values()) {
            if (((c)object3).b() == null) {
                ((c)object3).a((ExecutorService)object2);
            }
            ((c)object3).d();
        }
        HashMap hashMap2 = new HashMap();
        object3 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            try {
                hashMap2.put(entry.getKey(), ((c)entry.getValue()).a());
            }
            catch (i i2) {
                object3.put(entry.getKey(), i2);
            }
        }
        return new r(hashMap, hashMap2, (Map)object3, null);
    }

    @Override
    protected /* synthetic */ Object h() {
        return this.i();
    }
}

