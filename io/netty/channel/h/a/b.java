/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h.a;

import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.h.a.a;
import io.netty.channel.h.c;
import io.netty.channel.h.e;
import io.netty.util.c.u;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.NetworkChannel;
import java.util.Enumeration;

class b
extends e {
    private static final Object b;
    private static final Object c;
    private static final Object d;
    private static final Method e;
    private static final Method f;
    private final DatagramChannel g;

    b(a a2, DatagramChannel datagramChannel) {
        super(a2, datagramChannel.socket());
        this.g = datagramChannel;
    }

    @Override
    public int s() {
        return (Integer)this.a(b);
    }

    @Override
    public c r(int n2) {
        this.a(b, (Object)n2);
        return this;
    }

    @Override
    public InetAddress t() {
        NetworkInterface networkInterface = this.u();
        if (networkInterface == null) {
            return null;
        }
        Enumeration<InetAddress> enumeration = networkInterface.getInetAddresses();
        if (enumeration.hasMoreElements()) {
            return enumeration.nextElement();
        }
        return null;
    }

    @Override
    public c b(InetAddress inetAddress) {
        try {
            this.b(NetworkInterface.getByInetAddress(inetAddress));
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
        return this;
    }

    @Override
    public NetworkInterface u() {
        return (NetworkInterface)this.a(c);
    }

    @Override
    public c b(NetworkInterface networkInterface) {
        this.a(c, (Object)networkInterface);
        return this;
    }

    @Override
    public boolean r() {
        return (Boolean)this.a(d);
    }

    @Override
    public c g(boolean bl2) {
        this.a(d, (Object)bl2);
        return this;
    }

    @Override
    public c j(boolean bl2) {
        super.j(bl2);
        return this;
    }

    @Override
    protected void l() {
        ((a)this.a).b(false);
    }

    private Object a(Object object) {
        if (u.d() < 7) {
            throw new UnsupportedOperationException();
        }
        try {
            return e.invoke(this.g, object);
        }
        catch (Exception exception) {
            throw new ar(exception);
        }
    }

    private void a(Object object, Object object2) {
        if (u.d() < 7) {
            throw new UnsupportedOperationException();
        }
        try {
            f.invoke(this.g, object, object2);
        }
        catch (Exception exception) {
            throw new ar(exception);
        }
    }

    @Override
    public /* synthetic */ ap a(boolean bl2) {
        return this.j(bl2);
    }

    static {
        ClassLoader classLoader = u.a(DatagramChannel.class);
        Class<?> class_ = null;
        try {
            class_ = Class.forName("java.net.SocketOption", true, classLoader);
        }
        catch (Exception exception) {
            // empty catch block
        }
        Class<?> class_2 = null;
        try {
            class_2 = Class.forName("java.net.StandardSocketOptions", true, classLoader);
        }
        catch (Exception exception) {
            // empty catch block
        }
        Object object = null;
        Object object2 = null;
        Object object3 = null;
        Method method = null;
        Method method2 = null;
        if (class_ != null) {
            try {
                object = class_2.getDeclaredField("IP_MULTICAST_TTL").get(null);
            }
            catch (Exception exception) {
                throw new Error("cannot locate the IP_MULTICAST_TTL field", exception);
            }
            try {
                object2 = class_2.getDeclaredField("IP_MULTICAST_IF").get(null);
            }
            catch (Exception exception) {
                throw new Error("cannot locate the IP_MULTICAST_IF field", exception);
            }
            try {
                object3 = class_2.getDeclaredField("IP_MULTICAST_LOOP").get(null);
            }
            catch (Exception exception) {
                throw new Error("cannot locate the IP_MULTICAST_LOOP field", exception);
            }
            try {
                method = NetworkChannel.class.getDeclaredMethod("getOption", class_);
            }
            catch (Exception exception) {
                throw new Error("cannot locate the getOption() method", exception);
            }
            try {
                method2 = NetworkChannel.class.getDeclaredMethod("setOption", class_, Object.class);
            }
            catch (Exception exception) {
                throw new Error("cannot locate the setOption() method", exception);
            }
        }
        b = object;
        c = object2;
        d = object3;
        e = method;
        f = method2;
    }
}

