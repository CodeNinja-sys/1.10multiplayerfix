/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

final class fn
implements cm {
    final /* synthetic */ double a;
    final /* synthetic */ double b;
    final /* synthetic */ double c;
    final /* synthetic */ double d;

    fn(double d2, double d3, double d4, double d5) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
    }

    public boolean a(cpk cpk2) {
        return cpk2 != null && cpk2.i(this.a, this.b, this.c) <= this.d;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((cpk)object);
    }
}

