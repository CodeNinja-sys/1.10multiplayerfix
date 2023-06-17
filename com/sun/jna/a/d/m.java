/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.l;
import com.sun.jna.ay;
import com.sun.jna.b.a;

public class m
extends a {
    public m() {
        this(new l(0L));
    }

    public m(l l2) {
        super(ay.H);
        this.a(l2);
    }

    public void a(l l2) {
        if (ay.H == 4) {
            this.c().a(0L, l2.intValue());
        } else {
            this.c().d(0L, l2.longValue());
        }
    }

    public l d() {
        return new l(ay.H == 4 ? (long)this.c().e(0L) : this.c().f(0L));
    }
}

