/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h.a;

import io.netty.channel.h.h;
import java.net.ProtocolFamily;
import java.net.StandardProtocolFamily;

final class i {
    private i() {
    }

    public static ProtocolFamily a(h h2) {
        switch (h2) {
            case a: {
                return StandardProtocolFamily.INET;
            }
            case b: {
                return StandardProtocolFamily.INET6;
            }
        }
        throw new IllegalArgumentException();
    }
}

