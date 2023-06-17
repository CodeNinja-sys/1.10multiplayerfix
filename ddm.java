/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ddm {
    private final int a;
    private final Set b = aad.a(256);
    private final List c = ov.b(256);
    private int d;
    private int e;
    private final int f;
    private final int g;
    private final int h;

    public ddm(int n2, int n3, int n4, int n5) {
        this.a = n5;
        this.f = n2;
        this.g = n3;
        this.h = n4;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public void a(ars ars2) {
        ctz ctz2 = new ctz(ars2, this.a);
        if (this.h > 0) {
            ctz2.a(this.h);
        }
        this.b.add(ctz2);
    }

    public void c() {
        Object[] arrobject = this.b.toArray(new ctz[this.b.size()]);
        Arrays.sort(arrobject);
        for (Object object : arrobject) {
            if (this.a((ctz)object)) continue;
            String string = String.format("Unable to fit: %s - size: %dx%d - Maybe try a lowerresolution resourcepack?", ((ctz)object).a().i(), ((ctz)object).a().c(), ((ctz)object).a().d());
            throw new amx((ctz)object, string);
        }
        this.d = cmk.c(this.d);
        this.e = cmk.c(this.e);
    }

    public List d() {
        ArrayList arrayList = ov.a();
        for (Object object : this.c) {
            ((big)object).a(arrayList);
        }
        ArrayList arrayList2 = ov.a();
        for (big big2 : arrayList) {
            ctz ctz2 = big2.a();
            ars ars2 = ctz2.a();
            ars2.a(this.d, this.e, big2.b(), big2.c(), ctz2.e());
            arrayList2.add(ars2);
        }
        return arrayList2;
    }

    private static int b(int n2, int n3) {
        return (n2 >> n3) + ((n2 & (1 << n3) - 1) == 0 ? 0 : 1) << n3;
    }

    private boolean a(ctz ctz2) {
        ars ars2 = ctz2.a();
        boolean bl2 = ars2.c() != ars2.d();
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            if (((big)this.c.get(i2)).a(ctz2)) {
                return true;
            }
            if (!bl2) continue;
            ctz2.d();
            if (((big)this.c.get(i2)).a(ctz2)) {
                return true;
            }
            ctz2.d();
        }
        return this.b(ctz2);
    }

    private boolean b(ctz ctz2) {
        big big2;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        int n2 = Math.min(ctz2.b(), ctz2.c());
        int n3 = Math.max(ctz2.b(), ctz2.c());
        int n4 = cmk.c(this.d);
        int n5 = cmk.c(this.e);
        int n6 = cmk.c(this.d + n2);
        int n7 = cmk.c(this.e + n2);
        boolean bl5 = n6 <= this.f;
        boolean bl6 = bl4 = n7 <= this.g;
        if (!bl5 && !bl4) {
            return false;
        }
        boolean bl7 = bl5 && n4 != n6;
        boolean bl8 = bl3 = bl4 && n5 != n7;
        if (bl7 ^ bl3) {
            bl2 = bl7;
        } else {
            boolean bl9 = bl2 = bl5 && n4 <= n5;
        }
        if (bl2) {
            if (ctz2.b() > ctz2.c()) {
                ctz2.d();
            }
            if (this.e == 0) {
                this.e = ctz2.c();
            }
            big2 = new big(this.d, 0, ctz2.b(), this.e);
            this.d += ctz2.b();
        } else {
            big2 = new big(0, this.e, this.d, ctz2.c());
            this.e += ctz2.c();
        }
        big2.a(ctz2);
        this.c.add(big2);
        return true;
    }

    static /* synthetic */ int a(int n2, int n3) {
        return ddm.b(n2, n3);
    }
}

