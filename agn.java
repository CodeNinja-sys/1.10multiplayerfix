/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class agn
implements avf {
    private final Random a = new Random();
    private final bxy b;
    private dci c;
    private int d = 100;

    public agn(bxy bxy2) {
        this.b = bxy2;
    }

    @Override
    public void a() {
        aii aii2 = this.b.X();
        if (this.c != null) {
            if (!aii2.a().a().equals(this.c.b())) {
                this.b.W().b(this.c);
                this.d = cmk.a(this.a, 0, aii2.b() / 2);
            }
            if (!this.b.W().c(this.c)) {
                this.c = null;
                this.d = Math.min(cmk.a(this.a, aii2.b(), aii2.c()), this.d);
            }
        }
        this.d = Math.min(this.d, aii2.c());
        if (this.c == null && this.d-- <= 0) {
            this.a(aii2);
        }
    }

    public void a(aii aii2) {
        this.c = ol.a(aii2.a());
        this.b.W().a(this.c);
        this.d = Integer.MAX_VALUE;
    }

    public void b() {
        if (this.c != null) {
            this.b.W().b(this.c);
            this.c = null;
            this.d = 0;
        }
    }
}

