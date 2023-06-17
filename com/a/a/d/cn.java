/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import java.util.Collection;

final class cn
implements bl {
    final /* synthetic */ Collection a;

    cn(Collection collection) {
        this.a = collection;
    }

    @Override
    public Object a(Object object) {
        return object == this.a ? "(this Collection)" : object;
    }
}

