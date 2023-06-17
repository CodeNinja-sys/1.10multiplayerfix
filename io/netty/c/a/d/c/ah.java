/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.c.a.d.c.ac;
import io.netty.c.a.d.c.d;
import io.netty.c.a.d.c.e;
import io.netty.c.a.t;
import io.netty.channel.bd;
import java.util.List;

abstract class ah
extends t {
    ah() {
    }

    protected void a(bd bd2, ac ac2, List list) {
        if (ac2 instanceof d) {
            ac2.a().ab();
            bd2.b().b(new e(ac2.a()));
            return;
        }
        if (ac2 instanceof e) {
            return;
        }
        list.add(ac2.h());
    }

    @Override
    public void a(bd bd2, Throwable throwable) {
        bd2.n();
    }
}

