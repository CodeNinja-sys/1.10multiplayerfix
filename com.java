/*
 * Decompiled with CFR 0.150.
 */
import a.a.a.a.b.as;
import com.a.a.b.cc;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class com
implements apb {
    private static final d a = org.apache.logging.log4j.c.c();
    private final bhm b;
    private final as c = new chi(this, 8192);
    private final iu d;

    public com(iu iu2) {
        this.b = new clf(iu2, 0, 0);
        this.d = iu2;
    }

    public void c(int n2, int n3) {
        bhm bhm2 = this.b(n2, n3);
        if (!bhm2.h()) {
            bhm2.f();
        }
        this.c.a(zz.a(n2, n3));
    }

    @Override
    public bhm a(int n2, int n3) {
        return (bhm)this.c.c(zz.a(n2, n3));
    }

    public bhm d(int n2, int n3) {
        bhm bhm2 = new bhm(this.d, n2, n3);
        this.c.a(zz.a(n2, n3), bhm2);
        bhm2.c(true);
        return bhm2;
    }

    @Override
    public bhm b(int n2, int n3) {
        return (bhm)cc.b(this.a(n2, n3), this.b);
    }

    @Override
    public boolean a() {
        long l2 = System.currentTimeMillis();
        for (bhm bhm2 : this.c.c()) {
            bhm2.b(System.currentTimeMillis() - l2 > 5L);
        }
        if (System.currentTimeMillis() - l2 > 100L) {
            a.d("Warning: Clientside chunk ticking took {} ms", System.currentTimeMillis() - l2);
        }
        return false;
    }

    @Override
    public String b() {
        return "MultiplayerChunkCache: " + this.c.size() + ", " + this.c.size();
    }
}

