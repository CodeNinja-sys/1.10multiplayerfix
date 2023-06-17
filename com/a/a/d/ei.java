/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.eh;
import com.a.a.d.j;
import com.a.a.d.sz;
import java.util.Map;

class ei
extends j {
    private int b = -1;
    private final int c;
    final /* synthetic */ eh a;

    ei(eh eh2) {
        this.a = eh2;
        this.c = this.a.a.a().size();
    }

    protected Map.Entry d() {
        ++this.b;
        while (this.b < this.c) {
            Object object = this.a.a.a(this.b);
            if (object != null) {
                return sz.a(this.a.a.c(this.b), object);
            }
            ++this.b;
        }
        return (Map.Entry)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

