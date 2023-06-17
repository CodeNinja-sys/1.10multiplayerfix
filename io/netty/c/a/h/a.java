/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.h;

import io.netty.c.a.e;
import io.netty.c.a.h.b;
import io.netty.c.a.t;
import io.netty.channel.bd;
import io.netty.channel.g.f;
import java.util.List;

public class a
extends t {
    private final int a;
    private final int b;

    public a(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    @Override
    public final boolean a(Object object) {
        if (super.a(object)) {
            return this.a((f)object);
        }
        return false;
    }

    protected boolean a(f f2) {
        return f2.f() == this.a && f2.e() == this.b;
    }

    protected void a(bd bd2, f f2, List list) {
        if (!f2.h()) {
            throw new e(String.format("Received SctpMessage is not complete, please add %s in the pipeline before this handler", b.class.getSimpleName()));
        }
        list.add(f2.a().ab());
    }
}

