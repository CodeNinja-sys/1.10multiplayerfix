/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.Statement;

public class h {
    public static void a(Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            closeable.close();
        }
    }

    public static void a(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void b(Statement statement) {
        if (statement != null) {
            statement.close();
        }
    }

    public static void a(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void b(Connection connection) {
        if (connection != null) {
            connection.close();
        }
    }
}

