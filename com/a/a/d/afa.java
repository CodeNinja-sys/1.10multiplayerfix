/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aes;
import java.util.ConcurrentModificationException;

final class afa {
    private Object a;

    private afa() {
    }

    public Object a() {
        return this.a;
    }

    public void a(Object object, Object object2) {
        if (this.a != object) {
            throw new ConcurrentModificationException();
        }
        this.a = object2;
    }

    /* synthetic */ afa(aes aes2) {
        this();
    }
}

