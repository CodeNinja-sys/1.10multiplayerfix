/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.e;

import java.io.OutputStream;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.h.ab;
import org.apache.commons.compress.archivers.h.ag;
import org.apache.commons.compress.archivers.h.k;

public class c
extends ag {
    private boolean p = false;

    public c(OutputStream outputStream) {
        super(outputStream);
    }

    public void a(a a2) {
        if (!this.p) {
            ((ab)a2).b(k.b());
            this.p = true;
        }
        super.a(a2);
    }
}

