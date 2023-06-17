/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.eg;
import com.a.a.n.a.b;
import com.a.a.n.a.c;
import java.util.logging.Level;

class e
implements Runnable {
    final /* synthetic */ c a;

    e(c c2) {
        this.a = c2;
    }

    @Override
    public void run() {
        try {
            this.a.a.a();
            this.a.c();
            if (this.a.f()) {
                try {
                    this.a.a.b();
                }
                catch (Throwable throwable) {
                    try {
                        this.a.a.c();
                    }
                    catch (Exception exception) {
                        b.n().log(Level.WARNING, "Error while attempting to shut down the service after failure.", exception);
                    }
                    throw throwable;
                }
            }
            this.a.a.c();
            this.a.d();
        }
        catch (Throwable throwable) {
            this.a.a(throwable);
            throw eg.b(throwable);
        }
    }
}

