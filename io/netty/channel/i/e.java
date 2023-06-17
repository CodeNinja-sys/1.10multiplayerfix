/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.i;

import io.netty.channel.bi;

public final class e
extends bi {
    public static final e C = new e("PROTOCOL_RECEIVE_BUFFER_SIZE");
    public static final e D = new e("PROTOCOL_SEND_BUFFER_SIZE");
    public static final e E = new e("SYSTEM_RECEIVE_BUFFER_SIZE");
    public static final e F = new e("SYSTEM_SEND_BUFFER_SIZE");

    private e(String string) {
        super(string);
    }
}

