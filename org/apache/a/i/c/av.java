/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import org.apache.a.i.c.as;
import org.apache.a.i.c.b;

public class av
extends b {
    final /* synthetic */ as f;

    protected av(as as2) {
        this.f = as2;
        super(as2.c, null);
    }

    protected void c() {
        this.b();
        if (this.b.c()) {
            this.b.close();
        }
    }

    protected void d() {
        this.b();
        if (this.b.c()) {
            this.b.f();
        }
    }
}

