/*
 * Decompiled with CFR 0.150.
 */
package e.a;

import e.a.m;

public class l
extends Thread {
    private static final boolean a = false;
    private static final boolean b = true;
    private static final boolean c = false;
    private boolean d = true;
    private boolean e = false;

    protected void a() {
        this.b(true, true);
        this.a(true, false);
    }

    public void run() {
        this.a();
    }

    public void b() {
        new m(this).start();
    }

    private void f() {
        this.b(true, true);
        while (this.a(false, false)) {
            this.a(100L);
        }
        this.a(true, true);
        this.b(true, false);
        this.run();
    }

    public boolean c() {
        return this.a(false, false);
    }

    public void d() {
        this.b(true, true);
    }

    protected boolean e() {
        return this.b(false, false);
    }

    private synchronized boolean a(boolean bl2, boolean bl3) {
        if (bl2) {
            this.d = bl3;
        }
        return this.d;
    }

    private synchronized boolean b(boolean bl2, boolean bl3) {
        if (bl2) {
            this.e = bl3;
        }
        return this.e;
    }

    protected void a(long l2) {
        try {
            Thread.sleep(l2);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    static /* synthetic */ void a(l l2) {
        l2.f();
    }
}

