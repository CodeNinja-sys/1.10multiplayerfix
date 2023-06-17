/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.dj;
import com.a.a.n.a.gm;

class dk
implements Runnable {
    final /* synthetic */ dj a;

    dk(dj dj2) {
        this.a = dj2;
    }

    @Override
    public void run() {
        try {
            gm.a(dj.a(this.a));
        }
        catch (Error error) {
            throw error;
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        dj.b(this.a).a();
    }
}

