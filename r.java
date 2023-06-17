/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.yd;
import java.util.Collection;

public abstract class r
extends ab {
    private boolean i;

    public r(apq apq2) {
        super(apq2);
    }

    @Override
    public void cH_() {
        super.cH_();
        this.b();
    }

    protected void b() {
        if (this.u.h.bf().isEmpty()) {
            this.e = (this.w - this.b) / 2;
            this.i = false;
        } else {
            this.e = 160 + (this.w - this.b - 200) / 2;
            this.i = true;
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        if (this.i) {
            this.f();
        }
    }

    private void f() {
        int n2 = this.e - 124;
        int n3 = this.f;
        int n4 = 166;
        Collection collection = this.u.h.bf();
        if (collection.isEmpty()) {
            return;
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.f();
        int n5 = 33;
        if (collection.size() > 5) {
            n5 = 132 / (collection.size() - 1);
        }
        for (cko cko2 : yd.d().a(collection)) {
            bfv bfv2 = cko2.a();
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.u.P().a(a);
            this.c(n2, n3, 0, 166, 140, 32);
            if (bfv2.c()) {
                int n6 = bfv2.d();
                this.c(n2 + 6, n3 + 7, 0 + n6 % 8 * 18, 198 + n6 / 8 * 18, 18, 18);
            }
            String string = bf.a(bfv2.b(), new Object[0]);
            if (cko2.c() == 1) {
                string = string + " " + bf.a("enchantment.level.2", new Object[0]);
            } else if (cko2.c() == 2) {
                string = string + " " + bf.a("enchantment.level.3", new Object[0]);
            } else if (cko2.c() == 3) {
                string = string + " " + bf.a("enchantment.level.4", new Object[0]);
            }
            this.B.a(string, (float)(n2 + 10 + 18), (float)(n3 + 6), 0xFFFFFF);
            String string2 = bfv.a(cko2, 1.0f);
            this.B.a(string2, (float)(n2 + 10 + 18), (float)(n3 + 6 + 10), 0x7F7F7F);
            n3 += n5;
        }
    }
}

