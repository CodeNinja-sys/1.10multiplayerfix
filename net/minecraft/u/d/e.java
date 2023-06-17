/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.d;

import com.a.b.ac;
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.u.d.a;
import net.minecraft.u.d.a.b;
import net.minecraft.u.d.a.c;
import net.minecraft.u.d.a.d;
import net.minecraft.u.d.o;

public class e
implements ae,
v {
    public net.minecraft.u.d.c a(w w2, Type type, u u2) {
        if (w2.q()) {
            Object object;
            b b2;
            ac ac2;
            z z2;
            net.minecraft.u.d.c c2 = new net.minecraft.u.d.c();
            z z3 = w2.t();
            if (z3 == null) {
                return null;
            }
            if (z3.b("bold")) {
                net.minecraft.u.d.c.a(c2, z3.c("bold").n());
            }
            if (z3.b("italic")) {
                net.minecraft.u.d.c.b(c2, z3.c("italic").n());
            }
            if (z3.b("underlined")) {
                net.minecraft.u.d.c.c(c2, z3.c("underlined").n());
            }
            if (z3.b("strikethrough")) {
                net.minecraft.u.d.c.d(c2, z3.c("strikethrough").n());
            }
            if (z3.b("obfuscated")) {
                net.minecraft.u.d.c.e(c2, z3.c("obfuscated").n());
            }
            if (z3.b("color")) {
                net.minecraft.u.d.c.a(c2, (o)((Object)u2.a(z3.c("color"), (Type)((Object)o.class))));
            }
            if (z3.b("insertion")) {
                net.minecraft.u.d.c.a(c2, z3.c("insertion").d());
            }
            if (z3.b("clickEvent") && (z2 = z3.f("clickEvent")) != null) {
                String string;
                ac2 = z2.d("action");
                b2 = ac2 == null ? null : b.a(ac2.d());
                object = z2.d("value");
                String string2 = string = object == null ? null : ((ac)object).d();
                if (b2 != null && string != null && b2.a()) {
                    net.minecraft.u.d.c.a(c2, new net.minecraft.u.d.a.a(b2, string));
                }
            }
            if (z3.b("hoverEvent") && (z2 = z3.f("hoverEvent")) != null) {
                ac2 = z2.d("action");
                b2 = ac2 == null ? null : d.a(ac2.d());
                object = (a)u2.a(z2.c("value"), (Type)((Object)a.class));
                if (b2 != null && object != null && ((d)((Object)b2)).a()) {
                    net.minecraft.u.d.c.a(c2, new c((d)((Object)b2), (a)object));
                }
            }
            return c2;
        }
        return null;
    }

    public w a(net.minecraft.u.d.c c2, Type type, ad ad2) {
        z z2;
        if (c2.g()) {
            return null;
        }
        z z3 = new z();
        if (net.minecraft.u.d.c.b(c2) != null) {
            z3.a("bold", net.minecraft.u.d.c.b(c2));
        }
        if (net.minecraft.u.d.c.c(c2) != null) {
            z3.a("italic", net.minecraft.u.d.c.c(c2));
        }
        if (net.minecraft.u.d.c.d(c2) != null) {
            z3.a("underlined", net.minecraft.u.d.c.d(c2));
        }
        if (net.minecraft.u.d.c.e(c2) != null) {
            z3.a("strikethrough", net.minecraft.u.d.c.e(c2));
        }
        if (net.minecraft.u.d.c.f(c2) != null) {
            z3.a("obfuscated", net.minecraft.u.d.c.f(c2));
        }
        if (net.minecraft.u.d.c.g(c2) != null) {
            z3.a("color", ad2.a((Object)net.minecraft.u.d.c.g(c2)));
        }
        if (net.minecraft.u.d.c.h(c2) != null) {
            z3.a("insertion", ad2.a(net.minecraft.u.d.c.h(c2)));
        }
        if (net.minecraft.u.d.c.i(c2) != null) {
            z2 = new z();
            z2.a("action", net.minecraft.u.d.c.i(c2).a().b());
            z2.a("value", net.minecraft.u.d.c.i(c2).b());
            z3.a("clickEvent", z2);
        }
        if (net.minecraft.u.d.c.j(c2) != null) {
            z2 = new z();
            z2.a("action", net.minecraft.u.d.c.j(c2).a().b());
            z2.a("value", ad2.a(net.minecraft.u.d.c.j(c2).b()));
            z3.a("hoverEvent", z2);
        }
        return z3;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

