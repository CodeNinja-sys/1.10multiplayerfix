/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;
import org.apache.commons.c.c;

public class nu
extends awm {
    private final btk a;
    private final bxy b;
    private final ye[] w;
    private int x;

    public nu(btk btk2, bxy bxy2) {
        super(bxy2, btk2.w + 45, btk2.x, 63, btk2.x - 32, 20);
        this.a = btk2;
        this.b = bxy2;
        Object[] arrobject = (cke[])org.apache.commons.c.c.c(bxy2.u.ao);
        this.w = new ye[arrobject.length + cke.d().size()];
        Arrays.sort(arrobject);
        int n2 = 0;
        String string = null;
        for (Object object : arrobject) {
            int n3;
            String string2 = ((cke)object).f();
            if (!string2.equals(string)) {
                string = string2;
                this.w[n2++] = new rs(this, string2);
            }
            if ((n3 = bxy2.k.a(bf.a(((cke)object).h(), new Object[0]))) > this.x) {
                this.x = n3;
            }
            this.w[n2++] = new bdj(this, (cke)object, null);
        }
    }

    @Override
    protected int a() {
        return this.w.length;
    }

    @Override
    public ye c(int n2) {
        return this.w[n2];
    }

    @Override
    protected int c() {
        return super.c() + 15;
    }

    @Override
    public int d() {
        return super.d() + 32;
    }

    static /* synthetic */ bxy a(nu nu2) {
        return nu2.b;
    }

    static /* synthetic */ btk b(nu nu2) {
        return nu2.a;
    }

    static /* synthetic */ int c(nu nu2) {
        return nu2.x;
    }
}

