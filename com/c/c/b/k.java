/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.a.d.cv;
import com.c.c.b.i;
import com.c.c.b.l;
import java.util.Comparator;

public class k
implements Comparator {
    private final String a;

    public k(String string) {
        this.a = string;
    }

    public int a(i i2, i i3) {
        return cv.a().a(i2.e.equals((Object)l.c), i3.e.equals((Object)l.c)).a(i2.l, i3.l).a(i2.f.equals(this.a), i3.f.equals(this.a)).b(i2.k, i3.k).a(i2.e.equals((Object)l.b), i3.e.equals((Object)l.b)).a(i2.a, i3.a).b();
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((i)object, (i)object2);
    }
}

