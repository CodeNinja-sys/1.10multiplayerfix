/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.aw;
import com.a.a.d.mk;
import com.a.a.d.mm;
import com.a.a.d.mp;
import com.a.a.d.ql;
import com.a.a.d.qy;
import com.a.a.d.rz;

class mo
implements mk {
    private final qy a = new ql().j().b(aw.b()).f();

    private mo() {
    }

    @Override
    public Object a(Object object) {
        Object object2;
        do {
            rz rz2;
            if ((rz2 = this.a.c(object)) == null || (object2 = rz2.d()) == null) continue;
            return object2;
        } while ((object2 = (mp)((Object)this.a.putIfAbsent(object, (Object)mp.a))) != null);
        return object;
    }

    /* synthetic */ mo(mm mm2) {
        this();
    }
}

