/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.b.aa;
import com.a.b.ac;
import com.a.b.ag;
import com.a.b.d.a;
import com.a.b.k;
import com.a.b.t;
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import net.minecraft.m.cg;
import org.apache.commons.c.am;

public class bc {
    public static boolean a(z z2, String string) {
        return !bc.d(z2, string) ? false : z2.d(string).z();
    }

    public static boolean a(w w2) {
        return !w2.r() ? false : w2.v().z();
    }

    public static boolean b(w w2) {
        return !w2.r() ? false : w2.v().y();
    }

    public static boolean b(z z2, String string) {
        return !bc.d(z2, string) ? false : z2.d(string).b();
    }

    public static boolean c(z z2, String string) {
        return !bc.e(z2, string) ? false : z2.c(string).p();
    }

    public static boolean d(z z2, String string) {
        return !bc.e(z2, string) ? false : z2.c(string).r();
    }

    public static boolean e(z z2, String string) {
        return z2 == null ? false : z2.c(string) != null;
    }

    public static String a(w w2, String string) {
        if (w2.r()) {
            return w2.d();
        }
        throw new ag("Expected " + string + " to be a string, was " + bc.c(w2));
    }

    public static String f(z z2, String string) {
        if (z2.b(string)) {
            return bc.a(z2.c(string), string);
        }
        throw new ag("Missing " + string + ", expected to find a string");
    }

    public static String a(z z2, String string, String string2) {
        return z2.b(string) ? bc.a(z2.c(string), string) : string2;
    }

    public static cg b(w w2, String string) {
        if (w2.r()) {
            String string2 = w2.d();
            cg cg2 = cg.c(string2);
            if (cg2 == null) {
                throw new ag("Expected " + string + " to be an item, was unknown string '" + string2 + "'");
            }
            return cg2;
        }
        throw new ag("Expected " + string + " to be an item, was " + bc.c(w2));
    }

    public static cg g(z z2, String string) {
        if (z2.b(string)) {
            return bc.b(z2.c(string), string);
        }
        throw new ag("Missing " + string + ", expected to find an item");
    }

    public static boolean c(w w2, String string) {
        if (w2.r()) {
            return w2.n();
        }
        throw new ag("Expected " + string + " to be a Boolean, was " + bc.c(w2));
    }

    public static boolean h(z z2, String string) {
        if (z2.b(string)) {
            return bc.c(z2.c(string), string);
        }
        throw new ag("Missing " + string + ", expected to find a Boolean");
    }

    public static boolean a(z z2, String string, boolean bl2) {
        return z2.b(string) ? bc.c(z2.c(string), string) : bl2;
    }

    public static float d(w w2, String string) {
        if (w2.r() && w2.v().y()) {
            return w2.h();
        }
        throw new ag("Expected " + string + " to be a Float, was " + bc.c(w2));
    }

    public static float i(z z2, String string) {
        if (z2.b(string)) {
            return bc.d(z2.c(string), string);
        }
        throw new ag("Missing " + string + ", expected to find a Float");
    }

    public static float a(z z2, String string, float f2) {
        return z2.b(string) ? bc.d(z2.c(string), string) : f2;
    }

    public static int e(w w2, String string) {
        if (w2.r() && w2.v().y()) {
            return w2.j();
        }
        throw new ag("Expected " + string + " to be a Int, was " + bc.c(w2));
    }

    public static int j(z z2, String string) {
        if (z2.b(string)) {
            return bc.e(z2.c(string), string);
        }
        throw new ag("Missing " + string + ", expected to find a Int");
    }

    public static int a(z z2, String string, int n2) {
        return z2.b(string) ? bc.e(z2.c(string), string) : n2;
    }

    public static z f(w w2, String string) {
        if (w2.q()) {
            return w2.t();
        }
        throw new ag("Expected " + string + " to be a JsonObject, was " + bc.c(w2));
    }

    public static z k(z z2, String string) {
        if (z2.b(string)) {
            return bc.f(z2.c(string), string);
        }
        throw new ag("Missing " + string + ", expected to find a JsonObject");
    }

    public static z a(z z2, String string, z z3) {
        return z2.b(string) ? bc.f(z2.c(string), string) : z3;
    }

    public static t g(w w2, String string) {
        if (w2.p()) {
            return w2.u();
        }
        throw new ag("Expected " + string + " to be a JsonArray, was " + bc.c(w2));
    }

    public static t l(z z2, String string) {
        if (z2.b(string)) {
            return bc.g(z2.c(string), string);
        }
        throw new ag("Missing " + string + ", expected to find a JsonArray");
    }

    public static t a(z z2, String string, t t2) {
        return z2.b(string) ? bc.g(z2.c(string), string) : t2;
    }

    public static Object a(w w2, String string, u u2, Class class_) {
        if (w2 != null) {
            return u2.a(w2, class_);
        }
        throw new ag("Missing " + string);
    }

    public static Object a(z z2, String string, u u2, Class class_) {
        if (z2.b(string)) {
            return bc.a(z2.c(string), string, u2, class_);
        }
        throw new ag("Missing " + string);
    }

    public static Object a(z z2, String string, Object object, u u2, Class class_) {
        return z2.b(string) ? bc.a(z2.c(string), string, u2, class_) : object;
    }

    public static String c(w w2) {
        String string = am.f(String.valueOf(w2), "...", 10);
        if (w2 == null) {
            return "null (missing)";
        }
        if (w2.s()) {
            return "null (json)";
        }
        if (w2.p()) {
            return "an array (" + string + ")";
        }
        if (w2.q()) {
            return "an object (" + string + ")";
        }
        if (w2.r()) {
            ac ac2 = w2.v();
            if (ac2.y()) {
                return "a number (" + string + ")";
            }
            if (ac2.b()) {
                return "a boolean (" + string + ")";
            }
        }
        return string;
    }

    public static Object a(k k2, Reader reader, Class class_, boolean bl2) {
        try {
            a a2 = new a(reader);
            a2.a(bl2);
            return k2.a(class_).a(a2);
        }
        catch (IOException iOException) {
            throw new aa(iOException);
        }
    }

    public static Object a(k k2, String string, Class class_) {
        return bc.a(k2, string, class_, false);
    }

    public static Object a(k k2, String string, Class class_, boolean bl2) {
        return bc.a(k2, new StringReader(string), class_, bl2);
    }
}

