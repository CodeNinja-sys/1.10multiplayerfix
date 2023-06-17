/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.barchart.udt.SocketUDT
 *  com.barchart.udt.TypeUDT
 *  com.barchart.udt.nio.ChannelUDT
 *  com.barchart.udt.nio.KindUDT
 *  com.barchart.udt.nio.RendezvousChannelUDT
 *  com.barchart.udt.nio.SelectorProviderUDT
 *  com.barchart.udt.nio.ServerSocketChannelUDT
 *  com.barchart.udt.nio.SocketChannelUDT
 */
package io.netty.channel.i.a;

import com.barchart.udt.SocketUDT;
import com.barchart.udt.TypeUDT;
import com.barchart.udt.nio.ChannelUDT;
import com.barchart.udt.nio.KindUDT;
import com.barchart.udt.nio.RendezvousChannelUDT;
import com.barchart.udt.nio.SelectorProviderUDT;
import com.barchart.udt.nio.ServerSocketChannelUDT;
import com.barchart.udt.nio.SocketChannelUDT;
import io.netty.channel.an;
import io.netty.channel.ar;
import io.netty.channel.i.a.b;
import io.netty.channel.i.a.e;
import io.netty.channel.i.a.f;
import io.netty.channel.i.a.g;
import io.netty.channel.i.a.i;
import io.netty.channel.i.c;
import java.io.IOException;
import java.nio.channels.spi.SelectorProvider;

public final class j
implements io.netty.a.i {
    public static final io.netty.a.i a = new j(TypeUDT.STREAM, KindUDT.ACCEPTOR);
    public static final io.netty.a.i b = new j(TypeUDT.STREAM, KindUDT.CONNECTOR);
    public static final SelectorProvider c = SelectorProviderUDT.STREAM;
    public static final io.netty.a.i d = new j(TypeUDT.STREAM, KindUDT.RENDEZVOUS);
    public static final io.netty.a.i e = new j(TypeUDT.DATAGRAM, KindUDT.ACCEPTOR);
    public static final io.netty.a.i f = new j(TypeUDT.DATAGRAM, KindUDT.CONNECTOR);
    public static final SelectorProvider g = SelectorProviderUDT.DATAGRAM;
    public static final io.netty.a.i h = new j(TypeUDT.DATAGRAM, KindUDT.RENDEZVOUS);
    private final KindUDT i;
    private final TypeUDT j;

    public static ChannelUDT a(an an2) {
        if (an2 instanceof b) {
            return ((b)an2).K();
        }
        if (an2 instanceof io.netty.channel.i.a.c) {
            return ((io.netty.channel.i.a.c)an2).J();
        }
        if (an2 instanceof e) {
            return ((e)an2).J();
        }
        if (an2 instanceof f) {
            return ((f)an2).K();
        }
        if (an2 instanceof g) {
            return ((g)an2).J();
        }
        if (an2 instanceof i) {
            return ((i)an2).J();
        }
        return null;
    }

    static ServerSocketChannelUDT a(TypeUDT typeUDT) {
        try {
            return SelectorProviderUDT.from((TypeUDT)typeUDT).openServerSocketChannel();
        }
        catch (IOException iOException) {
            throw new ar("failed to open a server socket channel", iOException);
        }
    }

    static SocketChannelUDT b(TypeUDT typeUDT) {
        try {
            return SelectorProviderUDT.from((TypeUDT)typeUDT).openSocketChannel();
        }
        catch (IOException iOException) {
            throw new ar("failed to open a socket channel", iOException);
        }
    }

    static RendezvousChannelUDT c(TypeUDT typeUDT) {
        try {
            return SelectorProviderUDT.from((TypeUDT)typeUDT).openRendezvousChannel();
        }
        catch (IOException iOException) {
            throw new ar("failed to open a rendezvous channel", iOException);
        }
    }

    public static SocketUDT b(an an2) {
        ChannelUDT channelUDT = io.netty.channel.i.a.j.a(an2);
        if (channelUDT == null) {
            return null;
        }
        return channelUDT.socketUDT();
    }

    private j(TypeUDT typeUDT, KindUDT kindUDT) {
        this.j = typeUDT;
        this.i = kindUDT;
    }

    public KindUDT b() {
        return this.i;
    }

    public c c() {
        switch (this.i) {
            case ACCEPTOR: {
                switch (this.j) {
                    case DATAGRAM: {
                        return new f();
                    }
                    case STREAM: {
                        return new b();
                    }
                }
                throw new IllegalStateException("wrong type=" + (Object)this.j);
            }
            case CONNECTOR: {
                switch (this.j) {
                    case DATAGRAM: {
                        return new g();
                    }
                    case STREAM: {
                        return new io.netty.channel.i.a.c();
                    }
                }
                throw new IllegalStateException("wrong type=" + (Object)this.j);
            }
            case RENDEZVOUS: {
                switch (this.j) {
                    case DATAGRAM: {
                        return new i();
                    }
                    case STREAM: {
                        return new e();
                    }
                }
                throw new IllegalStateException("wrong type=" + (Object)this.j);
            }
        }
        throw new IllegalStateException("wrong kind=" + (Object)this.i);
    }

    public TypeUDT d() {
        return this.j;
    }

    @Override
    public /* synthetic */ an a() {
        return this.c();
    }
}

