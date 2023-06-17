/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;

public class bdu
extends crz {
    private final ars e;

    public bdu(crz crz2, ars ars2) {
        super(Arrays.copyOf(crz2.b(), crz2.b().length), crz2.b, dha.a(crz2.b()), crz2.a());
        this.e = ars2;
        this.f();
    }

    private void f() {
        for (int i2 = 0; i2 < 4; ++i2) {
            int n2 = 7 * i2;
            this.a[n2 + 4] = Float.floatToRawIntBits(this.e.a((double)this.d.a(Float.intBitsToFloat(this.a[n2 + 4]))));
            this.a[n2 + 4 + 1] = Float.floatToRawIntBits(this.e.b((double)this.d.b(Float.intBitsToFloat(this.a[n2 + 4 + 1]))));
        }
    }
}

