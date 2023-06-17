/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.openal;

import java.util.HashMap;
import org.lwjgl.openal.a;

public final class b {
    final long a;
    private boolean b;
    private final HashMap c = new HashMap();

    b(long l2) {
        this.a = l2;
        this.b = true;
    }

    public boolean equals(Object object) {
        if (object instanceof b) {
            return ((b)object).a == this.a;
        }
        return super.equals(object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(a a2) {
        HashMap hashMap = this.c;
        synchronized (hashMap) {
            this.c.put(a2.a, a2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void b(a a2) {
        HashMap hashMap = this.c;
        synchronized (hashMap) {
            this.c.remove(a2.a);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a() {
        this.b = false;
        HashMap hashMap = this.c;
        synchronized (hashMap) {
            for (a a2 : this.c.values()) {
                a2.a();
            }
        }
        this.c.clear();
    }

    public boolean b() {
        return this.b;
    }
}

