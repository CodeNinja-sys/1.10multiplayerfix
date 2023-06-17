/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.a.a;

import java.sql.Connection;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.apache.logging.log4j.core.a.a.a.b;
import org.apache.logging.log4j.core.d.v;
import org.apache.logging.log4j.d;

public final class c
implements b {
    private static final d a = org.apache.logging.log4j.d.d.k();
    private final DataSource b;
    private final String c;

    private c(String string, DataSource dataSource) {
        this.b = dataSource;
        this.c = "dataSource{ name=" + string + ", value=" + dataSource + " }";
    }

    @Override
    public Connection a() {
        return this.b.getConnection();
    }

    @Override
    public String toString() {
        return this.c;
    }

    public static c a(String string) {
        if (v.a(string)) {
            a.b("No JNDI name provided.");
            return null;
        }
        try {
            InitialContext initialContext = new InitialContext();
            DataSource dataSource = (DataSource)initialContext.lookup(string);
            if (dataSource == null) {
                a.b("No data source found with JNDI name [" + string + "].");
                return null;
            }
            return new c(string, dataSource);
        }
        catch (NamingException namingException) {
            a.b(namingException.getMessage(), (Throwable)namingException);
            return null;
        }
    }
}

