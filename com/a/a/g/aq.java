/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.g.ae;
import com.a.a.g.ai;
import com.a.a.g.aj;
import com.a.a.g.b;

final class aq
extends b {
    private final int b;

    aq(ai ... arrai) {
        super(arrai);
        int n2 = 0;
        for (ai ai2 : arrai) {
            n2 += ai2.b();
        }
        this.b = n2;
    }

    @Override
    ae a(aj[] arraj) {
        byte[] arrby = new byte[this.b / 8];
        int n2 = 0;
        for (aj aj2 : arraj) {
            ae ae2 = aj2.a();
            n2 += ae2.a(arrby, n2, ae2.a() / 8);
        }
        return ae.b(arrby);
    }

    @Override
    public int b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object instanceof aq) {
            aq aq2 = (aq)object;
            if (this.b != aq2.b || this.a.length != aq2.a.length) {
                return false;
            }
            for (int i2 = 0; i2 < this.a.length; ++i2) {
                if (this.a[i2].equals(aq2.a[i2])) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.b;
        for (ai ai2 : this.a) {
            n2 ^= ai2.hashCode();
        }
        return n2;
    }
}

