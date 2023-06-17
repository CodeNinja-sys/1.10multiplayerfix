/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.logging.log4j.core.a.x;
import org.apache.logging.log4j.d;

public abstract class b {
    protected static final d a = org.apache.logging.log4j.d.d.k();
    private static final Map c = new HashMap();
    private static final Lock d = new ReentrantLock();
    protected int b;
    private final String e;

    protected b(String string) {
        this.e = string;
        a.a("Starting {} {}", this.getClass().getSimpleName(), string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static b a(String string, x x2, Object object) {
        d.lock();
        try {
            b b2 = (b)c.get(string);
            if (b2 == null) {
                b2 = (b)x2.a(string, object);
                if (b2 == null) {
                    throw new IllegalStateException("Unable to create a manager");
                }
                c.put(string, b2);
            }
            ++b2.b;
            b b3 = b2;
            return b3;
        }
        finally {
            d.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(String string) {
        d.lock();
        try {
            boolean bl2 = c.containsKey(string);
            return bl2;
        }
        finally {
            d.unlock();
        }
    }

    protected void a() {
    }

    protected int b() {
        return this.b;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        d.lock();
        try {
            --this.b;
            if (this.b <= 0) {
                c.remove(this.e);
                a.a("Shutting down {} {}", this.getClass().getSimpleName(), this.d());
                this.a();
            }
        }
        finally {
            d.unlock();
        }
    }

    public String d() {
        return this.e;
    }

    public Map e() {
        return new HashMap();
    }
}

