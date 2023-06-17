/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.d.ad;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.av;
import io.netty.c.a.d.bf;
import io.netty.c.a.d.bg;
import io.netty.c.a.d.bh;
import io.netty.c.a.d.bm;
import io.netty.c.a.d.bs;
import io.netty.c.a.d.j;
import io.netty.c.a.d.s;
import io.netty.c.a.h;
import io.netty.c.a.w;
import io.netty.util.c.a;
import java.util.List;

public abstract class bd
extends w {
    private final int c;
    private final int f;
    private final int h;
    private final boolean i;
    protected final boolean d;
    private final a j = new a(128);
    private final bf k = new bf(this, this.j);
    private final bg l = new bg(this, this.j);
    private av m;
    private long n;
    private int o;
    private long p = Long.MIN_VALUE;

    protected bd() {
        this(4096, 8192, 8192, true);
    }

    protected bd(int n2, int n3, int n4, boolean bl2) {
        this(n2, n3, n4, bl2, true);
    }

    protected bd(int n2, int n3, int n4, boolean bl2, boolean bl3) {
        super((Object)bh.a);
        if (n2 <= 0) {
            throw new IllegalArgumentException("maxInitialLineLength must be a positive integer: " + n2);
        }
        if (n3 <= 0) {
            throw new IllegalArgumentException("maxHeaderSize must be a positive integer: " + n3);
        }
        if (n4 <= 0) {
            throw new IllegalArgumentException("maxChunkSize must be a positive integer: " + n4);
        }
        this.c = n2;
        this.f = n3;
        this.h = n4;
        this.i = bl2;
        this.d = bl3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void a(io.netty.channel.bd bd2, g g2, List list) {
        switch ((bh)((Object)this.e())) {
            case a: {
                try {
                    bd.a(g2);
                    this.a((Object)bh.b);
                }
                finally {
                    this.d();
                }
            }
            case b: {
                String[] arrstring;
                try {
                    arrstring = bd.a(this.l.a(g2));
                    if (arrstring.length < 3) {
                        this.a((Object)bh.a);
                        return;
                    }
                    this.m = this.a(arrstring);
                    this.a((Object)bh.c);
                }
                catch (Exception exception) {
                    list.add(this.a(exception));
                    return;
                }
            }
            case c: {
                String[] arrstring;
                try {
                    arrstring = this.b(g2);
                    this.a((Object)arrstring);
                    if (arrstring == bh.f) {
                        if (!this.i) {
                            throw new IllegalArgumentException("Chunked messages not supported");
                        }
                        list.add(this.m);
                        return;
                    }
                    if (arrstring == bh.a) {
                        list.add(this.m);
                        list.add(bs.b);
                        this.h();
                        return;
                    }
                    long l2 = this.i();
                    if (l2 == 0L || l2 == -1L && this.f()) {
                        list.add(this.m);
                        list.add(bs.b);
                        this.h();
                        return;
                    }
                    assert (arrstring == bh.e || arrstring == bh.d);
                    list.add(this.m);
                    if (arrstring == bh.e) {
                        this.n = l2;
                    }
                    return;
                }
                catch (Exception exception) {
                    list.add(this.a(exception));
                    return;
                }
            }
            case d: {
                int n2 = Math.min(this.b(), this.h);
                if (n2 > 0) {
                    g g3 = io.netty.b.w.a(bd2.d(), g2, n2);
                    if (g2.u()) {
                        list.add(new j(g3));
                    } else {
                        list.add(new s(g3, this.d));
                        this.h();
                    }
                } else if (!g2.u()) {
                    list.add(bs.b);
                    this.h();
                }
                return;
            }
            case e: {
                int n3 = this.b();
                if (n3 == 0) {
                    return;
                }
                int n4 = Math.min(n3, this.h);
                if ((long)n4 > this.n) {
                    n4 = (int)this.n;
                }
                g g4 = io.netty.b.w.a(bd2.d(), g2, n4);
                this.n -= (long)n4;
                if (this.n == 0L) {
                    list.add(new s(g4, this.d));
                    this.h();
                } else {
                    list.add(new j(g4));
                }
                return;
            }
            case f: {
                try {
                    a a2 = this.l.a(g2);
                    int n5 = bd.a(a2.toString());
                    this.n = n5;
                    if (n5 == 0) {
                        this.a((Object)bh.i);
                        return;
                    }
                    this.a((Object)bh.g);
                }
                catch (Exception exception) {
                    list.add(this.b(exception));
                    return;
                }
            }
            case g: {
                assert (this.n <= Integer.MAX_VALUE);
                int n6 = Math.min((int)this.n, this.h);
                j j2 = new j(io.netty.b.w.a(bd2.d(), g2, n6));
                this.n -= (long)n6;
                list.add(j2);
                if (this.n == 0L) {
                    this.a((Object)bh.h);
                } else {
                    return;
                }
            }
            case h: {
                int n6;
                while (true) {
                    if ((n6 = g2.E()) == 13) {
                        if (g2.E() != 10) continue;
                        this.a((Object)bh.f);
                        return;
                    }
                    if (n6 == 10) {
                        this.a((Object)bh.f);
                        return;
                    }
                    this.d();
                }
            }
            case i: {
                try {
                    bs bs2 = this.c(g2);
                    list.add(bs2);
                    this.h();
                    return;
                }
                catch (Exception exception) {
                    list.add(this.b(exception));
                    return;
                }
            }
            case j: {
                g2.A(this.b());
                break;
            }
            case k: {
                int n7 = this.b();
                if (n7 <= 0) break;
                list.add(g2.y(this.b()));
                break;
            }
        }
    }

    @Override
    protected void b(io.netty.channel.bd bd2, g g2, List list) {
        this.a(bd2, g2, list);
        if (this.m != null) {
            boolean bl2 = this.f() ? true : this.i() > 0L;
            this.h();
            if (!bl2) {
                list.add(bs.b);
            }
        }
    }

    protected boolean a(av av2) {
        if (av2 instanceof bm) {
            bm bm2 = (bm)av2;
            int n2 = bm2.s().a();
            if (n2 >= 100 && n2 < 200) {
                return n2 != 101 || bm2.q().d("Sec-WebSocket-Accept");
            }
            switch (n2) {
                case 204: 
                case 205: 
                case 304: {
                    return true;
                }
            }
        }
        return false;
    }

    private void h() {
        bm bm2;
        av av2 = this.m;
        this.m = null;
        this.p = Long.MIN_VALUE;
        if (!this.f() && (bm2 = (bm)av2) != null && bm2.s().a() == 101) {
            this.a((Object)bh.k);
            return;
        }
        this.a((Object)bh.a);
    }

    private av a(Exception exception) {
        this.a((Object)bh.j);
        if (this.m != null) {
            this.m.a(io.netty.c.a.h.a(exception));
        } else {
            this.m = this.g();
            this.m.a(io.netty.c.a.h.a(exception));
        }
        av av2 = this.m;
        this.m = null;
        return av2;
    }

    private ad b(Exception exception) {
        this.a((Object)bh.j);
        s s2 = new s(bi.c);
        s2.a(io.netty.c.a.h.a(exception));
        this.m = null;
        return s2;
    }

    private static void a(g g2) {
        char c2;
        while (Character.isISOControl(c2 = (char)g2.F()) || Character.isWhitespace(c2)) {
        }
        g2.g(g2.p() - 1);
    }

    private bh b(g g2) {
        bh bh2;
        this.o = 0;
        av av2 = this.m;
        ar ar2 = av2.q();
        a a2 = this.k.a(g2);
        String string = null;
        String string2 = null;
        if (a2.length() > 0) {
            ar2.a();
            do {
                char c2 = a2.charAt(0);
                if (string != null && (c2 == ' ' || c2 == '\t')) {
                    string2 = string2 + ' ' + a2.toString().trim();
                    continue;
                }
                if (string != null) {
                    ar2.a(string, string2);
                }
                String[] arrstring = bd.b(a2);
                string = arrstring[0];
                string2 = arrstring[1];
            } while ((a2 = this.k.a(g2)).length() > 0);
            if (string != null) {
                ar2.a(string, (Object)string2);
            }
        }
        if (this.a(av2)) {
            ar.i(av2);
            bh2 = bh.a;
        } else {
            bh2 = ar.h(av2) ? bh.f : (this.i() >= 0L ? bh.e : bh.d);
        }
        return bh2;
    }

    private long i() {
        if (this.p == Long.MIN_VALUE) {
            this.p = ar.a(this.m, -1L);
        }
        return this.p;
    }

    private bs c(g g2) {
        this.o = 0;
        a a2 = this.k.a(g2);
        String string = null;
        if (a2.length() > 0) {
            s s2 = new s(bi.c, this.d);
            do {
                Object object;
                char c2 = a2.charAt(0);
                if (string != null && (c2 == ' ' || c2 == '\t')) {
                    object = s2.e().c(string);
                    if (object.isEmpty()) continue;
                    int n2 = object.size() - 1;
                    String string2 = (String)object.get(n2) + a2.toString().trim();
                    object.set(n2, string2);
                    continue;
                }
                object = bd.b(a2);
                String string3 = object[0];
                if (!(ar.a((CharSequence)string3, (CharSequence)"Content-Length") || ar.a((CharSequence)string3, (CharSequence)"Transfer-Encoding") || ar.a((CharSequence)string3, (CharSequence)"Trailer"))) {
                    s2.e().a(string3, object[1]);
                }
                string = string3;
            } while ((a2 = this.k.a(g2)).length() > 0);
            return s2;
        }
        return bs.b;
    }

    protected abstract boolean f();

    protected abstract av a(String[] var1);

    protected abstract av g();

    private static int a(String string) {
        string = string.trim();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 != ';' && !Character.isWhitespace(c2) && !Character.isISOControl(c2)) continue;
            string = string.substring(0, i2);
            break;
        }
        return Integer.parseInt(string, 16);
    }

    private static String[] a(a a2) {
        int n2 = bd.a(a2, 0);
        int n3 = bd.b(a2, n2);
        int n4 = bd.a(a2, n3);
        int n5 = bd.b(a2, n4);
        int n6 = bd.a(a2, n5);
        int n7 = bd.a((CharSequence)a2);
        return new String[]{a2.b(n2, n3), a2.b(n4, n5), n6 < n7 ? a2.b(n6, n7) : ""};
    }

    private static String[] b(a a2) {
        int n2;
        int n3;
        int n4;
        char c2;
        int n5;
        int n6 = a2.length();
        for (n5 = n4 = bd.a(a2, 0); n5 < n6 && (c2 = a2.charAt(n5)) != ':' && !Character.isWhitespace(c2); ++n5) {
        }
        for (n3 = n5; n3 < n6; ++n3) {
            if (a2.charAt(n3) != ':') continue;
            ++n3;
            break;
        }
        if ((n2 = bd.a(a2, n3)) == n6) {
            return new String[]{a2.b(n4, n5), ""};
        }
        int n7 = bd.a((CharSequence)a2);
        return new String[]{a2.b(n4, n5), a2.b(n2, n7)};
    }

    private static int a(CharSequence charSequence, int n2) {
        int n3;
        for (n3 = n2; n3 < charSequence.length() && Character.isWhitespace(charSequence.charAt(n3)); ++n3) {
        }
        return n3;
    }

    private static int b(CharSequence charSequence, int n2) {
        int n3;
        for (n3 = n2; n3 < charSequence.length() && !Character.isWhitespace(charSequence.charAt(n3)); ++n3) {
        }
        return n3;
    }

    private static int a(CharSequence charSequence) {
        int n2;
        for (n2 = charSequence.length(); n2 > 0 && Character.isWhitespace(charSequence.charAt(n2 - 1)); --n2) {
        }
        return n2;
    }

    static /* synthetic */ int a(bd bd2, int n2) {
        bd2.o = n2;
        return bd2.o;
    }

    static /* synthetic */ int a(bd bd2) {
        return bd2.o++;
    }

    static /* synthetic */ int b(bd bd2) {
        return bd2.o;
    }

    static /* synthetic */ int c(bd bd2) {
        return bd2.f;
    }

    static /* synthetic */ int d(bd bd2) {
        return bd2.c;
    }
}

