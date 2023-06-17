/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class hz {
    private final aoe[] a;
    private final cfv[] b;
    private final bom c;
    private final bom d;

    public hz(aoe[] arraoe, cfv[] arrcfv, bom bom2, bom bom3) {
        this.a = arraoe;
        this.b = arrcfv;
        this.c = bom2;
        this.d = bom3;
    }

    protected void a(Collection collection, Random random, abe abe2) {
        ArrayList arrayList = ov.a();
        int n2 = 0;
        for (aoe aoe2 : this.a) {
            int n3;
            if (!bsf.a(aoe2.e, random, abe2) || (n3 = aoe2.a(abe2.e())) <= 0) continue;
            arrayList.add(aoe2);
            n2 += n3;
        }
        if (n2 == 0 || arrayList.isEmpty()) {
            return;
        }
        int n4 = random.nextInt(n2);
        for (aoe aoe3 : arrayList) {
            if ((n4 -= aoe3.a(abe2.e())) >= 0) continue;
            aoe3.a(collection, random, abe2);
            return;
        }
    }

    public void b(Collection collection, Random random, abe abe2) {
        if (!bsf.a(this.b, random, abe2)) {
            return;
        }
        int n2 = this.c.a(random) + cmk.d(this.d.b(random) * abe2.e());
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a(collection, random, abe2);
        }
    }

    static /* synthetic */ aoe[] a(hz hz2) {
        return hz2.a;
    }

    static /* synthetic */ bom b(hz hz2) {
        return hz2.c;
    }

    static /* synthetic */ bom c(hz hz2) {
        return hz2.d;
    }

    static /* synthetic */ cfv[] d(hz hz2) {
        return hz2.b;
    }
}

