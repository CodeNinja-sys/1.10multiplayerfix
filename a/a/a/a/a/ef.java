/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cw;
import a.a.a.a.a.eb;
import java.io.Serializable;

public class ef
extends cw
implements eb,
Serializable {
    private static final long c = -7046029254386353129L;

    protected ef(eb eb2, Object object) {
        super(eb2, object);
    }

    protected ef(eb eb2) {
        super(eb2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean g(int n2) {
        Object object = this.b;
        synchronized (object) {
            return this.a.remove(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean equals(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.a.equals(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int hashCode() {
        Object object = this.b;
        synchronized (object) {
            return this.a.hashCode();
        }
    }
}

