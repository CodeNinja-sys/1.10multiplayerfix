/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.c;

import com.ibm.icu.a.c.n;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;

public abstract class m {
    private ConcurrentHashMap a;
    private ReferenceQueue b = new ReferenceQueue();

    public m() {
        this(16, 0.75f, 16);
    }

    public m(int n2, float f2, int n3) {
        this.a = new ConcurrentHashMap(n2, f2, n3);
    }

    public Object c(Object object) {
        Object object2 = null;
        this.a();
        n n2 = (n)this.a.get(object);
        if (n2 != null) {
            object2 = n2.get();
        }
        if (object2 == null) {
            object = this.a(object);
            Object object3 = this.b(object);
            if (object == null || object3 == null) {
                return null;
            }
            n n3 = new n(object, object3, this.b);
            while (object2 == null) {
                this.a();
                n2 = this.a.putIfAbsent(object, n3);
                if (n2 == null) {
                    object2 = object3;
                    break;
                }
                object2 = n2.get();
            }
        }
        return object2;
    }

    private void a() {
        n n2;
        while ((n2 = (n)this.b.poll()) != null) {
            this.a.remove(n2.a());
        }
    }

    protected abstract Object b(Object var1);

    protected Object a(Object object) {
        return object;
    }
}

