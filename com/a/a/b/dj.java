/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.dg;
import com.a.a.b.dk;
import com.a.a.b.dr;
import com.a.a.b.ds;
import java.util.Iterator;

final class dj
implements ds {
    final /* synthetic */ String a;

    dj(String string) {
        this.a = string;
    }

    public dr a(dg dg2, CharSequence charSequence) {
        return new dk(this, dg2, charSequence);
    }

    @Override
    public /* synthetic */ Iterator b(dg dg2, CharSequence charSequence) {
        return this.a(dg2, charSequence);
    }
}

