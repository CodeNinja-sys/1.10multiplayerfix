/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import com.c.a.e;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Date;
import java.util.UUID;
import net.minecraft.c.b.f;
import net.minecraft.c.b.h;

class m
implements ae,
v {
    final /* synthetic */ h a;

    private m(h h2) {
        this.a = h2;
    }

    public w a(f f2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("name", f2.a().b());
        UUID uUID = f2.a().a();
        z2.a("uuid", uUID == null ? "" : uUID.toString());
        z2.a("expiresOn", h.a.format(f2.b()));
        return z2;
    }

    public f a(w w2, Type type, u u2) {
        if (w2.q()) {
            z z2 = w2.t();
            w w3 = z2.c("name");
            w w4 = z2.c("uuid");
            w w5 = z2.c("expiresOn");
            if (w3 != null && w4 != null) {
                String string = w4.d();
                String string2 = w3.d();
                Date date = null;
                if (w5 != null) {
                    try {
                        date = h.a.parse(w5.d());
                    }
                    catch (ParseException parseException) {
                        date = null;
                    }
                }
                if (string2 != null && string != null) {
                    UUID uUID;
                    try {
                        uUID = UUID.fromString(string);
                    }
                    catch (Throwable throwable) {
                        return null;
                    }
                    h h2 = this.a;
                    h2.getClass();
                    return new f(h2, new e(uUID, string2), date, null);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((f)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }

    /* synthetic */ m(h h2, m m2) {
        this(h2);
    }
}

