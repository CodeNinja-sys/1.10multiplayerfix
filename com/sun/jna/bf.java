/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.bg;

class bf
extends ThreadLocal {
    bf() {
    }

    protected synchronized Object initialValue() {
        return new bg(this);
    }
}

