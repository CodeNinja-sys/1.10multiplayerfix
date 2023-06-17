/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.aa;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;

public class aso
implements v {
    public cbn a(w w2, Type type, u u2) {
        z z2 = w2.t();
        String string = this.b(z2);
        avo avo2 = this.a(z2);
        boolean bl2 = this.d(z2);
        int n2 = this.c(z2);
        return new cbn(this.a(string), avo2, bl2, n2);
    }

    private bpx a(String string) {
        bpx bpx2 = new bpx(string);
        bpx2 = new bpx(bpx2.c(), "block/" + bpx2.b());
        return bpx2;
    }

    private boolean d(z z2) {
        return cwe.a(z2, "uvlock", false);
    }

    protected avo a(z z2) {
        int n2;
        int n3 = cwe.a(z2, "x", 0);
        avo avo2 = avo.a(n3, n2 = cwe.a(z2, "y", 0));
        if (avo2 == null) {
            throw new aa("Invalid BlockModelRotation x: " + n3 + ", y: " + n2);
        }
        return avo2;
    }

    protected String b(z z2) {
        return cwe.f(z2, "model");
    }

    protected int c(z z2) {
        int n2 = cwe.a(z2, "weight", 1);
        if (n2 < 1) {
            throw new aa("Invalid weight " + n2 + " found, expected integer >= 1");
        }
        return n2;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

