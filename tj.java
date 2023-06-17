/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

class tj
implements cm {
    private final azg a;
    private final int b;

    public tj(azg azg2) {
        this(azg2, -1);
    }

    public tj(azg azg2, int n2) {
        this.a = azg2;
        this.b = n2;
    }

    public boolean a(bhl bhl2) {
        return bhl2 != null && bhl2.a() == this.a && (this.b == -1 || this.b == bhl2.h());
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((bhl)object);
    }
}

