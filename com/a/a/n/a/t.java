/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.eg;
import com.a.a.n.a.p;
import com.a.a.n.a.q;

class t
implements Runnable {
    final /* synthetic */ q a;

    t(q q2) {
        this.a = q2;
    }

    @Override
    public void run() {
        q.a(this.a).lock();
        try {
            this.a.a.b();
            q.a(this.a, this.a.a.d().a(p.a(this.a.a), q.b(this.a), q.c(this.a)));
            this.a.c();
        }
        catch (Throwable throwable) {
            this.a.a(throwable);
            throw eg.b(throwable);
        }
        finally {
            q.a(this.a).unlock();
        }
    }
}

