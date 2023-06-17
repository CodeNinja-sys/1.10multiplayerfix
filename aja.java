/*
 * Decompiled with CFR 0.150.
 */
import a.a.a.a.b.as;
import a.a.a.a.b.bl;
import com.a.a.d.ov;
import java.util.List;
import net.minecraft.c.a;

public class aja {
    private final ey a;
    private long b;
    private final as c = new bl(4096);
    private final List d = ov.a();

    public aja(ey ey2) {
        this.a = ey2;
    }

    public bfc a(int n2, int n3) {
        long l2 = (long)(n2 >>= 4) & 0xFFFFFFFFL | ((long)(n3 >>= 4) & 0xFFFFFFFFL) << 32;
        bfc bfc2 = (bfc)this.c.c(l2);
        if (bfc2 == null) {
            bfc2 = new bfc(this, n2, n3);
            this.c.a(l2, bfc2);
            this.d.add(bfc2);
        }
        bfc2.d = net.minecraft.c.a.av();
        return bfc2;
    }

    public anr a(int n2, int n3, anr anr2) {
        anr anr3 = this.a(n2, n3).a(n2, n3);
        return anr3 == null ? anr2 : anr3;
    }

    public void a() {
        long l2 = net.minecraft.c.a.av();
        long l3 = l2 - this.b;
        if (l3 > 7500L || l3 < 0L) {
            this.b = l2;
            for (int i2 = 0; i2 < this.d.size(); ++i2) {
                bfc bfc2 = (bfc)this.d.get(i2);
                long l4 = l2 - bfc2.d;
                if (l4 <= 30000L && l4 >= 0L) continue;
                this.d.remove(i2--);
                long l5 = (long)bfc2.b & 0xFFFFFFFFL | ((long)bfc2.c & 0xFFFFFFFFL) << 32;
                this.c.a(l5);
            }
        }
    }

    public anr[] b(int n2, int n3) {
        return this.a((int)n2, (int)n3).a;
    }

    static /* synthetic */ ey a(aja aja2) {
        return aja2.a;
    }
}

