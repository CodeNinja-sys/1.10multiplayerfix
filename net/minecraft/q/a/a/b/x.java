/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import com.a.b.ac;
import com.a.b.ad;
import com.a.b.ag;
import com.a.b.t;
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.util.Iterator;
import java.util.UUID;
import net.minecraft.h.k;
import net.minecraft.q.a.a.f;
import net.minecraft.u.bc;

class x {
    private final String a;
    private final String b;
    private final int c;
    private final f d;
    private final UUID e;
    private final k[] f;

    private x(String string, String string2, int n2, f f2, k[] arrk, UUID uUID) {
        this.a = string;
        this.b = string2;
        this.c = n2;
        this.d = f2;
        this.e = uUID;
        this.f = arrk;
    }

    public z a(ad ad2) {
        z z2 = new z();
        z2.a("name", this.a);
        z2.a("attribute", this.b);
        z2.a("operation", x.a(this.c));
        z2.a("amount", ad2.a(this.d));
        if (this.e != null) {
            z2.a("id", this.e.toString());
        }
        if (this.f.length == 1) {
            z2.a("slot", this.f[0].d());
        } else {
            t t2 = new t();
            k[] arrk = this.f;
            int n2 = this.f.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                k k2 = arrk[i2];
                t2.a(new ac(k2.d()));
            }
            z2.a("slot", t2);
        }
        return z2;
    }

    public static x a(z z2, u u2) {
        Object object;
        k[] arrk;
        String string = bc.f(z2, "name");
        String string2 = bc.f(z2, "attribute");
        int n2 = x.a(bc.f(z2, "operation"));
        f f2 = (f)bc.a(z2, "amount", u2, f.class);
        UUID uUID = null;
        if (bc.a(z2, "slot")) {
            arrk = new k[]{k.a(bc.f(z2, "slot"))};
        } else {
            if (!bc.c(z2, "slot")) {
                throw new ag("Invalid or missing attribute modifier slot; must be either string or array of strings.");
            }
            object = bc.l(z2, "slot");
            arrk = new k[((t)object).b()];
            int n3 = 0;
            Iterator iterator = ((t)object).iterator();
            while (iterator.hasNext()) {
                w w2 = (w)iterator.next();
                arrk[n3++] = k.a(bc.a(w2, "slot"));
            }
            if (arrk.length == 0) {
                throw new ag("Invalid attribute modifier slot; must contain at least one entry.");
            }
        }
        if (z2.b("id")) {
            object = bc.f(z2, "id");
            try {
                uUID = UUID.fromString((String)object);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new ag("Invalid attribute modifier id '" + (String)object + "' (must be UUID format, with dashes)");
            }
        }
        return new x(string, string2, n2, f2, arrk, uUID);
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

    static /* synthetic */ UUID a(x x2) {
        return x2.e;
    }

    static /* synthetic */ k[] b(x x2) {
        return x2.f;
    }

    static /* synthetic */ String c(x x2) {
        return x2.b;
    }

    static /* synthetic */ String d(x x2) {
        return x2.a;
    }

    static /* synthetic */ f e(x x2) {
        return x2.d;
    }

    static /* synthetic */ int f(x x2) {
        return x2.c;
    }
}

