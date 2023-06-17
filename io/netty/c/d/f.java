/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.d;

import io.netty.b.bi;
import io.netty.c.d.b;
import io.netty.c.d.g;
import io.netty.c.d.h;
import io.netty.c.d.i;
import io.netty.c.d.j;
import io.netty.c.d.k;
import io.netty.channel.an;
import io.netty.channel.aq;
import io.netty.channel.av;
import io.netty.channel.bd;
import io.netty.channel.bw;
import io.netty.util.b.ad;
import io.netty.util.x;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayDeque;
import java.util.Queue;

public class f
extends aq {
    private static final io.netty.util.c.b.g a = io.netty.util.c.b.h.a(f.class);
    private final Queue b = new ArrayDeque();
    private volatile bd c;
    private k d;

    public f() {
    }

    public f(int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException("maxPendingWrites: " + n2 + " (expected: > 0)");
        }
    }

    @Override
    public void e(bd bd2) {
        this.c = bd2;
    }

    public void a() {
        bd bd2 = this.c;
        if (bd2 == null) {
            return;
        }
        if (bd2.e().bt_()) {
            try {
                this.k(bd2);
            }
            catch (Exception exception) {
                if (a.f()) {
                    a.d("Unexpected exception while sending chunks.", exception);
                }
            }
        } else {
            bd2.e().execute(new g(this, bd2));
        }
    }

    @Override
    public void a(bd bd2, Object object, bw bw2) {
        this.b.add(new k(object, bw2));
    }

    @Override
    public void d(bd bd2) {
        an an2 = bd2.b();
        if (an2.a() || !an2.I()) {
            this.k(bd2);
        }
    }

    @Override
    public void b(bd bd2) {
        this.k(bd2);
        super.b(bd2);
    }

    @Override
    public void j(bd bd2) {
        if (bd2.b().a()) {
            this.k(bd2);
        }
        bd2.l();
    }

    private void a(Throwable throwable) {
        while (true) {
            k k2 = this.d;
            if (this.d == null) {
                k2 = (k)this.b.poll();
            } else {
                this.d = null;
            }
            if (k2 == null) break;
            Object object = k2.a;
            if (object instanceof b) {
                b b2 = (b)object;
                try {
                    if (!b2.a()) {
                        if (throwable == null) {
                            throwable = new ClosedChannelException();
                        }
                        k2.a(throwable);
                    } else {
                        k2.a();
                    }
                    f.a(b2);
                }
                catch (Exception exception) {
                    k2.a(exception);
                    a.d(b.class.getSimpleName() + ".isEndOfInput() failed", exception);
                    f.a(b2);
                }
                continue;
            }
            if (throwable == null) {
                throwable = new ClosedChannelException();
            }
            k2.a(throwable);
        }
    }

    private void k(bd bd2) {
        an an2 = bd2.b();
        if (!an2.I()) {
            this.a((Throwable)null);
            return;
        }
        while (an2.a()) {
            if (this.d == null) {
                this.d = (k)this.b.poll();
            }
            if (this.d == null) break;
            k k2 = this.d;
            Object object = k2.a;
            if (object instanceof b) {
                boolean bl2;
                boolean bl3;
                b b2 = (b)object;
                Object object2 = null;
                try {
                    object2 = b2.b(bd2);
                    bl3 = b2.a();
                    bl2 = object2 == null ? !bl3 : false;
                }
                catch (Throwable throwable) {
                    this.d = null;
                    if (object2 != null) {
                        x.b(object2);
                    }
                    k2.a(throwable);
                    f.a(b2);
                    break;
                }
                if (bl2) break;
                if (object2 == null) {
                    object2 = bi.c;
                }
                int n2 = f.a(object2);
                av av2 = bd2.c(object2);
                if (bl3) {
                    this.d = null;
                    av2.a((ad)new h(this, k2, n2, b2));
                } else if (an2.a()) {
                    av2.a((ad)new i(this, object, k2, n2));
                } else {
                    av2.a((ad)new j(this, object, k2, n2, an2));
                }
            } else {
                bd2.a(object, k2.b);
                this.d = null;
            }
            bd2.q();
            if (an2.I()) continue;
            this.a(new ClosedChannelException());
            return;
        }
    }

    static void a(b b2) {
        block2: {
            try {
                b2.b();
            }
            catch (Throwable throwable) {
                if (!a.f()) break block2;
                a.d("Failed to close a chunked input.", throwable);
            }
        }
    }

    private static int a(Object object) {
        if (object instanceof io.netty.b.g) {
            return ((io.netty.b.g)object).r();
        }
        if (object instanceof io.netty.b.i) {
            return ((io.netty.b.i)object).a().r();
        }
        return 1;
    }

    static /* synthetic */ void a(f f2, bd bd2) {
        f2.k(bd2);
    }

    static /* synthetic */ io.netty.util.c.b.g b() {
        return a;
    }
}

