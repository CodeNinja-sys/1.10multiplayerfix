/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ac;
import com.a.b.ad;
import com.a.b.ag;
import com.a.b.t;
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.util.Iterator;
import java.util.UUID;

class cji {
    private final String a;
    private final String b;
    private final int c;
    private final bom d;
    private final UUID e;
    private final dfm[] f;

    private cji(String string, String string2, int n2, bom bom2, dfm[] arrdfm, UUID uUID) {
        this.a = string;
        this.b = string2;
        this.c = n2;
        this.d = bom2;
        this.e = uUID;
        this.f = arrdfm;
    }

    public z a(ad ad2) {
        z z2 = new z();
        z2.a("name", this.a);
        z2.a("attribute", this.b);
        z2.a("operation", cji.a(this.c));
        z2.a("amount", ad2.a(this.d));
        if (this.e != null) {
            z2.a("id", this.e.toString());
        }
        if (this.f.length == 1) {
            z2.a("slot", this.f[0].d());
        } else {
            t t2 = new t();
            for (dfm dfm2 : this.f) {
                t2.a(new ac(dfm2.d()));
            }
            z2.a("slot", t2);
        }
        return z2;
    }

    public static cji a(z z2, u u2) {
        Object object;
        dfm[] arrdfm;
        String string = cwe.f(z2, "name");
        String string2 = cwe.f(z2, "attribute");
        int n2 = cji.a(cwe.f(z2, "operation"));
        bom bom2 = (bom)cwe.a(z2, "amount", u2, bom.class);
        UUID uUID = null;
        if (cwe.a(z2, "slot")) {
            arrdfm = new dfm[]{dfm.a(cwe.f(z2, "slot"))};
        } else if (cwe.c(z2, "slot")) {
            object = cwe.l(z2, "slot");
            arrdfm = new dfm[((t)object).b()];
            int n3 = 0;
            Iterator iterator = ((t)object).iterator();
            while (iterator.hasNext()) {
                w w2 = (w)iterator.next();
                arrdfm[n3++] = dfm.a(cwe.a(w2, "slot"));
            }
            if (arrdfm.length == 0) {
                throw new ag("Invalid attribute modifier slot; must contain at least one entry.");
            }
        } else {
            throw new ag("Invalid or missing attribute modifier slot; must be either string or array of strings.");
        }
        if (z2.b("id")) {
            object = cwe.f(z2, "id");
            try {
                uUID = UUID.fromString((String)object);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new ag("Invalid attribute modifier id '" + (String)object + "' (must be UUID format, with dashes)");
            }
        }
        return new cji(string, string2, n2, bom2, arrdfm, uUID);
    }

    private static String a(int n2) {
        switch (n2) {
            case 0: {
                return "addition";
            }
            case 1: {
                return "multiply_base";
            }
            case 2: {
                return "multiply_total";
            }
        }
        throw new IllegalArgumentException("Unknown operation " + n2);
    }

    private static int a(String string) {
        if ("addition".equals(string)) {
            return 0;
        }
        if ("multiply_base".equals(string)) {
            return 1;
        }
        if ("multiply_total".equals(string)) {
            return 2;
        }
        throw new ag("Unknown attribute modifier operation " + string);
    }

    static /* synthetic */ UUID a(cji cji2) {
        return cji2.e;
    }

    static /* synthetic */ dfm[] b(cji cji2) {
        return cji2.f;
    }

    static /* synthetic */ String c(cji cji2) {
        return cji2.b;
    }

    static /* synthetic */ String d(cji cji2) {
        return cji2.a;
    }

    static /* synthetic */ bom e(cji cji2) {
        return cji2.d;
    }

    static /* synthetic */ int f(cji cji2) {
        return cji2.c;
    }
}

