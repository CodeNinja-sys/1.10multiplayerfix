/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h;

import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.bw;
import io.netty.channel.h.c;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;

public interface b
extends an {
    public c T();

    public InetSocketAddress K();

    public InetSocketAddress J();

    public boolean P();

    public av a(InetAddress var1);

    public av a(InetAddress var1, bw var2);

    public av a(InetSocketAddress var1, NetworkInterface var2);

    public av a(InetSocketAddress var1, NetworkInterface var2, bw var3);

    public av a(InetAddress var1, NetworkInterface var2, InetAddress var3);

    public av a(InetAddress var1, NetworkInterface var2, InetAddress var3, bw var4);

    public av b(InetAddress var1);

    public av b(InetAddress var1, bw var2);

    public av b(InetSocketAddress var1, NetworkInterface var2);

    public av b(InetSocketAddress var1, NetworkInterface var2, bw var3);

    public av b(InetAddress var1, NetworkInterface var2, InetAddress var3);

    public av b(InetAddress var1, NetworkInterface var2, InetAddress var3, bw var4);

    public av c(InetAddress var1, NetworkInterface var2, InetAddress var3);

    public av c(InetAddress var1, NetworkInterface var2, InetAddress var3, bw var4);

    public av a(InetAddress var1, InetAddress var2);

    public av a(InetAddress var1, InetAddress var2, bw var3);
}

