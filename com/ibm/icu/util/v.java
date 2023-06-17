/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.au;
import com.ibm.icu.a.av;
import com.ibm.icu.a.cc;
import com.ibm.icu.a.cf;
import com.ibm.icu.util.p;
import java.util.Set;

final class v
extends av {
    private p a;

    v(p p2) {
        super(p2.a());
        this.a = p2;
    }

    public Object a(cf cf2, cc cc2) {
        if (!this.a(cf2) || !(cf2 instanceof au)) {
            return null;
        }
        au au2 = (au)cf2;
        Object object = this.a.a(au2.f());
        if (object == null) {
            object = cc2.a(cf2, null, this);
        }
        return object;
    }

    protected Set a() {
        return this.a.b();
    }
}

