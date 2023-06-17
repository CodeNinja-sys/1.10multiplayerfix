/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.dg;
import com.a.a.b.dm;
import com.a.a.b.dr;
import com.a.a.b.ds;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class dl
implements ds {
    final /* synthetic */ Pattern a;

    dl(Pattern pattern) {
        this.a = pattern;
    }

    public dr a(dg dg2, CharSequence charSequence) {
        Matcher matcher = this.a.matcher(charSequence);
        return new dm(this, dg2, charSequence, matcher);
    }

    @Override
    public /* synthetic */ Iterator b(dg dg2, CharSequence charSequence) {
        return this.a(dg2, charSequence);
    }
}

