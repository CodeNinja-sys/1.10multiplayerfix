/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h;

import java.util.List;
import org.apache.commons.c.h.e;
import org.apache.commons.c.h.r;

class g
extends r {
    final /* synthetic */ e a;

    g(e e2) {
        this.a = e2;
    }

    @Override
    protected List a(char[] arrc, int n2, int n3) {
        if (arrc == null) {
            return super.a(this.a.b, 0, this.a.f());
        }
        return super.a(arrc, n2, n3);
    }

    @Override
    public String a() {
        String string = super.a();
        if (string == null) {
            return this.a.toString();
        }
        return string;
    }
}

