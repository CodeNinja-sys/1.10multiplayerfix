/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cw;
import a.a.a.a.b.ec;
import java.io.Serializable;

public class eg
extends cw
implements ec,
Serializable {
    private static final long c = -7046029254386353129L;

    protected eg(ec ec2, Object object) {
        super(ec2, object);
    }

    protected eg(ec ec2) {
        super(ec2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean g(long l2) {
        Object object = this.b;
        synchronized (object) {
            return this.a.remove(l2);
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

