/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import org.apache.commons.a.c.a.ae;
import org.apache.commons.a.c.a.p;

final class x
implements ae {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    x(String string, boolean bl2) {
        this.a = string;
        this.b = bl2;
    }

    @Override
    public boolean a(CharSequence charSequence) {
        return charSequence.length() == 1 && p.a((CharSequence)this.a, charSequence.charAt(0)) == this.b;
    }
}

