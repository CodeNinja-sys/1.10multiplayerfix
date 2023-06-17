/*
 * Decompiled with CFR 0.150.
 */
package e.a;

import e.a.b;
import e.a.l;
import e.a.o;
import e.a.p;
import e.a.t;

public class c
extends l {
    protected t a = p.b();
    private o c;
    protected String b = "CommandThread";

    public c(o o2) {
        this.c = o2;
    }

    protected void a() {
        this.d();
        this.a = null;
        this.c = null;
        super.a();
    }

    public void run() {
        long l2;
        long l3 = l2 = System.currentTimeMillis();
        if (this.c == null) {
            this.c("SoundSystem was null in method run().", 0);
            this.a();
            return;
        }
        this.a(3600000L);
        while (!this.e()) {
            this.c.g();
            this.c.a((b)null);
            l3 = System.currentTimeMillis();
            if (!this.e() && l3 - l2 > 10000L) {
                l2 = l3;
                this.c.h();
            }
            if (this.e()) continue;
            this.a(3600000L);
        }
        this.a();
    }

    protected void a(String string, int n2) {
        this.a.a(string, n2);
    }

    protected void b(String string, int n2) {
        this.a.b(string, n2);
    }

    protected boolean a(boolean bl2, String string) {
        return this.a.a(bl2, this.b, string, 0);
    }

    protected void c(String string, int n2) {
        this.a.a(this.b, string, n2);
    }
}

