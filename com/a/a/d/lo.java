/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aad;
import com.a.a.d.aaw;
import com.a.a.d.agi;
import com.a.a.d.cm;
import com.a.a.d.ey;
import com.a.a.d.iq;
import com.a.a.d.iz;
import com.a.a.d.ji;
import com.a.a.d.lp;
import com.a.a.d.lq;
import com.a.a.d.me;
import com.a.a.d.yc;
import com.a.a.d.zk;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public abstract class lo
extends iz
implements Set {
    static final int b = 0x40000000;
    private static final double a = 0.7;
    private static final int c = 0x2CCCCCCC;

    public static lo j() {
        return ey.a;
    }

    public static lo d(Object object) {
        return new aaw(object);
    }

    public static lo b(Object object, Object object2) {
        return lo.b(2, object, object2);
    }

    public static lo a(Object object, Object object2, Object object3) {
        return lo.b(3, object, object2, object3);
    }

    public static lo a(Object object, Object object2, Object object3, Object object4) {
        return lo.b(4, object, object2, object3, object4);
    }

    public static lo a(Object object, Object object2, Object object3, Object object4, Object object5) {
        return lo.b(5, object, object2, object3, object4, object5);
    }

    public static lo a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object ... arrobject) {
        int n2 = 6;
        Object[] arrobject2 = new Object[6 + arrobject.length];
        arrobject2[0] = object;
        arrobject2[1] = object2;
        arrobject2[2] = object3;
        arrobject2[3] = object4;
        arrobject2[4] = object5;
        arrobject2[5] = object6;
        System.arraycopy(arrobject, 0, arrobject2, 6, arrobject.length);
        return lo.b(arrobject2.length, arrobject2);
    }

    private static lo b(int n2, Object ... arrobject) {
        switch (n2) {
            case 0: {
                return lo.j();
            }
            case 1: {
                Object object = arrobject[0];
                return lo.d(object);
            }
        }
        int n3 = lo.a(n2);
        Object[] arrobject2 = new Object[n3];
        int n4 = n3 - 1;
        int n5 = 0;
        int n6 = 0;
        block4: for (int i2 = 0; i2 < n2; ++i2) {
            Object object = yc.a(arrobject[i2], i2);
            int n7 = object.hashCode();
            int n8 = iq.a(n7);
            while (true) {
                int n9;
                Object object2;
                if ((object2 = arrobject2[n9 = n8 & n4]) == null) {
                    arrobject[n6++] = object;
                    arrobject2[n9] = object;
                    n5 += n7;
                    continue block4;
                }
                if (object2.equals(object)) continue block4;
                ++n8;
            }
        }
        Arrays.fill(arrobject, n6, n2, null);
        if (n6 == 1) {
            Object object = arrobject[0];
            return new aaw(object, n5);
        }
        if (n3 != lo.a(n6)) {
            return lo.b(n6, arrobject);
        }
        Object[] arrobject3 = n6 < arrobject.length ? yc.b(arrobject, n6) : arrobject;
        return new zk(arrobject3, n5, arrobject2, n4);
    }

    static int a(int n2) {
        if (n2 < 0x2CCCCCCC) {
            int n3 = Integer.highestOneBit(n2 - 1) << 1;
            while ((double)n3 * 0.7 < (double)n2) {
                n3 <<= 1;
            }
            return n3;
        }
        cl.a(n2 < 0x40000000, (Object)"collection too large");
        return 0x40000000;
    }

    public static lo a(Object[] arrobject) {
        switch (arrobject.length) {
            case 0: {
                return lo.j();
            }
            case 1: {
                return lo.d(arrobject[0]);
            }
        }
        return lo.b(arrobject.length, (Object[])arrobject.clone());
    }

    public static lo a(Iterable iterable) {
        return iterable instanceof Collection ? lo.a(cm.a(iterable)) : lo.a(iterable.iterator());
    }

    public static lo a(Iterator iterator) {
        if (!iterator.hasNext()) {
            return lo.j();
        }
        Object e2 = iterator.next();
        if (!iterator.hasNext()) {
            return lo.d(e2);
        }
        return new lp().c(e2).b(iterator).b();
    }

    public static lo a(Collection collection) {
        Object[] arrobject;
        if (collection instanceof lo && !(collection instanceof me)) {
            arrobject = (Object[])collection;
            if (!arrobject.a()) {
                return arrobject;
            }
        } else if (collection instanceof EnumSet) {
            return lo.a((EnumSet)collection);
        }
        arrobject = collection.toArray();
        return lo.b(arrobject.length, arrobject);
    }

    private static lo a(EnumSet enumSet) {
        return ji.a(EnumSet.copyOf(enumSet));
    }

    lo() {
    }

    boolean aQ_() {
        return false;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof lo && this.aQ_() && ((lo)object).aQ_() && this.hashCode() != object.hashCode()) {
            return false;
        }
        return aad.a((Set)this, object);
    }

    @Override
    public int hashCode() {
        return aad.b(this);
    }

    @Override
    public abstract agi aO_();

    @Override
    Object aR_() {
        return new lq(this.toArray());
    }

    public static lp k() {
        return new lp();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }

    static /* synthetic */ lo a(int n2, Object[] arrobject) {
        return lo.b(n2, arrobject);
    }
}

