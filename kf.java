/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ac;
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;

public class kf
implements ae,
v {
    public bcc a(w w2, Type type, u u2) {
        if (w2.q()) {
            Object object;
            nc nc2;
            ac ac2;
            z z2;
            bcc bcc2 = new bcc();
            z z3 = w2.t();
            if (z3 == null) {
                return null;
            }
            if (z3.b("bold")) {
                bcc.a(bcc2, z3.c("bold").n());
            }
            if (z3.b("italic")) {
                bcc.b(bcc2, z3.c("italic").n());
            }
            if (z3.b("underlined")) {
                bcc.c(bcc2, z3.c("underlined").n());
            }
            if (z3.b("strikethrough")) {
                bcc.d(bcc2, z3.c("strikethrough").n());
            }
            if (z3.b("obfuscated")) {
                bcc.e(bcc2, z3.c("obfuscated").n());
            }
            if (z3.b("color")) {
                bcc.a(bcc2, (aug)((Object)u2.a(z3.c("color"), (Type)((Object)aug.class))));
            }
            if (z3.b("insertion")) {
                bcc.a(bcc2, z3.c("insertion").d());
            }
            if (z3.b("clickEvent") && (z2 = z3.f("clickEvent")) != null) {
                String string;
                ac2 = z2.d("action");
                nc2 = ac2 == null ? null : nc.a(ac2.d());
                object = z2.d("value");
                String string2 = string = object == null ? null : ((ac)object).d();
                if (nc2 != null && string != null && nc2.a()) {
                    bcc.a(bcc2, new cxk(nc2, string));
                }
            }
            if (z3.b("hoverEvent") && (z2 = z3.f("hoverEvent")) != null) {
                ac2 = z2.d("action");
                nc2 = ac2 == null ? null : km.a(ac2.d());
                object = (cbg)u2.a(z2.c("value"), (Type)((Object)cbg.class));
                if (nc2 != null && object != null && ((km)((Object)nc2)).a()) {
                    bcc.a(bcc2, new dex((km)((Object)nc2), (cbg)object));
                }
            }
            return bcc2;
        }
        return null;
    }

    public w a(bcc bcc2, Type type, ad ad2) {
        z z2;
        if (bcc2.g()) {
            return null;
        }
        z z3 = new z();
        if (bcc.b(bcc2) != null) {
            z3.a("bold", bcc.b(bcc2));
        }
        if (bcc.c(bcc2) != null) {
            z3.a("italic", bcc.c(bcc2));
        }
        if (bcc.d(bcc2) != null) {
            z3.a("underlined", bcc.d(bcc2));
        }
        if (bcc.e(bcc2) != null) {
            z3.a("strikethrough", bcc.e(bcc2));
        }
        if (bcc.f(bcc2) != null) {
            z3.a("obfuscated", bcc.f(bcc2));
        }
        if (bcc.g(bcc2) != null) {
            z3.a("color", ad2.a((Object)bcc.g(bcc2)));
        }
        if (bcc.h(bcc2) != null) {
            z3.a("insertion", ad2.a(bcc.h(bcc2)));
        }
        if (bcc.i(bcc2) != null) {
            z2 = new z();
            z2.a("action", bcc.i(bcc2).a().b());
            z2.a("value", bcc.i(bcc2).b());
            z3.a("clickEvent", z2);
        }
        if (bcc.j(bcc2) != null) {
            z2 = new z();
            z2.a("action", bcc.j(bcc2).a().b());
            z2.a("value", ad2.a(bcc.j(bcc2).b()));
            z3.a("hoverEvent", z2);
        }
        return z3;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((bcc)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

