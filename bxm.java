/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

final class bxm
implements cm {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    bxm(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public boolean a(cpk cpk2) {
        if (cpk2 == null) {
            return false;
        }
        int n2 = cmk.b(cmk.d(cpk2.ba));
        if (this.a > this.b) {
            return n2 >= this.a || n2 <= this.b;
        }
        return n2 >= this.a && n2 <= this.b;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((cpk)object);
    }
}

