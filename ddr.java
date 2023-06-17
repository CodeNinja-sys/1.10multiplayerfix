/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.Iterator;
import java.util.List;

public class ddr
extends alo
implements hm {
    private final bxy a;
    private final List b = ov.a();
    private boolean c;

    public ddr(bxy bxy2) {
        this.a = bxy2;
    }

    public void a(cnt cnt2) {
        if (!this.c && this.a.u.P) {
            this.a.W().a(this);
            this.c = true;
        } else if (this.c && !this.a.u.P) {
            this.a.W().b(this);
            this.c = false;
        }
        if (!this.c || this.b.isEmpty()) {
            return;
        }
        cja.D();
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        amj amj2 = new amj(this.a.h.aU, this.a.h.aV + (double)this.a.h.A(), this.a.h.aW);
        amj amj3 = new amj(0.0, 0.0, -1.0).a(-this.a.h.bb * ((float)Math.PI / 180)).b(-this.a.h.ba * ((float)Math.PI / 180));
        amj amj4 = new amj(0.0, 1.0, 0.0).a(-this.a.h.bb * ((float)Math.PI / 180)).b(-this.a.h.ba * ((float)Math.PI / 180));
        amj amj5 = amj3.c(amj4);
        int n2 = 0;
        int n3 = 0;
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            mz mz2 = (mz)iterator.next();
            if (mz2.b() + 3000L <= bxy.K()) {
                iterator.remove();
                continue;
            }
            n3 = Math.max(n3, this.a.k.a(mz2.a()));
        }
        n3 += this.a.k.a("<") + this.a.k.a(" ") + this.a.k.a(">") + this.a.k.a(" ");
        for (mz mz2 : this.b) {
            int n4 = 255;
            String string = mz2.a();
            amj amj6 = mz2.c().d(amj2).a();
            double d2 = -amj5.b(amj6);
            double d3 = -amj3.b(amj6);
            boolean bl2 = d3 > 0.5;
            int n5 = n3 / 2;
            int n6 = this.a.k.a;
            int n7 = n6 / 2;
            float f2 = 1.0f;
            int n8 = this.a.k.a(string);
            int n9 = cmk.c(cmk.b(255.0, 75.0, (double)((float)(bxy.K() - mz2.b()) / 3000.0f)));
            int n10 = n9 << 16 | n9 << 8 | n9;
            cja.D();
            cja.c((float)cnt2.a() - (float)n5 * 1.0f - 2.0f, (float)(cnt2.b() - 30) - (float)(n2 * (n6 + 1)) * 1.0f, 0.0f);
            cja.b(1.0f, 1.0f, 1.0f);
            ddr.a(-n5 - 1, -n7 - 1, n5 + 1, n7 + 1, -872415232);
            cja.l();
            if (!bl2) {
                if (d2 > 0.0) {
                    this.a.k.a(">", n5 - this.a.k.a(">"), -n7, n10 + -16777216);
                } else if (d2 < 0.0) {
                    this.a.k.a("<", -n5, -n7, n10 + -16777216);
                }
            }
            this.a.k.a(string, -n8 / 2, -n7, n10 + -16777216);
            cja.E();
            ++n2;
        }
        cja.k();
        cja.E();
    }

    @Override
    public void a(dci dci2, cdp cdp2) {
        if (cdp2.c() == null) {
            return;
        }
        String string = cdp2.c().j();
        if (!this.b.isEmpty()) {
            for (mz mz2 : this.b) {
                if (!mz2.a().equals(string)) continue;
                mz2.a(new amj(dci2.i(), dci2.j(), dci2.k()));
                return;
            }
        }
        this.b.add(new mz(this, string, new amj(dci2.i(), dci2.j(), dci2.k())));
    }
}

