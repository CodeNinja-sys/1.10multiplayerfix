/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.l;

import java.util.Set;
import org.apache.a.l.j;
import org.apache.a.l.k;

public abstract class a
implements j,
k {
    protected a() {
    }

    public long a(String string, long l2) {
        Object object = this.a(string);
        if (object == null) {
            return l2;
        }
        return (Long)object;
    }

    public j b(String string, long l2) {
        this.a(string, (Object)l2);
        return this;
    }

    public int a(String string, int n2) {
        Object object = this.a(string);
        if (object == null) {
            return n2;
        }
        return (Integer)object;
    }

    public j b(String string, int n2) {
        this.a(string, (Object)n2);
        return this;
    }

    public double a(String string, double d2) {
        Object object = this.a(string);
        if (object == null) {
            return d2;
        }
        return (Double)object;
    }

    public j b(String string, double d2) {
        this.a(string, (Object)d2);
        return this;
    }

    public boolean a(String string, boolean bl2) {
        Object object = this.a(string);
        if (object == null) {
            return bl2;
        }
        return (Boolean)object;
    }

    public j b(String string, boolean bl2) {
        this.a(string, bl2 ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    public boolean c(String string) {
        return this.a(string, false);
    }

    public boolean d(String string) {
        return !this.a(string, false);
    }

    public Set f() {
        throw new UnsupportedOperationException();
    }
}

