/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.i;

import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.client.f.u;
import net.minecraft.client.i.a;
import net.minecraft.client.i.d;
import net.minecraft.client.i.m;
import net.minecraft.client.i.o;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.r;
import net.minecraft.u.d.k;
import net.minecraft.x.ak;
import org.apache.logging.log4j.c;

public class n
extends cc {
    private static final AtomicInteger a = new AtomicInteger(0);
    private static final org.apache.logging.log4j.d b = org.apache.logging.log4j.c.c();
    private ak c;
    private boolean d;
    private final cc e;

    public n(cc cc2, r r2, a a2) {
        this.n = r2;
        this.e = cc2;
        o o2 = net.minecraft.client.i.o.a(a2.b);
        r2.a((d)null);
        r2.a(a2);
        this.a(o2.a(), o2.b());
    }

    public n(cc cc2, r r2, String string, int n2) {
        this.n = r2;
        this.e = cc2;
        r2.a((d)null);
        this.a(string, n2);
    }

    private void a(String string, int n2) {
        b.d("Connecting to {}, {}", string, n2);
        new m(this, "Server Connector #" + a.incrementAndGet(), string, n2).start();
    }

    @Override
    public void bY_() {
        if (this.c != null) {
            if (this.c.e()) {
                this.c.a();
            } else {
                this.c.j();
            }
        }
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    public void ct_() {
        this.r.clear();
        this.r.add(new ch(0, this.p / 2 - 100, this.q / 4 + 120 + 12, net.minecraft.client.f.u.a("gui.cancel", new Object[0])));
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.j == 0) {
            this.d = true;
            if (this.c != null) {
                this.c.a(new k("Aborted"));
            }
            this.n.a(this.e);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        if (this.c == null) {
            this.a(this.u, net.minecraft.client.f.u.a("connect.connecting", new Object[0]), this.p / 2, this.q / 2 - 50, 0xFFFFFF);
        } else {
            this.a(this.u, net.minecraft.client.f.u.a("connect.authorizing", new Object[0]), this.p / 2, this.q / 2 - 50, 0xFFFFFF);
        }
        super.a(n2, n3, f2);
    }

    static /* synthetic */ boolean a(n n2) {
        return n2.d;
    }

    static /* synthetic */ r b(n n2) {
        return n2.n;
    }

    static /* synthetic */ void a(n n2, ak ak2) {
        n2.c = ak2;
    }

    static /* synthetic */ ak c(n n2) {
        return n2.c;
    }

    static /* synthetic */ cc d(n n2) {
        return n2.e;
    }

    static /* synthetic */ org.apache.logging.log4j.d c() {
        return b;
    }
}

