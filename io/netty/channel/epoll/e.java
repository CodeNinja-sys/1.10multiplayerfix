/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.channel.bi;

public final class e
extends bi {
    public static final bi C = io.netty.channel.epoll.e.a("TCP_CORK");
    public static final bi D = io.netty.channel.epoll.e.a("TCP_KEEPIDLE");
    public static final bi E = io.netty.channel.epoll.e.a("TCP_KEEPINTVL");
    public static final bi F = io.netty.channel.epoll.e.a("TCP_KEEPCNT");
    public static final bi G = io.netty.channel.epoll.e.a("SO_REUSEPORT");

    private e(String string) {
        super(string);
    }
}

