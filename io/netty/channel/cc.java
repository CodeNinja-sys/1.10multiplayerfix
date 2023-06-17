/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.am;
import io.netty.util.c.ad;
import io.netty.util.x;
import io.netty.util.z;
import java.net.SocketAddress;

public class cc
implements am {
    private final Object a;
    private final SocketAddress b;
    private final SocketAddress c;

    public cc(Object object, SocketAddress socketAddress, SocketAddress socketAddress2) {
        if (object == null) {
            throw new NullPointerException("message");
        }
        this.a = object;
        this.b = socketAddress2;
        this.c = socketAddress;
    }

    public cc(Object object, SocketAddress socketAddress) {
        this(object, socketAddress, null);
    }

    @Override
    public Object e() {
        return this.a;
    }

    @Override
    public SocketAddress f() {
        return this.b;
    }

    @Override
    public SocketAddress g() {
        return this.c;
    }

    @Override
    public int ac() {
        if (this.a instanceof z) {
            return ((z)this.a).ac();
        }
        return 1;
    }

    public am h() {
        x.a(this.a);
        return this;
    }

    public am b(int n2) {
        x.a(this.a, n2);
        return this;
    }

    @Override
    public boolean ad() {
        return x.b(this.a);
    }

    @Override
    public boolean I(int n2) {
        return x.b(this.a, n2);
    }

    public String toString() {
        if (this.b != null) {
            return ad.a(this) + '(' + this.b + " => " + this.c + ", " + this.a + ')';
        }
        return ad.a(this) + "(=> " + this.c + ", " + this.a + ')';
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.h();
    }
}

