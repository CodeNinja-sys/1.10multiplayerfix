/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.bk;
import java.io.OutputStream;

class aa
extends OutputStream {
    final bk a;

    aa(bk bk2) {
        this.a = (bk)cl.a(bk2);
    }

    @Override
    public void write(int n2) {
        this.a.c((byte)n2);
    }

    @Override
    public void write(byte[] arrby) {
        this.a.c(arrby);
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        this.a.c(arrby, n2, n3);
    }

    public String toString() {
        return "Funnels.asOutputStream(" + this.a + ")";
    }
}

