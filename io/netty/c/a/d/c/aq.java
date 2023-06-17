/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.c.a.d.bp;
import io.netty.c.a.d.br;
import io.netty.c.a.d.i;
import io.netty.c.a.d.v;
import io.netty.channel.bd;
import io.netty.channel.bf;

final class aq
extends bf {
    aq() {
    }

    @Override
    public void a_(bd bd2, Object object) {
        if (object instanceof v) {
            ((v)object).ad();
            i i2 = new i(br.b, bp.v);
            bd2.b().b(i2);
        } else {
            bd2.b(object);
        }
    }
}

