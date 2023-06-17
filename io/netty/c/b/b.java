/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.b;

import io.netty.b.i;
import io.netty.c.b.a;
import io.netty.channel.aq;
import io.netty.channel.bd;
import io.netty.channel.bw;
import io.netty.util.c.ad;
import io.netty.util.c.b.f;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import java.net.SocketAddress;

public class b
extends aq {
    private static final a c;
    private static final String d;
    private static final String[] e;
    private static final String[] f;
    private static final String[] h;
    private static final char[] i;
    protected final g a;
    protected final f b;
    private final a j;

    public b() {
        this(c);
    }

    public b(a a2) {
        if (a2 == null) {
            throw new NullPointerException("level");
        }
        this.a = io.netty.util.c.b.h.a(this.getClass());
        this.j = a2;
        this.b = a2.a();
    }

    public b(Class class_) {
        this(class_, c);
    }

    public b(Class class_, a a2) {
        if (class_ == null) {
            throw new NullPointerException("clazz");
        }
        if (a2 == null) {
            throw new NullPointerException("level");
        }
        this.a = io.netty.util.c.b.h.a(class_);
        this.j = a2;
        this.b = a2.a();
    }

    public b(String string) {
        this(string, c);
    }

    public b(String string, a a2) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        if (a2 == null) {
            throw new NullPointerException("level");
        }
        this.a = io.netty.util.c.b.h.b(string);
        this.j = a2;
        this.b = a2.a();
    }

    public a a() {
        return this.j;
    }

    protected String a(bd bd2, String string) {
        String string2 = bd2.b().toString();
        StringBuilder stringBuilder = new StringBuilder(string2.length() + string.length() + 1);
        stringBuilder.append(string2);
        stringBuilder.append(' ');
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    @Override
    public void g(bd bd2) {
        if (this.a.a(this.b)) {
            this.a.a(this.b, this.a(bd2, "REGISTERED"));
        }
        super.g(bd2);
    }

    @Override
    public void h(bd bd2) {
        if (this.a.a(this.b)) {
            this.a.a(this.b, this.a(bd2, "UNREGISTERED"));
        }
        super.h(bd2);
    }

    @Override
    public void a(bd bd2) {
        if (this.a.a(this.b)) {
            this.a.a(this.b, this.a(bd2, "ACTIVE"));
        }
        super.a(bd2);
    }

    @Override
    public void b(bd bd2) {
        if (this.a.a(this.b)) {
            this.a.a(this.b, this.a(bd2, "INACTIVE"));
        }
        super.b(bd2);
    }

    @Override
    public void a(bd bd2, Throwable throwable) {
        if (this.a.a(this.b)) {
            this.a.a(this.b, this.a(bd2, "EXCEPTION: " + throwable), throwable);
        }
        super.a(bd2, throwable);
    }

    @Override
    public void b(bd bd2, Object object) {
        if (this.a.a(this.b)) {
            this.a.a(this.b, this.a(bd2, "USER_EVENT: " + object));
        }
        super.b(bd2, object);
    }

    @Override
    public void a(bd bd2, SocketAddress socketAddress, bw bw2) {
        if (this.a.a(this.b)) {
            this.a.a(this.b, this.a(bd2, "BIND(" + socketAddress + ')'));
        }
        super.a(bd2, socketAddress, bw2);
    }

    @Override
    public void a(bd bd2, SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        if (this.a.a(this.b)) {
            this.a.a(this.b, this.a(bd2, "CONNECT(" + socketAddress + ", " + socketAddress2 + ')'));
        }
        super.a(bd2, socketAddress, socketAddress2, bw2);
    }

    @Override
    public void a(bd bd2, bw bw2) {
        if (this.a.a(this.b)) {
            this.a.a(this.b, this.a(bd2, "DISCONNECT()"));
        }
        super.a(bd2, bw2);
    }

    @Override
    public void b(bd bd2, bw bw2) {
        if (this.a.a(this.b)) {
            this.a.a(this.b, this.a(bd2, "CLOSE()"));
        }
        super.b(bd2, bw2);
    }

    @Override
    public void c(bd bd2, bw bw2) {
        if (this.a.a(this.b)) {
            this.a.a(this.b, this.a(bd2, "DEREGISTER()"));
        }
        super.c(bd2, bw2);
    }

    @Override
    public void a_(bd bd2, Object object) {
        this.a(bd2, "RECEIVED", object);
        bd2.b(object);
    }

    @Override
    public void a(bd bd2, Object object, bw bw2) {
        this.a(bd2, "WRITE", object);
        bd2.a(object, bw2);
    }

    @Override
    public void d(bd bd2) {
        if (this.a.a(this.b)) {
            this.a.a(this.b, this.a(bd2, "FLUSH"));
        }
        bd2.q();
    }

    private void a(bd bd2, String string, Object object) {
        if (this.a.a(this.b)) {
            this.a.a(this.b, this.a(bd2, this.a(string, object)));
        }
    }

    protected String a(String string, Object object) {
        if (object instanceof io.netty.b.g) {
            return this.a(string, (io.netty.b.g)object);
        }
        if (object instanceof i) {
            return this.a(string, (i)object);
        }
        return this.b(string, object);
    }

    protected String a(String string, io.netty.b.g g2) {
        int n2;
        int n3;
        int n4;
        int n5 = g2.r();
        int n6 = n5 / 16 + (n5 % 15 == 0 ? 0 : 1) + 4;
        StringBuilder stringBuilder = new StringBuilder(n6 * 80 + string.length() + 16);
        stringBuilder.append(string).append('(').append(n5).append('B').append(')');
        stringBuilder.append(d + "         +-------------------------------------------------+" + d + "         |  0  1  2  3  4  5  6  7  8  9  a  b  c  d  e  f |" + d + "+--------+-------------------------------------------------+----------------+");
        int n7 = g2.p();
        int n8 = g2.q();
        for (n4 = n7; n4 < n8; ++n4) {
            n3 = n4 - n7;
            n2 = n3 & 0xF;
            if (n2 == 0) {
                stringBuilder.append(d);
                stringBuilder.append(Long.toHexString((long)n3 & 0xFFFFFFFFL | 0x100000000L));
                stringBuilder.setCharAt(stringBuilder.length() - 9, '|');
                stringBuilder.append('|');
            }
            stringBuilder.append(e[g2.n(n4)]);
            if (n2 != 15) continue;
            stringBuilder.append(" |");
            for (int i2 = n4 - 15; i2 <= n4; ++i2) {
                stringBuilder.append(i[g2.n(i2)]);
            }
            stringBuilder.append('|');
        }
        if ((n4 - n7 & 0xF) != 0) {
            n3 = n5 & 0xF;
            stringBuilder.append(f[n3]);
            stringBuilder.append(" |");
            for (n2 = n4 - n3; n2 < n4; ++n2) {
                stringBuilder.append(i[g2.n(n2)]);
            }
            stringBuilder.append(h[n3]);
            stringBuilder.append('|');
        }
        stringBuilder.append(d + "+--------+-------------------------------------------------+----------------+");
        return stringBuilder.toString();
    }

    protected String b(String string, Object object) {
        return string + ": " + object;
    }

    protected String a(String string, i i2) {
        return this.a(string, i2.a());
    }

    static {
        int n2;
        StringBuilder stringBuilder;
        int n3;
        int n4;
        c = io.netty.c.b.a.b;
        d = ad.a;
        e = new String[256];
        f = new String[16];
        h = new String[16];
        i = new char[256];
        for (n4 = 0; n4 < e.length; ++n4) {
            io.netty.c.b.b.e[n4] = ' ' + ad.a(n4);
        }
        for (n4 = 0; n4 < f.length; ++n4) {
            n3 = f.length - n4;
            stringBuilder = new StringBuilder(n3 * 3);
            for (n2 = 0; n2 < n3; ++n2) {
                stringBuilder.append("   ");
            }
            io.netty.c.b.b.f[n4] = stringBuilder.toString();
        }
        for (n4 = 0; n4 < h.length; ++n4) {
            n3 = h.length - n4;
            stringBuilder = new StringBuilder(n3);
            for (n2 = 0; n2 < n3; ++n2) {
                stringBuilder.append(' ');
            }
            io.netty.c.b.b.h[n4] = stringBuilder.toString();
        }
        for (n4 = 0; n4 < i.length; ++n4) {
            io.netty.c.b.b.i[n4] = n4 <= 31 || n4 >= 127 ? 46 : (char)n4;
        }
    }
}

