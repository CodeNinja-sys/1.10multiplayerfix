/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.aa;
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;

public class lf
extends cwc
implements ae {
    public cqx a(w w2, Type type, u u2) {
        z z2 = w2.t();
        cbg cbg2 = (cbg)u2.a(z2.c("description"), (Type)((Object)cbg.class));
        if (cbg2 == null) {
            throw new aa("Invalid/missing description!");
        }
        int n2 = cwe.j(z2, "pack_format");
        return new cqx(cbg2, n2);
    }

    public w a(cqx cqx2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("pack_format", cqx2.b());
        z2.a("description", ad2.a(cqx2.a()));
        return z2;
    }

    @Override
    public String a() {
        return "pack";
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((cqx)object, type, ad2);
    }
}

