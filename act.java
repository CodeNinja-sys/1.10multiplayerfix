/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;

public class act {
    private final iu a;
    private final cmz b;
    private final cmz c;
    private final bqk d;
    private final List e = ov.a();
    private final List f = ov.a();

    public act(iu iu2, cmz cmz2, bqk bqk2, boolean bl2) {
        this.a = iu2;
        this.b = cmz2;
        if (bl2) {
            this.d = bqk2;
            this.c = cmz2.c(bqk2);
        } else {
            this.d = bqk2.e();
            this.c = cmz2.c(bqk2, 2);
        }
    }

    public boolean a() {
        this.e.clear();
        this.f.clear();
        dbk dbk2 = this.a.n(this.c);
        if (!ath.a(dbk2, this.a, this.c, this.d, false)) {
            if (dbk2.o() == bez.b) {
                this.f.add(this.c);
                return true;
            }
            return false;
        }
        if (!this.a(this.c)) {
            return false;
        }
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            cmz cmz2 = (cmz)this.e.get(i2);
            if (this.a.n(cmz2).t() != blg.cE || this.b(cmz2)) continue;
            return false;
        }
        return true;
    }

    private boolean a(cmz cmz2) {
        int n2;
        dbk dbk2 = this.a.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (dbk2.a() == ahk.a) {
            return true;
        }
        if (!ath.a(dbk2, this.a, cmz2, this.d, false)) {
            return true;
        }
        if (cmz2.equals(this.b)) {
            return true;
        }
        if (this.e.contains(cmz2)) {
            return true;
        }
        int n3 = 1;
        if (n3 + this.e.size() > 12) {
            return false;
        }
        while (bfa2 == blg.cE) {
            cmz cmz3 = cmz2.c(this.d.e(), n3);
            dbk2 = this.a.n(cmz3);
            bfa2 = dbk2.t();
            if (dbk2.a() == ahk.a || !ath.a(dbk2, this.a, cmz3, this.d, false) || cmz3.equals(this.b)) break;
            if (++n3 + this.e.size() <= 12) continue;
            return false;
        }
        int n4 = 0;
        for (n2 = n3 - 1; n2 >= 0; --n2) {
            this.e.add(cmz2.c(this.d.e(), n2));
            ++n4;
        }
        n2 = 1;
        while (true) {
            cmz cmz4;
            int n5;
            if ((n5 = this.e.indexOf(cmz4 = cmz2.c(this.d, n2))) > -1) {
                this.a(n4, n5);
                for (int i2 = 0; i2 <= n5 + n4; ++i2) {
                    cmz cmz5 = (cmz)this.e.get(i2);
                    if (this.a.n(cmz5).t() != blg.cE || this.b(cmz5)) continue;
                    return false;
                }
                return true;
            }
            dbk2 = this.a.n(cmz4);
            if (dbk2.a() == ahk.a) {
                return true;
            }
            if (!ath.a(dbk2, this.a, cmz4, this.d, true) || cmz4.equals(this.b)) {
                return false;
            }
            if (dbk2.o() == bez.b) {
                this.f.add(cmz4);
                return true;
            }
            if (this.e.size() >= 12) {
                return false;
            }
            this.e.add(cmz4);
            ++n4;
            ++n2;
        }
    }

    private void a(int n2, int n3) {
        ArrayList arrayList = ov.a();
        ArrayList arrayList2 = ov.a();
        ArrayList arrayList3 = ov.a();
        arrayList.addAll(this.e.subList(0, n3));
        arrayList2.addAll(this.e.subList(this.e.size() - n2, this.e.size()));
        arrayList3.addAll(this.e.subList(n3, this.e.size() - n2));
        this.e.clear();
        this.e.addAll(arrayList);
        this.e.addAll(arrayList2);
        this.e.addAll(arrayList3);
    }

    private boolean b(cmz cmz2) {
        for (bqk bqk2 : bqk.values()) {
            if (bqk2.l() == this.d.l() || this.a(cmz2.c(bqk2))) continue;
            return false;
        }
        return true;
    }

    public List b() {
        return this.e;
    }

    public List c() {
        return this.f;
    }
}

