/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import java.util.AbstractList;

final class oz
extends AbstractList {
    private final CharSequence a;

    oz(CharSequence charSequence) {
        this.a = charSequence;
    }

    public Character a(int n2) {
        cl.a(n2, this.size());
        return Character.valueOf(this.a.charAt(n2));
    }

    @Override
    public int size() {
        return this.a.length();
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }
}

