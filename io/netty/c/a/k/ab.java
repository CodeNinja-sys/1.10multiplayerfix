/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.b.g;
import io.netty.c.a.k.ac;
import io.netty.c.a.k.ai;
import io.netty.c.a.k.am;
import io.netty.c.a.k.bp;
import io.netty.util.c.u;

abstract class ab {
    ab() {
    }

    static ab a(bp bp2, int n2, int n3, int n4) {
        if (u.d() >= 7) {
            return new ai(bp2, n2);
        }
        return new ac(bp2, n2, n3, n4);
    }

    abstract g a(am var1);

    abstract void a();
}

