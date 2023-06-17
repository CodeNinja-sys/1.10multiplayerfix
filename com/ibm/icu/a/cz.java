/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bc;
import com.ibm.icu.a.cb;
import com.ibm.icu.a.cv;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dv;

class cz
extends cv {
    private final bc a;

    public cz(String string, dn dn2) {
        this.a = (bc)dv.b(string, dn2.k());
    }

    public dn a() {
        return this.a.i();
    }

    public String a(String string, String string2, String string3) {
        return cb.a(this.a, string, string2, string3);
    }
}

