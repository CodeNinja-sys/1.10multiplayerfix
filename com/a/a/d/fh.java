/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.jt;
import com.a.a.d.ju;
import com.a.a.d.yd;
import com.a.a.d.yh;
import java.io.Serializable;
import java.util.List;

final class fh
extends yd
implements Serializable {
    final jt a;
    private static final long b = 0L;

    fh(List list) {
        this(fh.b(list));
    }

    fh(jt jt2) {
        this.a = jt2;
    }

    @Override
    public int compare(Object object, Object object2) {
        return this.a(object) - this.a(object2);
    }

    private int a(Object object) {
        Integer n2 = (Integer)this.a.get(object);
        if (n2 == null) {
            throw new yh(object);
        }
        return n2;
    }

    private static jt b(List list) {
        ju ju2 = jt.n();
        int n2 = 0;
        for (Object e2 : list) {
            ju2.b(e2, n2++);
        }
        return ju2.b();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof fh) {
            fh fh2 = (fh)object;
            return this.a.equals(fh2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Ordering.explicit(" + this.a.g() + ")";
    }
}

