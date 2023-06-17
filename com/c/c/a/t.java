/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import com.c.c.a.r;
import com.c.c.c.a;

public class t
extends r {
    public t(String string, int n2, int n3) {
        super(string, n2, n3);
    }

    public t f() {
        try {
            this.a.setDoInput(true);
            this.a.setDoOutput(true);
            this.a.setUseCaches(false);
            this.a.setRequestMethod("GET");
            return this;
        }
        catch (Exception exception) {
            throw new a(exception.getMessage(), exception);
        }
    }

    @Override
    public /* synthetic */ r e() {
        return this.f();
    }
}

