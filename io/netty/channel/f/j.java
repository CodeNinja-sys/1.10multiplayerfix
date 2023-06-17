/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.f;

import io.netty.channel.bi;

public final class j
extends bi {
    public static final j C = new j("BAUD_RATE");
    public static final j D = new j("DTR");
    public static final j E = new j("RTS");
    public static final j F = new j("STOP_BITS");
    public static final j G = new j("DATA_BITS");
    public static final j H = new j("PARITY_BIT");
    public static final j I = new j("WAIT_TIME");
    public static final j J = new j("READ_TIMEOUT");

    private j(String string) {
        super(string);
    }
}

