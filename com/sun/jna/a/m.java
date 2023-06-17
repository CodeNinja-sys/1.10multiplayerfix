/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.d.di;
import com.sun.jna.a.j;
import com.sun.jna.a.l;

class m
extends l {
    private m() {
        super(null);
    }

    private int b(int n2, int n3) {
        if (n2 >= 65 && n2 <= 90 || n2 >= 48 && n2 <= 57) {
            return n2;
        }
        if (n2 == 16) {
            if ((n3 & 3) != 0) {
                return 161;
            }
            if ((n3 & 2) != 0) {
                return 160;
            }
            return 16;
        }
        if (n2 == 17) {
            if ((n3 & 3) != 0) {
                return 163;
            }
            if ((n3 & 2) != 0) {
                return 162;
            }
            return 17;
        }
        if (n2 == 18) {
            if ((n3 & 3) != 0) {
                return 165;
            }
            if ((n3 & 2) != 0) {
                return 164;
            }
            return 18;
        }
        return 0;
    }

    public boolean a(int n2, int n3) {
        di di2 = di.g;
        return (di2.a(this.b(n2, n3)) & 0x8000) != 0;
    }

    /* synthetic */ m(j j2) {
        this();
    }
}

