/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.ca;
import io.netty.util.b.ab;
import io.netty.util.b.w;
import io.netty.util.c.u;

final class cu
extends ca {
    private final Throwable a;

    cu(an an2, w w2, Throwable throwable) {
        super(an2, w2);
        if (throwable == null) {
            throw new NullPointerException("cause");
        }
        this.a = throwable;
    }

    @Override
    public Throwable bq_() {
        return this.a;
    }

    @Override
    public boolean bo_() {
        return false;
    }

    @Override
    public av f() {
        u.a(this.a);
        return this;
    }

    @Override
    public av g() {
        u.a(this.a);
        return this;
    }

    @Override
    public /* synthetic */ ab bj_() {
        return this.g();
    }

    @Override
    public /* synthetic */ ab bl_() {
        return this.f();
    }
}

