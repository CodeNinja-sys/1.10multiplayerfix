/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import com.c.c.a.r;
import com.c.c.c.a;

public class s
extends r {
    public s(String string, int n2, int n3) {
        super(string, n2, n3);
    }

    public s f() {
        try {
            this.a.setDoOutput(true);
            this.a.setRequestMethod("DELETE");
            this.a.connect();
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

