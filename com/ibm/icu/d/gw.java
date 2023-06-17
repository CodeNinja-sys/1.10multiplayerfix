/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.au;
import com.ibm.icu.a.av;
import com.ibm.icu.a.cc;
import com.ibm.icu.a.cf;
import com.ibm.icu.d.gs;
import java.util.Set;

final class gw
extends av {
    private gs a;

    gw(gs gs2) {
        super(gs2.a());
        this.a = gs2;
    }

    public Object a(cf cf2, cc cc2) {
        if (!this.a(cf2) || !(cf2 instanceof au)) {
            return null;
        }
        au au2 = (au)cf2;
        Object object = this.a.a(au2.f(), au2.b());
        if (object == null) {
            object = cc2.a(cf2, null, this);
        }
        return object;
    }

    protected Set a() {
        return this.a.b();
    }
}

