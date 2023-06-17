/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.a.a;

import java.io.StringReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import org.apache.logging.log4j.core.a.a.a.a;
import org.apache.logging.log4j.core.a.a.a.i;
import org.apache.logging.log4j.core.a.a.a.j;
import org.apache.logging.log4j.core.a.a.a.k;
import org.apache.logging.log4j.core.a.a.a.l;
import org.apache.logging.log4j.core.a.a.b;
import org.apache.logging.log4j.core.a.d;

public final class h
extends b {
    private static final l c = new l(null);
    private final List d;
    private final org.apache.logging.log4j.core.a.a.a.b e;
    private final String f;
    private Connection g;
    private PreparedStatement h;

    private h(String string, int n2, org.apache.logging.log4j.core.a.a.a.b b2, String string2, List list) {
        super(string, n2);
        this.e = b2;
        this.f = string2;
        this.d = list;
    }

    @Override
    protected void f() {
        this.g = this.e.a();
        this.h = this.g.prepareStatement(this.f);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void h() {
        try {
            org.apache.logging.log4j.core.d.h.b(this.h);
        }
        finally {
            org.apache.logging.log4j.core.d.h.b(this.g);
        }
    }

    @Override
    protected void a(org.apache.logging.log4j.core.h h2) {
        StringReader stringReader = null;
        try {
            if (!this.j() || this.g == null || this.g.isClosed()) {
                throw new d("Cannot write logging event; JDBC manager not connected to the database.");
            }
            int n2 = 1;
            for (j j2 : this.d) {
                if (j.a(j2)) {
                    this.h.setTimestamp(n2++, new Timestamp(h2.g()));
                    continue;
                }
                if (j.b(j2)) {
                    stringReader = new StringReader(j.c(j2).c(h2));
                    if (j.d(j2)) {
                        this.h.setNClob(n2++, stringReader);
                        continue;
                    }
                    this.h.setClob(n2++, stringReader);
                    continue;
                }
                if (j.d(j2)) {
                    this.h.setNString(n2++, j.c(j2).c(h2));
                    continue;
                }
                this.h.setString(n2++, j.c(j2).c(h2));
            }
            if (this.h.executeUpdate() == 0) {
                throw new d("No records inserted in database table for log event in JDBC manager.");
            }
        }
        catch (SQLException sQLException) {
            throw new d("Failed to insert record for log event in JDBC manager: " + sQLException.getMessage(), sQLException);
        }
        finally {
            org.apache.logging.log4j.core.d.h.a(stringReader);
        }
    }

    public static h a(String string, int n2, org.apache.logging.log4j.core.a.a.a.b b2, String string2, a[] arra) {
        return (h)org.apache.logging.log4j.core.a.a.b.a(string, new k(n2, b2, string2, arra), c);
    }

    /* synthetic */ h(String string, int n2, org.apache.logging.log4j.core.a.a.a.b b2, String string2, List list, i i2) {
        this(string, n2, b2, string2, list);
    }
}

