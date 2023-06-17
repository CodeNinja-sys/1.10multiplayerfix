/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.cz;
import com.a.a.d.ql;
import com.a.a.d.qp;

final class qo
extends qp {
    private static final long b = 0L;
    final bl a;

    qo(ql ql2, bl bl2) {
        super(ql2);
        this.a = (bl)cl.a(bl2);
    }

    @Override
    public Object get(Object object) {
        Object object2 = object;
        Object object3 = this.a(object2);
        cl.a(object3, "%s returned null for key %s.", this.a, object2);
        this.a(object2, object3);
        return object3;
    }

    private Object a(Object object) {
        cl.a(object);
        try {
            return this.a.a(object);
        }
        catch (cz cz2) {
            throw cz2;
        }
        catch (Throwable throwable) {
            throw new cz(throwable);
        }
    }
}

