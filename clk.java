/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.aa;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import org.lwjgl.util.e.l;

class clk
implements v {
    private static final l a = new l(0.0f, 0.0f, 0.0f);
    private static final l b = new l(0.0f, 0.0f, 0.0f);
    private static final l c = new l(1.0f, 1.0f, 1.0f);

    clk() {
    }

    public cll a(w w2, Type type, u u2) {
        z z2 = w2.t();
        l l2 = this.a(z2, "rotation", a);
        l l3 = this.a(z2, "translation", b);
        l3.a(0.0625f);
        l3.a = cmk.a(l3.a, -5.0f, 5.0f);
        l3.b = cmk.a(l3.b, -5.0f, 5.0f);
        l3.c = cmk.a(l3.c, -5.0f, 5.0f);
        l l4 = this.a(z2, "scale", c);
        l4.a = cmk.a(l4.a, -4.0f, 4.0f);
        l4.b = cmk.a(l4.b, -4.0f, 4.0f);
        l4.c = cmk.a(l4.c, -4.0f, 4.0f);
        return new cll(l2, l3, l4);
    }

    private l a(z z2, String string, l l2) {
        if (!z2.b(string)) {
            return l2;
        }
        t t2 = cwe.l(z2, string);
        if (t2.b() != 3) {
            throw new aa("Expected 3 " + string + " values, found: " + t2.b());
        }
        float[] arrf = new float[3];
        for (int i2 = 0; i2 < arrf.length; ++i2) {
            arrf[i2] = cwe.d(t2.a(i2), string + "[" + i2 + "]");
        }
        return new l(arrf[0], arrf[1], arrf[2]);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

