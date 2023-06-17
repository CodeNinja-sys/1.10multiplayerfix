/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.h;

import io.netty.c.a.e;
import io.netty.c.a.h.b;
import io.netty.c.a.t;
import io.netty.channel.g.f;

public abstract class c
extends t {
    @Override
    public boolean a(Object object) {
        if (object instanceof f) {
            f f2 = (f)object;
            if (f2.h()) {
                return true;
            }
            throw new e(String.format("Received SctpMessage is not complete, please add %s in the pipeline before this handler", b.class.getSimpleName()));
        }
        return false;
    }
}

