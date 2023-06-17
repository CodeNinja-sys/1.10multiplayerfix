/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.d.mq;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.d.ty;
import com.a.a.d.uk;
import java.util.Collection;

class uc
extends uk {
    final /* synthetic */ ty a;

    uc(ty ty2) {
        this.a = ty2;
        super(ty2);
    }

    @Override
    public boolean remove(Object object) {
        if (this.a.containsKey(object)) {
            this.a.a.remove(object);
            return true;
        }
        return false;
    }

    private boolean a(cm cm2) {
        return mq.a(this.a.a.entrySet(), cn.a(this.a.b, sz.a(cm2)));
    }

    @Override
    public boolean removeAll(Collection collection) {
        return this.a(cn.a(collection));
    }

    @Override
    public boolean retainAll(Collection collection) {
        return this.a(cn.a(cn.a(collection)));
    }

    @Override
    public Object[] toArray() {
        return ov.a(this.iterator()).toArray();
    }

    @Override
    public Object[] toArray(Object[] arrobject) {
        return ov.a(this.iterator()).toArray(arrobject);
    }
}

