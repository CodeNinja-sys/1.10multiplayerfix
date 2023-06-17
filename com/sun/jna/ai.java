/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

class ai
extends ThreadLocal {
    ai() {
    }

    protected synchronized Object initialValue() {
        return new Integer(0);
    }
}

