/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;

public class boc
implements aho {
    private final bhl a;
    private final List b;

    public boc(bhl bhl2, List list) {
        this.a = bhl2;
        this.b = list;
    }

    @Override
    public bhl b() {
        return this.a;
    }

    @Override
    public bhl[] b(yo yo2) {
        bhl[] arrbhl = new bhl[yo2.aI_()];
        for (int i2 = 0; i2 < arrbhl.length; ++i2) {
            bhl bhl2 = yo2.a(i2);
            if (bhl2 == null || !bhl2.a().q()) continue;
            arrbhl[i2] = new bhl(bhl2.a().p());
        }
        return arrbhl;
    }

    @Override
    public boolean a(yo yo2, iu iu2) {
        ArrayList arrayList = ov.a((Iterable)this.b);
        for (int i2 = 0; i2 < yo2.h(); ++i2) {
            for (int i3 = 0; i3 < yo2.i(); ++i3) {
                bhl bhl2 = yo2.c(i3, i2);
                if (bhl2 == null) continue;
                boolean bl2 = false;
                for (bhl bhl3 : arrayList) {
                    if (bhl2.a() != bhl3.a() || bhl3.h() != 32767 && bhl2.h() != bhl3.h()) continue;
                    bl2 = true;
                    arrayList.remove(bhl3);
                    break;
                }
                if (bl2) continue;
                return false;
            }
        }
        return arrayList.isEmpty();
    }

    @Override
    public bhl a(yo yo2) {
        return this.a.j();
    }

    @Override
    public int a() {
        return this.b.size();
    }
}

