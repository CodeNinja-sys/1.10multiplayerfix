/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;

class cug
implements ae,
v {
    final /* synthetic */ aic a;

    private cug(aic aic2) {
        this.a = aic2;
    }

    public w a(bhk bhk2, Type type, ad ad2) {
        z z2 = new z();
        bhk2.a(z2);
        return z2;
    }

    public bhk a(w w2, Type type, u u2) {
        if (w2.q()) {
            z z2 = w2.t();
            return this.a.a(z2);
        }
        return null;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((bhk)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }

    /* synthetic */ cug(aic aic2, bfk bfk2) {
        this(aic2);
    }
}

