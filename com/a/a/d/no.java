/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import java.util.Enumeration;

final class no
extends agi {
    final /* synthetic */ Enumeration a;

    no(Enumeration enumeration) {
        this.a = enumeration;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasMoreElements();
    }

    public Object next() {
        return this.a.nextElement();
    }
}

