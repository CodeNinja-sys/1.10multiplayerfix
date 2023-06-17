/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.c.a;
import com.sun.jna.a.c.f;
import com.sun.jna.a.j;
import com.sun.jna.a.l;

class n
extends l {
    private n() {
        super(null);
    }

    private int b(int n2, int n3) {
        if (n2 >= 65 && n2 <= 90) {
            return 97 + (n2 - 65);
        }
        if (n2 >= 48 && n2 <= 57) {
            return 48 + (n2 - 48);
        }
        if (n2 == 16) {
            if ((n3 & 3) != 0) {
                return 65505;
            }
            return 65505;
        }
        if (n2 == 17) {
            if ((n3 & 3) != 0) {
                return 65508;
            }
            return 65507;
        }
        if (n2 == 18) {
            if ((n3 & 3) != 0) {
                return 65514;
            }
            return 65513;
        }
        if (n2 == 157) {
            if ((n3 & 3) != 0) {
                return 65512;
            }
            return 65511;
        }
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(int n2, int n3) {
        a a2 = a.g;
        f f2 = a2.a((String)null);
        if (f2 == null) {
            throw new Error("Can't open X Display");
        }
        try {
            byte[] arrby = new byte[32];
            a2.a(f2, arrby);
            int n4 = this.b(n2, n3);
            for (int i2 = 5; i2 < 256; ++i2) {
                int n5;
                int n6 = i2 / 8;
                int n7 = i2 % 8;
                if ((arrby[n6] & 1 << n7) == 0 || (n5 = a2.a(f2, (byte)i2, 0).intValue()) != n4) continue;
                boolean bl2 = true;
                return bl2;
            }
        }
        finally {
            a2.f(f2);
        }
        return false;
    }

    /* synthetic */ n(j j2) {
        this();
    }
}

