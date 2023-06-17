/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.b;

import com.ibm.icu.a.gl;
import com.ibm.icu.a.hk;
import com.ibm.icu.b.p;
import com.ibm.icu.util.ci;
import com.ibm.icu.util.cj;
import java.util.Iterator;

final class o
implements ci {
    private Iterator a;
    private gl b;
    private static final p c = new p(null);

    o() {
        this.a();
    }

    public boolean a(cj cj2) {
        if (this.a.hasNext()) {
            this.b = (gl)this.a.next();
            if (!this.b.d) {
                cj2.a = this.b.a;
                cj2.b = this.b.b + 1;
                cj2.c = this.b.c;
                return true;
            }
        }
        return false;
    }

    public void a() {
        this.a = hk.a.b.a(c);
    }
}

