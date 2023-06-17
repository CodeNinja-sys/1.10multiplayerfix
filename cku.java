/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class cku
extends aet {
    private final List a = ov.a();

    public cku() {
        this.a.add(new clh(abs.class, 10, 2, 3));
        this.a.add(new clh(csq.class, 5, 4, 4));
        this.a.add(new clh(azy.class, 10, 4, 4));
        this.a.add(new clh(clw.class, 3, 4, 4));
    }

    @Override
    public String a() {
        return "Fortress";
    }

    public List c() {
        return this.a;
    }

    @Override
    protected boolean a(int n2, int n3) {
        int n4 = n2 >> 4;
        int n5 = n3 >> 4;
        this.d.setSeed((long)(n4 ^ n5 << 4) ^ this.e.y());
        this.d.nextInt();
        if (this.d.nextInt(3) != 0) {
            return false;
        }
        if (n2 != (n4 << 4) + 4 + this.d.nextInt(8)) {
            return false;
        }
        return n3 == (n5 << 4) + 4 + this.d.nextInt(8);
    }

    @Override
    protected cv b(int n2, int n3) {
        return new arj(this.e, this.d, n2, n3);
    }
}

