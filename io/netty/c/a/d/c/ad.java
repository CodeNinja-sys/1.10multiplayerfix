/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.b.g;
import io.netty.c.a.d.c.a;
import io.netty.c.a.d.c.ac;
import io.netty.c.a.d.c.c;
import io.netty.c.a.d.c.f;
import io.netty.c.a.t;
import io.netty.c.a.y;
import io.netty.channel.bd;
import java.util.List;

public class ad
extends t {
    private final int a;
    private ac b;
    private boolean c;

    public ad(int n2) {
        if (n2 < 1) {
            throw new IllegalArgumentException("maxFrameSize must be > 0");
        }
        this.a = n2;
    }

    protected void a(bd bd2, ac ac2, List list) {
        if (this.b == null) {
            this.c = false;
            if (ac2.m()) {
                list.add(ac2.h());
                return;
            }
            io.netty.b.ac ac3 = bd2.d().e().d(ac2.a().ab());
            ((g)ac3).h(((g)ac3).q() + ac2.a().r());
            if (ac2 instanceof f) {
                this.b = new f(true, ac2.n(), ac3);
            } else if (ac2 instanceof a) {
                this.b = new a(true, ac2.n(), ac3);
            } else {
                ac3.ad();
                throw new IllegalStateException("WebSocket frame was not of type TextWebSocketFrame or BinaryWebSocketFrame");
            }
            return;
        }
        if (ac2 instanceof c) {
            if (this.c) {
                if (ac2.m()) {
                    this.b = null;
                }
                return;
            }
            io.netty.b.ac ac4 = (io.netty.b.ac)this.b.a();
            if (ac4.r() > this.a - ac2.a().r()) {
                this.b.ad();
                this.c = true;
                throw new y("WebSocketFrame length exceeded " + ac4 + " bytes.");
            }
            ac4.d(ac2.a().ab());
            ac4.Y(ac4.q() + ac2.a().r());
            if (ac2.m()) {
                ac ac5 = this.b;
                this.b = null;
                list.add(ac5);
                return;
            }
            return;
        }
        list.add(ac2.h());
    }

    @Override
    public void b(bd bd2) {
        super.b(bd2);
        if (this.b != null) {
            this.b.ad();
            this.b = null;
        }
    }

    @Override
    public void f(bd bd2) {
        super.f(bd2);
        if (this.b != null) {
            this.b.ad();
            this.b = null;
        }
    }
}

