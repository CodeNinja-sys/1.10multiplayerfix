/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cc;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;

public class bou {
    private static final cbd b = new cvu(null);
    private static final cbd c = new wb(-1, true);
    private static final cbd d = new wb(1, true);
    private static final cbd e = new wb(1, false);
    public static final cbd a = new ry();
    private final aye f;
    private final List g = ov.a();
    private cwo h = new bya();
    private int i = -1;
    private int j;

    public bou(aye aye2) {
        this.f = aye2;
    }

    public cbd a(int n2) {
        int n3 = n2 + this.j * 6;
        if (this.j > 0 && n2 == 0) {
            return c;
        }
        if (n2 == 7) {
            if (n3 < this.h.c().size()) {
                return d;
            }
            return e;
        }
        if (n2 == 8) {
            return b;
        }
        if (n3 < 0 || n3 >= this.h.c().size()) {
            return a;
        }
        return (cbd)cc.b(this.h.c().get(n3), a);
    }

    public List a() {
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 <= 8; ++i2) {
            arrayList.add(this.a(i2));
        }
        return arrayList;
    }

    public cbd b() {
        return this.a(this.i);
    }

    public cwo c() {
        return this.h;
    }

    public void b(int n2) {
        cbd cbd2 = this.a(n2);
        if (cbd2 != a) {
            if (this.i == n2 && cbd2.b()) {
                cbd2.a(this);
            } else {
                this.i = n2;
            }
        }
    }

    public void d() {
        this.f.a(this);
    }

    public int e() {
        return this.i;
    }

    public void a(cwo cwo2) {
        this.g.add(this.f());
        this.h = cwo2;
        this.i = -1;
        this.j = 0;
    }

    public bvq f() {
        return new bvq(this.h, this.a(), this.i);
    }

    static /* synthetic */ int a(bou bou2, int n2) {
        return bou2.j += n2;
    }
}

