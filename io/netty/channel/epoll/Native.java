/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.channel.DefaultFileRegion;
import io.netty.channel.ar;
import io.netty.channel.epoll.EpollDatagramChannel$DatagramSocketAddress;
import io.netty.channel.epoll.v;
import io.netty.util.c.ae;
import io.netty.util.c.p;
import io.netty.util.c.u;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.Locale;

final class Native {
    private static final byte[] f = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1};
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e;

    public static native int eventFd();

    public static native void eventFdWrite(int var0, long var1);

    public static native void eventFdRead(int var0);

    public static native int epollCreate();

    public static native int epollWait(int var0, long[] var1, int var2);

    public static native void epollCtlAdd(int var0, int var1, int var2, int var3);

    public static native void epollCtlMod(int var0, int var1, int var2, int var3);

    public static native void epollCtlDel(int var0, int var1);

    public static native void close(int var0);

    public static native int write(int var0, ByteBuffer var1, int var2, int var3);

    public static native int writeAddress(int var0, long var1, int var3, int var4);

    public static native long writev(int var0, ByteBuffer[] var1, int var2, int var3);

    public static native long writevAddresses(int var0, long var1, int var3);

    public static native int read(int var0, ByteBuffer var1, int var2, int var3);

    public static native int readAddress(int var0, long var1, int var3, int var4);

    public static native long sendfile(int var0, DefaultFileRegion var1, long var2, long var4, long var6);

    public static int a(int n2, ByteBuffer byteBuffer, int n3, int n4, InetAddress inetAddress, int n5) {
        int n6;
        byte[] arrby;
        if (inetAddress instanceof Inet6Address) {
            arrby = inetAddress.getAddress();
            n6 = ((Inet6Address)inetAddress).getScopeId();
        } else {
            n6 = 0;
            arrby = Native.a(inetAddress.getAddress());
        }
        return Native.sendTo(n2, byteBuffer, n3, n4, arrby, n6, n5);
    }

    private static native int sendTo(int var0, ByteBuffer var1, int var2, int var3, byte[] var4, int var5, int var6);

    public static int a(int n2, long l2, int n3, int n4, InetAddress inetAddress, int n5) {
        int n6;
        byte[] arrby;
        if (inetAddress instanceof Inet6Address) {
            arrby = inetAddress.getAddress();
            n6 = ((Inet6Address)inetAddress).getScopeId();
        } else {
            n6 = 0;
            arrby = Native.a(inetAddress.getAddress());
        }
        return Native.sendToAddress(n2, l2, n3, n4, arrby, n6, n5);
    }

    private static native int sendToAddress(int var0, long var1, int var3, int var4, byte[] var5, int var6, int var7);

    public static native EpollDatagramChannel$DatagramSocketAddress recvFrom(int var0, ByteBuffer var1, int var2, int var3);

    public static native EpollDatagramChannel$DatagramSocketAddress recvFromAddress(int var0, long var1, int var3, int var4);

    public static int a() {
        try {
            return Native.socketStream();
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
    }

    public static int b() {
        try {
            return Native.socketDgram();
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
    }

    private static native int socketStream();

    private static native int socketDgram();

    public static void a(int n2, InetAddress inetAddress, int n3) {
        v v2 = Native.a(inetAddress);
        Native.bind(n2, v2.a, v2.b, n3);
    }

    private static byte[] a(byte[] arrby) {
        byte[] arrby2 = new byte[16];
        System.arraycopy(f, 0, arrby2, 0, f.length);
        System.arraycopy(arrby, 0, arrby2, 12, arrby.length);
        return arrby2;
    }

    public static native void bind(int var0, byte[] var1, int var2, int var3);

    public static native void listen(int var0, int var1);

    public static boolean b(int n2, InetAddress inetAddress, int n3) {
        v v2 = Native.a(inetAddress);
        return Native.connect(n2, v2.a, v2.b, n3);
    }

    public static native boolean connect(int var0, byte[] var1, int var2, int var3);

    public static native boolean finishConnect(int var0);

    public static native InetSocketAddress remoteAddress(int var0);

    public static native InetSocketAddress localAddress(int var0);

    public static native int accept(int var0);

    public static native void shutdown(int var0, boolean var1, boolean var2);

    public static native int getReceiveBufferSize(int var0);

    public static native int getSendBufferSize(int var0);

    public static native int isKeepAlive(int var0);

    public static native int isReuseAddress(int var0);

    public static native int isReusePort(int var0);

    public static native int isTcpNoDelay(int var0);

    public static native int isTcpCork(int var0);

    public static native int getSoLinger(int var0);

    public static native int getTrafficClass(int var0);

    public static native int isBroadcast(int var0);

    public static native int getTcpKeepIdle(int var0);

    public static native int getTcpKeepIntvl(int var0);

    public static native int getTcpKeepCnt(int var0);

    public static native void setKeepAlive(int var0, int var1);

    public static native void setReceiveBufferSize(int var0, int var1);

    public static native void setReuseAddress(int var0, int var1);

    public static native void setReusePort(int var0, int var1);

    public static native void setSendBufferSize(int var0, int var1);

    public static native void setTcpNoDelay(int var0, int var1);

    public static native void setTcpCork(int var0, int var1);

    public static native void setSoLinger(int var0, int var1);

    public static native void setTrafficClass(int var0, int var1);

    public static native void setBroadcast(int var0, int var1);

    public static native void setTcpKeepIdle(int var0, int var1);

    public static native void setTcpKeepIntvl(int var0, int var1);

    public static native void setTcpKeepCnt(int var0, int var1);

    private static v a(InetAddress inetAddress) {
        byte[] arrby = inetAddress.getAddress();
        if (inetAddress instanceof Inet6Address) {
            return new v(arrby, ((Inet6Address)inetAddress).getScopeId());
        }
        return new v(Native.a(arrby));
    }

    public static native String kernelVersion();

    private static native int iovMax();

    private Native() {
    }

    static {
        String string = ae.b("os.name").toLowerCase(Locale.UK).trim();
        if (!string.startsWith("linux")) {
            throw new IllegalStateException("Only supported on Linux");
        }
        p.a("netty-transport-native-epoll", u.a(Native.class));
        e = Native.iovMax();
    }
}

