/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.ba;
import io.netty.channel.bd;
import io.netty.channel.bw;
import io.netty.util.b.x;
import java.net.SocketAddress;
import java.util.List;
import java.util.Map;

public interface br
extends Iterable {
    public br a(String var1, ba var2);

    public br a(x var1, String var2, ba var3);

    public br b(String var1, ba var2);

    public br b(x var1, String var2, ba var3);

    public br a(String var1, String var2, ba var3);

    public br a(x var1, String var2, String var3, ba var4);

    public br b(String var1, String var2, ba var3);

    public br b(x var1, String var2, String var3, ba var4);

    public br a(ba ... var1);

    public br a(x var1, ba ... var2);

    public br b(ba ... var1);

    public br b(x var1, ba ... var2);

    public br a(ba var1);

    public ba a(String var1);

    public ba a(Class var1);

    public ba a();

    public ba b();

    public br a(ba var1, String var2, ba var3);

    public ba c(String var1, String var2, ba var3);

    public ba a(Class var1, String var2, ba var3);

    public ba c();

    public bd d();

    public ba e();

    public bd f();

    public ba b(String var1);

    public ba b(Class var1);

    public bd b(ba var1);

    public bd c(String var1);

    public bd c(Class var1);

    public an g();

    public List h();

    public Map i();

    public br j();

    public br k();

    public br l();

    public br m();

    public br a(Throwable var1);

    public br a(Object var1);

    public br b(Object var1);

    public br n();

    public br o();

    public av a(SocketAddress var1);

    public av b(SocketAddress var1);

    public av a(SocketAddress var1, SocketAddress var2);

    public av p();

    public av q();

    public av r();

    public av a(SocketAddress var1, bw var2);

    public av b(SocketAddress var1, bw var2);

    public av a(SocketAddress var1, SocketAddress var2, bw var3);

    public av a(bw var1);

    public av b(bw var1);

    public av c(bw var1);

    public br s();

    public av c(Object var1);

    public av a(Object var1, bw var2);

    public br t();

    public av b(Object var1, bw var2);

    public av d(Object var1);
}

