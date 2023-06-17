/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import org.apache.commons.b.h;
import org.apache.commons.b.j;

final class i
extends Thread {
    final /* synthetic */ h a;

    i(h h2) {
        this.a = h2;
        super("File Reaper");
        this.setPriority(10);
        this.setDaemon(true);
    }

    @Override
    public void run() {
        while (!this.a.d || this.a.b.size() > 0) {
            try {
                j j2 = (j)this.a.a.remove();
                this.a.b.remove(j2);
                if (!j2.b()) {
                    this.a.c.add(j2.a());
                }
                j2.clear();
            }
            catch (InterruptedException interruptedException) {}
        }
    }
}

