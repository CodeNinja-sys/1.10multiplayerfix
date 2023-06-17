/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public enum bov {
    a("vertex", ".vsh", cjg.o),
    b("fragment", ".fsh", cjg.p);

    private final String c;
    private final String d;
    private final int e;
    private final Map f = sz.c();

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bov(int n2) {
        void var5_3;
        void var4_2;
        this.c = (String)n2;
        this.d = var4_2;
        this.e = var5_3;
    }

    public String a() {
        return this.c;
    }

    private String b() {
        return this.d;
    }

    private int c() {
        return this.e;
    }

    private Map d() {
        return this.f;
    }

    static /* synthetic */ Map a(bov bov2) {
        return bov2.d();
    }

    static /* synthetic */ String b(bov bov2) {
        return bov2.b();
    }

    static /* synthetic */ int c(bov bov2) {
        return bov2.c();
    }
}

