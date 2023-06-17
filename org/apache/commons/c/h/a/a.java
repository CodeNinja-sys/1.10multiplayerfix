/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h.a;

import java.io.Writer;
import org.apache.commons.c.c;
import org.apache.commons.c.h.a.b;

public class a
extends b {
    private final b[] a;

    public a(b ... arrb) {
        this.a = (b[])c.c(arrb);
    }

    @Override
    public int a(CharSequence charSequence, int n2, Writer writer) {
        for (b b2 : this.a) {
            int n3 = b2.a(charSequence, n2, writer);
            if (n3 == 0) continue;
            return n3;
        }
        return 0;
    }
}

