/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.cs;
import com.ibm.icu.util.da;
import com.ibm.icu.util.de;

final class cx
extends de {
    private da e;

    public cx(int n2, da da2) {
        this.e = da2;
        this.b(n2);
    }

    public int hashCode() {
        return (0x4EEEEEA + this.b) * 37 + this.e.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!super.equals(object)) {
            return false;
        }
        cx cx2 = (cx)object;
        return this.e == cx2.e;
    }

    public int a(int n2) {
        if (this.d == 0) {
            this.d = n2 = this.e.a(n2);
        }
        return n2;
    }

    public void a(cs cs2) {
        this.e.a(cs2);
        this.d = cs2.a(this.b, false);
    }
}

