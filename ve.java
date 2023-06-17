/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.c.an;
import com.a.a.c.f;

public class ve {
    private final cm[][][] a;
    private final int b;
    private final int c;
    private final int d;

    public ve(cm[][][] arrcm) {
        this.a = arrcm;
        this.b = arrcm.length;
        if (this.b > 0) {
            this.c = arrcm[0].length;
            this.d = this.c > 0 ? arrcm[0][0].length : 0;
        } else {
            this.c = 0;
            this.d = 0;
        }
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    private aiz a(cmz cmz2, bqk bqk2, bqk bqk3, an an2) {
        for (int i2 = 0; i2 < this.d; ++i2) {
            for (int i3 = 0; i3 < this.c; ++i3) {
                for (int i4 = 0; i4 < this.b; ++i4) {
                    if (this.a[i4][i3][i2].a(an2.c(ve.a(cmz2, bqk2, bqk3, i2, i3, i4)))) continue;
                    return null;
                }
            }
        }
        return new aiz(cmz2, bqk2, bqk3, an2, this.d, this.c, this.b);
    }

    public aiz a(iu iu2, cmz cmz2) {
        an an2 = ve.a(iu2, false);
        int n2 = Math.max(Math.max(this.d, this.c), this.b);
        for (cmz cmz3 : cmz.a(cmz2, cmz2.e(n2 - 1, n2 - 1, n2 - 1))) {
            for (bqk bqk2 : bqk.values()) {
                for (bqk bqk3 : bqk.values()) {
                    aiz aiz2;
                    if (bqk3 == bqk2 || bqk3 == bqk2.e() || (aiz2 = this.a(cmz3, bqk2, bqk3, an2)) == null) continue;
                    return aiz2;
                }
            }
        }
        return null;
    }

    public static an a(iu iu2, boolean bl2) {
        return f.a().a(new cat(iu2, bl2));
    }

    protected static cmz a(cmz cmz2, bqk bqk2, bqk bqk3, int n2, int n3, int n4) {
        if (bqk2 == bqk3 || bqk2 == bqk3.e()) {
            throw new IllegalArgumentException("Invalid forwards & up combination");
        }
        cjx cjx2 = new cjx(bqk2.h(), bqk2.i(), bqk2.j());
        cjx cjx3 = new cjx(bqk3.h(), bqk3.i(), bqk3.j());
        cjx cjx4 = cjx2.b(cjx3);
        return cmz2.e(cjx3.a() * -n3 + cjx4.a() * n2 + cjx2.a() * n4, cjx3.b() * -n3 + cjx4.b() * n2 + cjx2.b() * n4, cjx3.c() * -n3 + cjx4.c() * n2 + cjx2.c() * n4);
    }
}

