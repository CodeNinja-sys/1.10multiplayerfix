/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.b.dx;
import java.io.Serializable;
import java.util.EnumSet;
import java.util.Set;

final class vp
implements dx,
Serializable {
    private final Class a;

    vp(Class class_) {
        this.a = (Class)cl.a(class_);
    }

    public Set b() {
        return EnumSet.noneOf(this.a);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

