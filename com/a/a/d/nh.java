/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.j;
import com.a.a.d.mr;
import java.util.NoSuchElementException;
import java.util.Queue;

class nh
extends j {
    private final Queue a;

    private nh(Queue queue) {
        this.a = queue;
    }

    @Override
    public Object a() {
        try {
            return this.a.remove();
        }
        catch (NoSuchElementException noSuchElementException) {
            return this.b();
        }
    }

    /* synthetic */ nh(Queue queue, mr mr2) {
        this(queue);
    }
}

