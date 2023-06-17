/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.dg;
import com.a.a.b.dl;
import com.a.a.b.dr;
import java.util.regex.Matcher;

class dm
extends dr {
    final /* synthetic */ Matcher a;
    final /* synthetic */ dl b;

    dm(dl dl2, dg dg2, CharSequence charSequence, Matcher matcher) {
        this.b = dl2;
        this.a = matcher;
        super(dg2, charSequence);
    }

    @Override
    public int a(int n2) {
        return this.a.find(n2) ? this.a.start() : -1;
    }

    @Override
    public int b(int n2) {
        return this.a.end();
    }
}

