/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import com.a.a.c.ab;
import com.a.a.d.du;
import com.a.a.d.ep;
import com.a.a.d.ov;
import com.a.a.d.yl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import net.minecraft.q.g.a.a;

class ah
extends ab {
    private ah() {
    }

    public a[] a(Long l2) {
        ArrayList arrayList = ov.a(du.a(yl.c(Integer.valueOf(0), Integer.valueOf(10)), ep.a()));
        Collections.shuffle(arrayList, new Random(l2));
        a[] arra = new a[10];
        for (int i2 = 0; i2 < 10; ++i2) {
            int n2 = (int)(42.0 * Math.cos(2.0 * (-Math.PI + 0.3141592653589793 * (double)i2)));
            int n3 = (int)(42.0 * Math.sin(2.0 * (-Math.PI + 0.3141592653589793 * (double)i2)));
            int n4 = (Integer)arrayList.get(i2);
            int n5 = 2 + n4 / 3;
            int n6 = 76 + n4 * 3;
            boolean bl2 = n4 == 1 || n4 == 2;
            arra[i2] = new a(n2, n3, n5, n6, bl2);
        }
        return arra;
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.a((Long)object);
    }

    /* synthetic */ ah(ah ah2) {
        this();
    }
}

