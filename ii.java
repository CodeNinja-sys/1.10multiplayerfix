/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class ii
extends awm {
    private final List a = ov.a();

    public ii(bxy bxy2, int n2, int n3, int n4, int n5, int n6, oi ... arroi) {
        super(bxy2, n2, n3, n4, n5, n6);
        this.m = false;
        for (int i2 = 0; i2 < arroi.length; i2 += 2) {
            oi oi2 = arroi[i2];
            oi oi3 = i2 < arroi.length - 1 ? arroi[i2 + 1] : null;
            cwv cwv2 = this.a(bxy2, n2 / 2 - 155, 0, oi2);
            cwv cwv3 = this.a(bxy2, n2 / 2 - 155 + 160, 0, oi3);
            this.a.add(new aiu(cwv2, cwv3));
        }
    }

    private cwv a(bxy bxy2, int n2, int n3, oi oi2) {
        if (oi2 == null) {
            return null;
        }
        int n4 = oi2.c();
        return oi2.a() ? new jq(n4, n2, n3, oi2) : new bcy(n4, n2, n3, oi2, bxy2.u.c(oi2));
    }

    public aiu b(int n2) {
        return (aiu)this.a.get(n2);
    }

    @Override
    protected int a() {
        return this.a.size();
    }

    @Override
    public int d() {
        return 400;
    }

    @Override
    protected int c() {
        return super.c() + 32;
    }

    @Override
    public /* synthetic */ ye c(int n2) {
        return this.b(n2);
    }
}

