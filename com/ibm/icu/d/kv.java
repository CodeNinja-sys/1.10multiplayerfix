/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.util.dn;
import com.ibm.icu.util.du;
import java.text.Format;

public abstract class kv
extends Format {
    private static final long a = -4964390515840164416L;
    private dn b;
    private dn c;

    public final dn a(du du2) {
        return du2 == dn.w ? this.c : this.b;
    }

    final void a(dn dn2, dn dn3) {
        if (dn2 == null != (dn3 == null)) {
            throw new IllegalArgumentException();
        }
        this.b = dn2;
        this.c = dn3;
    }
}

