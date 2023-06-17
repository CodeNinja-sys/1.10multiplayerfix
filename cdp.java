/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;
import java.util.Random;

public class cdp
implements ckf {
    private final List a = ov.a();
    private final Random b = new Random();
    private final bpx c;
    private final cbg d;

    public cdp(bpx bpx2, String string) {
        this.c = bpx2;
        this.d = string == null ? null : new du(string, new Object[0]);
    }

    @Override
    public int e() {
        int n2 = 0;
        for (ckf ckf2 : this.a) {
            n2 += ckf2.e();
        }
        return n2;
    }

    public qe a() {
        int n2 = this.e();
        if (this.a.isEmpty() || n2 == 0) {
            return bro.a;
        }
        int n3 = this.b.nextInt(n2);
        for (ckf ckf2 : this.a) {
            if ((n3 -= ckf2.e()) >= 0) continue;
            return (qe)ckf2.i();
        }
        return bro.a;
    }

    public void a(ckf ckf2) {
        this.a.add(ckf2);
    }

    public bpx b() {
        return this.c;
    }

    public cbg c() {
        return this.d;
    }

    @Override
    public /* synthetic */ Object i() {
        return this.a();
    }
}

