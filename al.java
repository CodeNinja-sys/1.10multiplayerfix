/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class al
implements tb {
    private String a;
    private final int b;
    private final bhl[] c;
    private List d;
    private boolean e;

    public al(String string, boolean bl2, int n2) {
        this.a = string;
        this.e = bl2;
        this.b = n2;
        this.c = new bhl[n2];
    }

    public al(cbg cbg2, int n2) {
        this(cbg2.i(), true, n2);
    }

    public void a(uz uz2) {
        if (this.d == null) {
            this.d = ov.a();
        }
        this.d.add(uz2);
    }

    public void b(uz uz2) {
        this.d.remove(uz2);
    }

    @Override
    public bhl a(int n2) {
        if (n2 < 0 || n2 >= this.c.length) {
            return null;
        }
        return this.c[n2];
    }

    @Override
    public bhl a(int n2, int n3) {
        bhl bhl2 = cjk.a(this.c, n2, n3);
        if (bhl2 != null) {
            this.c_();
        }
        return bhl2;
    }

    public bhl a(bhl bhl2) {
        bhl bhl3 = bhl2.j();
        for (int i2 = 0; i2 < this.b; ++i2) {
            int n2;
            int n3;
            bhl bhl4 = this.a(i2);
            if (bhl4 == null) {
                this.a(i2, bhl3);
                this.c_();
                return null;
            }
            if (!bhl.c(bhl4, bhl3) || (n3 = Math.min(bhl3.b, (n2 = Math.min(this.d(), bhl4.b())) - bhl4.b)) <= 0) continue;
            bhl4.b += n3;
            bhl3.b -= n3;
            if (bhl3.b > 0) continue;
            this.c_();
            return null;
        }
        if (bhl3.b != bhl2.b) {
            this.c_();
        }
        return bhl3;
    }

    @Override
    public bhl b(int n2) {
        if (this.c[n2] != null) {
            bhl bhl2 = this.c[n2];
            this.c[n2] = null;
            return bhl2;
        }
        return null;
    }

    @Override
    public void a(int n2, bhl bhl2) {
        this.c[n2] = bhl2;
        if (bhl2 != null && bhl2.b > this.d()) {
            bhl2.b = this.d();
        }
        this.c_();
    }

    @Override
    public int aI_() {
        return this.b;
    }

    @Override
    public String i_() {
        return this.a;
    }

    @Override
    public boolean j_() {
        return this.e;
    }

    public void a(String string) {
        this.e = true;
        this.a = string;
    }

    @Override
    public cbg v() {
        if (this.j_()) {
            return new aym(this.i_());
        }
        return new du(this.i_(), new Object[0]);
    }

    @Override
    public int d() {
        return 64;
    }

    @Override
    public void c_() {
        if (this.d != null) {
            for (int i2 = 0; i2 < this.d.size(); ++i2) {
                ((uz)this.d.get(i2)).a(this);
            }
        }
    }

    @Override
    public boolean a(bdl bdl2) {
        return true;
    }

    @Override
    public void b(bdl bdl2) {
    }

    @Override
    public void c(bdl bdl2) {
    }

    @Override
    public boolean b(int n2, bhl bhl2) {
        return true;
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int f() {
        return 0;
    }

    @Override
    public void g() {
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            this.c[i2] = null;
        }
    }
}

