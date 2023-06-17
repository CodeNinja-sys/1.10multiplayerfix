/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.g;

import com.sun.nio.sctp.Association;
import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.bw;
import io.netty.channel.g.d;
import io.netty.channel.g.h;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Set;

public interface c
extends an {
    public h g();

    public Association i();

    public InetSocketAddress u();

    public Set w();

    public d z();

    public InetSocketAddress C();

    public Set D();

    public av a(InetAddress var1);

    public av a(InetAddress var1, bw var2);

    public av b(InetAddress var1);

    public av b(InetAddress var1, bw var2);
}

