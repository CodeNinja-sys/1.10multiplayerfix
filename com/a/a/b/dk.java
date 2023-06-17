/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.dg;
import com.a.a.b.dj;
import com.a.a.b.dr;

class dk
extends dr {
    final /* synthetic */ dj a;

    dk(dj dj2, dg dg2, CharSequence charSequence) {
        this.a = dj2;
        super(dg2, charSequence);
    }

    @Override
    public int a(int n2) {
        int n3 = this.a.a.length();
        int n4 = this.c.length() - n3;
        block0: for (int i2 = n2; i2 <= n4; ++i2) {
            for (int i3 = 0; i3 < n3; ++i3) {
                if (this.c.charAt(i3 + i2) != this.a.a.charAt(i3)) continue block0;
            }
            return i2;
        }
        return -1;
    }

    @Override
    public int b(int n2) {
        return n2 + this.a.a.length();
    }
}

