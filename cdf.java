/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.bl;

public class cdf
extends ge {
    protected final bfa b;
    protected final bl c;

    public cdf(bfa bfa2, bfa bfa3, bl bl2) {
        super(bfa2);
        this.b = bfa3;
        this.c = bl2;
        this.e(0);
        this.a(true);
    }

    public cdf(bfa bfa2, bfa bfa3, String[] arrstring) {
        this(bfa2, bfa3, new ckn(arrstring));
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    @Override
    public String b(bhl bhl2) {
        return super.a() + "." + (String)this.c.a(bhl2);
    }
}

