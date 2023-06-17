/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h.a;

import java.io.Writer;
import org.apache.commons.c.h.a.b;

public abstract class c
extends b {
    @Override
    public final int a(CharSequence charSequence, int n2, Writer writer) {
        int n3 = Character.codePointAt(charSequence, n2);
        boolean bl2 = this.a(n3, writer);
        return bl2 ? 1 : 0;
    }

    public abstract boolean a(int var1, Writer var2);
}

