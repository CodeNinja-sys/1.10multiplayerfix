/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.bt;
import io.netty.util.c.a.cb;

public class cj
extends Thread {
    final bt a;
    final cb b;

    protected cj(bt bt2) {
        super("aForkJoinWorkerThread");
        this.a = bt2;
        this.b = bt2.a(this);
    }

    public bt a() {
        return this.a;
    }

    public int b() {
        return this.b.n >>> 1;
    }

    protected void c() {
    }

    protected void a(Throwable throwable) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        Throwable throwable = null;
        try {
            this.c();
            this.a.a(this.b);
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
        }
        finally {
            try {
                this.a(throwable);
            }
            catch (Throwable throwable3) {
                if (throwable == null) {
                    throwable = throwable3;
                }
            }
            finally {
                this.a.a(this, throwable);
            }
        }
    }
}

