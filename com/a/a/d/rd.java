/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.qy;
import com.a.a.d.sa;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

final class rd
implements Runnable {
    final WeakReference a;

    public rd(qy qy2) {
        this.a = new WeakReference<qy>(qy2);
    }

    @Override
    public void run() {
        qy qy2 = (qy)this.a.get();
        if (qy2 == null) {
            throw new CancellationException();
        }
        for (sa sa2 : qy2.j) {
            sa2.q();
        }
    }
}

