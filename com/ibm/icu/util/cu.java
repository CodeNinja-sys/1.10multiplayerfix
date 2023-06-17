/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.cs;
import com.ibm.icu.util.da;
import com.ibm.icu.util.de;

final class cu
extends de {
    private int e;
    private da f;

    public cu(int n2, da da2) {
        this.e = n2;
        this.f = da2;
    }

    public int hashCode() {
        return (0xECCCCBE + this.e) * 37 + this.f.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!super.equals(object)) {
            return false;
        }
        cu cu2 = (cu)object;
        return this.e == cu2.e && this.f == cu2.f;
    }

    public int a(int n2) {
        if (this.d == 0) {
            this.d = n2 = this.f.a(n2);
        }
        return n2;
    }

    public void a(cs cs2) {
        this.f.a(cs2);
        if (this.e <= cs2.d()) {
            this.d = cs2.a(this.a, this.b, this.e - 1);
        } else {
            cs2.a(this.e - 1);
            this.d = cs2.a(this.a, this.b, 0);
        }
    }
}

