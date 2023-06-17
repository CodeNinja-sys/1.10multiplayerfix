/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

final class ja
implements cm {
    final /* synthetic */ boolean a;
    final /* synthetic */ bvh b;

    ja(boolean bl2, bvh bvh2) {
        this.a = bl2;
        this.b = bvh2;
    }

    public boolean a(cpk cpk2) {
        if (!(cpk2 instanceof czt)) {
            return false;
        }
        czt czt2 = (czt)cpk2;
        bvh bvh2 = czt2.c.b();
        return this.a ? bvh2 != this.b : bvh2 == this.b;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((cpk)object);
    }
}

