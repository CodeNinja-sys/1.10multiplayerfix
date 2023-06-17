/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ao;
import com.a.a.c.bl;
import com.a.a.c.bt;
import com.a.a.n.a.dl;
import java.util.logging.Level;

class bu
implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ int b;
    final /* synthetic */ bl c;
    final /* synthetic */ dl d;
    final /* synthetic */ bt e;

    bu(bt bt2, Object object, int n2, bl bl2, dl dl2) {
        this.e = bt2;
        this.a = object;
        this.b = n2;
        this.c = bl2;
        this.d = dl2;
    }

    @Override
    public void run() {
        try {
            Object object = this.e.a(this.a, this.b, this.c, this.d);
        }
        catch (Throwable throwable) {
            ao.f.log(Level.WARNING, "Exception thrown during refresh", throwable);
            this.c.a(throwable);
        }
    }
}

