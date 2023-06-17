/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.a;

import io.netty.channel.a.c;
import io.netty.channel.a.d;
import io.netty.channel.a.e;
import io.netty.channel.a.f;
import io.netty.channel.ap;
import io.netty.channel.av;
import io.netty.channel.b;
import io.netty.channel.ba;
import io.netty.channel.bh;
import io.netty.channel.bj;
import io.netty.channel.br;
import io.netty.channel.cd;
import io.netty.channel.cr;
import io.netty.util.c.aa;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.c.u;
import io.netty.util.x;
import java.net.SocketAddress;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayDeque;
import java.util.Queue;

public class a
extends io.netty.channel.a {
    private static final g d = io.netty.util.c.b.h.a(a.class);
    private static final bh e = new bh(false);
    private final e f = new e();
    private final ap g = new cd(this);
    private final SocketAddress h = new f();
    private final SocketAddress i = new f();
    private final Queue j = new ArrayDeque();
    private final Queue k = new ArrayDeque();
    private Throwable l;
    private int m;

    public a(ba ... arrba) {
        super(null);
        if (arrba == null) {
            throw new NullPointerException("handlers");
        }
        int n2 = 0;
        br br2 = this.c();
        for (ba ba2 : arrba) {
            if (ba2 == null) break;
            ++n2;
            br2.b(new ba[]{ba2});
        }
        if (n2 == 0) {
            throw new IllegalArgumentException("handlers is empty.");
        }
        this.f.a(this);
        br2.b(new ba[]{new d(this, null)});
    }

    @Override
    public bh F() {
        return e;
    }

    @Override
    public ap G() {
        return this.g;
    }

    @Override
    public boolean H() {
        return this.m < 2;
    }

    @Override
    public boolean I() {
        return this.m == 1;
    }

    public Queue J() {
        return this.j;
    }

    public Queue K() {
        return this.J();
    }

    public Queue L() {
        return this.k;
    }

    public Queue M() {
        return this.L();
    }

    public Object N() {
        return this.j.poll();
    }

    public Object O() {
        return this.k.poll();
    }

    public boolean a(Object ... arrobject) {
        this.S();
        if (arrobject.length == 0) {
            return !this.j.isEmpty();
        }
        br br2 = this.c();
        for (Object object : arrobject) {
            br2.b(object);
        }
        br2.n();
        this.Q();
        this.R();
        return !this.j.isEmpty();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b(Object ... arrobject) {
        this.S();
        if (arrobject.length == 0) {
            return !this.k.isEmpty();
        }
        aa aa2 = aa.a(arrobject.length);
        try {
            Object object;
            Object[] arrobject2 = arrobject;
            int n2 = arrobject2.length;
            for (int i2 = 0; i2 < n2 && (object = arrobject2[i2]) != null; i2 += 1) {
                aa2.add(this.a(object));
            }
            this.n();
            int n3 = aa2.size();
            for (n2 = 0; n2 < n3; n2 += 1) {
                av av2 = (av)aa2.get(n2);
                assert (av2.isDone());
                if (av2.bq_() == null) continue;
                this.b(av2.bq_());
            }
            this.Q();
            this.R();
            n2 = !this.k.isEmpty() ? 1 : 0;
            return n2 != 0;
        }
        finally {
            aa2.b();
        }
    }

    public boolean P() {
        this.l();
        this.Q();
        this.R();
        return !this.j.isEmpty() || !this.k.isEmpty();
    }

    public void Q() {
        try {
            this.f.e();
        }
        catch (Exception exception) {
            this.b(exception);
        }
    }

    private void b(Throwable throwable) {
        if (this.l == null) {
            this.l = throwable;
        } else {
            d.d("More than one exception was raised. Will report only the first one and log others.", throwable);
        }
    }

    public void R() {
        Throwable throwable = this.l;
        if (throwable == null) {
            return;
        }
        this.l = null;
        u.a(throwable);
    }

    protected final void S() {
        if (!this.H()) {
            this.b(new ClosedChannelException());
            this.R();
        }
    }

    @Override
    protected boolean a(cr cr2) {
        return cr2 instanceof e;
    }

    @Override
    protected SocketAddress x() {
        return this.I() ? this.h : null;
    }

    @Override
    protected SocketAddress y() {
        return this.I() ? this.i : null;
    }

    @Override
    protected void bw_() {
        this.m = 1;
    }

    @Override
    protected void c(SocketAddress socketAddress) {
    }

    @Override
    protected void A() {
        this.B();
    }

    @Override
    protected void B() {
        this.m = 2;
    }

    @Override
    protected void by_() {
    }

    @Override
    protected b bv_() {
        return new c(this, null);
    }

    @Override
    protected void a(bj bj2) {
        Object object;
        while ((object = bj2.b()) != null) {
            x.a(object);
            this.k.add(object);
            bj2.c();
        }
    }

    static /* synthetic */ Queue a(a a2) {
        return a2.j;
    }

    static /* synthetic */ void a(a a2, Throwable throwable) {
        a2.b(throwable);
    }
}

