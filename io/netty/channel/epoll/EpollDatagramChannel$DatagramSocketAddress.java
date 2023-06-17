/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import java.net.InetSocketAddress;

final class EpollDatagramChannel$DatagramSocketAddress
extends InetSocketAddress {
    private static final long b = 1348596211215015739L;
    final int a;

    EpollDatagramChannel$DatagramSocketAddress(String string, int n2, int n3) {
        super(string, n2);
        this.a = n3;
    }
}

