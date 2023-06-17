/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.e;

import java.io.OutputStream;
import java.nio.channels.ClosedChannelException;

final class h
extends OutputStream {
    h() {
    }

    @Override
    public void write(int n2) {
        throw new ClosedChannelException();
    }
}

