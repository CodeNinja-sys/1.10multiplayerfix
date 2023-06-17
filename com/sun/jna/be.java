/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import java.util.HashMap;

class be
extends ThreadLocal {
    be() {
    }

    protected synchronized Object initialValue() {
        return new HashMap();
    }
}

