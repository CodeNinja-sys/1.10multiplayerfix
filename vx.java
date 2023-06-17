/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

final class vx
implements cm {
    vx() {
    }

    public boolean a(bhl bhl2) {
        for (tj tj2 : qs.b()) {
            if (!tj2.a(bhl2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((bhl)object);
    }
}

