/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.ac;

class ad
extends ac {
    private final ac b;

    public ad(ac ac2, long l2) {
        this.b = ac2;
        this.a = ac2.a - l2;
        this.J = ac2.J + l2;
    }

    protected void finalize() {
    }

    protected void b(long l2, long l3) {
        this.b.b(this.J - this.b.J + l2, l3);
    }

    public String toString() {
        return super.toString() + " (shared from " + this.b.toString() + ")";
    }
}

