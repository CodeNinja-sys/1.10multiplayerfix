/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.ca;

final class bt
implements ca {
    int a = 0;
    final /* synthetic */ CharSequence b;

    bt(CharSequence charSequence) {
        this.b = charSequence;
    }

    @Override
    public int a() {
        if (this.a < this.b.length()) {
            return this.b.charAt(this.a++);
        }
        return -1;
    }

    @Override
    public void b() {
        this.a = this.b.length();
    }
}

