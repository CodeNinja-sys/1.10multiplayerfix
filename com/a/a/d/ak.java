/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ai;
import com.a.a.d.aj;
import com.a.a.d.dv;
import com.a.a.d.xo;
import java.util.Map;

class ak
extends xo {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ aj b;

    ak(aj aj2, Map.Entry entry) {
        this.b = aj2;
        this.a = entry;
    }

    @Override
    public Object a() {
        return this.a.getKey();
    }

    @Override
    public int b() {
        dv dv2;
        dv dv3 = (dv)this.a.getValue();
        if ((dv3 == null || dv3.a() == 0) && (dv2 = (dv)ai.a(this.b.c).get(this.a())) != null) {
            return dv2.a();
        }
        return dv3 == null ? 0 : dv3.a();
    }
}

