/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;

class btd
implements v {
    btd() {
    }

    public dfk a(w w2, Type type, u u2) {
        z z2 = w2.t();
        cll cll2 = this.a(u2, z2, "thirdperson_righthand");
        cll cll3 = this.a(u2, z2, "thirdperson_lefthand");
        if (cll3 == cll.a) {
            cll3 = cll2;
        }
        cll cll4 = this.a(u2, z2, "firstperson_righthand");
        cll cll5 = this.a(u2, z2, "firstperson_lefthand");
        if (cll5 == cll.a) {
            cll5 = cll4;
        }
        cll cll6 = this.a(u2, z2, "head");
        cll cll7 = this.a(u2, z2, "gui");
        cll cll8 = this.a(u2, z2, "ground");
        cll cll9 = this.a(u2, z2, "fixed");
        return new dfk(cll3, cll2, cll5, cll4, cll6, cll7, cll8, cll9);
    }

    private cll a(u u2, z z2, String string) {
        if (z2.b(string)) {
            return (cll)u2.a(z2.c(string), (Type)((Object)cll.class));
        }
        return cll.a;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

