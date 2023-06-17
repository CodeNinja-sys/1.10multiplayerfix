/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.d.sz;
import com.a.a.d.tu;
import com.a.a.d.wf;
import com.a.a.d.wh;
import java.util.Iterator;
import java.util.Map;

class wg
extends tu {
    final /* synthetic */ wf a;

    wg(wf wf2) {
        this.a = wf2;
    }

    @Override
    Map a() {
        return this.a;
    }

    @Override
    public Iterator iterator() {
        return sz.b(wf.a(this.a).q(), (bl)new wh(this));
    }

    @Override
    public boolean remove(Object object) {
        if (!this.contains(object)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        this.a.a(entry.getKey());
        return true;
    }
}

