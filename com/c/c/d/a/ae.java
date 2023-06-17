/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.d.b;
import com.c.c.d.d;
import com.c.c.d.e;
import net.minecraft.s.f;
import net.minecraft.s.n;

public class ae
extends n
implements b {
    private final int b = 666;
    private final int c = 667;
    private final n d;
    private final d e;
    private volatile String s = "";
    private volatile boolean t;
    private volatile String u;
    private volatile boolean v;
    private int w;
    private d x;
    private int y = 212;
    public static final String[] a = new String[]{"\u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583", "_ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584", "_ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585", "_ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586", "_ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587", "_ _ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588", "_ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587", "_ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586", "_ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585", "_ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584", "\u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583", "\u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _", "\u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _", "\u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _", "\u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _", "\u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _ _", "\u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _", "\u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _", "\u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _", "\u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _"};

    public ae(n n2, d d2) {
        this.d = n2;
        this.x = d2;
        d2.a(this);
        this.e = d2;
    }

    public void b() {
        new Thread((Runnable)this.e, "Realms-long-running-task").start();
    }

    @Override
    public void g() {
        super.g();
        ++this.w;
        this.x.a();
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 1) {
            this.e();
        }
    }

    @Override
    public void d() {
        this.x.c();
        this.b(ae.a(666, this.r() / 2 - this.y / 2, com.c.c.d.e.a(12), this.y, 20, ae.f("gui.cancel")));
    }

    @Override
    public void a(f f2) {
        if (f2.c() == 666 || f2.c() == 667) {
            this.e();
        }
        this.x.a(f2);
    }

    private void e() {
        this.v = true;
        this.x.d();
        net.minecraft.s.b.a(this.d);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        this.a(this.s, this.r() / 2, com.c.c.d.e.a(3), 0xFFFFFF);
        if (!this.t) {
            this.a(a[this.w % a.length], this.r() / 2, com.c.c.d.e.a(8), 0x808080);
        }
        if (this.t) {
            this.a(this.u, this.r() / 2, com.c.c.d.e.a(8), 0xFF0000);
        }
        super.a(n2, n3, f2);
    }

    @Override
    public void a(String string) {
        this.t = true;
        this.u = string;
        this.u();
        this.b(ae.a(667, this.r() / 2 - this.y / 2, this.s() / 4 + 120 + 12, ae.f("gui.back")));
    }

    public void b(String string) {
        this.s = string;
    }

    public boolean c() {
        return this.v;
    }
}

