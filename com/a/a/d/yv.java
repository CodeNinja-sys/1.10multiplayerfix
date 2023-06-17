/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ep;
import com.a.a.d.yl;
import com.a.a.d.ys;
import com.a.a.d.yt;
import java.io.Serializable;

final class yv
implements Serializable {
    final yl a;
    final ep b;

    private yv(yl yl2, ep ep2) {
        this.a = yl2;
        this.b = ep2;
    }

    private Object a() {
        return new ys(this.a, this.b);
    }

    /* synthetic */ yv(yl yl2, ep ep2, yt yt2) {
        this(yl2, ep2);
    }
}

