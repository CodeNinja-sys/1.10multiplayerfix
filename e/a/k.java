/*
 * Decompiled with CFR 0.150.
 */
package e.a;

import e.a.i;
import e.a.j;
import e.a.l;

class k
extends l {
    final /* synthetic */ i a;

    private k(i i2) {
        this.a = i2;
    }

    public void run() {
        while (!this.e()) {
            if (this.a.a == -1.0f && this.a.b == 1.0f) {
                this.a(3600000L);
            }
            i.a(this.a);
            this.a(50L);
        }
        this.a();
    }

    /* synthetic */ k(i i2, j j2) {
        this(i2);
    }
}

