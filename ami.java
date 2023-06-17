/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class ami
extends qa {
    private static final Random a = new Random();
    private int K = 128;

    protected ami(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, 0.5 - a.nextDouble(), d6, 0.5 - a.nextDouble());
        this.j *= (double)0.2f;
        if (d5 == 0.0 && d7 == 0.0) {
            this.i *= (double)0.1f;
            this.k *= (double)0.1f;
        }
        this.x *= 0.75f;
        this.w = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        this.c = this.f;
        this.d = this.g;
        this.e = this.h;
        if (this.v++ >= this.w) {
            this.h();
        }
        this.d(this.K + (7 - this.v * 8 / this.w));
        this.j += 0.004;
        this.a(this.i, this.j, this.k);
        if (this.g == this.d) {
            this.i *= 1.1;
            this.k *= 1.1;
        }
        this.i *= (double)0.96f;
        this.j *= (double)0.96f;
        this.k *= (double)0.96f;
        if (this.l) {
            this.i *= (double)0.7f;
            this.k *= (double)0.7f;
        }
    }

    public void a(int n2) {
        this.K = n2;
    }
}

