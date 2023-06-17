/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.q;
import java.awt.Rectangle;
import java.util.List;

class am
implements q {
    final /* synthetic */ List a;

    am(List list) {
        this.a = list;
    }

    public boolean a(int n2, int n3, int n4, int n5) {
        this.a.add(new Rectangle(n2, n3, n4, n5));
        return true;
    }
}

