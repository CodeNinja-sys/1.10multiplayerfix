/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.e;
import b.o;
import java.util.Comparator;

class f
implements Comparator {
    final /* synthetic */ e a;

    f(e e2) {
        this.a = e2;
    }

    public int a(o o2, o o3) {
        return ((String)o2.a().iterator().next()).compareTo((String)o3.a().iterator().next());
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((o)object, (o)object2);
    }
}

