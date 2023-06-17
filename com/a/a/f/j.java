/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.f;

import com.a.a.f.h;
import java.util.LinkedList;
import java.util.Queue;

class j
extends ThreadLocal {
    final /* synthetic */ h a;

    j(h h2) {
        this.a = h2;
    }

    protected Queue a() {
        return new LinkedList();
    }

    protected /* synthetic */ Object initialValue() {
        return this.a();
    }
}

