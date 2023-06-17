/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bx;
import com.a.a.b.dg;
import java.util.Iterator;

class dp
implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ dg b;

    dp(dg dg2, CharSequence charSequence) {
        this.b = dg2;
        this.a = charSequence;
    }

    public Iterator iterator() {
        return dg.a(this.b, this.a);
    }

    public String toString() {
        return bx.a(", ").a(new StringBuilder().append('['), (Iterable)this).append(']').toString();
    }
}

