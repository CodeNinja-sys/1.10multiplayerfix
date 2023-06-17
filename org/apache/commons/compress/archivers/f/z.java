/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import java.io.OutputStream;
import org.apache.commons.compress.archivers.f.y;
import org.apache.commons.compress.c.h;

class z
extends h {
    final /* synthetic */ y a;

    z(y y2, OutputStream outputStream) {
        this.a = y2;
        super(outputStream);
    }

    public void write(int n2) {
        super.write(n2);
        y.a(this.a).update(n2);
    }

    public void write(byte[] arrby) {
        super.write(arrby);
        y.a(this.a).update(arrby);
    }

    public void write(byte[] arrby, int n2, int n3) {
        super.write(arrby, n2, n3);
        y.a(this.a).update(arrby, n2, n3);
    }
}

