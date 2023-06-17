/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.b.cn;

public final class auxx {
    public static final cm a = new aa();
    public static final cm b = new aly();
    public static final cm c = new kz();
    public static final cm d = new apd();
    public static final cm e = new abm();
    public static final cm f = new bcb();

    public static cm a(double d2, double d3, double d4, double d5) {
        double d6 = d5 * d5;
        return new fn(d2, d3, d4, d6);
    }

    public static cm a(cpk cpk2) {
        bfo bfo2;
        ccw ccw2 = cpk2.as_();
        bfo bfo3 = bfo2 = ccw2 == null ? bfo.a : ccw2.j();
        if (bfo2 == bfo.b) {
            return cn.b();
        }
        return cn.a(e, (cm)new cvl(cpk2, ccw2, bfo2));
    }
}

