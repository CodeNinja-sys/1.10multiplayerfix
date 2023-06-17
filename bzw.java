/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.j;
import java.util.Iterator;

class bzw
extends j {
    final /* synthetic */ Iterator a;
    final /* synthetic */ arr b;

    bzw(arr arr2, Iterator iterator) {
        this.b = arr2;
        this.a = iterator;
    }

    protected bhm d() {
        while (this.a.hasNext()) {
            asi asi2 = (asi)this.a.next();
            bhm bhm2 = asi2.f();
            if (bhm2 == null) continue;
            if (!bhm2.v() && bhm2.u()) {
                return bhm2;
            }
            if (!bhm2.j()) {
                return bhm2;
            }
            if (!asi2.a(128.0, arr.d())) continue;
            return bhm2;
        }
        return (bhm)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

