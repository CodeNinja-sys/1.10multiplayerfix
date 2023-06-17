/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.cs;
import com.a.a.n.a.dl;

class ct
implements Runnable {
    final /* synthetic */ cs a;

    ct(cs cs2) {
        this.a = cs2;
    }

    @Override
    public void run() {
        if (this.a.isCancelled()) {
            for (dl dl2 : this.a.a) {
                dl2.cancel(this.a.b());
            }
        }
        this.a.a = null;
        this.a.e = null;
        this.a.d = null;
    }
}

