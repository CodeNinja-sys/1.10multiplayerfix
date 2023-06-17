/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.ba;
import io.netty.channel.bd;
import io.netty.channel.be;
import io.netty.channel.cf;
import io.netty.channel.k;
import io.netty.util.x;

final class cl
extends k
implements be {
    private static final String d = cf.d(cl.class);

    cl(cf cf2) {
        super(cf2, null, d, true, false);
    }

    @Override
    public ba x() {
        return this;
    }

    @Override
    public void g(bd bd2) {
    }

    @Override
    public void h(bd bd2) {
    }

    @Override
    public void a(bd bd2) {
    }

    @Override
    public void b(bd bd2) {
    }

    @Override
    public void j(bd bd2) {
    }

    @Override
    public void e(bd bd2) {
    }

    @Override
    public void f(bd bd2) {
    }

    @Override
    public void b(bd bd2, Object object) {
    }

    @Override
    public void a(bd bd2, Throwable throwable) {
        cf.a.d("An exceptionCaught() event was fired, and it reached at the tail of the pipeline. It usually means the last handler in the pipeline did not handle the exception.", throwable);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a_(bd bd2, Object object) {
        try {
            cf.a.b("Discarded inbound message {} that reached at the tail of the pipeline. Please check your pipeline configuration.", object);
        }
        finally {
            x.b(object);
        }
    }

    @Override
    public void i(bd bd2) {
    }
}

