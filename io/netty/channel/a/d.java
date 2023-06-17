/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.a;

import io.netty.channel.a.a;
import io.netty.channel.a.b;
import io.netty.channel.bd;
import io.netty.channel.bf;

final class d
extends bf {
    final /* synthetic */ a a;

    private d(a a2) {
        this.a = a2;
    }

    @Override
    public void a_(bd bd2, Object object) {
        io.netty.channel.a.a.a(this.a).add(object);
    }

    @Override
    public void a(bd bd2, Throwable throwable) {
        io.netty.channel.a.a.a(this.a, throwable);
    }

    /* synthetic */ d(a a2, b b2) {
        this(a2);
    }
}

