/*
 * Decompiled with CFR 0.150.
 */
package com.c.a.e;

import com.a.b.aa;
import com.a.b.k;
import com.a.b.r;
import com.c.a.a;
import com.c.a.a.d;
import com.c.a.e;
import com.c.a.e.b.h;
import com.c.a.e.f;
import com.c.a.e.i;
import com.c.a.g;
import com.c.a.j;
import com.c.d.b;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.Proxy;
import java.net.URL;
import java.util.UUID;
import org.apache.commons.c.am;

public class c
extends g {
    private final String a;
    private final k b;

    public c(Proxy proxy, String string) {
        super(proxy);
        this.a = string;
        r r2 = new r();
        r2.a((Type)((Object)e.class), (Object)new com.c.a.e.e(null));
        r2.a((Type)((Object)com.c.a.d.b.class), (Object)new com.c.a.d.c());
        r2.a((Type)((Object)UUID.class), (Object)new b());
        r2.a((Type)((Object)com.c.a.e.b.e.class), (Object)new com.c.a.e.b.f());
        this.b = r2.i();
    }

    @Override
    public j a(a a2) {
        return new i(this, a2);
    }

    @Override
    public com.c.a.c.i a() {
        return new com.c.a.e.g(this);
    }

    @Override
    public com.c.a.f b() {
        return new f(this);
    }

    protected h a(URL uRL, Object object, Class class_) {
        try {
            String string = object == null ? this.b(uRL) : this.a(uRL, this.b.b(object), "application/json");
            h h2 = (h)this.b.a(string, class_);
            if (h2 == null) {
                return null;
            }
            if (am.d((CharSequence)h2.f())) {
                if ("UserMigratedException".equals(h2.g())) {
                    throw new d(h2.h());
                }
                if (h2.f().equals("ForbiddenOperationException")) {
                    throw new com.c.a.a.c(h2.h());
                }
                throw new com.c.a.a.a(h2.h());
            }
            return h2;
        }
        catch (IOException iOException) {
            throw new com.c.a.a.b("Cannot contact authentication server", iOException);
        }
        catch (IllegalStateException illegalStateException) {
            throw new com.c.a.a.b("Cannot contact authentication server", illegalStateException);
        }
        catch (aa aa2) {
            throw new com.c.a.a.b("Cannot contact authentication server", aa2);
        }
    }

    public String d() {
        return this.a;
    }
}

