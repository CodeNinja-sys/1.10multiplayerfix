/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.g;

import io.netty.channel.bi;

public class e
extends bi {
    public static final e C = new e("SCTP_DISABLE_FRAGMENTS");
    public static final e D = new e("SCTP_EXPLICIT_COMPLETE");
    public static final e E = new e("SCTP_FRAGMENT_INTERLEAVE");
    public static final e F = new e("SCTP_INIT_MAXSTREAMS");
    public static final e G = new e("SCTP_NODELAY");
    public static final e H = new e("SCTP_PRIMARY_ADDR");
    public static final e I = new e("SCTP_SET_PEER_PRIMARY_ADDR");

    protected e(String string) {
        super(string);
    }
}

