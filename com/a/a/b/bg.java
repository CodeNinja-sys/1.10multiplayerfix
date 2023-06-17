/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bh;

class bg
implements bh {
    bg() {
    }

    @Override
    public Class a() {
        try {
            return Class.forName("com.a.a.b.a.a");
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new AssertionError((Object)classNotFoundException);
        }
    }
}

