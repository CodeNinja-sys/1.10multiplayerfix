/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.aa;
import a.a.a.a.c.aq;
import java.io.Serializable;

public class au
extends aa
implements aq,
Serializable {
    private static final long c = -7046029254386353129L;

    protected au(aq aq2, Object object) {
        super(aq2, object);
    }

    protected au(aq aq2) {
        super(aq2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean remove(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.a.remove(object);
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

