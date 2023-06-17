/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public abstract class yw {
    private double c;
    private double d;
    private double e;
    protected List a = ov.b(17424);
    protected boolean b;

    public void a(double d2, double d3, double d4) {
        this.b = true;
        this.a.clear();
        this.c = d2;
        this.d = d3;
        this.e = d4;
    }

    public void a(adr adr2) {
        cmz cmz2 = adr2.j();
        cja.c((float)((double)cmz2.a() - this.c), (float)((double)cmz2.b() - this.d), (float)((double)cmz2.c() - this.e));
    }

    public void a(adr adr2, kj kj2) {
        this.a.add(adr2);
    }

    public abstract void a(kj var1);
}

