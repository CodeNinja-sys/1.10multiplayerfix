/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.c.ab;
import com.a.a.d.du;
import com.a.a.d.ep;
import com.a.a.d.ov;
import com.a.a.d.yl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class ciu
extends ab {
    private ciu() {
    }

    public ajp[] a(Long l2) {
        ArrayList arrayList = ov.a(du.a(yl.c(Integer.valueOf(0), Integer.valueOf(10)), ep.a()));
        Collections.shuffle(arrayList, new Random(l2));
        ajp[] arrajp = new ajp[10];
        for (int i2 = 0; i2 < 10; ++i2) {
            int n2 = (int)(42.0 * Math.cos(2.0 * (-Math.PI + 0.3141592653589793 * (double)i2)));
            int n3 = (int)(42.0 * Math.sin(2.0 * (-Math.PI + 0.3141592653589793 * (double)i2)));
            int n4 = (Integer)arrayList.get(i2);
            int n5 = 2 + n4 / 3;
            int n6 = 76 + n4 * 3;
            boolean bl2 = n4 == 1 || n4 == 2;
            arrajp[i2] = new ajp(n2, n3, n5, n6, bl2);
        }
        return arrajp;
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.a((Long)object);
    }

    /* synthetic */ ciu(ato ato2) {
        this();
    }
}

