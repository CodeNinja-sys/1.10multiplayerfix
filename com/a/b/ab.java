/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.aa;
import com.a.b.ag;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.f;
import com.a.b.w;
import com.a.b.x;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class ab {
    public w a(String string) {
        return this.a(new StringReader(string));
    }

    public w a(Reader reader) {
        try {
            a a2 = new a(reader);
            w w2 = this.a(a2);
            if (!w2.s() && a2.f() != d.j) {
                throw new ag("Did not consume the entire document.");
            }
            return w2;
        }
        catch (f f2) {
            throw new ag(f2);
        }
        catch (IOException iOException) {
            throw new x(iOException);
        }
        catch (NumberFormatException numberFormatException) {
            throw new ag(numberFormatException);
        }
    }

    public w a(a a2) {
        boolean bl2 = a2.p();
        a2.a(true);
        try {
            w w2 = com.a.b.b.ag.a(a2);
            return w2;
        }
        catch (StackOverflowError stackOverflowError) {
            throw new aa("Failed parsing JSON source: " + a2 + " to Json", stackOverflowError);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            throw new aa("Failed parsing JSON source: " + a2 + " to Json", outOfMemoryError);
        }
        finally {
            a2.a(bl2);
        }
    }
}

