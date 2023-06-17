/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cn;
import com.a.a.d.nj;
import com.a.a.d.sz;
import com.a.a.d.ud;
import com.a.a.d.un;
import java.util.Collection;
import java.util.NavigableMap;

class ue
extends un {
    final /* synthetic */ ud a;

    ue(ud ud2, NavigableMap navigableMap) {
        this.a = ud2;
        super(navigableMap);
    }

    @Override
    public boolean removeAll(Collection collection) {
        return nj.a(ud.b(this.a).entrySet().iterator(), cn.a(ud.a(this.a), sz.a(cn.a(collection))));
    }

    @Override
    public boolean retainAll(Collection collection) {
        return nj.a(ud.b(this.a).entrySet().iterator(), cn.a(ud.a(this.a), sz.a(cn.a(cn.a(collection)))));
    }
}

