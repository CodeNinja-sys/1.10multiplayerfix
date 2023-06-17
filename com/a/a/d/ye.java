/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ql;
import com.a.a.d.yd;
import com.a.a.d.yf;
import com.a.a.d.yj;
import java.util.Map;

class ye
extends yd {
    private Map a = yj.a(new ql()).a(new yf(this));

    ye() {
    }

    @Override
    public int compare(Object object, Object object2) {
        int n2;
        if (object == object2) {
            return 0;
        }
        if (object == null) {
            return -1;
        }
        if (object2 == null) {
            return 1;
        }
        int n3 = this.a(object);
        if (n3 != (n2 = this.a(object2))) {
            return n3 < n2 ? -1 : 1;
        }
        int n4 = ((Integer)this.a.get(object)).compareTo((Integer)this.a.get(object2));
        if (n4 == 0) {
            throw new AssertionError();
        }
        return n4;
    }

    public String toString() {
        return "Ordering.arbitrary()";
    }

    int a(Object object) {
        return System.identityHashCode(object);
    }
}

