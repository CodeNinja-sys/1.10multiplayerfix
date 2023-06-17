/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.hd;
import com.ibm.icu.d.hf;
import com.ibm.icu.d.ho;
import com.ibm.icu.util.dn;

final class es
implements hd {
    private dn a;
    private hf b;
    private ho c;

    public es(dn dn2, ho ho2) {
        this.a = dn2;
        this.c = ho2;
    }

    public String a(double d2) {
        if (this.b == null) {
            this.b = hf.a(this.a, this.c);
        }
        return this.b.a(d2);
    }
}

