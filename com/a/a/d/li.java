/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.du;
import com.a.a.d.j;
import com.a.a.d.lf;
import com.a.a.d.lh;
import com.a.a.d.nj;
import com.a.a.d.yl;
import java.util.Iterator;

class li
extends j {
    final Iterator a;
    Iterator b;
    final /* synthetic */ lh c;

    li(lh lh2) {
        this.c = lh2;
        this.a = lf.a(this.c.a).aO_();
        this.b = nj.a();
    }

    protected Comparable d() {
        while (!this.b.hasNext()) {
            if (this.a.hasNext()) {
                this.b = du.a((yl)this.a.next(), lh.a(this.c)).aO_();
                continue;
            }
            return (Comparable)this.b();
        }
        return (Comparable)this.b.next();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

