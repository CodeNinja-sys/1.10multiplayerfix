/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.z;
import java.util.Collection;
import java.util.Random;

public abstract class aoe {
    protected final int c;
    protected final int d;
    protected final cfv[] e;

    protected aoe(int n2, int n3, cfv[] arrcfv) {
        this.c = n2;
        this.d = n3;
        this.e = arrcfv;
    }

    public int a(float f2) {
        return Math.max(cmk.d((float)this.c + (float)this.d * f2), 0);
    }

    public abstract void a(Collection var1, Random var2, abe var3);

    protected abstract void a(z var1, ad var2);
}

