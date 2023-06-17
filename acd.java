/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

class acd
extends apq {
    public List a = ov.a();

    public acd(bdl bdl2) {
        int n2;
        cps cps2 = bdl2.n;
        for (n2 = 0; n2 < 5; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.b(new ux(ans.g(), n2 * 9 + i2, 9 + i2 * 18, 18 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.b(new ux(cps2, n2, 9 + n2 * 18, 112));
        }
        this.a(0.0f);
    }

    @Override
    public boolean b(bdl bdl2) {
        return true;
    }

    public void a(float f2) {
        int n2 = (this.a.size() + 9 - 1) / 9 - 5;
        int n3 = (int)((double)(f2 * (float)n2) + 0.5);
        if (n3 < 0) {
            n3 = 0;
        }
        for (int i2 = 0; i2 < 5; ++i2) {
            for (int i3 = 0; i3 < 9; ++i3) {
                int n4 = i3 + (i2 + n3) * 9;
                if (n4 >= 0 && n4 < this.a.size()) {
                    ans.g().a(i3 + i2 * 9, (bhl)this.a.get(n4));
                    continue;
                }
                ans.g().a(i3 + i2 * 9, null);
            }
        }
    }

    public boolean b() {
        return this.a.size() > 45;
    }

    @Override
    protected void a(int n2, int n3, boolean bl2, bdl bdl2) {
    }

    @Override
    public bhl b(bdl bdl2, int n2) {
        ux ux2;
        if (n2 >= this.g.size() - 9 && n2 < this.g.size() && (ux2 = (ux)this.g.get(n2)) != null && ux2.b()) {
            ux2.b(null);
        }
        return null;
    }

    @Override
    public boolean a(bhl bhl2, ux ux2) {
        return ux2.f > 90;
    }

    @Override
    public boolean a(ux ux2) {
        return ux2.c instanceof cps || ux2.f > 90 && ux2.e <= 162;
    }
}

