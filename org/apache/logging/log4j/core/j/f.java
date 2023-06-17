/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.j;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameNotFoundException;
import javax.naming.NamingException;
import org.apache.logging.log4j.core.e.a;
import org.apache.logging.log4j.core.j.g;
import org.apache.logging.log4j.core.k;
import org.apache.logging.log4j.d.d;

public class f
implements g {
    private static final k a = new k("Default");
    private static final ConcurrentMap b = new ConcurrentHashMap();
    private static final d c = d.k();

    @Override
    public k a(String string, ClassLoader classLoader, boolean bl2) {
        return this.a(string, classLoader, bl2, null);
    }

    @Override
    public k a(String string, ClassLoader classLoader, boolean bl2, URI uRI) {
        k k2 = (k)org.apache.logging.log4j.core.e.a.a.get();
        if (k2 != null) {
            return k2;
        }
        String string2 = null;
        try {
            InitialContext initialContext = new InitialContext();
            string2 = (String)f.a(initialContext, "java:comp/env/log4j/context-name");
        }
        catch (NamingException namingException) {
            c.b("Unable to lookup java:comp/env/log4j/context-name", (Throwable)namingException);
        }
        return string2 == null ? a : this.a(string2, null, uRI);
    }

    @Override
    public k a(String string, Object object, URI uRI) {
        if (string == null) {
            c.b("A context name is required to locate a LoggerContext");
            return null;
        }
        if (!b.containsKey(string)) {
            k k2 = new k(string, object, uRI);
            b.putIfAbsent(string, k2);
        }
        return (k)b.get(string);
    }

    @Override
    public void a(k k2) {
        for (Map.Entry entry : b.entrySet()) {
            if (!((k)entry.getValue()).equals(k2)) continue;
            b.remove(entry.getKey());
        }
    }

    @Override
    public k a(String string) {
        return (k)b.remove(string);
    }

    @Override
    public List a() {
        ArrayList arrayList = new ArrayList(b.values());
        return Collections.unmodifiableList(arrayList);
    }

    protected static Object a(Context context, String string) {
        if (context == null) {
            return null;
        }
        try {
            return context.lookup(string);
        }
        catch (NameNotFoundException nameNotFoundException) {
            c.b("Could not find name [" + string + "].");
            throw nameNotFoundException;
        }
    }
}

