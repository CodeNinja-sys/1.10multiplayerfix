/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.be;
import com.a.a.n.a.bk;
import com.a.a.n.a.bl;

public final class br
extends bk {
    private final bk c;

    private br(bl bl2, bl bl3, bk bk2) {
        super(bl2, bl3);
        this.c = bk2;
        this.initCause(bk2);
    }

    public bk a() {
        return this.c;
    }

    @Override
    public String getMessage() {
        StringBuilder stringBuilder = new StringBuilder(super.getMessage());
        for (Throwable throwable = this.c; throwable != null; throwable = throwable.getCause()) {
            stringBuilder.append(", ").append(throwable.getMessage());
        }
        return stringBuilder.toString();
    }

    /* synthetic */ br(bl bl2, bl bl3, bk bk2, be be2) {
        this(bl2, bl3, bk2);
    }
}

