/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.a.a;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.logging.log4j.core.a.a.a.b;
import org.apache.logging.log4j.core.d.r;
import org.apache.logging.log4j.core.d.v;

public final class d
implements b {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.d.d.k();
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    private d(String string, String string2, String string3) {
        this.c = string;
        this.d = string2;
        this.b = string3;
        this.e = "driverManager{ url=" + this.c + ", username=" + this.d + ", passwordHash=" + r.b(this.b + this.getClass().getName()) + " }";
    }

    @Override
    public Connection a() {
        if (this.d == null) {
            return DriverManager.getConnection(this.c);
        }
        return DriverManager.getConnection(this.c, this.d, this.b);
    }

    @Override
    public String toString() {
        return this.e;
    }

    public static d a(String string, String string2, String string3) {
        Driver driver;
        if (v.a(string)) {
            a.b("No JDBC URL specified for the database.");
            return null;
        }
        try {
            driver = DriverManager.getDriver(string);
        }
        catch (SQLException sQLException) {
            a.b("No matching driver found for database URL [" + string + "].", (Throwable)sQLException);
            return null;
        }
        if (driver == null) {
            a.b("No matching driver found for database URL [" + string + "].");
            return null;
        }
        if (string2 == null || string2.trim().isEmpty()) {
            string2 = null;
            string3 = null;
        }
        return new d(string, string2, string3);
    }
}

