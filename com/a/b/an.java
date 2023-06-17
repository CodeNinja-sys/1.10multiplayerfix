/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.ao;
import com.a.b.b.a.g;
import com.a.b.b.a.i;
import com.a.b.d.a;
import com.a.b.d.e;
import com.a.b.w;
import com.a.b.x;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public abstract class an {
    public abstract void a(e var1, Object var2);

    public final void a(Writer writer, Object object) {
        e e2 = new e(writer);
        this.a(e2, object);
    }

    public final an a() {
        return new ao(this);
    }

    public final String a(Object object) {
        StringWriter stringWriter = new StringWriter();
        this.a(stringWriter, object);
        return stringWriter.toString();
    }

    public final w b(Object object) {
        try {
            i i2 = new i();
            this.a(i2, object);
            return i2.a();
        }
        catch (IOException iOException) {
            throw new x(iOException);
        }
    }

    public abstract Object a(a var1);

    public final Object a(Reader reader) {
        a a2 = new a(reader);
        return this.a(a2);
    }

    public final Object a(String string) {
        return this.a(new StringReader(string));
    }

    public final Object a(w w2) {
        try {
            g g2 = new g(w2);
            return this.a(g2);
        }
        catch (IOException iOException) {
            throw new x(iOException);
        }
    }
}

