/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cn;
import com.a.a.d.fj;
import com.a.a.d.fm;
import com.a.a.d.nj;
import com.a.a.d.tu;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class fl
extends tu {
    final /* synthetic */ fj a;

    fl(fj fj2) {
        this.a = fj2;
    }

    @Override
    Map a() {
        return this.a;
    }

    @Override
    public Iterator iterator() {
        return new fm(this);
    }

    @Override
    public boolean removeAll(Collection collection) {
        return this.a.a.a(cn.a(collection));
    }

    @Override
    public boolean retainAll(Collection collection) {
        return this.a.a.a(cn.a(cn.a(collection)));
    }

    @Override
    public int size() {
        return nj.b(this.iterator());
    }
}

