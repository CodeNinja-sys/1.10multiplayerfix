/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class bmr
extends awm {
    private final cuz a;
    private final List b = ov.a();
    private final List w = ov.a();
    private final ye x = new ayl();
    private int y = -1;

    public bmr(cuz cuz2, bxy bxy2, int n2, int n3, int n4, int n5, int n6) {
        super(bxy2, n2, n3, n4, n5, n6);
        this.a = cuz2;
    }

    @Override
    public ye c(int n2) {
        if (n2 < this.b.size()) {
            return (ye)this.b.get(n2);
        }
        if ((n2 -= this.b.size()) == 0) {
            return this.x;
        }
        return (ye)this.w.get(--n2);
    }

    @Override
    protected int a() {
        return this.b.size() + 1 + this.w.size();
    }

    public void b(int n2) {
        this.y = n2;
    }

    @Override
    protected boolean a(int n2) {
        return n2 == this.y;
    }

    public int l() {
        return this.y;
    }

    public void a(my my2) {
        this.b.clear();
        for (int i2 = 0; i2 < my2.c(); ++i2) {
            this.b.add(new aun(this.a, my2.a(i2)));
        }
    }

    public void a(List list) {
        this.w.clear();
        for (mg mg2 : list) {
            this.w.add(new alr(this.a, mg2));
        }
    }

    @Override
    protected int c() {
        return super.c() + 30;
    }

    @Override
    public int d() {
        return super.d() + 85;
    }
}

