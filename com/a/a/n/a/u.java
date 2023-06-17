/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.eg;
import com.a.a.n.a.eu;
import com.a.a.n.a.q;

class u
implements Runnable {
    final /* synthetic */ q a;

    u(q q2) {
        this.a = q2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        try {
            q.a(this.a).lock();
            try {
                if (this.a.g() != eu.d) {
                    return;
                }
                this.a.a.c();
            }
            finally {
                q.a(this.a).unlock();
            }
            this.a.d();
        }
        catch (Throwable throwable) {
            this.a.a(throwable);
            throw eg.b(throwable);
        }
    }
}

