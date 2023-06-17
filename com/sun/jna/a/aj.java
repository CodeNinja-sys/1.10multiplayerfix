/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.af;
import com.sun.jna.a.d.fe;
import com.sun.jna.a.d.y;
import com.sun.jna.a.q;

class aj
implements q {
    final /* synthetic */ fe a;
    final /* synthetic */ fe b;
    final /* synthetic */ af c;

    aj(af af2, fe fe2, fe fe3) {
        this.c = af2;
        this.a = fe2;
        this.b = fe3;
    }

    public boolean a(int n2, int n3, int n4, int n5) {
        y y2 = y.g;
        y2.a(this.a, n2, n3, n2 + n4, n3 + n5);
        return y2.a(this.b, this.b, this.a, 2) != 0;
    }
}

