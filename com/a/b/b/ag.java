/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.a.y;
import com.a.b.b.ai;
import com.a.b.d.a;
import com.a.b.d.e;
import com.a.b.d.f;
import com.a.b.w;
import com.a.b.x;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class ag {
    public static w a(a a2) {
        boolean bl2 = true;
        try {
            a2.f();
            bl2 = false;
            return (w)y.P.a(a2);
        }
        catch (EOFException eOFException) {
            if (bl2) {
                return com.a.b.y.a;
            }
            throw new com.a.b.ag(eOFException);
        }
        catch (f f2) {
            throw new com.a.b.ag(f2);
        }
        catch (IOException iOException) {
            throw new x(iOException);
        }
        catch (NumberFormatException numberFormatException) {
            throw new com.a.b.ag(numberFormatException);
        }
    }

    public static void a(w w2, e e2) {
        y.P.a(e2, (Object)w2);
    }

    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer)appendable : new ai(appendable, null);
    }
}

