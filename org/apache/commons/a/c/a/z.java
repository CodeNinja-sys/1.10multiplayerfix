/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import org.apache.commons.a.c.a.ae;
import org.apache.commons.a.c.a.p;

final class z
implements ae {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    z(String string, boolean bl2) {
        this.a = string;
        this.b = bl2;
    }

    @Override
    public boolean a(CharSequence charSequence) {
        return charSequence.length() > 0 && p.a((CharSequence)this.a, charSequence.charAt(charSequence.length() - 1)) == this.b;
    }
}

