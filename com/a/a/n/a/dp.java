/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.do;

abstract class dp {
    private final String a;

    dp(String string) {
        this.a = string;
    }

    abstract void a(Object var1);

    void a(Iterable iterable) {
        for (do do_ : iterable) {
            do_.a(this);
        }
    }

    static /* synthetic */ String a(dp dp2) {
        return dp2.a;
    }
}

