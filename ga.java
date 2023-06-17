/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.c.ao;

public class ga
implements v {
    public dca a(w w2, Type type, u u2) {
        z z2 = cwe.f(w2, "entry");
        boolean bl2 = cwe.a(z2, "replace", false);
        String string = cwe.a(z2, "subtitle", null);
        List list = this.a(z2);
        return new dca(list, bl2, string);
    }

    private List a(z z2) {
        ArrayList arrayList = ov.a();
        if (z2.b("sounds")) {
            t t2 = cwe.l(z2, "sounds");
            for (int i2 = 0; i2 < t2.b(); ++i2) {
                w w2 = t2.a(i2);
                if (cwe.a(w2)) {
                    String string = cwe.a(w2, "sound");
                    arrayList.add(new qe(string, 1.0f, 1.0f, 1, ad.a, false));
                    continue;
                }
                arrayList.add(this.b(cwe.f(w2, "sound")));
            }
        }
        return arrayList;
    }

    private qe b(z z2) {
        String string = cwe.f(z2, "name");
        ad ad2 = this.a(z2, ad.a);
        float f2 = cwe.a(z2, "volume", 1.0f);
        ao.a(f2 > 0.0f, "Invalid volume", new Object[0]);
        float f3 = cwe.a(z2, "pitch", 1.0f);
        ao.a(f3 > 0.0f, "Invalid pitch", new Object[0]);
        int n2 = cwe.a(z2, "weight", 1);
        ao.a(n2 > 0, "Invalid weight", new Object[0]);
        boolean bl2 = cwe.a(z2, "stream", false);
        return new qe(string, f2, f3, n2, ad2, bl2);
    }

    private ad a(z z2, ad ad2) {
        ad ad3 = ad2;
        if (z2.b("type")) {
            ad3 = ad.a(cwe.f(z2, "type"));
            ao.a((Object)ad3, "Invalid type", new Object[0]);
        }
        return ad3;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

