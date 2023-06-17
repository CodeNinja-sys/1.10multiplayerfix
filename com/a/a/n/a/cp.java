/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cg;
import com.a.a.d.ov;
import com.a.a.n.a.cy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class cp
implements cy {
    cp() {
    }

    public List a(List list) {
        ArrayList arrayList = ov.a();
        for (cg cg2 : list) {
            arrayList.add(cg2 != null ? cg2.d() : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override
    public /* synthetic */ Object b(List list) {
        return this.a(list);
    }
}

