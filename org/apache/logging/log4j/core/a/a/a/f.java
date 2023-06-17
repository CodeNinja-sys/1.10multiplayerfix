/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.a.a;

import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.sql.DataSource;

final class f
implements DataSource {
    final /* synthetic */ Method a;

    f(Method method) {
        this.a = method;
    }

    @Override
    public Connection getConnection() {
        try {
            return (Connection)this.a.invoke(null, new Object[0]);
        }
        catch (Exception exception) {
            throw new SQLException("Failed to obtain connection from factory method.", exception);
        }
    }

    @Override
    public Connection getConnection(String string, String string2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getLoginTimeout() {
        throw new UnsupportedOperationException();
    }

    @Override
    public PrintWriter getLogWriter() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Logger getParentLogger() {
        throw new UnsupportedOperationException();
    }

    public boolean isWrapperFor(Class class_) {
        return false;
    }

    @Override
    public void setLoginTimeout(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setLogWriter(PrintWriter printWriter) {
        throw new UnsupportedOperationException();
    }

    public Object unwrap(Class class_) {
        return null;
    }
}

