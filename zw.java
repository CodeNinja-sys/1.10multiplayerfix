/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public class zw
extends alo {
    private static final bpx a = new bpx("textures/gui/bars.png");
    private final bxy b;
    private final Map c = sz.d();

    public zw(bxy bxy2) {
        this.b = bxy2;
    }

    public void a() {
        if (this.c.isEmpty()) {
            return;
        }
        cnt cnt2 = new cnt(this.b);
        int n2 = cnt2.a();
        int n3 = 12;
        for (cjd cjd2 : this.c.values()) {
            int n4 = n2 / 2 - 91;
            int n5 = n3;
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.b.P().a(a);
            this.a(n4, n5, cjd2);
            String string = cjd2.b().j();
            this.b.k.a(string, (float)(n2 / 2 - this.b.k.a(string) / 2), (float)(n5 - 9), 0xFFFFFF);
            if ((n3 += 10 + this.b.k.a) < cnt2.b() / 3) continue;
            break;
        }
    }

    private void a(int n2, int n3, bds bds2) {
        int n4;
        this.c(n2, n3, 0, bds2.d().ordinal() * 5 * 2, 182, 5);
        if (bds2.e() != abo.a) {
            this.c(n2, n3, 0, 80 + (bds2.e().ordinal() - 1) * 5 * 2, 182, 5);
        }
        if ((n4 = (int)(bds2.c() * 183.0f)) > 0) {
            this.c(n2, n3, 0, bds2.d().ordinal() * 5 * 2 + 5, n4, 5);
            if (bds2.e() != abo.a) {
                this.c(n2, n3, 0, 80 + (bds2.e().ordinal() - 1) * 5 * 2 + 5, n4, 5);
            }
        }
    }

    public void a(dgy dgy2) {
        if (dgy2.b() == atf.a) {
            this.c.put(dgy2.a(), new cjd(dgy2));
        } else if (dgy2.b() == atf.b) {
            this.c.remove(dgy2.a());
        } else {
            ((cjd)this.c.get(dgy2.a())).a(dgy2);
        }
    }

    public void b() {
        this.c.clear();
    }

    public boolean c() {
        if (!this.c.isEmpty()) {
            for (bds bds2 : this.c.values()) {
                if (!bds2.g()) continue;
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        if (!this.c.isEmpty()) {
            for (bds bds2 : this.c.values()) {
                if (!bds2.f()) continue;
                return true;
            }
        }
        return false;
    }

    public boolean e() {
        if (!this.c.isEmpty()) {
            for (bds bds2 : this.c.values()) {
                if (!bds2.h()) continue;
                return true;
            }
        }
        return false;
    }
}

