/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.eg;
import com.a.a.n.a.p;
import com.a.a.n.a.q;
import java.util.logging.Level;

class r
implements Runnable {
    final /* synthetic */ q a;

    r(q q2) {
        this.a = q2;
    }

    @Override
    public void run() {
        q.a(this.a).lock();
        try {
            this.a.a.a();
        }
        catch (Throwable throwable) {
            try {
                this.a.a.c();
            }
            catch (Exception exception) {
                p.n().log(Level.WARNING, "Error while attempting to shut down the service after failure.", exception);
            }
            this.a.a(throwable);
            throw eg.b(throwable);
        }
        finally {
            q.a(this.a).unlock();
        }
    }
}

