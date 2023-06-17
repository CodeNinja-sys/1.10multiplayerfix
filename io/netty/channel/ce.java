/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.ba;
import io.netty.channel.be;
import io.netty.channel.bp;
import io.netty.channel.cf;
import io.netty.channel.k;
import io.netty.util.b.x;

final class ce
extends k {
    private final ba d;

    ce(cf cf2, x x2, String string, ba ba2) {
        super(cf2, x2, string, ce.a(ba2), ce.b(ba2));
        if (ba2 == null) {
            throw new NullPointerException("handler");
        }
        this.d = ba2;
    }

    @Override
    public ba x() {
        return this.d;
    }

    private static boolean a(ba ba2) {
        return ba2 instanceof be;
    }

    private static boolean b(ba ba2) {
        return ba2 instanceof bp;
    }
}

